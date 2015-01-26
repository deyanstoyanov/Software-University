import java.util.Scanner;


public class _07_CountOfBitsOne {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		long count = Integer.bitCount(number);
		System.out.println(count);
	}
}