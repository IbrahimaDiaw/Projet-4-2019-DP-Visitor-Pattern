/**
 * 
 */
package Visitor;

import java.util.ArrayList;

import Interface.Element;
import Interface.Visitor;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class AjoutEmploye extends Element {
	
	private ArrayList<Element>Employes = new ArrayList<Element>();

	
	public AjoutEmploye(String n, String p) {
		super(n, p);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void acceptVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitorEmploye(this);
		for(Element employe : Employes) {
			employe.acceptVisitor(visitor);
		}
			
		
	}

	@Override
	public boolean ajoutEmploye(Element employe) {
		return Employes.add(employe);
	}


	/**
	 * @return the employes
	 */
	public ArrayList<Element> getEmployes() {
		return Employes;
	}


	/**
	 * @param employes the employes to set
	 */
	public void setEmployes(ArrayList<Element> employes) {
		Employes = employes;
	}

}
