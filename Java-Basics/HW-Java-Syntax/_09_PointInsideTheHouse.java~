import java.util.Scanner;

public class _09_PointInsideTheHouse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		double x1 = 12.5;
		double y1 = 8.5;
		double x2 = 22.5;
		double y2 = 8.5;
		double x3 = 17.5;
		double y3 = 3.5;
		double denominator = (y2 - y3)*(x1 - x3) + (x3 - x2)*(y1 - y3);
		double a = ((y2 - y3)*(x - x3) + (x3 - x2)*(y - y3)) / denominator;
		double b = ((y3 - y1)*(x - x3) + (x1 - x3)*(y - y3)) / denominator;
		double c = 1 - a - b;
		
		boolean insideTriagle = (a >= 0 && a <= 1 && 0 <= b && b <= 1 && 0 <= c && c <= 1);
		boolean insideFigure1 = (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5);
		boolean insideFigure2 =(x >= 20 && x <= 22.5 && y >=8.5 && y <= 13.5);
		boolean check = ( insideTriagle || insideFigure1 || insideFigure2);
		if (check) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}


//if (a >= 0 && a <= 1 && 0 <= b && b <= 1 && 0 <= c && c <= 1) {
//	System.out.println("Inside");
//}
//else if (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) {
//	System.out.println("Inside");
//}
//else if (x >= 20 && x <= 22.5 && y >=8.5 && y <= 13.5) {
//	System.out.println("Inside");
//}
//else {
//	System.out.println("Outside");
//}