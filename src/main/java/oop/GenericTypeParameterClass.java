package oop;

// https://docs.oracle.com/javase/tutorial/java/generics/types.html
// A generic class is defined with the following format:
// class name<T1, T2, ..., Tn> { /* ... */ }
public class GenericTypeParameterClass<T> implements GenericTypeParameterInterface<T> {
    private T element;

    public GenericTypeParameterClass(T element) {
        this.element = element;
    }

    public T getValue() {
        return this.element;
    }

    public static void main(String[] args) {
        GenericTypeParameterClass<Integer> i = new GenericTypeParameterClass<>(5);
        GenericTypeParameterClass<String> s = new GenericTypeParameterClass<>("test");
        System.out.println(i.getValue() + " " + s.getValue());
    }

}
