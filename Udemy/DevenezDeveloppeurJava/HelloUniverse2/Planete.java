public class Planete {
    String nom;
    long diametre;
    String matiere;
    int totalVisiteurs;
    Atmosphere atmosphere;

    void accueillirVaisseau(int nbHumains) {
        totalVisiteurs += nbHumains ;
    }

    void accueillirVaisseau(String typeVaisseau) {
        if(typeVaisseau.equals("CHASSEUR")) {
            totalVisiteurs += 3;
        }
        else if(typeVaisseau.equals("FREGATE")) {
            totalVisiteurs += 12;
        }
        else if(typeVaisseau.equals("CROISEUR")) {
            totalVisiteurs += 50;
        }
    }

    int revolution(int angle) {
        System.out.print("Je suis la planète "+nom+" et je tourne autour de mon étoile de "+angle+" degrés. ");
        return angle/360;
    }

    int rotation(int angle) {
        System.out.print("Je suis la planète "+nom+" et je tourne sur moi-même de "+angle+" degrés. ");
        return angle/360;
    }

}
