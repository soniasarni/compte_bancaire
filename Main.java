package compteBancaire;

public class Main {

	public static void main(String[] args) {
	Compte compte1=new Compte("sarah");
	Compte compte2=new Compte("David");
	compte1.deposer(2000);
	compte2.deposer(5000);
	compte1.retirer(500);
	compte2.virerVers(1000, compte1);
	compte1.afficher();
	compte2.afficher();
	}

}

