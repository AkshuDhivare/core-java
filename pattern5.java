public class pattern5 {

	public static void main(String[] args) {
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
  }
}

/* output :- 

 1 
 4 9 
 16 25 36 
 49 64 81 100 
 121 144 169 196 225 
 256 289 324 361 
 400 441 484 
 529 576 
 625
   
*/
