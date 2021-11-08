class InferieurDeux extends RuntimeException {}
public class Menu_3 {

	public static String[] saisirChoix(String[] tab, int taille){	
		tab = new String[taille];
		for (int i=0; i<taille; i=i+1){
			Terminal.ecrireStringln("Entrez un choix dans le menu");
			tab[i]=Terminal.lireString();
		}
		return tab;
	}

	public static String[] afficherChoix(String[] tab){	
		System.out.println("Les choix du menu sont: ");	
		for (int i= 0; i < tab.length; i=i+1){
			System.out.println(tab[i]);
		}
		return tab;
	}

	public static int nbChoix(String[] tab){	
		int taille=0;
		taille = lireEntier("Taille du tableau? ");
		afficherChoix(saisirChoix(tab,taille));
		System.out.println("Nombre de choix choisis: ");	
		for (int i= 0; i < taille; i=i+1){
			System.out.println(i);
		}
		return taille;
	}

	public static int lireEntier(String msg){
		int entier=0;
		boolean correct;
		do{
			try{
				Terminal.ecrireString(msg);
				entier = Terminal.lireInt();
				if (entier<2){
					throw new InferieurDeux();
				}
				correct=true;
			} catch(TerminalException e){
				Terminal.ecrireString("Vous avez tapé autre chose qu’un entier");
				Terminal.ecrireStringln(" Veuillez recommencer");
				correct = false;
			} catch (InferieurDeux e) {
				Terminal.ecrireStringln("Taille tableau inferieur a deux, veuillez recommencer.");
				correct = false;
			}
		} while(!correct);
		return entier;
	}

	public static void main(String[] args){
		String[] tab ={};
		System.out.println("taille: "+nbChoix(tab));
	}

}