public class LeProg { // on commence le programme LeProg ici, la classe LeProg
	public static void main (String[] args) {  // ceci est lespace de commande principale entre les { }
		double nombre; // on déclare une variable à nombre à virgule 
		System.out.println("Entrez un nombre: ");   // "Entrez un nombre" s'affiche dans la console avec un retour à la ligne après
		nombre = Terminal.lireDouble(); // on demande à l'utilisateur d'entrer un nombre au clavier et dappuyer sur entrée pour valider
		System.out.print(nombre); // on affiche ce nombre
		System.out.println(" est un beau nombre"); // on affiche par la suite " est un beau nombre" et retour à la ligne
	}
}

// Question 1
// Le nom de ce programme est LeProg
// la catégorie nombre est une variable
// Terminal.lireDouble() - lireDouble() est une méthode situé dans la classe Terminal
// " est un beau nombre" est une chaine de charactères, un String en java
// Il y a des guillements à " est un beau nombre" car cest une chaine de charactères, nombre est une variable donc pas de guillements
