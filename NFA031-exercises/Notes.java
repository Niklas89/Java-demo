import java.util.ArrayList;
public class Notes {
	public static void main(String[] args) {
		ArrayList<Integer> notes= new ArrayList<Integer>();
		ArrayList<Integer> coef= new ArrayList<Integer>();
		boolean fin= false;
		while (! fin) {
			Terminal.ecrireStringln("votre choix : ");
			Terminal.ecrireStringln("1: ajouter une note et son coefficient");
			Terminal.ecrireStringln("2: supprimer une note et son coefficient");
			Terminal.ecrireStringln("3: changer une note et son coefficient");
			Terminal.ecrireStringln("4: terminer et afficher toutes les notes et la moyenne");
			int rep= Terminal.lireInt();
			if (rep == 1) { // ajout d’une note
				Terminal.ecrireString("note :");
				int nb= Terminal.lireInt();
				Terminal.ecrireString("coefficient :");
				int co= Terminal.lireInt();
				ajouterNote(notes,coef,nb,co);
			} else if (rep == 2) {
				// suppression de la note i.
				afficherNotes(notes,coef);
				Terminal.ecrireString("numéro de la note à enlever: ");
				int i= Terminal.lireInt();
				// on supprime la note
				supprimerNote(notes,coef,i);
				Terminal.ecrireStringln("Notes après suppression");
				afficherNotes(notes,coef);
			}else if (rep == 3) {
				// changement de la note i.
				afficherNotes(notes,coef);
				Terminal.ecrireString("numéro de la note à changer: ");
				int i= Terminal.lireInt();
				Terminal.ecrireString("écrire la nouvelle note: ");
				int j= Terminal.lireInt();
				Terminal.ecrireString("écrire le nouveau coefficient: ");
				int k= Terminal.lireInt();
				// on change la note
				changerNote(notes,coef,i,j,k);
				Terminal.ecrireStringln("Notes après changements");
				afficherNotes(notes,coef);
			} else {
				fin = true;
			}
		}
		Terminal.ecrireStringln("Notes au final");
		afficherNotes(notes,coef);
		Terminal.ecrireStringln("La moyenne est:");
		Terminal.ecrireDoubleln(calculMoyenne(notes,coef));
	}
	public static void ajouterNote(ArrayList<Integer> notes, ArrayList<Integer> coef, int nb, int co) {
		notes.add(nb);
		coef.add(co);
	}
	public static void changerNote(ArrayList<Integer> notes, ArrayList<Integer> coef, int nb, int j, int co) {
		notes.set(nb,j);
		coef.set(nb,co);
	}
	public static void supprimerNote(ArrayList<Integer> notes, ArrayList<Integer> coef, int nb) {
		notes.remove(nb);
		coef.remove(nb);
	}
	public static double calculMoyenne(ArrayList<Integer> notes, ArrayList<Integer> coef) {
		double moyenne= 0;
		double total= 0;
		double coefTotal = 0;
		for (int i= 0; i < notes.size(); i++) {
			total= total + notes.get(i)*coef.get(i);
			coefTotal = coefTotal + coef.get(i);
		}
		moyenne = total / coefTotal;
		return moyenne;
	}
	public static void afficherNotes(ArrayList<Integer> notes, ArrayList<Integer> coef) {
		Terminal.ecrireStringln("Toutes les notes:");
		for (int i= 0; i < notes.size(); i++) {
			Terminal.ecrireStringln(i+ ". "+
			notes.get(i)+" coef "+coef.get(i));
		}
	}
}