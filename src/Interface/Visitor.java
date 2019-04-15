/**
 * 
 */
package Interface;

import Visitor.AjoutEmploye;
import Visitor.Commerciaux;
import Visitor.Directeur;
import Visitor.Manager;
import Visitor.Ouvrier;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public interface Visitor {
	
	public void calculSalaire(Directeur directeur);
	public void calculSalaire(Manager manager);
	public void calculSalaire(Commerciaux commerçant);
	public void calculSalaire(Ouvrier ouvrier);
	public void visitorEmploye(AjoutEmploye employe);
}
