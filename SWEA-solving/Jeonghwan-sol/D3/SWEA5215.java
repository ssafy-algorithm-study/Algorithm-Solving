import java.util.Scanner;

public class SWEA5215 {
	
	static int N, L, maxScore;
	static int[][] ingredient;
	
	public static void select(int idx, int score, int cal) {
		if (cal > L) {
			return;
		} else if (cal <= L) {
			maxScore = Math.max(maxScore, score);
		}
		
		if (idx == N) {
			return;
		} else {
			select(idx + 1, score + ingredient[idx][0], cal + ingredient[idx][1]);
			select(idx + 1, score, cal);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			L = sc.nextInt();
			ingredient = new int[N][2];
			
			for (int i = 0; i < N; i++) {
				ingredient[i][0] = sc.nextInt();
				ingredient[i][1] = sc.nextInt();
			}
			
			maxScore = 0;
			select(0, 0, 0);
			
			System.out.println("#" + tc + " " + maxScore);
		}
		
		sc.close();
	}
}
