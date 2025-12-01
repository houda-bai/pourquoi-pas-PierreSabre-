package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	protected Humain[] memoire = new Humain[30];
	protected int nbConnaissances = 0;


	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}

	public String getNom() {
		return nom;
	}

	public int getQuantiteArgent() {
		return quantiteArgent;
	}

	protected void gagnerArgent(int gain) {
		quantiteArgent += gain;
	}

	protected void perdreArgent(int perte) {
		quantiteArgent -= perte;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de" + this.boissonFavorite + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (this.quantiteArgent >= prix) {
			this.quantiteArgent -= prix;
			parler("J'ai " + this.quantiteArgent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix
					+ " sous.");
		} else {
			parler("Je n'ai plus que " + this.quantiteArgent + " sous en poche. Je ne peux même pas m'offrir un " + bien
					+ " à " + prix + " sous.");
		}
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void faireConnaissanceAvec(Humain autre) {
	    this.direBonjour();
	    autre.direBonjour();
	    this.memoriser(autre);
	    autre.memoriser(this);
	}


	public void memoriser(Humain humain) {
	    if (nbConnaissances < memoire.length) {
	        memoire[nbConnaissances] = humain;
	        nbConnaissances++;
	    } else {
	        for (int i = 0; i < memoire.length - 1; i++) {
	            memoire[i] = memoire[i + 1];
	        }
	        memoire[memoire.length - 1] = humain;
	    }
	}

	public void listerConnaissance() {
		StringBuilder liste = new StringBuilder();
		for (int i = 0; i < nbConnaissances; i++) {
			liste.append(memoire[i].getNom());
			if (i < nbConnaissances - 1) {
				liste.append(", ");
			}
		}
		parler("Je connais beaucoup de monde dont : " + liste.toString());
	}
}
