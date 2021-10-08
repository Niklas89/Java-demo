public class Test2 {
	public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			y = y + x;
		System.out.print(x +""+ y +" ");
		x = x + 1;
		}
		


	} // end public static
} // end public class Test2


// Resultat:
// while (x<5) {
// 	y = 0
// 	x = 0
// 00
// 	x = 1
// 	y = 0 + 1 = 1
// 11
// 	x = 2
// 	y = 1+2 = 3
// 23
// 	x = 3
// 	y = 3+3 = 6
// 36
// 	x = 4
// 	y = 6+4 = 10
// 410
// }