package histoire;

import personnages.Humain;
import personnages.Commerçant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
        Humain prof = new Humain("Prof", "kombucha", 54);
        
        prof.direBonjour();
        prof.acheter("boisson", 12);
        prof.boire();
        prof.acheter("jeu", 2);
        prof.acheter("kimono", 50);
        
        System.out.println();
        
        //commerçant
        Commerçant marco=new Commerçant("Marco",20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
        
        System.out.println();
      //yazuka
      		//Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
      		//yaku.direBonjour();
      		//yaku.extorqer(marco);
      	System.out.println();
      //Ronin 
      		//Ronin roro=new Ronin("Roro","shouchu",60);
      		//roro.direBonjour();
      		//roro.donner(marco);
      		
      //roro yaku 
      		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
      	    Ronin roro = new Ronin("Roro", "shochu", 60);
      	    roro.donner(marco);
      	    roro.provoquer(yaku);
	}
		
}
