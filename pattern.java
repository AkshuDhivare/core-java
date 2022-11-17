package logic1;

public class pattern {

	public static void main(String[] args) {
		// normal pattern
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("......................................................");

		// pattern in square
		int a = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a * a + " ");
				a = a + 1;
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a * a + " ");
				a = a + 1;
			}
			System.out.println();
		}

		System.out.println("........................................................");

		// pattern in 1 to .........
		int b = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(b + " ");
				b = b + 1;
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(b + " ");
				b = b + 1;
			}
			System.out.println();
		}

		System.out.println("..................................................");

		// pattern like 1 22 333 444 55555
		int c = 6;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
			}
			c = c + 1;
			System.out.println();
		}
	}

}
