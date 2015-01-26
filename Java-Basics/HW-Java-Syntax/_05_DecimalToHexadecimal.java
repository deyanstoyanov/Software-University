import java.util.Scanner;


public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int decimalNumber = scan.nextInt();
		String hexNumber = Integer.toHexString(decimalNumber).toUpperCase();
		System.out.println(hexNumber);
	}
}