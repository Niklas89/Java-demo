public class HelloUniverseCONTINUE_BREAK {
    public static void main(String... args) {

        boolean jeContinue=true;
        int nb = 0;
        while (jeContinue) {

                    System.out.println("Hello Universe");
                  nb++;
                  if(nb==5) {
                      continue;
                  } // quand on arrive à nb == 5 la boucle retourne au début sans passer
            // par le "Nb ne vaut pas 5"
            System.out.println("Nb ne vaut pas 5");
                  if(nb == 10) {
                      break;
                  }
                  // la boucle s'arrete quand nb == 10
        }


    }
}
 
