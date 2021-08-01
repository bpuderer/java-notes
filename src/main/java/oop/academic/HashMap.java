package oop.academic;

import java.util.ArrayList;
import java.util.List;


public class HashMap<K, V> {

    // values is an array of List and List contains Pair objects. initial size 10.
    // array indexes correspond to hash of Pair object's key

    private List<Pair<K, V>>[] values;
    private int keyCount;

    public HashMap() {
        this.values = new ArrayList[10];
        this.keyCount = 0;
    }

    public V get(K key) {
        // get value for key
        int hashValue = Math.abs(key.hashCode() % this.values.length);

        // no keys exist for that hash value
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                // found it
                return valuesAtIndex.get(i).getValue();
            }
        }

        // Pair(s) exist for this key's hash, but not with this key
        return null;
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        // if no Pairs for that hash, creates new List for that hash
        // then returns List at that hash
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }

        return values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        // returns index of Pair with matching key in List
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }


    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            // Pair with that key does not exist in list
            valuesAtIndex.add(new Pair<>(key, value));
            this.keyCount++;  // incremented each time a key is added
        } else {
            // overwrite existing value
            valuesAtIndex.get(index).setValue(value);
        }

        // grow when the number of keys is greater than 75% size of the array
        if (1.0 * this.keyCount / this.values.length > 0.75) {
            grow();
        }
    }

    private void grow() {
        // create a new array to replace existing this.values. 2x as big
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            // copy each list in values array
            copyList(newArray, i);
        }

        // replace the old array with the new
        this.values = newArray;
    }

    private void copyList(List<Pair<K, V>>[] newArray, int atIndex) {
        // copies the List at the array index passed as fromIdx

        if (this.values[atIndex] == null || this.values[atIndex].isEmpty()) {
            return;
        }

        for (int i = 0; i < this.values[atIndex].size(); i++) {
            Pair<K, V> value = this.values[atIndex].get(i);

            // method needed the array itself or the length so it can calculate the hash
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(value);
        }
    }

    public V remove(K key) {
        // returns null if no Pair with that key or value if it exists when removing it
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        // No Pairs at that hash
        if (valuesAtIndex.isEmpty()) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            // Pairs at that hash, but not for that key
            return null;
        }

        // exists.  remove it.
        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (var lst : this.values) {
            if (lst == null || lst.isEmpty()) {
                continue;
            }
            for (var pr : lst) {
                sb.append(pr);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}