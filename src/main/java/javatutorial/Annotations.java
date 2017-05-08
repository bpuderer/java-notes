package javatutorial;

@ClassPreamble(
		author = "bpuderer")
public class Annotations {

	// Java SE 8 supports repeating annotations. @Repeatable.
	// Java SE 8 supports annotations applied to use of types (type annotation).  Before SE 8, limited to declarations.
	// java.lang - @Deprecated, @FunctionalInterface, @Override, @SafeVarargs, @SuppressWarnings
	// java.lang.annotation - meta-annotations - annotations that apply to other annotations
	// https://checkerframework.org/
	
	/**
	 * @deprecated use of deprecatedMethod
	 * is discouraged, use notDeprecatedMethod
	 * instead.
	 */
	@Deprecated
	public static void deprecatedMethod() {
		System.out.println("deprecated");
	}
	
	public static void notDeprecatedMethod() {
		System.out.println("not deprecated");
	}
	
	public static void main(String[] args) {
		deprecatedMethod();
		notDeprecatedMethod();
	}
	
}
