
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class _04_TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] array = new double[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextDouble();
		}
		
		Arrays.sort(array);
		if (array[0] == (int)array[0]) {
		System.out.println((int)array[0]);
		}
		else {
		System.out.println(array[0]);
		}
	}
}