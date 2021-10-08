public class HelloUniverse {
    public static void main(String... args) {

        Planete planeteMercure = new Planete();
        planeteMercure.nom = "Mercure";
        planeteMercure.diametre = 4880;
        planeteMercure.matiere = "Tellurique";
        Atmosphere atmosphereMercure = new Atmosphere();
        atmosphereMercure.oxygene = 42f;
        atmosphereMercure.sodium = 29f;
        atmosphereMercure.hydrogene = 22f;
        planeteMercure.atmosphere = atmosphereMercure;

        Planete soleil = new Planete();
        soleil.nom = "Soleil";
        soleil.diametre = 1391000;
        soleil.matiere = "Gazeuse";

        Planete planeteVenus = new Planete();
        planeteVenus.nom = "Venus";
        planeteVenus.diametre = 12100;
        planeteVenus.matiere = "Tellurique";
        Atmosphere atmosphereVenus = new Atmosphere();
        atmosphereVenus.dioxydeCarbone = 96f;
        atmosphereVenus.nitrogene = 3f;
        planeteVenus.atmosphere = atmosphereVenus;

        Planete planeteTerre = new Planete();
        planeteTerre.nom = "Terre";
        planeteTerre.diametre = 12756;
        planeteTerre.matiere = "Tellurique";
        Atmosphere atmosphereTerre = new Atmosphere();
        atmosphereTerre.nitrogene = 78f;
        atmosphereTerre.oxygene = 21f;
        atmosphereTerre.argon = 1f;
        planeteTerre.atmosphere = atmosphereTerre;

        Planete planeteMars = new Planete();
        planeteMars.nom = "Mars";
        planeteMars.diametre = 6792;
        planeteMars.matiere = "Tellurique";
        Atmosphere atmosphereMars = new Atmosphere();
        atmosphereMars.dioxydeCarbone = 95f;
        atmosphereMars.nitrogene = 3f;
        atmosphereMars.argon = 1.5f;
        planeteMars.atmosphere = atmosphereMars;

        Planete planeteJupiter = new Planete();
        planeteJupiter.nom = "Jupiter";
        planeteJupiter.diametre = 142984;
        planeteJupiter.matiere = "Gazeuse";
        Atmosphere atmosphereJupiter = new Atmosphere();
        atmosphereJupiter.hydrogene = 90f;
        atmosphereJupiter.helium = 10f;
        planeteJupiter.atmosphere = atmosphereJupiter;

        Planete planeteSaturne = new Planete();
        planeteSaturne.nom = "Saturne";
        planeteSaturne.diametre = 120536;
        planeteSaturne.matiere = "Gazeuse";
        Atmosphere atmosphereSaturne = new Atmosphere();
        atmosphereSaturne.hydrogene = 96f;
        atmosphereSaturne.helium = 3f;
        planeteSaturne.atmosphere = atmosphereSaturne;

        Planete planeteUranus = new Planete();
        planeteUranus.nom = "Uranus";
        planeteUranus.diametre = 120536;
        planeteUranus.matiere = "Gazeuse";
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.hydrogene = 83f;
        atmosphereUranus.helium = 15f;
        atmosphereUranus.methane = 2.5f;
        planeteUranus.atmosphere = atmosphereUranus;

        Planete planeteNeptune = new Planete();
        planeteNeptune.nom = "Neptune";
        planeteNeptune.diametre = 49532;
        planeteNeptune.matiere = "Gazeuse";
        Atmosphere atmosphereNeptune = new Atmosphere();
        atmosphereNeptune.hydrogene = 84f;
        atmosphereNeptune.helium = 12f;
        atmosphereNeptune.methane = 2f;
        planeteNeptune.atmosphere = atmosphereNeptune;

        Planete planetePluton = new Planete();
        planetePluton.nom = "Pluton";
        planetePluton.diametre = 2300;
        planetePluton.matiere = "Gazeuse";


        Planete sedna = new Planete();

        System.out.println(sedna.nom+" est une planète "+sedna.matiere+" avec un diamètre de "+sedna.diametre+" kilomètres.");

        System.out.println("Neptune a effectué "+planeteNeptune.revolution(-3542)+" tours autour de son étoile");
        System.out.println("Mars a effectué "+planeteMars.rotation(-684)+" tours sur elle-même.");
        System.out.println("Venus a effectué "+planeteVenus.rotation(1250)+" tours sur elle-même.");



        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.nbPassagers = 9;
        nouveauVaisseau.type = "Fregate";
        planeteMars.accueillirVaisseau(nouveauVaisseau);

        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.nbPassagers = 42;
        autreVaisseau.type = "Croiseur";
        planeteMars.accueillirVaisseau(autreVaisseau);
        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de "+planeteMars.totalVisiteurs);




        System.out.println("L'atmosphere de Uranus est composée :");
        System.out.println("A "+atmosphereUranus.hydrogene+"% d'hydrogène");
        System.out.println("A "+planeteUranus.atmosphere.helium+"% d'hélium");
        System.out.println("A "+planeteUranus.atmosphere.methane+"% de méthane");


        System.out.println("La forme d'une planète est : "+Planete.forme);
        System.out.println("La forme de "+planeteMars.nom+" est : "+planeteMars.forme);

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

    }
}
