public class Voiture {
	
	int nbPortes=5;
	boolean automatique;
	String couleur;
	int rapportCourant;

	void klaxonner() {
		System.out.println("Tutut!!");
	}

	int accelerer() {
		System.out.println("J'accélère");
		return 100;
	}

	int passerRapport(boolean augmenter) {
		if (augmenter) {
			rapportCourant++;
		}
		else {
			rapportCourant--;
		}
		return rapportCourant;
	}


	void tourner(boolean droite, int angle) {
		String droiteOuGauche=null;
		if (droite) {
			droiteOuGauche="droite";
		} else {
			droiteOuGauche = "gauche";
		}
		System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de "+angle);
	}

}
