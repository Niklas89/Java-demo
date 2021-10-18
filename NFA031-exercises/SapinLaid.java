// Il s’agit de dessiner un triangle avec la pointe tournée vers le haut.
// Pour le triangle, on demandera à l’utilisateur de rentrer le nombre de lignes. 
// Pour chaque ligne, il faudra afficher un certain nombre d’espaces, puis un certain nombre d’étoiles, puis un passage à la ligne.
// Le but de l’exercice est d’écrire un programme qui affiche un soi-disant sapin constitué d’une suite d’étoiles. 
// Le programme lira au clavier le nombre de triangles constituant le sapin.

public class SapinLaid {
	public static void main (String[] args) {


		int nblignes;
		int nbtriangles;

		Terminal.ecrireStringln("Entrez le nombre de lignes d'étoiles souhaité: ");
		nblignes = Terminal.lireInt();

		
		

		Terminal.ecrireStringln("Entrez le nombre de triangles souhaité: ");
		nbtriangles = Terminal.lireInt();


		for(int k=0;k<nbtriangles;k++) {
			int nbetoiles = 1;
			int nbespacesdebut = nblignes-1;
			int nbespacesfin = nblignes-1;

			for(int i=0;i<nblignes;i++) {

				for(int j = 0;j<nbespacesdebut;j++) {
					System.out.print(" ");
				}
				for(int j = 0;j<nbetoiles;j++) {
					System.out.print("*");
				}
				for(int j = 0;j<nbespacesfin;j++) {
					System.out.print(" ");
				}
				System.out.println();
				nbetoiles = nbetoiles+2;
				nbespacesdebut = nbespacesdebut-1;
				nbespacesfin = nbespacesfin-1;

			}

			if (k == nbtriangles-1) {
					int nbEtoilesTronc = 1;
					int nbespacesDebut = nblignes-3;
					int nbespacesFin = nblignes-3;
					
					for(int l=0;l<nblignes;l++) {

						for(int o = 0;o<nbespacesDebut;o++) {
							System.out.print(" ");
						}

						for(int m = 0;m<nbEtoilesTronc;m++) {
							System.out.print("*****");
						}

						for(int p = 0;p<nbespacesFin;p++) {
							System.out.print(" ");
						}
						System.out.println();
					}

			}

		}



	}
}