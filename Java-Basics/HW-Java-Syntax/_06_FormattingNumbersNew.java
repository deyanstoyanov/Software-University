import java.util.Scanner;


public class _06_FormattingNumbersNew {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		String bin = Integer.toBinaryString(a);
		int outBin = Integer.parseInt(bin);
		System.out.format("|" + "%1$-10X", a);
		System.out.printf("|" + "%010d" + "|" + "%10.2f" + "|" + "%-10.3f" + "|", outBin, b, c);
	}
}