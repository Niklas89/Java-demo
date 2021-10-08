public class Conversion {
	public static void main (String[] args) {
		double euros;
		double dollars;
		System.out.println("Somme en euros? ");
		euros = Terminal.lireDouble();
		dollars = euros *1.118;
		System.out.println("La somme en dollars: ");
		System.out.println(dollars);
	}
}
