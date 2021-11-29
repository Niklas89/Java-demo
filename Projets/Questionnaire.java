public class Questionnaire {
  	static void afficher(String[] questions, String[][] reponses, int[] nbquest, int[][] nbrep, int[] bonnesRep) {
  		System.out.println("-------------------------------");
  		System.out.println("Affichage des questions et reponses");
  		if(nbquest[0] == 0) {
  			System.out.println("-------------------------------");
  			System.out.println("Il n'y a aucune question dans la liste encore, veuillez ajouter des questions!");
  		}
  		for(int i=0;i<nbquest[0];i++) {
  			System.out.println("-------------------------------");
  			System.out.print("  ");
  			System.out.println(i+1+") "+questions[i]);
  			System.out.println("--------");
  			for(int j=0;j<nbrep[i][0];j++) {
  				System.out.println(j+1+". "+reponses[i][j]);
  			}
  			if(reponses[i][bonnesRep[i]] != null) {
  				System.out.print("Bonne réponse: ");
  				System.out.println(bonnesRep[i]+1+". "+reponses[i][bonnesRep[i]]);
  			}
  		}
  	}
	static void ajouterQuestions(String[] questions, int[] nbquest) {
		Terminal.ecrireStringln("-------------------------------");
		Terminal.ecrireStringln("Ecrire les questions ci-dessous. Appuyer sur la touche \"q\" pour quitter.");
		Terminal.ecrireStringln("Il faut ecrire au moins deux questions.");
		Terminal.ecrireStringln("-------------------------------");
		String question;
		int indice=0;
		while(indice<nbquest[0]) {
			indice = indice+1;
		}
		boolean finQuestions = false;
		while(!finQuestions) {
			Terminal.ecrireString("Question ");
			Terminal.ecrireInt(indice+1);
			Terminal.ecrireStringln(" :");
			question = Terminal.lireString();
			if(question.equals("q") && nbquest[0]>=2) {
				finQuestions = true;
			} 
			else if(question.equals("q") && nbquest[0]<2) {
				finQuestions = false;
				Terminal.ecrireStringln("Il faut au moins deux questions avant de quitter.");
			}
			else if(question==null || question.equals("")) {
				finQuestions = false;
				Terminal.ecrireStringln("Vous devez ecrire une question.");
			} else {
				questions[indice] = question;
				indice=indice+1;
				nbquest[0]=nbquest[0]+1;
			}
			System.out.println();
		}
	}
	static void modifierQuestions(String[] questions, int[] nbquest) {
		Terminal.ecrireStringln("-------------------------------");
		Terminal.ecrireStringln("Choisissez la question ci-dessous que vous souhaitez modifier.");
		Terminal.ecrireStringln("Appuyer sur la touche \"q\" pour quitter.");
		Terminal.ecrireStringln("-------------------------------");
		int questModif;
  		if(nbquest[0] == 0) {
  			System.out.println("-------------------------------");
  			System.out.println("Il n'y a aucune question dans la liste encore, veuillez ajouter des questions!");
  		}
  		for(int i=0;i<nbquest[0];i++) {
  			System.out.println("-------------------------------");
  			System.out.print("  ");
  			System.out.println(i+1+") "+questions[i]);
  		}
  		questModif = lireIntPos("Quelle question souhaitez-vous modifier? ",1,nbquest[0]+1);
  		questModif = questModif-1;
		String question;
		boolean finQuestions = false;
		while(!finQuestions) {
			Terminal.ecrireString("Modifier question ");
			Terminal.ecrireInt(questModif+1);
			Terminal.ecrireStringln(" :");
			question = Terminal.lireString();
			if(question.equals("q")) {
				finQuestions = true;
				Terminal.ecrireStringln("Vous avez quitte la modification de la question.");
			} 
			else if(question==null || question.equals("")) {
				finQuestions = false;
				Terminal.ecrireStringln("Vous devez ecrire une question ou tapez \"q\" pour quitter.");
			} else {
				questions[questModif] = question;
				Terminal.ecrireStringln("La question a bien ete modifiee");
				finQuestions = true;
			}
			System.out.println();
		}
	}
	static void ajouterReponses(String[] questions, String[][] reponses, int[] nbquest, int[][] nbrep, int[] bonnesRep) {
		Terminal.ecrireStringln("-------------------------------");
		Terminal.ecrireStringln("Ecrire les reponses ci-dessous. Appuyer sur la touche \"q\" pour quitter.");
		Terminal.ecrireStringln("Il faut ecrire au moins deux reponses.");
		Terminal.ecrireStringln("-------------------------------");
  		if(nbquest[0] == 0) {
  			System.out.println("Il n'y a aucune question dans la liste encore, veuillez ajouter des questions d'abord!");
  		}
		String reponse;
		int indice;
		for(int i=0; i<nbquest[0];i++) {
			Terminal.ecrireStringln("------------");
			Terminal.ecrireString("Ecrire les reponses pour la question ");
			Terminal.ecrireInt(i+1);
			Terminal.ecrireStringln(" : "+questions[i]);
			boolean finReponses = false;
			indice=0;
			while(indice<nbrep[i][0]) {
				indice = indice+1;
			}
			while(!finReponses) {
				Terminal.ecrireString("Reponse ");
				Terminal.ecrireInt(indice+1);
				Terminal.ecrireString(" : ");
				reponse = Terminal.lireString();
				if(reponse.equals("q") && nbrep[i][0]>=2) {
					finReponses = true;
				} 
				else if(reponse.equals("q") && nbrep[i][0]<2) {
					finReponses = false;
					Terminal.ecrireStringln("Il faut au moins deux reponses avant de quitter.");
				}
				else if(reponse==null || reponse.equals("")) {
					finReponses = false;
					Terminal.ecrireStringln("Vous devez ecrire une reponse.");
				} else {
					reponses[i][indice] = reponse;
					indice=indice+1;
					nbrep[i][0]=nbrep[i][0]+1;
				}
				System.out.println();
			}
			Terminal.ecrireStringln("Quelle est la bonne réponse parmis celles-ci?");
			for(int j=0;j<nbrep[i][0];j++) {
				System.out.println(j+1+". "+reponses[i][j]);
			}
			bonnesRep[i] = lireIntPos("Bonne réponse: ",1,nbrep[i][0]+1);
			bonnesRep[i] = bonnesRep[i] - 1;
		}
	}
	static void modifierReponses(String[] questions, String[][] reponses, int[] nbquest, int[][] nbrep, int[] bonnesRep) {
		int repModif;
		Terminal.ecrireStringln("-------------------------------");
		Terminal.ecrireStringln("Modifier une ou plusieurs reponses ci-dessous.");
		Terminal.ecrireStringln("Appuyer sur la touche \"q\" pour quitter.");
		Terminal.ecrireStringln("-------------------------------");
  		if(nbquest[0] == 0) {
  			System.out.println("Il n'y a aucune question dans la liste encore, veuillez ajouter des questions d'abord!");
  		} 
  		System.out.println("Affichage des questions et reponses");
  		for(int i=0;i<nbquest[0];i++) {
  			System.out.println("-------------------------------");
  			System.out.print("  ");
  			System.out.println(i+1+") "+questions[i]);
  			System.out.println("--------");
  			for(int j=0;j<nbrep[i][0];j++) {
  				if(nbrep[i][0] == 0) {
  					System.out.println("Il n'y a aucune reponse a cette question encore, veuillez ajouter des reponses d'abord!");
  				}
  				System.out.println(j+1+". "+reponses[i][j]);
  			}
  			if(reponses[i][bonnesRep[i]] != null) {
  				System.out.print("Bonne réponse: ");
  				System.out.println(bonnesRep[i]+1+". "+reponses[i][bonnesRep[i]]);
  			}
  			repModif = lireIntPos("Quelle reponse souhaitez-vous modifier? ",1,nbrep[i][0]+1);
  			repModif = repModif-1;
  			String reponse;
			boolean finReponses = false;
			while(!finReponses) {
				Terminal.ecrireString("Modifier reponse ");
				Terminal.ecrireInt(repModif+1);
				Terminal.ecrireStringln(" :");
				reponse = Terminal.lireString();
				if(reponse.equals("q")) {
					finReponses = true;
					Terminal.ecrireStringln("Vous avez quitte la modification de la reponse.");
				} 
				else if(reponse==null || reponse.equals("")) {
					finReponses = false;
					Terminal.ecrireStringln("Vous devez ecrire une reponse ou tapez \"q\" pour quitter.");
				} else {
					reponses[i][repModif] = reponse;
					Terminal.ecrireStringln("La reponse a bien ete modifiee");
					finReponses = true;
				}
			}
			Terminal.ecrireStringln("Quelle est la nouvelle bonne réponse parmis celles-ci?");
			for(int j=0;j<nbrep[i][0];j++) {
				System.out.println(j+1+". "+reponses[i][j]);
			}
			bonnesRep[i] = lireIntPos("Nouvelle bonne réponse: ",1,nbrep[i][0]+1);
			bonnesRep[i] = bonnesRep[i] - 1;
  		}
	}
	static void repondreQuestions(String[] questions, String[][] reponses, int[] nbquest, int[][] nbrep, int[] bonnesRep, int[] repEleve) {
  		System.out.println("-------------------------------");
  		System.out.println("Affichage des questions et reponses");
  		if(nbquest[0] == 0) {
  			System.out.println("-------------------------------");
  			System.out.println("Il n'y a aucune question dans la liste encore, veuillez attendre que votre prof en ajoute!");
  		}
  		for(int i=0;i<nbquest[0];i++) {
  			System.out.println("------------Entrer le numero de la bonne reponse-------------------");
  			System.out.println(i+1+") "+questions[i]);
  			System.out.println("--------");
  			for(int j=0;j<nbrep[i][0];j++) {
  				System.out.println(j+1+". "+reponses[i][j]);
  			}
  			repEleve[i] = lireIntPos("Quelle est la bonne reponse? ",1,nbrep[i][0]+1);
  			repEleve[i] = repEleve[i] - 1;
  		}

	}
	static void afficherReponses(String[] questions, String[][] reponses, int[] nbquest, int[][] nbrep, int[] bonnesRep, int[] repEleve) {
  		int note=0;
		float moyenne = 0;
  		System.out.println("-------------------------------");
  		System.out.println("Affichage des questions avec vos reponses");
  		if(nbquest[0] == 0) {
  			System.out.println("-------------------------------");
  			System.out.println("Il n'y a aucune question dans la liste encore, veuillez attendre que votre prof en ajoute!");
  		}
  		for(int i=0;i<nbquest[0];i++) {
  			System.out.println("------------------------------");
  			System.out.print("  ");
  			System.out.println(i+1+") "+questions[i]);
  			System.out.println("--------");
  			for(int j=0;j<nbrep[i][0];j++) {
  				if(repEleve[i] == j) {
  					System.out.print("Vous avez repondu: ");
  					System.out.println(j+1+". "+reponses[i][j]);
  					if(repEleve[i] == bonnesRep[i]) {
  						note = note+1;
  					}
  				}
  			}
  			System.out.print("La bonne reponse etait: ");
  			System.out.println(bonnesRep[i]+1+". "+reponses[i][bonnesRep[i]]);
  		}
  		if(nbquest[0] > 0) {
  			System.out.println("--------");
	  		moyenne = nbquest[0]/2;
	  		System.out.println("Note finale: "+note+" / "+nbquest[0]);
	  		if(note>=moyenne) {
	  			System.out.println("Test reussi!");
	  		}
	  		else {
	  			System.out.println("Echec du test. Vous devez le repasser.");
	  			System.out.println("Retournez au menu et selectionnez 1.");
	  		}
  		}
  		
	}
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
  	public static int proposeMenu(){
	    System.out.println("-----------------------------------");
	    System.out.println("-----------MENU-PRINCIPAL----------");
	    System.out.println("-----------------------------------");
	    System.out.println("1- Espace professeur");
	    System.out.println("2- Espace eleve");
	    System.out.println("3- Quitter");
	    return lireIntPos("Votre choix: ",1,3);
    }
    public static int menuProf(){
	    System.out.println("-----------------------------------");
	    System.out.println("-------------MENU-PROF-------------");
	    System.out.println("-----------------------------------");
	    System.out.println("1- Ajouter des questions");
	    System.out.println("2- Modifier des questions");
	    System.out.println("3- Ajouter des reponses");
	    System.out.println("4- Modifier des reponses");
	    System.out.println("5- Liste des questions et reponses");
	    // ajouter une option "note et reponses de mon eleve"
	    System.out.println("6- Quitter");
	    return lireIntPos("Votre choix: ",1,6);
    }
    public static int menuEleve(){
	    System.out.println("-----------------------------------");
	    System.out.println("-------------MENU-ELEVE------------");
	    System.out.println("-----------------------------------");
	    System.out.println("1- Repondre au questionnaire ou le repasser");
	    System.out.println("2- Afficher mes reponses et ma note");
	    System.out.println("3- Quitter");
	    return lireIntPos("Votre choix: ",1,3);
    }
	static void espaceProf(String[] questions, String[][] reponses, int[] nbquest, int[][] nbrep, int[] bonnesRep) {
		int choix; 
	    boolean fin = false;
	    do{
	      choix = menuProf();
	      if(choix == 1) {
	        ajouterQuestions(questions,nbquest);
	      }
	      else if(choix == 2) {
	        modifierQuestions(questions,nbquest);
	      }
	      else if(choix == 3) {
	        ajouterReponses(questions,reponses,nbquest,nbrep,bonnesRep);
	      }
	      else if(choix == 4) {
	        modifierReponses(questions,reponses,nbquest,nbrep,bonnesRep);
	      }
	      else if(choix == 5) {
	        afficher(questions,reponses,nbquest,nbrep,bonnesRep);
	      } else {
	        fin = true;
	      }
	    }while(!fin);
	}
	static void espaceEleve(String[] questions, String[][] reponses, int[] nbquest, int[][] nbrep, int[] bonnesRep, int[] repEleve) {
		int choix; 
	    boolean fin = false;
	    do{
	      choix = menuEleve();
	      if(choix == 1) {
	        repondreQuestions(questions,reponses,nbquest,nbrep,bonnesRep,repEleve);
	      }
	      else if(choix == 2) {
	        afficherReponses(questions,reponses,nbquest,nbrep,bonnesRep,repEleve);
	      } else {
	        fin = true;
	      }
	    }while(!fin);
	}
	public static void main(String[] args) {
		String[] questions = new String[50];
		int[] bonnesRep = new int[50];
		int[] repEleve = new int[50];
		int[] nbquest = {0};
		String[][] reponses = new String[50][20];
		int[][] nbrep = new int[50][1];
	    int choix; 
	    boolean fin = false;
	    do{
	      choix = proposeMenu();
	      if(choix == 1) {
	        espaceProf(questions,reponses,nbquest,nbrep,bonnesRep);
	      }
	      else if(choix == 2) {
	        espaceEleve(questions,reponses,nbquest,nbrep,bonnesRep,repEleve);
	      } else {
	        fin = true;
	      }
	    }while(!fin);
	}
}