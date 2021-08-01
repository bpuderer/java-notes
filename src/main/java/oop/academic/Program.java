package oop.academic;

public class Program {

    public static void main(String[] args) {

        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }

        HashMap<String, String> hm = new HashMap<>();
        hm.add("a1", "a1 val");
        hm.add("a2", "a2 val");
        hm.add("a3", "a3 val");
        hm.add("b1", "b1 val");
        hm.add("c1", "c1 val");
        hm.add("c2", "c2 val");
        hm.add("c3", "c3 val");
        hm.add("c4", "c4 val");
        hm.add("c5", "c5 val");
        hm.add("c6", "c6 val");
        hm.remove("c3");
        System.out.println(hm);

    }

}