public class Planete {
    String nom;
    long diametre;
    String matiere;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAcoste;
    static String forme = "Sphérique";

    Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
        totalVisiteurs += vaisseau.nbPassagers;
        if(vaisseauActuellementAcoste == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println("Un vaisseau de type "+vaisseauActuellementAcoste.type+" doit s'en aller.");
        }
        Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;
        vaisseauActuellementAcoste = vaisseau;
        return  vaisseauPrecedent;


    }


    int revolution(int angle) {
        System.out.print("Je suis la planète "+nom+" et je tourne autour de mon étoile de "+angle+" degrés. ");
        return angle/360;
    }

    int rotation(int angle) {
        System.out.print("Je suis la planète "+nom+" et je tourne sur moi-même de "+angle+" degrés. ");
        return angle/360;
    }

    static String expansion(double distance) {
        if(distance < 14) {
            return "Oh la la mais c'est super rapide !";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }

}
