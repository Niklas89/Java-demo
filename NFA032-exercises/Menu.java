package exoExceptionsMenu;
import java.util.*;


public class Menu {
	private String[] choixMenu;
	private int n;
	
	public Menu(int nbChoix) {
		choixMenu = new String[nbChoix];
		n = choixMenu.length;
	}
	
	public String[] getContent(){
		String[] copieDeMenu = new String[choixMenu.length];
		for (int i=0; i<choixMenu.length; i++)
			copieDeMenu[i] = choixMenu[i];
		return copieDeMenu;
	}

	public void ajouterChoix(String choix) throws PlusDePlaceException {
		int i=0;
		while(i<choixMenu.length && choixMenu[i]!=null)
			i++;
		if (i==choixMenu.length)
			throw new PlusDePlaceException();
		else
			choixMenu[i]=choix;
	}
/*
	public void retirerChoix(String choix) throws NoSuchElementException {
		int i = 0;
		while(i<choixMenu.length && ! choixMenu[i].equals(choix))
			i++;
		if (i==choixMenu.length)
			throw new NoSuchElementException();
		else
			choixMenu[i]=null;
	} */
	
	public void afficherChoixMenu() {
		for(int i=0;i<choixMenu.length;i++){
			System.out.println(i+1 + ": " + choixMenu[i]);
		}
	}
	
	public int saisirChoix(int entier) {
		try {
			
			if(this.n<=1) 
				throw new InferieurA1();
			if(entier>this.n || entier<1) 
				throw new PasComprisEntre1etN();
		} catch(InferieurA1 ex) {
			System.out.println("N est inferieur ou egal à 1.");
		} catch(PasComprisEntre1etN ex) {
			System.out.println("L'entier doit etre compris entre 1 et n.");
		} 
		return entier;
	}
}

class InferieurA1 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
class PasComprisEntre1etN extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
class CeNestPasUnNb extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}

