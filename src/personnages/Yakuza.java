package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public void extorqer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() + ",si tu tiens a la vie donne moi ta bourse !");
		int argentpris = victime.seFaireExtorquer();
		gagnerArgent(argentpris);
		reputation++;
		parler("J'ai pique les " + argentpris + " sous de " + victime.getNom() + ", ce qui me fait "
				+ getQuantiteArgent() + " sous dans ma poche. Hi ! Hi !");
	}

	public int perdre() {
        int perdu = getQuantiteArgent();
        perdreArgent(perdu);
        reputation--;
        parler("J'ai perdu mon duel et mes " + perdu + " sous, snif... J'ai deshonore le clan de " + clan + ".");
        return perdu;
    }
	 public void gagner(int gain) {
	        gagnerArgent(gain);
	        reputation++;
	        parler("Ce duel m'a rapporte " + gain + " sous ! Je m'enrichis et ma reputation monte.");
	 }
	 
	 public int getReputation() {
	        return reputation;
	 }
}
