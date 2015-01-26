import java.util.Scanner;


public class _04_TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if (a <= b && a <= c) {
			System.out.println(a);
		}
		if (b < a && b <= c) {
			System.out.println(b);
		}
		if (c < a && c < b) {
			System.out.println(c);
		}
	}
}