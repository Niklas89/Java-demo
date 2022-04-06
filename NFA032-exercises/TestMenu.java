package exoExceptionsMenu;

import java.util.Scanner;

public class TestMenu {

	public static void main(String[] args) {
		Menu menu1 = new Menu(3);
		try {
			menu1.ajouterChoix("Menu1Choix1");
			menu1.ajouterChoix("Menu1Choix2");
			menu1.ajouterChoix("Menu1Choix3");
		} catch(PlusDePlaceException e) {
			System.out.println("Il n'y a plus de place dans le menu1.");
		}
		// menu1.retirerChoix("Menu1Choix2");
		/*
		String[] tab = menu1.getContent();
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
		*/
		menu1.afficherChoixMenu();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez un nombre: ");
		try {
			int entier1 = menu1.saisirChoix(sc1.nextInt());
			sc1.close();
		} catch(NumberFormatException e) {
			System.out.println("Ce nest pas un nombre !");
		}
		
		// Menu 2 ci-dessous -------------------------
		
		Menu menu2 = new Menu(5);
		try {
			menu2.ajouterChoix("Menu2Choix1");
			menu2.ajouterChoix("Menu2Choix2");
			menu2.ajouterChoix("Menu2Choix3");
			menu2.ajouterChoix("Menu2Choix4");
			menu2.ajouterChoix("Menu2Choix5");
		} catch(PlusDePlaceException e) {
			System.out.println("Il n'y a plus de place dans le menu2.");
		}
		menu2.afficherChoixMenu();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Entrez un nombre: ");
		try {
			int entier2 = menu2.saisirChoix(sc2.nextInt());
			sc2.close();
		} catch(NumberFormatException e) {
			System.out.println("Ce nest pas un nombre !");
		}
		
		
	}

}
class PlusDePlaceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}