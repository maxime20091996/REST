package eu.ensup.JsonJackson.domaine;

public class Employe {

	private String nom;
	private String prenom;
	
	public Employe(String nom, String prenom){
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Employe(){
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void poserConges(){
		System.out.println("L'employe " + this.prenom + " " + this.nom + " pose des congés");
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
