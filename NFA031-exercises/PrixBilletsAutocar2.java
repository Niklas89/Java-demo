public class PrixBilletsAutocar2 { // ajouter une deuxieme ligne de bus
	public static void calculReducTrajet(String[] villes, String[] villes2, double[] prix) {
		int depart;
		int arrivee;
		System.out.println("Vous voulez obtenir des tarifs pour la ligne 1 ou la ligne 2 ? ");
		int ligne=Terminal.lireInt();
		if(ligne==1) {
			System.out.println("Choisissez votre gare parmis la liste ci-dessous: ");
			for(int j=0; j<villes.length; j++) {
				System.out.println(j+" - "+villes[j]);
			}
			System.out.println("Entrez le numéro correspondant a la gare de départ: ");
			depart=Terminal.lireInt();
			System.out.println("Entrez le numéro correspondant a la gare d'arrivée: ");
			arrivee=Terminal.lireInt();
			double prixTrajet = 0;
			int i = 0;
			int reduc=0;
			boolean departTrouve = false;
			boolean arriveeTrouve = false;
			while(arriveeTrouve==false && i<prix.length){
				if(departTrouve) {
					reduc=reduc+1;
					double prixReduit=0;
					if(reduc==1) {
						prixReduit=prix[i]-(prix[i]*10/100);
						prixTrajet=prixTrajet+prixReduit;
					} else if(reduc==2) {
						prixReduit=prix[i]-(prix[i]*20/100);
						prixTrajet=prixTrajet+prixReduit;
					} else if(reduc==3) {
						prixReduit=prix[i]-(prix[i]*30/100);
						prixTrajet=prixTrajet+prixReduit;
					} else if(reduc==4) {
						prixReduit=prix[i]-(prix[i]*40/100);
						prixTrajet=prixTrajet+prixReduit;
					}
				}
				if(departTrouve==false && depart==i) {
					prixTrajet=prixTrajet+prix[i];
					departTrouve = true;
				}
				
				if(arriveeTrouve==false && arrivee==i+1) {
					arriveeTrouve=true;
				}
				i=i+1;
			}
			System.out.println("Tarif avec réductions appliquées pour le trajet sélectionné: "+prixTrajet);
		} else if(ligne==2) {
			System.out.println("Choisissez votre gare parmis la liste ci-dessous: ");
			for(int j=0; j<villes2.length; j++) {
				System.out.println(j+" - "+villes2[j]);
			}
			System.out.println("Entrez le numéro correspondant a la gare de départ: ");
			depart=Terminal.lireInt();
			System.out.println("Entrez le numéro correspondant a la gare d'arrivée: ");
			arrivee=Terminal.lireInt();
			double prixTrajet = 0;
			int i = 0;
			int reduc=0;
			boolean departTrouve = false;
			boolean arriveeTrouve = false;
			while(arriveeTrouve==false && i<prix.length){
				if(departTrouve) {
					reduc=reduc+1;
					double prixReduit=0;
					if(reduc==1) {
						prixReduit=prix[i]-(prix[i]*10/100);
						prixTrajet=prixTrajet+prixReduit;
					} else if(reduc==2) {
						prixReduit=prix[i]-(prix[i]*20/100);
						prixTrajet=prixTrajet+prixReduit;
					} else if(reduc==3) {
						prixReduit=prix[i]-(prix[i]*30/100);
						prixTrajet=prixTrajet+prixReduit;
					} else if(reduc==4) {
						prixReduit=prix[i]-(prix[i]*40/100);
						prixTrajet=prixTrajet+prixReduit;
					}
				}
				if(departTrouve==false && depart==i) {
					prixTrajet=prixTrajet+prix[i];
					departTrouve = true;
				}
				
				if(arriveeTrouve==false && arrivee==i+1) {
					arriveeTrouve=true;
				}
				i=i+1;
			}
			System.out.println("Tarif avec réductions appliquées pour le trajet sélectionné: "+prixTrajet);

		}
		
	}
	public static void calculTrajet(String[] villes, String[] villes2, double[] prix) {
		int depart;
		int arrivee;
		System.out.println("Vous voulez obtenir des tarifs pour la ligne 1 ou la ligne 2 ? ");
		int ligne=Terminal.lireInt();
		if(ligne==1) {
			System.out.println("Choisissez votre gare parmis la liste ci-dessous: ");
			for(int j=0; j<villes.length; j++) {
				System.out.println(j+" - "+villes[j]);
			}
			System.out.println("Entrez le numéro correspondant a la gare de départ: ");
			depart=Terminal.lireInt();
			System.out.println("Entrez le numéro correspondant a la gare d'arrivée: ");
			arrivee=Terminal.lireInt();
			double prixTrajet = 0;
			int i = 0;
			boolean departTrouve = false;
			boolean arriveeTrouve = false;
			while(arriveeTrouve==false && i<prix.length){
				if(departTrouve) {
					prixTrajet=prixTrajet+prix[i];
				}
				if(departTrouve==false && depart==i) {
					prixTrajet=prixTrajet+prix[i];
					departTrouve = true;
				}
				
				if(arriveeTrouve==false && arrivee==i+1) {
					arriveeTrouve=true;
				}
				i=i+1;
			}
			System.out.println("Tarif pour le trajet sélectionné: "+prixTrajet);
		} else if(ligne==2) {
			System.out.println("Choisissez votre gare parmis la liste ci-dessous: ");
			for(int j=0; j<villes2.length; j++) {
				System.out.println(j+" - "+villes2[j]);
			}
			System.out.println("Entrez le numéro correspondant a la gare de départ: ");
			depart=Terminal.lireInt();
			System.out.println("Entrez le numéro correspondant a la gare d'arrivée: ");
			arrivee=Terminal.lireInt();
			double prixTrajet = 0;
			int i = 0;
			boolean departTrouve = false;
			boolean arriveeTrouve = false;
			while(arriveeTrouve==false && i<prix.length){
				if(departTrouve) {
					prixTrajet=prixTrajet+prix[i];
				}
				if(departTrouve==false && depart==i) {
					prixTrajet=prixTrajet+prix[i];
					departTrouve = true;
				}
				
				if(arriveeTrouve==false && arrivee==i+1) {
					arriveeTrouve=true;
				}
				i=i+1;
			}
			System.out.println("Tarif pour le trajet sélectionné: "+prixTrajet);

		}
		
		
	}
	public static void afficher(String[] villes, String[] villes2, double[] prix) {
		for (int i=0; i<prix.length; i=i+1){
			System.out.println("Prix :"+prix[i]+" pour trajet: "+villes[i]+" à "+villes[i+1]);
		}
		System.out.println("---------------------------------------");
		for (int i=0; i<prix.length; i=i+1){
			System.out.println("Prix :"+prix[i]+" pour trajet: "+villes2[i]+" à "+villes2[i+1]);
		}
	}
	public static void main(String[] args) {
		String[] villes = {"Vierzon", "Salbris", "Nouans", "Lamotte-Beuvron", "La Ferté Saint-Aubin", "Orléans"};
		String[] villes2 = {"Porte Maillot", "Jardin d'Acclimatation", "Fondation Louis Vuitton", "Porte de Madrid", "Route des Lacs", "Bagatelle"};
		double[] prix = {3.20, 1.80, 2.30, 4.20, 5.00};
		afficher(villes,villes2,prix);
		//calculTrajet(villes,villes2,prix);
		calculReducTrajet(villes,villes2,prix);
	}
	
}