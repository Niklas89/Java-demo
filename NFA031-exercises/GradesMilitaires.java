public class GradesMilitaires{
  /**
   * Lit au clavier puis retourne un entier positif compris entre min et max inclus.
   * Affiche {@param invite} comme message d'invitation, lit un entier et vérifie
   * qu'il est compris entre min et max. Si ce n'est pas le cas, 
   * un message est affichée et un nouvel entier est lu.
   */
  public static int lireIntPos( String invite, int min, int max){
    int x;
    while (true){
      try {
        System.out.print(invite);
        x =Terminal.lireInt();
        if (x<min)
          System.out.println("Le nombre doit etre plus grand que "+min);
        else if (x>max)
          System.out.println("Le nombre doit etre inférieur ou égal à "+max);
        else
          return x;
      } catch (TerminalException e) {
        System.out.println("Ce n'est pas un nombre.");
      }
    }
  }
  /**
   * Méthode qui affiche la liste des militaires
   */
  public static void afficheParLigneNumerotee(String[] liste){
    System.out.println("Armée");
    for(int i=0;i<liste.length;i++) {
      System.out.println(i+1+". "+liste[i]);
    }
  }
  /**
  * Affiche un menu et renvoie le choix de l'utilisateur compris entre 1 et 3. 
  */
  public static int proposeMenu(){
    System.out.println("-----------------------------------");
    System.out.println("1- Liste des militaires");
    System.out.println("2- Enregistrer un changement de grade");
    System.out.println("3- Quitter");
    return lireIntPos("Votre choix: ",1,3);
  }
  /**
   * Retourne la sous-chaîne de s après le 1er espace.
   * @param s chaîne dont on extrait le nom
   * @IllegalArgumentException si s est null ou vide ou si aucun espace
   */
  public static String getNom(String s) {
    if (s==null|| s.equals(""))
      throw new IllegalArgumentException("getGrade");
    String [] part = s.split(" ");
    if (part.length<2)
      throw new IllegalArgumentException("getNom");
    return part[1];
  } 
  /** 
   * Méthode qui change le grade d'un des militaires de la liste
   */
  public static void changeGradeDeNum(String[] liste, String[] grades){
    int militaire;
    int grade;
    String nomMilitaire;
    militaire = lireIntPos("Numero du militaire qui change de grade ? ",1,8);
    nomMilitaire = getNom(liste[militaire-1]);
    System.out.println("Liste des grades");
    for(int i=0;i<grades.length;i++) {
      System.out.println(i+1+". "+grades[i]);
    }
    grade = lireIntPos("Numero du nouveau grade ? ",1,9);
    liste[militaire-1] = grades[grade-1]+" "+nomMilitaire;
    System.out.println(liste[militaire-1]);
  }
  public static void main(String[] args) {
    String [] liste = {"soldat Dupont",
      "caporal Durand",
      "sergent Li",
      "adjudant Grouchy",
      "lieutenant Greely",
      "capitaine Flamme", 
      "colonel Vodka",
      "general Hiver"};
    String [] grades = {"soldat",
      "caporal", "sergent", "adjudant", "major", "lieutenant", "capitaine", 
      "colonel", "general"};
    int choix; // variable contenant le choix de l'utilisateur
    boolean fin = false;
    do{
      choix = proposeMenu();
      if(choix == 1) {
        afficheParLigneNumerotee(liste);
      }
      else if(choix == 2) {
        afficheParLigneNumerotee(liste);
        changeGradeDeNum(liste,grades);
      } else {
        fin = true;
      }
    }while(!fin);
  }
}
