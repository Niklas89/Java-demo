public class SapinBeau {
	public static void main (String[] args) {


		for(int taille = 3; taille < 6 ; taille++) {
			int nEspaces = 4;
			int nEtoiles = 1;

			for (int i= 0; i < taille; i++) {
			
				for (int j= 0; j < nEspaces; j++) {
					Terminal.ecrireChar(' ');
				}
				for (int j= 0; j < nEtoiles; j++) {
					Terminal.ecrireChar('*');
				}
				System.out.println();
				nEspaces= nEspaces -1;
				nEtoiles= nEtoiles + 2;
			}
		}
		
					
		for(int l=0;l<3;l++) {
			int nbEtoiles = 1;
			int nbEspaces = 3;

			for(int o = 0;o<nbEspaces;o++) {
				System.out.print(" ");
			}

			for(int m = 0;m<nbEtoiles;m++) {
				System.out.print("***");
			}
			System.out.println();
		}

			

	}
}