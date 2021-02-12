
public class Opdracht5 {
		public static void main(String[] args) {
		
		Auto auto1 = new Auto(true,false,true,false); //Vanuit gegaan dat false het dus niet doet
				
		Monteur monteur1 = new Monteur();
		monteur1.repareren(auto1);
		
		}
		
}

class Monteur{
	int reperatiekosten = 25;
	
	void repareren (Auto auto) {
		int Prijs = 0;
		boolean[] onderdelen = {auto.motor, auto.deur, auto.voorruit, auto.uitlaat};
		for (int i =1; i<onderdelen.length ;i++ ) {
		if(onderdelen[i]==false) {
			Prijs += reperatiekosten;
			auto.motor = true;
			auto.deur = true;
			auto.voorruit = true;
			auto.uitlaat = true;
						
		}
		
		}
	System.out.println("Kosten voor repartie zijn "+ Prijs);
	System.out.println(auto.motor +","+ auto.deur + ","+ auto.voorruit + "," + auto.uitlaat);
	}
}

class Auto {
	boolean motor;
	boolean deur;
	boolean voorruit;
	boolean uitlaat;
	
	Auto(boolean motor, boolean deur, boolean voorruit, boolean uitlaat){
		this.motor= motor;
		this.deur = deur;
		this.voorruit = voorruit;
		this.uitlaat = uitlaat;
	}
}
	
	
