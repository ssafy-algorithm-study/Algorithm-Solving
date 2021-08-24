import java.util.Scanner;

public class BOJ10163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int M_SIZE = 1001;
		int N = sc.nextInt();
		int[][] map = new int[M_SIZE][M_SIZE];
		int[][] pos = new int[N][2];
		int[][] size = new int[N][2];
		int[] res = new int[N];
		
		for (int nc = 0; nc < N; nc++) {
			for (int i = 0; i < 2; i++) {
				pos[nc][i] = sc.nextInt();
			}
			
			for (int j = 0; j < 2; j++) {
				size[nc][j] = sc.nextInt();
			}
		}
		
		for (int k = 0; k < N; k++) {
			int startR = pos[k][0];
			int endR = pos[k][0] + size[k][0];
			int startC = pos[k][1];
			int endC = pos[k][1] + size[k][1];
			
			for (int i = startR; i < endR; i++) {
				for (int j = startC; j < endC; j++) {
					map[i][j] = k + 1;
				}
			}
		}
		
		for (int r = 0; r < M_SIZE; r++) {
			for (int c = 0; c < M_SIZE; c++) {
				if (map[r][c] != 0) {
					res[map[r][c] - 1]++;
				}
			}
		}
		
		for (int x : res) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
