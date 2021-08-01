package oop;

public class OuterClass {
	int x = 0;
	int y = 11;

	void outerClassMethod() {
		System.out.println("greetings from OuterClass");
	}

	class InnerClass {
		int x = 1;

		void innerClassMethod() {
			System.out.println("greetings from InnerClass");
			// x is shadowed
			System.out.println("OuterClass.x: " + OuterClass.this.x);
			System.out.println("OuterClass.y: " + y);
			System.out.println("InnerClass.x: " + this.x);
			outerClassMethod();
		}
	}

	static class StaticNestedClass {
		int x = 2;

		void staticClassMethod() {
			System.out.println("greetings from StaticNestedClass");
			// cannot directly refer OuterClass instance variables or methods
		}
	}

	public static void main(String[] args) {

		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.innerClassMethod();

		OuterClass.StaticNestedClass snc = new OuterClass.StaticNestedClass();
		snc.staticClassMethod();
	}

}