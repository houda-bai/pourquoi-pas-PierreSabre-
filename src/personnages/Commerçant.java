package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom, int argent) {
		super(nom, "the", argent);
	}

	public int seFaireExtorquer() {
		int vol = getQuantiteArgent(); 
		perdreArgent(vol); 
		parler("J'ai tout perdu! Le monde est trop injuste ...");
		return vol; 
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent +"sous ! Je te remercie genereux donateur!");
	}
	
}
