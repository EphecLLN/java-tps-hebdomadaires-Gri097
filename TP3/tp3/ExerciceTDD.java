package tp3;

public class ExerciceTDD {

	/**
	* Cette m�thode calcule le carr� d�un nombre.
	* @param n : Un nombre entier quelconque
	* @return Un nombre >= 0, r�sultat de la multiplication de n par lui-m�me
	*/
	public int carre(int n){
	return n*n;
	}
	public int transi = 0;
	public String word = "ahsjahdkmjjzzssqaa";
	public char chaine[] = word.toCharArray();
	public int i=0;
	public int occ=0;
	/**
	* Cette m�thode v�rifie si un nombre est pair ou impair.
	* @param n : Un nombre entier quelconque
	* @return une string disant si le nombre est paire ou impair
	*/
	public void paire(int n){
	
		transi = (n % 2) ;
		if(transi == 0){
			System.out.println("paire") ;
		}
		else {
			System.out.println("impaire");
		}
	}
	
	/**
	* Cette m�thode calcule le nombre d'occurence s'un caractere dans un mot.
	* @param n : Un caractere quelconque
	* @return Un nombre >= 0, r�sultat de la multiplication de n par lui-m�me
	*/
	public void occ(char c){
		
		for(char i: chaine) {
			
			if(chaine[i] = c) {
				
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
