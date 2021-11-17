import java.util.ArrayList;
/**
*Une simulation de caisse enregistreuse.
*/
public class Caisse {
	public static void main(String args[]) {
		ArrayList<String> nomsArticles= new ArrayList<String>();
		ArrayList<Double> prixArticles= new ArrayList<Double>();
		boolean fin= false;
		while (! fin) {
			Terminal.ecrireStringln("votre choix : ");
			Terminal.ecrireStringln("1: ajouter un article");
			Terminal.ecrireStringln("2: supprimer un article");
			Terminal.ecrireStringln("3: terminer et afficher le total");
			int rep= Terminal.lireInt();
			if (rep == 1) { // ajout d’un produit
				Terminal.ecrireString("nom de l’article :");
				String nom= Terminal.lireString();
				Terminal.ecrireString("prix de l’article :");
				double prix= Terminal.lireDouble();
				nomsArticles.add(nom);
				prixArticles.add(prix);
				afficherTicket(nomsArticles, prixArticles);
			} else if (rep == 2) {
				// suppression du produit dans la case i.
				afficherTicket(nomsArticles, prixArticles);
				Terminal.ecrireString("numéro de l’article à enlever");
				int i= Terminal.lireInt();
				// on supprime le produit dans les deux ArrayList.
				nomsArticles.remove(i);
				prixArticles.remove(i);
				Terminal.ecrireStringln("Ticket après suppression");
				afficherTicket(nomsArticles, prixArticles);
			} else {
				fin = true;
			}
		}
		Terminal.ecrireStringln("Ticket final");
		afficherTicket(nomsArticles, prixArticles);
		// calcul du prix
		double total= 0;
		for (int i= 0; i < prixArticles.size(); i++) {
			total= total + prixArticles.get(i);
		}
		Terminal.ecrireStringln("Total " + total);
	}
	public static void afficherTicket(ArrayList<String> noms, ArrayList<Double> prixArticles) {
		for (int i= 0; i < noms.size(); i++) {
			Terminal.ecrireStringln(i+ ". "+
			noms.get(i)+
			" prix: "+ prixArticles.get(i));
		}
	}
}