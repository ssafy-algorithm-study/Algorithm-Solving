import java.util.Scanner;

public class BOJ16926 {
	// down, right, up, left
	static int[] dX = { 0, 1, 0, -1};
	static int[] dY = {1, 0, -1, 0};
	static int N, M, R;
	static int[][] arr;
	
	private static void rotate(int sq) {
		for (int i = 0; i < sq; i++) {
			int sX  = i;
			int sY = i;
			int d = 0;
			int tmp = arr[sX][sY];
			
			while (d < 4) {
				int nX = sX + dX[d];
				int nY = sY + dY[d];
				
				if (nX >= i && nY >= i && nX < N - i && nY < M - i) {
					arr[sX][sY] = arr[nX][nY];
					sX = nX;
					sY = nY;
				} else {
					d++;
				}
			}
			
			arr[i + 1][i] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		R = sc.nextInt();
		arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sq = Math.min(N, M) / 2;
		
		for (int i = 0; i < R; i++) {
			rotate(sq);
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
