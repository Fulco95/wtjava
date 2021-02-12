import java.util.Scanner;
import java.util.Arrays;
public class Opdracht7 {
	public static void main(String[] args) {
	String woord = "fiets";
	System.out.print("_ _ _ _ _ \n");
	Scanner sc = new Scanner (System.in);
	System.out.println("5 letter woord:");
	String text = sc.nextLine();
	int[] Gok = {0,0,0,0,0};
	for(int i=0; i<woord.length(); i++) {
	String letter = Character.toString(text.charAt(i));
	if(woord.contains(letter)){
		Gok[i]=1;
	}
	
	if(woord.charAt(i)==text.charAt(i)) {
		Gok[i]=2;
	}
	}
	System.out.print(text);
	System.out.println(Arrays.toString(Gok));
		
	
}
}

		
	
