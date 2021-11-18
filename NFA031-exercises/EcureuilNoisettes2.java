class CaseOccupe extends RuntimeException {}
public class EcureuilNoisettes2 {
	public static int auSortQuatre(){
		return (int) (Math.random() *(4-1+1)+1); //  (int)(Math.random()*(max-min+1)+min)
	}

	public static int auSortDeux(){
		return (int) (Math.random() *(2-1+1)+1); //  (int)(Math.random()*(max-min+1)+min)
	}

	public static int auSortOnze(){
		return (int) (Math.random() *11);
	}

	public static void afficherDamier(char[][] damier){
		System.out.println("-------------------------------------------");
		for(int i=0;i<damier.length;i++) {
			for(int j=0;j<damier[0].length;j++) {
				System.out.print(damier[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------------------------------------");
		}
		
	}

	public static void placerNoisettes(char[][] damier) {
		int auSort;
		int auSort2;
		boolean occupe;
		for(int i=0;i<25;i++) {
			do {
				try {
					auSort = auSortOnze();
					auSort2 = auSortOnze();
					if(damier[auSort][auSort2] == 'o' || damier[auSort][auSort2] == '2') {
						throw new CaseOccupe();
					} else {
						damier[auSort][auSort2] = 'o';
						occupe=true;
					}
				} catch (CaseOccupe e) {
				occupe = false;
				}
			} while(!occupe);
		}
	}

	public static void changePlaceEcureuil(char[][] damier, int[] position) {
		int auSort;
		boolean correct;
		int horizontale = 1;
		int verticale = 2;
		do {
			try{
				if(horizontale == auSortDeux()){
					auSort = auSortQuatre();
					if(11>position[1]+auSort) {
						damier[position[0]][position[1]] = ' ';
						damier[position[0]][position[1]+auSort] = '2';
						position[1] = position[1]+auSort;		
					} 
					else {
						damier[position[0]][position[1]] = ' ';
						damier[position[0]][position[1]-auSort] = '2';
						position[1] = position[1]-auSort;
					}

				} else {
					auSort = auSortQuatre();
					if(11>position[0]+auSort) {
						damier[position[0]][position[1]] = ' ';
						damier[position[0]+auSort][position[1]] = '2';
						position[0] = position[0]+auSort;
					} else {
						damier[position[0]][position[1]] = ' ';
						damier[position[0]-auSort][position[1]] = '2';
						position[0] = position[0]-auSort;
					}
				}		
				correct=true;
			} catch(ArrayIndexOutOfBoundsException e){
				correct = false;
			} // catch
		} while(!correct);
	} 

	public static void main (String[] args) throws InterruptedException {
		char[][] damier = new char[11][11];
		int ecuPosLig = 5;
		int ecuPosCol = 5;
		int[] position = new int[2];
		damier[ecuPosCol][ecuPosLig] = '2';
		position[0] = ecuPosCol;
		position[1] = ecuPosLig;
		placerNoisettes(damier);
		afficherDamier(damier);
		System.out.println("On deplace lecureuil de 1 a 4 cases: ");
		int vide=0;
		while(vide!=10) {
			try {
	            for (int col=0; col<damier.length; col=col+1){ 
					for (int lig=0; lig<damier[0].length; lig=lig+1){
		                Thread.sleep(1000);
		                changePlaceEcureuil(damier,position);
						afficherDamier(damier);
		                if(damier[col][lig] == ' ') {
		                	vide+=1;
		                }
					}
	            }
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
		}
	}
}