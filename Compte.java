package compteBancaire;

public class Compte {
int solde;
String titulaire;
public Compte(String titulaire) {
	super();
	this.titulaire = titulaire;
}
public Compte() {
	super();
	// TODO Auto-generated constructor stub
}
public void afficher() {
	System.out.println(" solde DE madame "+this.titulaire+"  est: "+solde);
}
public void deposer(int montant) {
	solde+=montant;
	//System.out.println("votre solde est: "+solde);
}
public void retirer(int montant) {
	solde-=montant;
	//System.out.println("votre solde est: "+solde);
}
public void virerVers(int montant, Compte destinataire) {
	this.retirer(montant);
	destinataire.deposer(montant);
	//solde-=montant;
	
	//ystem.out.println("votre solde est: "+solde);
}
}

