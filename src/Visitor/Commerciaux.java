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
public class Commerciaux extends Element {
	private double primeVente ;

	public Commerciaux(String n, String p, double primeVente) {
		super(n, p);
		// TODO Auto-generated constructor stub
		this.primeVente = primeVente;
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.calculSalaire(this);
	}

	/**
	 * @return the primeVente
	 */
	public double getPrimeVente() {
		return primeVente;
	}

	/**
	 * @param primeVente the primeVente to set
	 */
	public void setPrimeVente(double primeVente) {
		this.primeVente = primeVente;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}

	@Override
	public String getPrenom() {
		// TODO Auto-generated method stub
		return super.getPrenom();
	}

	@Override
	public void setPrenom(String prenom) {
		// TODO Auto-generated method stub
		super.setPrenom(prenom);
	}

	@Override
	public boolean ajoutEmploye(Element employe) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
