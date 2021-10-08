public class HelloUniverseAND {
    public static void main(String... args) {
        String phraseIntroduction="En %d, les planètes du système solaire étaient au nombre de : %d ";
        int nbPlanetes=7;
        short annee = 1780;
        if(annee < 2020 && annee > 1600) {
            if ( annee < 1700) {
                nbPlanetes = 7;
            }
            else if ( annee < 1800 ) {
                nbPlanetes = 8;
            }
            else if (annee < 2006 ) {
                nbPlanetes = 9;
            }
            else {
                nbPlanetes = 8;
            }

        }
        else {
            System.out.println("Le programme ne peut pas fournir de résultat pour l'année "+annee);
        }
        System.out.printf(phraseIntroduction,annee,nbPlanetes);


    }
}
