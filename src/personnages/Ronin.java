package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	    this.honneur=1;
	}
	public void donner(Commerçant beneficiaire) {
		int donner= getQuantiteArgent()/10;
		perdreArgent(donner);
		parler(beneficiaire.getNom()+" prends ces "+donner+" sous ");
		parler(donner+" sous! Je te remercie genereux donateur!");
	}
	public void provoquer(Yakuza adversaire) {
	    parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand!");
        int force = honneur * 2;
        if (force >= adversaire.getReputation()) {
            parler("Je t'ai eu petit yakusa!");
            int b = adversaire.perdre(); 
            gagnerArgent(b);
            honneur++;
        } else {
            honneur--;
            int perdu = getQuantiteArgent();
            perdreArgent(perdu);
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
            adversaire.gagner(perdu);         }
	}
}
	

