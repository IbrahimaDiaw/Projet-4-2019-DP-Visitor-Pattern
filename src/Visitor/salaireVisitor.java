/**
 * 
 */
package Visitor;

import Interface.Visitor;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class salaireVisitor implements Visitor {
	

	private double salaireNet;

	@Override
	public void calculSalaire(Directeur directeur) {
		// TODO Auto-generated method stub
		double salaireNet;
		salaireNet = (directeur.getIndice() * directeur.getSalaireDeBase()) +directeur.getBonus();
		
		System.out.println(" Le Directeur "+directeur.getNom() +" "+ directeur.getPrenom()+ " per�oit un salaire de "+ salaireNet);
		
	}

	@Override
	public void calculSalaire(Manager manager) {
		
		setSalaireNet((manager.getIndice() * manager.getSalaireDeBase()) + manager.getPrime() - manager.getImpot());
		System.out.println(" Le manager "+manager.getNom()+" "+manager.getPrenom()+ " per�oit un salaire de "+ salaireNet);
	}

	/**
	 * @return the salaireNet
	 */
	public double getSalaireNet() {
		return salaireNet;
	}

	/**
	 * @param salaireNet the salaireNet to set
	 */
	public void setSalaireNet(double salaireNet) {
		this.salaireNet = salaireNet;
	}

	@Override
	public void calculSalaire(Commerciaux commer�ant) {
		// TODO Auto-generated method stub
		double salaireNet = (commer�ant.getPrimeVente() + 1000);
		System.out.println(" Le Commer�ant "+ commer�ant.getNom()+" "+commer�ant.getPrenom()+ " per�oit un montant de salaire �gal � "+salaireNet);
	}

	@Override
	public void calculSalaire(Ouvrier ouvrier) {
		// TODO Auto-generated method stub
		double salaireNet = (ouvrier.getSalaireHeure() * ouvrier.getNbreHeure()) + 5000;
		System.out.println("L'ouvrier  "+ouvrier.getNom()+" "+ouvrier.getPrenom()+" per�oit � chaque fin du mois un salaire de "+salaireNet );
		
	}

	@Override
	public void visitorEmploye(AjoutEmploye employe) {
		// TODO Auto-generated method stub
		System.out.println("La Liste des employ�s avec leurs salaires  est : "+ "\n");
	}
	

}
