package javatutorial;

public class Looping {

	public static void main(String[] args) {

		int temp = 0;
		do {
			System.out.println("temp: " + temp);
			temp++;
		} while (temp < 2);


		int x = 5;
		while (x > 3) {
			System.out.println("x: " + x);
			x--;
		}


		for (int i=0; i < 3; i++) {
			System.out.println("i: " + i);
		}


		// enhanced for
		// also labeled version of break exists to terminate particular loop instead of innermost
		boolean foundIt = false;
		int searchItem = 43;
		int[] numbers = {28, 3, 42, 2112, 9};
        for (int item : numbers) {
        	if (item == searchItem) {
        		foundIt = true;
        		break;
        	}
        }
        
        if (foundIt) {
        	System.out.println("found " + searchItem + " in array");
        } else {
        	System.out.println("did not find " + searchItem + " in array");
        }

        
        // also labeled version of continue exists
        int evenNumSum = 0;
        for (int item : numbers) {
        	if (item % 2 != 0) {
        		continue;
        	}
			evenNumSum += item;
        }
        System.out.println("sum of even numbers in array: " + evenNumSum);
        
	}
	
}
