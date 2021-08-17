import java.util.Scanner;

public class SWEA2050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			int n = (int) str.charAt(i);
			System.out.format("%d ", n - 64);
		}
		
		sc.close();
	}
}
