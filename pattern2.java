public class pattern2 {

	public static void main(String[] args) {
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
    
/* output :- 1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 
20 21 22 
23 24 
25 
*/
