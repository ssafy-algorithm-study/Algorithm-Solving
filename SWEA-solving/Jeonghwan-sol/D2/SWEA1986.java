import java.util.Scanner;

public class SWEA1986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int res = 0;
			
			for (int i = 1; i <= N; i++) {
				if (i % 2 != 0 || i == 0) {
					res += i;
				} else {
					res -= i;
				}
			}
			
			System.out.println("#" + tc + " " + res);
		}
		
		sc.close();
	}
}
