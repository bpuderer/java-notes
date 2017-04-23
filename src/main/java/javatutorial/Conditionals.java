package javatutorial;

public class Conditionals {

	public static void main(String[] args) {

		int x = 2;
		
		if (x == 0) {
			System.out.println("x is 0");
		} else if (x == 1) {
			System.out.println("x is 1");
		} else {
			System.out.println("x is something other than 0 or 1");
		}


		switch (x) {
		case 0: 
			System.out.println("x is 0");
			break;
		case 1: case 2:
			System.out.println("x is 1 or 2");
			break;
		default:
			System.out.println("x is not 0, 1, or 2");
			break;
		}


		// ternary
		boolean someCondition = true;
		String result = someCondition ? "true val" : "false val";
		System.out.println("result: " + result);
		
	}
	
}
