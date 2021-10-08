public class Test5 {
	public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			
			if (y < 5) {
				x = x + 1;
				if (y < 3) {
					x = x - 1;
				}
			}
			y = y + 2;

		System.out.print(x +""+ y +" ");
		x = x + 1;
		}
		

	} // end public static
} // end public class Test5


// RESULTAT:

// while (x<5) {

// 	x = 0
// 	y = 2
// 02
// 	x = 1
// 	y = 4
// 14
// 	x = 3
// 	y = 6
// 36
// 	x = 4
// 	y = 8
// 48	

// }