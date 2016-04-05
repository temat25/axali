import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println ("enter first number");
		int someNumber1 = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println ("operation");
		String operation = sc2.nextLine();

		Scanner sc3 = new Scanner(System.in);
		System.out.println ("enter first number");
		int someNumber2 = sc3.nextInt();

		ragaca(someNumber1, operation, someNumber2);

	}

	private static void ragaca (int someNumber1, String operation, int someNumber2) {
		switch (operation) {
			case "+":
				int a = someNumber1 + someNumber2;
					System.out.println(a);
				break;
			case "-":

				int b = someNumber1 - someNumber2;
					System.out.println(b);
				break;
			case "*":

				int c = someNumber1 * someNumber2;
					System.out.println(c);
				break;

			case "/":

				int d = someNumber1 / someNumber2;
					System.out.println(d);
				break;

		}

	}
}