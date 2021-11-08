public class CourseEscargots {
	public static void main(String[] args){
		// MOOC.useMOOCTerminal();

		System.out.println("Entrez le nombre d'escargots pour cette course: ");
		int nb = Terminal.lireInt();

		int [] tab;
		tab = new int[nb];
		int tirage;
		int gagnant = 0;
		int position = 0;
		boolean gagne = false;

		while(gagne == false) {
		
			for(int i=0; i <= tab.length -1 ; i++ ) {
				tirage = MOOC.auSort(1,6);
				tab[i] += tirage;
				System.out.println("Position de l'escargot "+i+": "+tab[i]);
				if(tab[i] >= 50) {
					gagne = true;
					gagnant = i;
					position = tab[i];

				}
			}
		}
		if (gagne){
			System.out.println("L'escargot numero "+gagnant+" a gagne! Sa position est: "+position);
		}
		
		System.out.println("Score des escargots: ");
		for (int j=0; j <= tab.length -1 ; j++) {
			System.out.println("Escargot "+j+" avec le score: "+tab[j]);
		}
	}
}