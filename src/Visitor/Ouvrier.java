/**
 * 
 */
package Visitor;

import Interface.Element;
import Interface.Visitor;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class Ouvrier extends Element{

	private double salaireHeure;
	private int nbreHeure;
	
	public Ouvrier(String n, String p, double salaireHeure, int nbreHeure) {
		super(n, p);
		// TODO Auto-generated constructor stub
		this.setSalaireHeure(salaireHeure);
		this.setNbreHeure(nbreHeure);
	}
	@Override
	public void acceptVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.calculSalaire(this);
		
	}
	/**
	 * @return the salaireHeure
	 */
	public double getSalaireHeure() {
		return salaireHeure;
	}
	/**
	 * @param salaireHeure the salaireHeure to set
	 */
	public void setSalaireHeure(double salaireHeure) {
		this.salaireHeure = salaireHeure;
	}
	/**
	 * @return the nbreHeure
	 */
	public int getNbreHeure() {
		return nbreHeure;
	}
	/**
	 * @param nbreHeure the nbreHeure to set
	 */
	public void setNbreHeure(int nbreHeure) {
		this.nbreHeure = nbreHeure;
	}
	@Override
	public boolean ajoutEmploye(Element employe) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
