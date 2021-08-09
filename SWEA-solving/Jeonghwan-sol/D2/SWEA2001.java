package D2;
import java.util.Scanner;

public class SWEA2001 {

	static int N;
	static int M;
	static int[][] area;
	
	private static int getSum(int x, int y) {
		int sum = 0;
		
		for (int i = x; i < x + M; i++) {
			for (int j = y; j < y + M; j++) {
				sum += area[i][j];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			area = new int[N][N];		
			int max = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					area[i][j] = sc.nextInt();
				}
			}
			
			for (int a = 0; a <= N - M; a++) {
				for (int b = 0; b <= N - M; b++) {
					if (max < getSum(a, b)) {
						max = getSum(a, b);
					}
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
		
		sc.close();
	}
}
