/**
 * 
 */
package Interface;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public abstract class  Element {
	
	protected String nom;
	protected String prenom;
	
	public Element(String n, String p) {
		this.nom = n;
		this.prenom = p;
		
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
  	public abstract void acceptVisitor(Visitor visitor);
  	public abstract boolean ajoutEmploye(Element employe);

}
