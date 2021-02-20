import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



public class Kermis {
	public static void main(String[] args) {
		
		Kassa Kassa = new Kassa();
		Botsauto Botsauto = new Botsauto();
		Spin Spin = new Spin();
		Spiegelpaleis Spiegelpaleis = new Spiegelpaleis();
		Spookhuis Spookhuis = new Spookhuis();
		Hawaii Hawaii = new Hawaii();
		Ladderklimmen Ladderklimmen = new Ladderklimmen();
		ArrayList<String> attracties = new ArrayList<String>();
		attracties.add("Botsauto");
		attracties.add("Spin");
		attracties.add("Spiegelpaleis");
		attracties.add("Spookhuis");
		attracties.add("Hawaii");
		attracties.add("Ladderklimmen");
		
	
		
		int[] Kaarten = new int[] {0,0,0,0,0,0};
		double[] prijzen = new double[] {Botsauto.prijs, Spin.prijs, Spiegelpaleis.prijs, Spookhuis.prijs, Hawaii.prijs, Ladderklimmen.prijs};
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		while(true) {
		String text = sc.nextLine();
		
		
		if (text.equals("1")) {
			Botsauto.draaien();	
			Kaarten[0] += 1;
		}else if(text.equals("2")){
			Spin.draaien();	
			Kaarten[1] += 1;
			Spin.opstellingKeuring(Kaarten[1]);
			
		}else if(text.equals("3")) {
			Spiegelpaleis.draaien();
			Kaarten[2]+=1;
		}else if(text.equals("4")) {
			Spookhuis.draaien();
			Kaarten[3]+=1;
		}else if(text.equals("5")){
			Hawaii.draaien();
			Kaarten[4]+=1;
			Hawaii.opstellingKeuring(Kaarten[4]);
			
		}else if (text.equals("6")) {
			Kaarten[5]+=1;
			Ladderklimmen.draaien();
		}else if (text.equals("k")) {
			Kassa.Kaarten(Kaarten);
			
		}else if (text.equals("o")){
			Kassa.Omzet(Kaarten, prijzen);
			
		}
		
		}	
		
	}
}

class Kassa{
	void Kaarten(int [] Kaarten) {
		
		int TotaalKaarten = 0;
		for(int i=0;i< Kaarten.length;i++) {
		TotaalKaarten += Kaarten[i];

		}
		System.out.println("Er zijn "+ TotaalKaarten + " kaarten verkocht");
		}
	void Omzet(int[] Kaarten,double[] prijzen) {
		double TotaalOmzet = 0;
		for(int i=0; i<Kaarten.length;i++) {
		TotaalOmzet +=	Kaarten[i]*prijzen[i];
		}
		System.out.println("Er is "+ TotaalOmzet + " omzet gedraaid");
		
	}
}
class Attracties{
	String naam;
	double prijs;
	
	
	
	void draaien() {
		System.out.println("De attractie " + naam + " draait nu.");
		
			
		
	}
	
}


class RisicoRijkeAttracties extends Attracties{
	
	int draailimiet; 
	
	void opstellingKeuring(int k) {
	
	
	if(k % draailimiet==0) {
	System.out.println("Keuring nodig voor "+ naam )	;
}
}
}
class Botsauto extends Attracties{
	public Botsauto() {
	naam = "Botsauto";
	prijs = 2.50;
	}}
	
class Spin extends RisicoRijkeAttracties{
	public Spin(){
	naam = "Spin";
	prijs = 2.25;
	draailimiet = 5;
	}}

class Spiegelpaleis extends Attracties{
	public Spiegelpaleis(){
	naam = "Spiegelpaleis";
	prijs = 2.75;
	}}
class Spookhuis extends Attracties{
	public Spookhuis() {
	naam = "Spookhuis";
	prijs = 3.20;
	}}

class Hawaii extends RisicoRijkeAttracties{
	public Hawaii() {
	naam = "Hawaii";
	prijs = 2.90;
	draailimiet =10;
	}}

	
class Ladderklimmen extends Attracties{
	public Ladderklimmen() {
	naam = "Ladderklimmen";
	prijs = 5.00;
	}}



