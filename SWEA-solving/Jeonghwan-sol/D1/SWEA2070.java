package D1;
import java.util.Scanner;

public class SWEA2070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			char res = ' ';
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if (n1 > n2) {
				res = '>';
			} else if (n1 < n2) {
				res = '<';
			} else {
				res = '=';
			}
			
			System.out.println("#" + tc + " "+ res);
		}
		
		sc.close();
	}
}
