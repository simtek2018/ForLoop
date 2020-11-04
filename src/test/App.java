package test;

public class App {

	public static void main(String[] args) {
		int counter = 0;
		boolean found = false;

		for (counter = 0; counter < 100 && !found; counter++) {
			System.out.println("Counter = " + counter);
			
		}
		System.out.println("Found it at: " + (counter-1));
	}
}
