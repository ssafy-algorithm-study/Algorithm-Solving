import java.util.Scanner;

public class SWEA1970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int[] MONEY = {50000, 10000, 5000, 1000, 500, 100, 50, 10};  
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] cnt = new int[MONEY.length];
			
			for (int i = 0; i < MONEY.length; i++) {
				if (N == 0) {
					break;
				}
				
				if (N / MONEY[i] > 0) {
					cnt[i] = N / MONEY[i];
					N = N % MONEY[i];
				}
			}
			
			System.out.println("#" + tc);
			
			for (int c : cnt) {
				System.out.print(c + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
