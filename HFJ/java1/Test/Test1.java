public class Test1 {
	public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			y = x - y;
		System.out.print(x +""+ y +" ");
		x = x + 1;
		}
		


	} // end public static
} // end public class Test1

 
// comment ca marche:
// 		int x = 0;
// 		int y = 0;
// while (x < 5) {
// 	y = 0 - 0
// 	x = 0
// 	y = 0
// 00

// 	x = 1
// 	y = 1
// 11

// 	x = 2
// 	y = 2 - 1 = 1
// 21

// 	x=3
// 	y = 3 - 1 = 2
// 32

// 	x = 4
// 	y = 4 - 2 = 2
// 42
// }