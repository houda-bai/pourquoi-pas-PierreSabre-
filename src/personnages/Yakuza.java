package personnages;

public class Yakuza  extends Humain{
	 private String clan;
	 private int reputation;
	 
	 public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
	        super(nom, boissonFavorite, argent);
	        this.clan = clan;
	        this.reputation = 0;
	 }
	 
	 public void extorqer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom()+ ",si tu tiens a la vie donne moi ta bourse !");
		int argentpris = victime.seFaireExtorquer(); 
        gagnerArgent(argentpris);
        reputation++;
        parler("J'ai pique les " + argentpris + " sous de " + victime.getNom() + ", ce qui me fait " + getQuantiteArgent()+ " sous dans ma poche. Hi ! Hi !");
	 }
}
