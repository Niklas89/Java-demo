public class EmployesServices3 {
	// procédure qui insère elem dans tab en respectant l'ordre croissant
	public static void ajouter(String[] employes, int[] service, int[] nb, String n, int s) {
		int indice=0;
		while(indice<nb[0] && s>service[indice]) {
			indice = indice+1;
		}
		// indice est le numéro où insérer s
		// il faut d'abord décaler les éléments plus grands
		// vers la droite
		for (int i=nb[0]; i>indice; i=i-1) {
			service[i]=service[i-1];
			employes[i]=employes[i-1];
		}
		service[indice]=s;
		employes[indice]=n;
		nb[0]=nb[0]+1;
	}
	public static boolean supprimer(String[] employes, int[] service, int[] nb, String n, int s) {
		int indice=0;
		while(indice<nb[0] && (n!=employes[indice] || s!=service[indice])) {
			indice = indice+1;
		}
		if (indice<nb[0] && n==employes[indice] && s==service[indice]) {
			for (int i=indice; i<nb[0]; i=i+1){
				employes[i]=employes[i+1];
				service[i]=service[i+1];
			}
			nb[0]=nb[0]-1;
			return true;
		} else {
			return false;
		}
	}
	public static void afficherParService(String[] departs, String[] employes, int[] service, int[] nbpers) {
		System.out.println("----------------------------------------");
		for (int i=0; i<departs.length; i=i+1){
			System.out.println("Employes de "+departs[i]+" :");
			for(int j=0; j<nbpers[0]; j=j+1){
				if(service[j] == i) {
					System.out.println(employes[j]);
				}
			}
			System.out.println("----------------------------------------");
		}
	}
	public static void choisirService(String[] departs, String[] employes, int[] service, int[] nbpers) {
		int nb;
		System.out.println("----------------------------------------");
		for (int i=0; i<departs.length; i=i+1){
			System.out.println(i+1+" - service: "+departs[i]);
		}
		System.out.println("----------------------------------------");
		System.out.println("Entrez le numéro du service qui vous intéresse:");
		nb=Terminal.lireInt();
		System.out.println("Employes du "+departs[nb-1]+" :");
		for(int j=0; j<nbpers[0]; j=j+1){
			if(service[j] == nb-1) {
				System.out.println(employes[j]);
			}
		}
		System.out.println("----------------------------------------");
	}
	public static void afficher(String[] departs, String[] employes, int[] service, int[] nb) {
		for (int i=0; i<nb[0]; i=i+1){
			System.out.println("Employe :"+employes[i]+" - service: "+departs[service[i]]);
		}
	}
	public static void main(String[] args) {
		String[] employes = new String[100];
		int[] service = new int[100];
		int[] nbpers = {0};
		String[] departs = {"bureau detude","ressources humaines",
		"service commercial","gestion financiere"};
		ajouter(employes,service,nbpers,"Jean",0);
		ajouter(employes,service,nbpers,"John",1);
		ajouter(employes,service,nbpers,"Jeannot",0);
		ajouter(employes,service,nbpers,"Jeanne",2);
		ajouter(employes,service,nbpers,"Jeannette",1);
		ajouter(employes,service,nbpers,"Janeton",3);
		ajouter(employes,service,nbpers,"Giovanna",3);
		ajouter(employes,service,nbpers,"Juan",2);
		ajouter(employes,service,nbpers,"Juanito",0);
		afficher(departs,employes,service,nbpers);
		choisirService(departs,employes,service,nbpers);
		afficherParService(departs,employes,service,nbpers);
		System.out.println("---------------------------------"); 
		supprimer(employes,service,nbpers,"Janeton",3); 
		afficher(departs,employes,service,nbpers); 
	}
}