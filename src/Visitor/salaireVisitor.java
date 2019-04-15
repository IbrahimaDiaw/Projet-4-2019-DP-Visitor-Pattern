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
		
		System.out.println(" Le Directeur "+directeur.getNom() +" "+ directeur.getPrenom()+ " perçoit un salaire de "+ salaireNet);
		
	}

	@Override
	public void calculSalaire(Manager manager) {
		
		setSalaireNet((manager.getIndice() * manager.getSalaireDeBase()) + manager.getPrime() - manager.getImpot());
		System.out.println(" Le manager "+manager.getNom()+" "+manager.getPrenom()+ " perçoit un salaire de "+ salaireNet);
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
	public void calculSalaire(Commerciaux commerçant) {
		// TODO Auto-generated method stub
		double salaireNet = (commerçant.getPrimeVente() + 1000);
		System.out.println(" Le Commerçant "+ commerçant.getNom()+" "+commerçant.getPrenom()+ " perçoit un montant de salaire égal à "+salaireNet);
	}

	@Override
	public void calculSalaire(Ouvrier ouvrier) {
		// TODO Auto-generated method stub
		double salaireNet = (ouvrier.getSalaireHeure() * ouvrier.getNbreHeure()) + 5000;
		System.out.println("L'ouvrier  "+ouvrier.getNom()+" "+ouvrier.getPrenom()+" perçoit à chaque fin du mois un salaire de "+salaireNet );
		
	}

	@Override
	public void visitorEmploye(AjoutEmploye employe) {
		// TODO Auto-generated method stub
		System.out.println("La Liste des employés avec leurs salaires  est : "+ "\n");
	}
	

}
