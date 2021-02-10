import java.util.Scanner;

class Opdracht2 {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner (System.in);
	System.out.println("Text:");
	String text = sc.nextLine();
	int aantalE = 0;
	for (int index=0; index < text.length(); index++) {
	if (text.charAt(index)=='e'|| text.charAt(index)=='E'){
			aantalE = aantalE + 1;
		}
	}
	
	System.out.println(aantalE);
	

	}

}
