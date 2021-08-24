import java.util.Scanner;

public class BOJ10163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int M_SIZE = 1001;
		int[][] map = new int[M_SIZE][M_SIZE];
		int N = sc.nextInt();
		int[] res = new int[N];
		
		for (int nc = 1; nc <= N; nc++) {
			int column = sc.nextInt();
			int row = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			for (int i = row; i < (row + h); i++) {
				for (int j = column; j < (column + w); j++) {
					map[i][j] = nc;
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
