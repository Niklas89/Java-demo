// Comment lire un fichier en Java avec BufferedReader /////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExemple {
    private static final String FILENAME = "C:\\Users\\utilisateur\\javademo\\NFP135\\Exam2020\\in.txt";

    public static void main(String[] args) {
        int entier = 0;
        int somme = 0;
        BufferedReader bufferedreader = null;
        FileReader filereader = null;
        try {
          filereader = new FileReader(FILENAME);
          bufferedreader = new BufferedReader(filereader);
          String strCurrentLine;
          while ((strCurrentLine = bufferedreader.readLine()) != null) {
            System.out.println(strCurrentLine);
            entier = Integer.parseInt(strCurrentLine);
            if(entier > 0) {
                somme += entier;
            }
          }
        } catch (IOException e) {
          e.printStackTrace();
        } catch (NumberFormatException ex) {
            System.out.println("Vous avez ecrit du texte dans le fichier, veuillez modifier le fichier.");
        } finally {
          try {
            if (bufferedreader != null)
              bufferedreader.close();
            if (filereader != null)
              filereader.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
        System.out.println("La somme est " + somme);
    }
}




// Calcule de la puissance /////////////////////////////////////////////////////////////////////////////////

public class Exo2 {
    public static int puissance(int x, int n) {
        int produit = 1;
        if(n < 0) {
            System.out.println("impossible de calculer cette puissance avec un exposant négatif");
            return -1;
        } else {
            for(int i=0; i<n; i++) {
            produit = produit*x; 
            }
        return produit;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(puissance(x,n));
    }
}


// Calcule de Min et Max /////////////////////////////////////////////////////////////////////////////////

public class Exo1 {
    public static int max(int[] entiers) {
        int max = 0;
        for(int i=0; i<entiers.length; i++) {
            if(entiers[i]>max) {
                max = entiers[i];
            }
        }
        return max;

    }
    public static int min(int[] entiers) {
        int min = entiers[0];
        for(int i=0; i<entiers.length; i++) {
            if(entiers[i]<min) {
                min = entiers[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] entiers = {4,5,8,50,9,2,99};
        System.out.println("Valeur minimale = "+min(entiers));
       System.out.println("Valeur maximale = "+max(entiers));
    }

}


// Saisie utilisateur et try-catch Exception //////////////////////////////////////////////////////

import java.util.Scanner; 

public class Exo7 {
    public static double noteFinale(double tp, double exam) {
        double noteFinale = 0;
        if(exam >= 10 && exam >= tp) {
            noteFinale = exam;
        } else if(tp > exam && exam >= 10) {
            noteFinale = (tp + exam) / 2;
        } 
        return noteFinale;
    }
    public static void main(String[] args) {
        boolean continueAsking = true;
        double tp = 0;
        double exam = 0;
        while(continueAsking) {
            try {
                 Scanner scanner = new Scanner(System.in);  
                System.out.print("Entrez la note du TP : ");  
                String strTP = scanner.next();  
                tp = Double.parseDouble(strTP);
                System.out.print("Entrez la note de l'exam : ");  
                String strExam = scanner.next(); 
                exam = Double.parseDouble(strExam);
                if((tp >= 0 && exam >= 0) && (tp <= 20 && exam <= 20)) {
                    continueAsking = false;
                } else {
                    throw new PasEntreZeroEtVingt();
                }
                //  keep in mind this rule: if the exceptions have parent-child relationship, 
                //the catch blocks must be sorted by the most specific exceptions first, then by the most general ones.
            } catch (PasEntreZeroEtVingt ex) {
                System.out.println("La valeur saisie ne se situe pas entre 0 et 20.");
            } catch (Exception ex) {
                System.out.println("Vous n'avez pas saisi la bonne valeur.");
            }

        }
        
        System.out.println(noteFinale(tp,exam));

    }
}
class PasEntreZeroEtVingt extends RuntimeException{}



//Le Plus Grand Diviseur Premier /////////////////////////////////////////////////////////////////////////////////

public class Exo6 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(lePlusGrandDiviseurPremier(n));
    }
    public static int lePlusGrandDiviseurPremier(int n) {
        int plusGrandDiviseur = 0;
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                plusGrandDiviseur = i;
            }
        }
        return plusGrandDiviseur;
    }
}





// Le Plus Grand Ecart entre deux nombres successifs /////////////////////////////////////////////////////////////////////////////////

public class Exo5q2 {
  public static void main(String[] args) {
    int[] t = {2, 1, 2, 0, 3, 3, 3, 5, 5, 5, 15, 1};
    System.out.println(indicePGEcart(t));
  }
  static int indicePGEcart(int [] t) {
    int plusGrandEcart = 0;
    int nbPrecedent = 0;
    int ecart = 0;
    for(int i=0; i<t.length; i++) {
      if((t[i]-nbPrecedent) < 0){
        ecart = -1*(t[i]-nbPrecedent);
      } else {
        ecart = t[i]-nbPrecedent;
      }
      if(ecart > plusGrandEcart) {
        plusGrandEcart = ecart;
      }
      nbPrecedent = t[i];
    }
    return plusGrandEcart;
  }
}

// Indice du premier nombre d’une succession d’entiers /////////////////////////////////////////////////////////////////////////////////

public class Exo5q1 {
  public static void main(String[] args) {
    int[] t = {2, 1, 2, 0, 3, 3, 3, 5, 5, 5, 10, 11};
    System.out.println(indicePremRepet(t));
  }
  static int indicePremRepet(int [] t) {
    int nbRepet = 0;
    for(int i=0; i<t.length; i++) {
      if(t[i] == nbRepet) {
        return i-1;
      }
      nbRepet = t[i];
    }
    return -1;
  }
}



// Lecture de fichier avec Scanner et TryCatch /////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
//Lecture du fichier « toto.txt »
class Slide6{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(new File("toto.txt"));
            int x = s.nextInt();
            System.out.println(x);
            String y = s.next();
            //y = s.nextLine(); //ça récupère ce qui reste après 1000
            //                  //sur la première ligne, le saut de ligne
            //y = s.nextLine(); //ça récupère la 2ème ligne du fichier
            System.out.println(y);
        }catch(FileNotFoundException e){
            System.out.println("Fichier 'toto.txt' pas trouvé");
        }catch(NoSuchElementException e){
            System.out.println("Pas assez de données dans toto.txt");
        } 
    } 
}


// Try Catch  /////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Trycatch {
    public static void main(String[] args){
boolean saisieCorrecte = false;
        do{
        try{ 
            System.out.println("Saisir une valeur entière svp");
            Scanner s = new Scanner(System.in);
            Int x = s.nextInt();
            System.out.println("Vous avez saisi x="+x);
            int y = 10/x;
            System.out.println("y="+y);
     saisieCorrecte = true;
        } catch(InputMismatchException e){
            System.out.println("Un problème est survenu lors de la saisie");
     saisieCorrecte = false;
        } catch(ArithmeticException e){
            System.out.println("Division par 0");
     saisieCorrecte = false;
        }
    }
}
while(!saisieCorrecte);
}


// Calcule de Min et Max – deuxième méthode /////////////////////////////////////////////////////////////////////////////////

class valMinMaxTab {
    static double min; //deux variables globales, c.à.d., 
    static double max; //deux variables visibles dans tous le programme

    static double valMinTab(double[] tab){
        double min = tab[0];
        for(int i=1;i<tab.length;i++){
            if(min > tab[i])
                min = tab[i];
        }
        return min;
    }
    static double valMaxTab(double[] tab){
        //1. inverser toutes les valeurs dans tab
        for(int i=0;i<tab.length;i++)
            tab[i] = - tab[i];
        //2. On utilise valMinTab, une fonction déjà écrite et bien vérifiée
        double m = valMinTab(tab);  
        //3. 
        return -m;                 //si m=-1000, on retourne 1000
    }
    static void calcMinMax(double[] tab){
        min = valMinTab(tab);
        max = valMaxTab(tab);
    }
    public static void main(String[] args){
        double[] td = {7.9, 12.3, -8.4,  1000.0, 12.9};
        calcMinMax(td);
        System.out.println(min);
        System.out.println(max);
    }
}


// Calcule de racine carré /////////////////////////////////////////////////////////////////////////////////

class Slide11 {
    public static double racine2(double x){
        double[] r = new double[10];
        r[0] = x;
        for(int i=0;i<r.length-1; i++)//i c'est le n dans la formule
            r[i+1] = (r[i]+x/r[i])/2;
        return r[r.length-1];
    }
    public static double racine4(double x){
        return racine2(racine2(x));
    }
    public static void main(String[] args){
        double racinec1 = Math.sqrt(2);
        double racinec2 = racine2(2); //1.4142..
        System.out.println(racinec1);
        System.out.println(racinec2);
        System.out.println("Racine 4 de 81: "+racine4(81));
    }
}
//r1 = x , disons pour x=9
//r2 = (r1+x/r1)/2 = (9+9/9)/2 = 10/2 = 5
//r3 = (r2+x/r2)/2 = (5+9/5)/2 = (5+1.8)/2 = 6.8/2 = 3.4
//r4 = (r3+x/r3)/2 = (3.4+9/3.4)/2 = 3.0235



// Lecture de fichier avec BufferedReader /////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

public class Exo4 {
  public static void main(String[] args) {
    int somme = 0;
        try{
            BufferedReader objLecteur = new BufferedReader(new FileReader("in.txt"));
            
            for(int i = 0; i < 5; i++) {
                String ligne = objLecteur.readLine();
                somme = somme + Integer.parseInt(ligne);
            }
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        System.out.println(somme);
  }
}


// Note la plus fréquente /////////////////////////////////////////////////////////////////////////////////

public class Exo5 {
  public static void main(String[] args) {
    int[] notes = {11, 15, 3, 15, 5, 3, 15, 3, 15};
    System.out.println(noteLaPlusFrequente(notes));
  }
  public static int noteLaPlusFrequente(int[] notes) {
    int[] noteMax = new int[9];
    for(int i=0;i<notes.length;i++){
      for(int j=0;j<notes.length;j++) {
        if(notes[i] == notes[j]){
          noteMax[i]++;
        }
      }
    }
    int max = noteMax[0];
    int maxNote = notes[0];
    for(int j=0;j<noteMax.length;j++) {
      if(noteMax[j]>max) {
        max = noteMax[j];
        maxNote = notes[j];
      }
    }
    return maxNote;
  }
}



// Dessiner un losange (un triangle normal + un triangle inversé en dessous) /////////////////////////////////////////////////////////////////////////////////

public class Exo6 {
  public static void main(String[] args) {
    int taille = 7;
    losange(taille);
  }
  public static void espacesEtoiles(int nbEspaces, int nbEtoiles) {
    for(int j=0;j<nbEspaces;j++){
      System.out.print(" ");
    }
    for(int j=0;j<nbEtoiles;j++){
      System.out.print("*");
    }
  }
  public static void losange(int taille) {
    int nbEspaces = (taille-1)/2;
    int nbEtoiles = 1;
    for(int i=0;i<taille;i++) {
      if(i<=(taille-1)/2) {
        espacesEtoiles(nbEspaces,nbEtoiles);
        System.out.println();
        nbEspaces -= 1;
        if(nbEtoiles == taille) {
          nbEtoiles -=2;
          nbEspaces += 2;
        } else {
          nbEtoiles +=2;
        }
      } else {
        espacesEtoiles(nbEspaces,nbEtoiles);
        System.out.println();
        nbEtoiles -= 2;
        nbEspaces += 1;
      }
      
    }

  }
}


// Afficher une version compressée d’une chaine de caractères /////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; 

public class Exo7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez une chaine de caracteres pour obtenir sa forme compressee : ");  
        String chaine = scanner.next();  
    //String chaine = "lkmlkmlkokkklmqsdo";

    // nbiteration[] contiendra le nb d'itération de chaque caractere
    int[] nbiteration = new int[chaine.length()];
    // boucle for qui incrémente dans nbiteration[] pour ajouter le nb d'itération
    for(int i=0; i<chaine.length(); i++) {
      for(int j=0;j<chaine.length();j++) {
        if(chaine.charAt(i) == chaine.charAt(j)){
          nbiteration[i]++;
        }
      }
    }

    // je crée un nouveau tableau pour ajouter l'association nb d'itération + le caractere en question
    String[] association = new String[nbiteration.length];
    // je boucle pour ajouter dans ce tableau par ex "6k" a chaque endroit où il y a "k" dans la String chaine
    for(int j=0;j<nbiteration.length;j++) {
      if(nbiteration[j] == 1) {
        association[j] = ""+chaine.charAt(j);
      } else if(nbiteration[j] == 2) {
        association[j] = ""+chaine.charAt(j) + chaine.charAt(j);
      } else {
        association[j] = Integer.toString(nbiteration[j])+chaine.charAt(j);
      }
    }
    
    // je crée un nouveau String pour ajouter la valeur Max de l'association nb d'itération + le caractere en question
    String associationFinale = "";

    //boucle while qui check si le tableau est vide
    boolean checkifempty = true;
    int i = 0;
    while(checkifempty) {

      // déterminer la valeure maximale dans nbiteration[]
      int maxnbchar = nbiteration[0];
      String maxAssociation = association[0];
      int countNotZero = 0;
      
      // prendre le maximum
      for(int k=0;k<nbiteration.length;k++) {
        if(nbiteration[k]>maxnbchar){
          maxnbchar = nbiteration[k];
          maxAssociation = association[k];  
        }
      }

      associationFinale = associationFinale + maxAssociation;

      // supprimer
      for(int k=0;k<nbiteration.length;k++) {
        if(association[k].equals(maxAssociation)){
          association[k] = "";
          nbiteration[k] = 0;
        }
      }
      // check if empty
      for(int k=0;k<nbiteration.length;k++) {
        if(nbiteration[k] != 0 && association[k] != ""){
          countNotZero++;
        }
      }
      if(countNotZero == 0) {
        checkifempty = false;
      } else{
        countNotZero = 0;
      }
      i++;
    }

    // ce tableau est maintenant vide
    /*
    for(int k=0;k<association.length;k++) {
      System.out.print(association[k]);
    } */
    
    //System.out.println("---------------------");
    
    System.out.println(associationFinale);
  }
}

// TP noté carré magique /////////////////////////////////////////////////////////////////////////////////
// Un carrée magique (simplifié) est une matrice 3x3 avec 9 entiers strictement positifs (mat[i][j]> 0)
// disposées de sorte que la somme sur chaque ligne et chaque colonne soit la m^eme. Par exemple, la matrice ci-après
// a une somme de 10 sur chaque ligne et chaque colonne.

// Ecrire une fonction magique(int[][] matrice) qui renvoie true si la matrice passée comme argument
// représente un carré magique ou false sinon. On suppose que la matrice a une taille de 3 x 3.

// MA VERSION ////////////////////////////////////////////////////////
public class Exo6 {
  // Fonction qui vérifie si les valeurs d'un tableau sont égales
  public static boolean valeursEgales(int[] t){
    for(int i=0; i<t.length; i++){
      if(t[0] != t[i]) {
        return false;
      }
    }
    return true;
  }

  // fonction qui vérifie le carré magique
  public static boolean magique(int[][] matrice){
    // on stock dans ses deux tableaux la somme de chaque ligne dans sommeLigne
    // et la somme de chaque colonne dans sommeColonne
    int[] sommeLigne = new int[3];
    int[] sommeColonne = new int[3];

    // deux variables qui prennent la somme de ligne et la somme de colonne 
    // pour vérifier à la fin si ligne et colonne sont égales
    int varLigne = 0;
    int varColonne = 0;

    // calculer la somme de chaque ligne
    for(int i=0; i<3; i++) {
      for(int j=0; j<3; j++){
        sommeLigne[i] += matrice[i][j];
      }
    }
    varLigne = sommeLigne[0];
    // Vérifier si toutes les lignes sont égales entre eux
    boolean valeurLigne = valeursEgales(sommeLigne);

    // calculer la somme de chaque colonne
    for(int i=0; i<3; i++) {
      for(int j=0; j<3; j++){
        sommeColonne[i] += matrice[j][i];
      }
    }
    varColonne = sommeColonne[0];
    // Vérifier si toutes les colonnes sont égales entre eux
    boolean valeurColonne = valeursEgales(sommeColonne);


    // vérifier si la somme d'une ligne et d'une colonne sont bien égales entre eux
    boolean egaliteLigneColonne = true;
    if(varColonne != varLigne) {
      egaliteLigneColonne = false;
    }
    

    // Vérifier si tout est bien égale, true
    if(valeurColonne == true && valeurLigne == true && egaliteLigneColonne == true){
      return true;
    } 
    return false;
  }

  public static void main(String[] args) {
    int[][] matrice = {{2,5,3},{3,1,6},{5,4,1}};
    //int[][] mat = {     
           /* ligne 0 */  // {2, 5, 3},
           /* ligne 1 */  // {3, 1, 6},
           /* ligne 2 */  // {5, 4, 1}
                  // };
    System.out.println(magique(matrice));
  }
}


// VERSION DU PROF CORRIGE ////////////////////////////////////////////////////////
class Exo6{
    static boolean valeursEgales(int[] t){
        for(int i=0;i<t.length;i++){
            if(t[i]!=t[0]){
                return false;
            }
        }
        return true;
    }
    static int sommeLigne(int[][] m, int l){
        int somme = 0;
        for(int i=0;i<m.length;i++)
            somme = somme + m[l][i];
        return somme;
    }
    static boolean magique(int[][] m){
        int ligne0   = sommeLigne(m,0);
        int ligne1   = sommeLigne(m,1);
        int ligne2   = m[2][0] + m[2][1] + m[2][2];//ou sommeLigne(m,2);
        int collone0 = m[0][0] + m[1][0] + m[2][0];
        int collone1 = m[0][1] + m[1][1] + m[2][1];
        int collone2 = m[0][2] + m[1][2] + m[2][2];
        int[] t = new int[6];
        t[0] = ligne0  ;
        t[1] = ligne1  ;
        t[2] = ligne2  ;
        t[3] = collone0 ;
        t[4] = collone1 ;
        t[5] = collone2 ;
        //boolean val_egales_t = valeursEgales(t); 
        //return val_egales_t;
        return valeursEgales(t);
    }
    public static void main(String[] args){
        int[][] mat = {     
           /* ligne 0 */  {2, 5, 3},
           /* ligne 1 */  {3, 1, 6},
           /* ligne 2 */  {5, 4, 1}
                      };
        System.out.println(magique(mat));
    }
}


