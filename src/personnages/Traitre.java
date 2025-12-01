package personnages;
import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;
	private Random random = new Random();

	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}
	@Override
	public void direBonjour() {
	    super.direBonjour();
	    parler("Mais je suis un traitre et mon niveau de traitrise est : " + niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
	    if (niveauTraitrise >= 3) {
	        parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me demasquer !");
	        return;
	    }

	    int argentCommercant = commercant.getQuantiteArgent();
	    int montant = argentCommercant / 5; 

	    parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " 
	           + montant + " sous ou gare a toi !");

	    commercant.perdreArgent(montant);
	    this.gagnerArgent(montant);

	    niveauTraitrise++;
	}
	public void faireLeGentil() {
	    if (nbConnaissances == 0) {
	        parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
	        return;
	    }

	    int index = random.nextInt(nbConnaissances);
	    Humain ami = memoire[index];

	    int don = getQuantiteArgent() / 20; // 1/20

	    parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom() + ".");
	    parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");

	    ami.gagnerArgent(don);
	    this.perdreArgent(don);

	    if (niveauTraitrise > 0) niveauTraitrise--;
	}


}
