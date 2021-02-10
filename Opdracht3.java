import java.util.Scanner;
import java.util.ArrayList;
class Opdracht3 {
	
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner (System.in);
	System.out.println("Typ nummbers wanneer klaar typ een letter:");
	ArrayList<Double> numbers = new ArrayList<Double>();
	while (sc.hasNextDouble()) {
		numbers.add(sc.nextDouble());
	}
	System.out.println(numbers);
	double sum = 0;
	for (int index=0; index < numbers.size() ; index++) {
		sum = sum + numbers.get(index);
		
	}
	System.out.println(sum);
	
	}
	
	
}
