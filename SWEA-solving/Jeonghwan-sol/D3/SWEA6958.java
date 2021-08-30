import java.util.Scanner;

public class SWEA6958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] map = new int[N][M];
			int maxSol = Integer.MIN_VALUE;
			int cnt = 0;
			
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < M; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
			for (int r = 0; r < N; r++) {
				int sol = 0;
				
				for (int c = 0; c < M; c++) {
					if (map[r][c] == 1) {
						sol++;
					}
				}
				
				if (sol > maxSol) {
					cnt = 1;
					maxSol = sol;
				} else if (sol == maxSol) {
					cnt++;
				}
			}
			
			System.out.println("#" + tc + " " + cnt + " " + maxSol);
		}
		
		sc.close();
	}

}
