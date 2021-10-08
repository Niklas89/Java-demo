public class Test4 {
	public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			
			x = x + 1;
			y = y + x;

		System.out.print(x +""+ y +" ");
		x = x + 1;
		}
		

	} // end public static
} // end public class Test4


// RESULTAT:
// while (x<5) {

// 	x = 1
// 	y = 1
// 11
// 	x = 3
// 	y = 4
// 34
// 	x = 5
// 	y = 9
// 59		

// }