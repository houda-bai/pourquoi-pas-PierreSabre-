package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);

		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);

		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		System.out.println( );
		
		//yakuza
		yaku.direBonjour();
		
		//samourai 
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sake", 80);

		akimoto.direBonjour();
		marco.direBonjour();
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();

		akimoto.boire("the");
		
		// traitre
		System.out.println();
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);

		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);

		akimoto.direBonjour();
		masako.direBonjour();

		yaku.direBonjour();
		masako.faireLeGentil();
		masako.direBonjour();

		roro.direBonjour();




	}
	
}
