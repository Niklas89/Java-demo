public class Rectangle {
	public static void main(String[] args){
		int x,y;
		char symbole;
		Terminal.ecrireString("Entrez la hauteur du rectangle: ");
		y = Terminal.lireInt();
		Terminal.ecrireString("Entrez la largeur du rectangle: ");
		x = Terminal.lireInt();
		Terminal.ecrireString("Entrez un symbole a utiliser pour le rectangle: ");
		symbole = Terminal.lireChar();
		etoiles(x,y,symbole);

	}

	public static void etoiles(int x, int y, char symbole) {
		for(int i=0;i<y;i++) {
			for(int j = 0;j<x-1;j++) {
				System.out.print(symbole);
			}
			System.out.println(symbole);
		}
	}
}