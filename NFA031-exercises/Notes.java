import java.util.ArrayList;
public class Notes {
	public static void main(String[] args) {
		ArrayList<Integer> notes= new ArrayList<Integer>();
		boolean fin= false;
		while (! fin) {
			Terminal.ecrireStringln("votre choix : ");
			Terminal.ecrireStringln("1: ajouter une note");
			Terminal.ecrireStringln("2: supprimer une note");
			Terminal.ecrireStringln("3: terminer et afficher le total");
			int rep= Terminal.lireInt();
			if (rep == 1) { // ajout d’une note
				Terminal.ecrireString("note :");
				int nb= Terminal.lireInt();
				ajouterNote(notes,nb);
			} else if (rep == 2) {
				// suppression du produit dans la note i.
				afficherNotes(notes);
				Terminal.ecrireString("numéro de la note à enlever: ");
				int i= Terminal.lireInt();
				// on supprime la note
				supprimerNote(notes,i);
				Terminal.ecrireStringln("Notes après suppression");
				afficherNotes(notes);
			} else {
				fin = true;
			}
		}
		Terminal.ecrireStringln("Notes au final");
		afficherNotes(notes);
		Terminal.ecrireStringln("La moyenne est:");
		Terminal.ecrireDoubleln(calculMoyenne(notes));
	}
	public static void ajouterNote(ArrayList<Integer> notes, int nb) {
		notes.add(nb);
	}
	public static void supprimerNote(ArrayList<Integer> notes, int nb) {
		notes.remove(nb);
	}
	public static double calculMoyenne(ArrayList<Integer> notes) {
		double moyenne= 0;
		double total= 0;
		for (int i= 0; i < notes.size(); i++) {
			total= total + notes.get(i);
		}
		moyenne = total / notes.size();
		return moyenne;
	}
	public static void afficherNotes(ArrayList<Integer> notes) {
		Terminal.ecrireStringln("Toutes les notes:");
		for (int i= 0; i < notes.size(); i++) {
			Terminal.ecrireStringln(i+ ". "+
			notes.get(i));
		}
	}
}