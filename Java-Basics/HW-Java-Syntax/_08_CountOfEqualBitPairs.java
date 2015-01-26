import java.util.Scanner;



public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int number = scan.nextInt();
		String binary = Integer.toBinaryString(number);
		char[] array = binary.toCharArray();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
				i++;
			}
			break;
		}
		System.out.println(count);
	}
}