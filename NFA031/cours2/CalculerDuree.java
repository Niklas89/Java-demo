public class CalculerDuree {
	public static void main (String[] args) {
		int minutes;
		int heures;
		int dureeTotale;
		int reste;
		int jours;
		int resteHeures;

		System.out.println("Quelle est la duree en minutes ? ");
		minutes = Terminal.lireInt();
		heures = minutes / 60;
		reste = minutes % 60;
		if(heures > 24) {
			jours = heures / 24;
			resteHeures = heures % 24;
			System.out.println("Ca fait "+jours+" jours "+resteHeures+" heures et "+reste+" minutes");
		}
		else {
			System.out.println("Ca fait "+heures+" heures et "+reste+" minutes");
		}
	}
}
