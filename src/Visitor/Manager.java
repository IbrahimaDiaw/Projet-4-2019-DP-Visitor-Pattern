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
public class Manager extends Element {
      
	private double indice;
    private double salaireDeBase;
    private double prime ;
    private double impot;
       
       public Manager(String n, String p,double indice, double sb, double prime, double impot) {
   		super(n, p);
   		// TODO Auto-generated constructor stub
   		this.setIndice(indice);
   		this.setSalaireDeBase(sb);
   		this.setPrime(prime);
   		this.setImpot(impot);
   	}
	@Override
	public void acceptVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		 visitor.calculSalaire(this);
	}
	/**
	 * @return the indice
	 */
	public double getIndice() {
		return indice;
	}
	/**
	 * @param indice the indice to set
	 */
	public void setIndice(double indice) {
		this.indice = indice;
	}
	/**
	 * @return the salaireDeBase
	 */
	public double getSalaireDeBase() {
		return salaireDeBase;
	}
	/**
	 * @param salaireDeBase the salaireDeBase to set
	 */
	public void setSalaireDeBase(double salaireDeBase) {
		this.salaireDeBase = salaireDeBase;
	}
	/**
	 * @return the impot
	 */
	public double getImpot() {
		return impot;
	}
	/**
	 * @param impot the impot to set
	 */
	public void setImpot(double impot) {
		this.impot = impot;
	}
	/**
	 * @return the prime
	 */
	public double getPrime() {
		return prime;
	}
	/**
	 * @param prime the prime to set
	 */
	public void setPrime(double prime) {
		this.prime = prime;
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
