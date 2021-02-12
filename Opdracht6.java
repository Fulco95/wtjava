import java.util.Scanner;
import java.util.Arrays;

public class Opdracht6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Typ een string");
	String text = sc.nextLine();
	System.out.println(text);
	 char charArray[] = text.toCharArray();
     Arrays.sort(charArray);
     System.out.println(new String(charArray));
}
}
