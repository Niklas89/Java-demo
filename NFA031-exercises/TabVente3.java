public class TabVente3 {
	public static void calculCA(int[][] nbVoiture, String[] vendeur, int[] prixModel, int[] totalVentesVendeur){
		for (int lig=0; lig<5; lig=lig+1){
			for (int col=0; col<4; col=col+1){
				totalVentesVendeur[lig] += nbVoiture[col][lig] * prixModel[col];
			}
			System.out.println("CA du vendeur "+vendeur[lig]+" (en EURO) est de : "+totalVentesVendeur[lig]);
		}
		System.out.println();
	}

	public static void prixModel(String[] model, int[] prixModel){
		for (int col=0; col<4; col=col+1){
			Terminal.ecrireStringln("Entrez le prix voiture du model "+model[col]+" : ");
			prixModel[col] = Terminal.lireInt();
			Terminal.ecrireString("Le prix du "+model[col]+" (en EURO) est de : ");
			Terminal.ecrireIntln(prixModel[col]);
		}
	}

	public static void totalVentes(int[][] nbVoiture, String[] model, String[] vendeur, int[] totalVentesModel){
		for (int col=0; col<4; col=col+1){
			int count = 0;
			for (int lig=0; lig<5; lig=lig+1){
				count += nbVoiture[col][lig];
			}
			totalVentesModel[col] = count;
			Terminal.ecrireString("TOTAL voitures vendues pour la "+model[col]+" : ");
			Terminal.ecrireIntln(count);
		}
		//recap ventes par model
		System.out.println();
		Terminal.ecrireStringln("RECAP TOTAL: ");
		for (int col=0; col<4; col=col+1){
			Terminal.ecrireString("pour "+model[col]+" : ");
			Terminal.ecrireIntln(totalVentesModel[col]);
		}
	}

	public static void afficher(int[][] nbVoiture, String[] model, String[] vendeur){
		for (int lig=0; lig<5; lig=lig+1){
			Terminal.ecrireStringln(vendeur[lig]+" a votre tour!");
			for (int col=0; col<4; col=col+1){
				Terminal.ecrireStringln("Entrez le nb de voitures vendues pour la "+model[col]+" : ");
				nbVoiture[col][lig] = Terminal.lireInt();
			}
			System.out.println();
		}
		System.out.println();
		// recap voitures vendues par vendeur
		for (int lig=0; lig<5; lig=lig+1){
			Terminal.ecrireStringln(vendeur[lig]+" :");
			for (int col=0; col<4; col=col+1){
				Terminal.ecrireString("Voitures vendues pour la "+model[col]+" : ");
				Terminal.ecrireIntln(nbVoiture[col][lig]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args){
		String[] model = {"Twingo","Clio",
		"Megane","Vel Satis"};
		String[] vendeur = {"Andre","Ingemar",
		"Jean-Jerome","Cindy", "Joey"};
		int[][] nbVoiture = new int[4][5];
		int[] totalVentesModel = new int[4];
		int[] prixModel = new int[4];
		int[] totalVentesVendeur = new int[5];
		afficher(nbVoiture,model,vendeur); // entrer le nb de voitures pour chaque vendeur et chaque model
		totalVentes(nbVoiture,model,vendeur,totalVentesModel); // total des ventes de chaque model
		System.out.println();
		prixModel(model,prixModel); // prix voiture de chaque model
		System.out.println();
		calculCA(nbVoiture,vendeur,prixModel,totalVentesVendeur); // CA de chaque vendeur
	}			
}