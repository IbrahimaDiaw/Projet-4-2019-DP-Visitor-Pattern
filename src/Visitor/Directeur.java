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
public class Directeur extends Element{

		private double indice;
         private double salaireDeBase;
         private double bonus;
         
	public Directeur(String n, String p, double indice, double sb, double bonus) {
		super(n, p);
		// TODO Auto-generated constructor stub
		this.setIndice(indice);
		this.setSalaireDeBase(sb);
		this.setBonus(bonus);
		
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
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
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
	public void acceptVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.calculSalaire(this);
		
	}

	@Override
	public boolean ajoutEmploye(Element employe) {
		// TODO Auto-generated method stub
		return false;
	}
		
          
}
