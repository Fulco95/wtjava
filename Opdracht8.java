
public class Opdracht8 {
	public static void main(String[] args) {
	Boot boot1 = new Boot();
	SpeedBoot Speed1 = new SpeedBoot();
	Kapitein kap = new Kapitein();
	kap.varen(boot1);
	kap.varen(Speed1);
	
	}

}

class Boot{
	
}

class SpeedBoot extends Boot{
	
}

class Kapitein{
	void varen(Boot boot) {
	if(boot instanceof SpeedBoot) {
	System.out.println("Ik zet mijn pet af");
	
	}
	}
}