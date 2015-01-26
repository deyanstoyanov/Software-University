import java.util.Scanner;


public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] firstCordinates = new int[2];
		for (int i = 0; i < firstCordinates.length; i++) {
			firstCordinates[i] = scan.nextInt();
		}
		int[] secondCordinates = new int[2];
		for (int i = 0; i < secondCordinates.length; i++) {
			secondCordinates[i] = scan.nextInt();
		}
		int[] thirdCordinates = new int[2];
		for (int i = 0; i < thirdCordinates.length; i++) {
			thirdCordinates[i] = scan.nextInt();
		}
		int Ax = firstCordinates[0];
		int Ay = firstCordinates[1];
		int Bx = secondCordinates[0];
		int By = secondCordinates[1];
		int Cx = thirdCordinates[0];
		int Cy = thirdCordinates[1];
		int area = (Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By))/2;
		if (area < 0) {
			area = -area;
		}
		
		if (Ax == Bx && Ay == By || Ax == Cx && Ay == Cy || Bx == Cx && By == Cy) {
			System.out.println("0");
		}
		else {
			System.out.println(area);
		}
	}
}