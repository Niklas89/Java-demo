public class ConversionDollars {
	public static void main (String[] args) {


		double euros, dollar, cours;
		char reponse = 'o';

		Terminal.ecrireStringln("Cours du dollar (valeur de 1 dollar)? ");
		cours = Terminal.lireDouble();

		while (reponse=='o'){
			Terminal.ecrireString("Somme en euros? ");
			euros = Terminal.lireInt();
			dollar = euros / cours;
			Terminal.ecrireStringln("La somme en dollars: "+ dollar);
			Terminal.ecrireStringln("Voulez-vous faire une autre conversion" +
			" (tapez o pour oui ou n pour non)");
			reponse = Terminal.lireChar();
		}
		if(reponse=='n') {
			Terminal.ecrireStringln("Merci et au revoir");
		}

		



	}
}