class MixFor5 {
	public static void main(String [] args) {
		int x = 0;
		int y = 30;
		for (int outer = 0; outer < 3; outer++) {

			for(int inner = 4; inner > 1; inner--) { // je dois faire celui-ci en boucle 3 fois à chacune des boucles du for outer
				x = x + 3;

				y = y - 2;
				if (x == 6) {
				break;
				}
				x = x + 3;

			}
			y = y - 2;
		}
		System.out.println(x + " " + y);
	}
}

// si c'est le x = x + 3; qui manque je fais:
// outer = 0

// inner = 4
// y = 28
// x = 6
// inner = 3

// inner = 3
// y = 26
// x = 12
// inner = 2

// inner = 2
// y = 24
// x = 18
// inner = 1
// fini inner

// y = 22
// outer = 1
// ---------------------------
// outer = 1

// inner = 4
// y = 20
// x = 24
// inner = 3

// inner = 3
// y = 18
// x = 30
// inner = 2

// inner = 2
// y = 16
// x = 36
// inner = 1
// fini inner

// y = 14
// outer = 2
// -----------------------------
// outer = 2

// inner = 4
// x = 42
// y = 12
// inner = 3

// inner = 3
// x = 48
// y = 10
// inner = 2

// inner = 2
// x = 54
// y = 8
// inner = 1
// fini inner

// y = 6
// outer = 3
// fini outer 
// -----------------------------------

// x = 54
// y = 6