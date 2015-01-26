import java.util.Scanner;


public class _01_RectangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();
		int area = firstNumber * secondNumber;
		
		System.out.println(area);
	}

}