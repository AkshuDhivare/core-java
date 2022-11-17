public class pattern {
 public static void main(String[] args) {
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

/* output :- 

 1 
 2 2 
 3 3 3 
 4 4 4 4 
 5 5 5 5 5 
 6 6 6 6 
 7 7 7 
 8 8 
 9 
 
*/
