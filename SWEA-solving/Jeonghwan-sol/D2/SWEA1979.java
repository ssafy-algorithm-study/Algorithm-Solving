import java.util.Scanner;

public class SWEA1979 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] puzzle = new int[N][N];
			int cnt = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					puzzle[i][j] = sc.nextInt();
				}
			}
			
			// 가로 탐색
			for (int i = 0; i < N; i++) {
				outerloop:
				for (int j = 0; j <= N - K; j++) {
					if ((j != 0 && puzzle[i][j - 1] == 1) || (j + K != N && puzzle[i][j + K] == 1)) {
						continue;
					}
					
					for (int x = 0; x < K; x++) {
						if (puzzle[i][j + x] == 0) {
							continue outerloop;
						}
					}
					
					cnt++;
				}
			}
			
			// 세로 탐색
			for (int i = 0; i <= N - K; i++) {
				outerloop:
				for (int j = 0; j < N; j++) {
					if ((i != 0 && puzzle[i - 1][j] == 1) || (i + K != N && puzzle[i + K][j] == 1)) {
						continue;
					}
					
					for (int x = 0; x < K; x++) {
						if (puzzle[i + x][j] == 0) {
							continue outerloop;
						}
					}

					cnt++;
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
		}
		
		sc.close();
	}
}
