public class Test3 {
	public static void main(String [] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			
			y = y + 2;
			if(y > 4) {
				y = y - 1;
			}

		System.out.print(x +""+ y +" ");
		x = x + 1;
		}
		

	} // end public static
} // end public class Test3


// RESULTAT:
// while (x<5) {
// 	y = 2
// 	x = 0
// 02
// 	x = 1
// 	y = 4
// 14
// 	x = 2
// 	y = 5
// 25
// 	x = 3
// 	y = 6
// 36
// 	x = 4
// 	y = 7
// 47
// }