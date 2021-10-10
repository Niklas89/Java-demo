public class HelloWorld {
	public static void main(String... args) {
		Voiture voitureDeMichel = new Voiture();
		voitureDeMichel.nbPortes = 3;
		voitureDeMichel.automatique = true;
		voitureDeMichel.couleur = "Verte";

		int nouveauRapport = voitureDeMichel.passerRapport(true);

		voitureDeMichel.passerRapport(true);
		voitureDeMichel.passerRapport(true);
		nouveauRapport=voitureDeMichel.passerRapport(false);

		System.out.println("Le nouveau rapport est : "+ nouveauRapport);

		voitureDeMichel.tourner(false, 45);
	}
}