/**
 * 
 */
package tp3;

/**
 * @author he201536
 *
 */
public class testjunit {

	public testjunit(double valeurCourante) {
		super();
		this.valeurCourante = valeurCourante;
	}


	/**
	 * @param args
	 */
	
	double valeurCourante;
	
	public testjunit (){
		this.valeurCourante = 0;
		}
	
	void carre() {
		valeurCourante*=valeurCourante;
	}
	
	/**
	* Cette m�thode calcule le carr� d�un nombre.
	* @param n : Un nombre entier quelconque
	* @return Un nombre >= 0, r�sultat de la multiplication de n par lui-m�me
	*/
	public int carre(int n){
	//TODO : A implementer
		valeurCourante*=valeurCourante;
	return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testjunit myCalc = new testjunit(2);
		myCalc.carre();
		System.out.println(myCalc.valeurCourante);
	}

}
