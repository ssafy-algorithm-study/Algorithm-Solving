import java.util.Scanner;

public class SWEA1976 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int h = 0;
			int m = 0;
			
			for (int i = 0; i < 2; i++) {
				h += sc.nextInt();
				m += sc.nextInt();
			}
			
			h += (m / 60);
			m = m % 60;
			
			if (h > 12) {
				h -= 12;
			}
			
			System.out.println("#" + tc + " " + h + " " + m);
		}
		
		sc.close();
	}
}
