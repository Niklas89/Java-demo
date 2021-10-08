public class CalculsBooleens {
	public static void main(String[] args) {
		double nombre;
		boolean inf20;
		boolean sup0;
		boolean resultat;

		System.out.println("Entrez un nombre :");
		nombre = Terminal.lireInt();
		inf20 = nombre <= 20;
		sup0 = nombre >= 0;
		resultat = (nombre <= 20) && (nombre >= 0);


		Terminal.ecrireStringln("Le nombre "+nombre+", est-il inférieur ou égale à 20 ? "+inf20);
		Terminal.ecrireStringln("Le nombre "+nombre+", est-il supérieur ou égale à 0 ? "+sup0);
		Terminal.ecrireStringln("Le nombre "+nombre+", est-il inférieur ou égale à 20 et supérieur ou égale à 0 ? "+resultat);
	}
}