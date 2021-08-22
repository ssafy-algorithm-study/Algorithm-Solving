import java.util.Scanner;

public class SWEA1948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int gap = 0;
			int m = sc.nextInt();
			int d = sc.nextInt();
			int nm = sc.nextInt();
			int nd = sc.nextInt();
			
			int sum1 = 0;
			int sum2 = 0;
			
			for (int i = 1; i < m; i++) {
				sum1 += days[i];
			}
			
			sum1 += d;
			
			for (int j = 1; j < nm; j++) {
				sum2 += days[j];
			}
			
			sum2 += nd;
			
			gap = sum2 - sum1 + 1;
			System.out.println("#" + tc + " " + gap);
		}
		
		sc.close();
	}

}
