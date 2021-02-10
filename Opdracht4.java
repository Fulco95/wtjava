import java.util.Arrays;
import java.util.Random;

class Opdracht4 {

	public static void main(String[] args) {
	Random rd = new Random();
	int[] array = new int[10];
	for(int i=0; i<array.length; i++) {
	
	array[i]= rd.nextInt(10)+1;

	
	}
	System.out.println(Arrays.toString(array));
	
	for(int index=0 ; index<array.length ; index++) {	
	for (int j =0; j<array.length; j++) {
	if(array[index]<array[j]) {
		int k = array[index];
		array[index]=array[j];
		array[j]= k;
	}
	}
	
	}
	System.out.println(Arrays.toString(array));
	}
	
	}


