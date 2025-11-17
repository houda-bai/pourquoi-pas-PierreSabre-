package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;

	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}

	public String getNom() {
		return this.nom;
	}

	public int getQuantiteArgent() {
		return this.quantiteArgent;
	}

	public void gagnerArgent(int gain) {
		this.quantiteArgent += gain;
	}

	public void perdreArgent(int perte) {
		this.quantiteArgent -= perte;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + this.boissonFavorite);
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

	private void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
}
