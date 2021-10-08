public class MamieLeonie {
	public static void main (String[] args) {
		int nbQuatreQuart;
		double poidsPaquet;
		double poidsQuatreQuart;

		System.out.println("Quel est le nombre de quatre-quarts que vous avez ? ");
		nbQuatreQuart = Terminal.lireInt();
		poidsQuatreQuart = nbQuatreQuart * 250;
		poidsPaquet = poidsQuatreQuart / 1000;

		System.out.println("Le poids total du paquet en kilos est de : "+poidsPaquet);
		
	}
}
