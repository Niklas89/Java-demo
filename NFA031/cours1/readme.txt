ConversionCmPouces :

En vous inspirant du programme Conversion du cours, écrivez un programme qui demande à
l’utilisateur une longueur en centimètres et la convertit en une longueur en pouces (inches en anglais).
Un centimètre correspond à 0,393701 pouces.


_____________________________________________________________________________________


Conversion :

Faites un copier-coller de ce programme et corrigez chacune des erreurs de compilation qui se produit:

public class Conversion {
	public static void main (String[] args) {
		double euros;
		double dollars;
		System.out.println("Somme en euros? ");
		euros = Terminal.lireDouble();
		dollars = euros *1.118;
		System.out.println("La somme en dollars: ");
		System.out.println(dollars);
	}
}

Copiez ce programme par copier-coller (sélectionner à la souris, puis controle-c et controle-v). Le compiler et l'exécuter.
modifiez ce programme pour qu'il convertisse une somme en euros en une somme en dollars avec le taux de change de 1 euro pour 1,30 dollars.
modifiez ce programme pour qu'il lise au clavier le taux de change du jour.


___________________________________________________________________________________


