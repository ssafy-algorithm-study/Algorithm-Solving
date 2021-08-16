import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SWEA1983 {

	public static void main(String[] args) {
		final String grades[] = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"}; 
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt() - 1;
			Integer[] score = new Integer[N];
			
			for (int i = 0; i < N; i++) {
				int mTest = sc.nextInt();
				int fTest = sc.nextInt();
				int assign = sc.nextInt();
				
				score[i] = mTest * 35 + fTest * 45 + assign * 20;
			}
			
			int kScore = score[K];
			
			Arrays.sort(score, Collections.reverseOrder());
			
			int kRank = Arrays.asList(score).indexOf(kScore);

			System.out.println("#" + tc + " " + grades[10 * kRank / N]);
		}
		sc.close();
	}
}
