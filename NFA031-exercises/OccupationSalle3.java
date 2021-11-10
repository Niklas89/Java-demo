public class OccupationSalle3 {
	public static void reserver(boolean[][] occupee, String[] jour, String[] horaire){
		Terminal.ecrireString("Quel jour voulez-vous reserver? ");
		String reserverJour = Terminal.lireString();
		Terminal.ecrireString("Quelle plage horaire voulez-vous prendre? ");
		String reserverHoraire = Terminal.lireString();
		boolean valide = false;
		for (int col=0; col<occupee.length; col=col+1){ 
			if(reserverJour.equals(jour[col])) {
				for (int lig=0; lig<occupee[0].length; lig=lig+1){
					if (reserverHoraire.equals(horaire[lig])){
						if(occupee[col][lig] == true) {
							valide = true;
						} else {
							occupee[col][lig] = true;
						}
					} 
				}
			} 
			System.out.println();
		} 
		if (valide){
			System.out.println("Salle deja occupee le "+reserverJour+" a "+reserverHoraire);
		}else{
			System.out.println("Salle bien reservee le "+reserverJour+" a "+reserverHoraire);
		}
		System.out.println();
	} 
	
	public static double calculOccupation(boolean[][] occupee){
		double nbOccupee = 0;
		double nbPlages = 0;
		double tauxOccupation = 0;
		for (int col=0; col<occupee.length; col=col+1){ 
			for (int lig=0; lig<occupee[0].length; lig=lig+1){
				if (occupee[col][lig]){
					nbOccupee += 1;
				} 
				nbPlages += 1;
			}
		}
		tauxOccupation = (nbOccupee / nbPlages)*100;
		return tauxOccupation;
	}

	public static void afficher(boolean[][] occupee, String[] jour, String[] horaire){
		for (int col=0; col<occupee.length; col=col+1){ 
			Terminal.ecrireStringln(jour[col]+" disponibilites : ");
			for (int lig=0; lig<occupee[0].length; lig=lig+1){
				if (occupee[col][lig]){
					Terminal.ecrireStringln("Salle occupee a "+horaire[lig]);
				} else {
					Terminal.ecrireStringln("Salle disponible a "+horaire[lig]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args){
		String[] jour = {"Lundi","Mardi",
		"Mercredi","Jeudi", "Vendredi"};
		String[] horaire = {"8H00-9H00","9H00-10H00",
		"10H00-11H00","11H00-12H00", "12H00-13H00", "13H00-14H00", "14H00-15H00", "15H00-16H00", "16H00-17H00", "17H00-18H00", "18H00-19H00"};
		boolean[][] occupee =
		{{false,true,true,true,false,true,true,false,true,false,true},
		{false,true,true,true,false,true,true,false,true,false,false},
		{false,false,true,true,false,false,true,false,true,false,true},
		{true,true,false,true,false,true,true,false,true,true,false},
		{false,true,false,true,false,true,true,false,false,false,true}};
		afficher(occupee,jour,horaire);	// affiche jours disponibilites: horaires ou cest dispo
		System.out.println("Taux occupation de la salle: "+calculOccupation(occupee)+" %"); // calcul le taux d'occupation de la salle
		System.out.println();
		reserver(occupee,jour,horaire);
		//afficher(occupee,jour,horaire);
	}		
}