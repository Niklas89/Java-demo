class Exceptions1 {
	static int division(int[] tab, int indice, int diviseur){
		return tab[indice]/diviseur;
	}

	public static int lireEntier(String msg){
		int entier=0;
		boolean correct;
		do{
			try{
				Terminal.ecrireString(msg);
				entier = Terminal.lireInt();
				correct=true;
			} catch(TerminalException e){
				Terminal.ecrireString("Vous avez tapé autre chose qu’un entier");
				Terminal.ecrireStringln(" Veuillez recommencer");
				correct = false;
			}
		} while(!correct);
		return entier;
	}

	public static void main(String[] args){
		int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};
		int x=0, y=0;
		boolean correct;
		do {
			try{
				x = lireEntier("Entrez l’indice de l’entier à diviser: ");
				tableau[x] = tableau[x];
				correct=true;
			} catch(ArrayIndexOutOfBoundsException e){
					Terminal.ecrireString("Cette case n’existe pas.");
					Terminal.ecrireStringln(" Veuillez recommencer");
					correct = false;
			}
		} while(!correct);


		do{
			try{
				
				y = lireEntier("Entrez le diviseur: ");
				Terminal.ecrireString("Le résultat de la division est: ");
				Terminal.ecrireIntln(division(tableau,x,y));
				correct=true;
			} catch(ArithmeticException e){
				Terminal.ecrireString("Le diviseur ne peut pas être zero.");
				Terminal.ecrireStringln(" Veuillez recommencer");
				correct = false;
			}
		} while(!correct);
	}
}