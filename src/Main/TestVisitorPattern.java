/**
 * 
 */
package Main;

import Visitor.AjoutEmploye;
import Visitor.Commerciaux;
import Visitor.Directeur;
import Visitor.Manager;
import Visitor.Ouvrier;
import Visitor.salaireVisitor;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class TestVisitorPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directeur directeur = new Directeur("Diaw", "IBRAHIMA", 5,670000,200000);
		Manager manager = new Manager("DIAW", "Ibrahima",3,360000,60000, 130000);
		Commerciaux commerçant = new Commerciaux("DIAW", "Ibrahima ", 250000);
		Ouvrier ouvrier = new Ouvrier("DIAW", "Ibrahima", 10000,48);
		
		AjoutEmploye groupe = new AjoutEmploye("Premon","Nom Employé");
		
		
		groupe.ajoutEmploye(directeur);
		groupe.ajoutEmploye(manager); 
		groupe.ajoutEmploye(commerçant);
		groupe.ajoutEmploye(ouvrier);
		
		
		groupe.acceptVisitor(new salaireVisitor());
		

	}

}
