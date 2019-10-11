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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testjunit myCalc = new testjunit(5);
		myCalc.carre();
		System.out.println(myCalc.valeurCourante);
	}

}
