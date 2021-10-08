public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {

			if (beerNum == 1) {
				word = "bottle"; // singular, as in ONE bottle.
			}


			System.out.print(beerNum + " " + word + " of beer on the wall, ");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.print("Take one down and pass it around, ");
			beerNum = beerNum - 1;

			if (beerNum > 0) {
				if (beerNum == 1) {
					word = "bottle";
				} else {
					word = "bottles";
				}
			System.out.println(beerNum + " " + word + " of beer on the wall.");
			} else {
				System.out.println("no more bottles of beer on the wall.");
			} // end else
		} // end while loop
	} // end main method
} // end class
