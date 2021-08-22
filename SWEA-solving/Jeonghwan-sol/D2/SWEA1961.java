import java.util.Scanner;

public class SWEA1961 {
	
	public static int[][] rotation(int[][] arr) {
		int len = arr.length;
		int[][] res = new int[len][len];
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				res[i][j] = arr[len - j - 1][i];
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int[][] res90 = rotation(arr);
			int[][] res180 = rotation(res90);
			int[][] res270 = rotation(res180);

			System.out.println("#" + tc);
			
			for (int j = 0; j < N; j++) {
				for (int a = 0; a < N; a++) {
					System.out.print(res90[j][a]);
				}
				System.out.print(" ");
				for (int b = 0; b < N; b++) {
					System.out.print(res180[j][b]);
				}
				System.out.print(" ");
				for (int c = 0; c < N; c++) {
					System.out.print(res270[j][c]);
				}
				System.out.println();
			}
			
		}
		
		sc.close();
	}
}
