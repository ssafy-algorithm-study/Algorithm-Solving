import java.util.Scanner;

public class SWEA1974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int[][] arr = new int[9][9];
			int res = 1;
			
			for (int r = 0; r < 9; r++) {
				for (int c = 0; c < 9; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			// 행 체크
			for (int i = 0; i < 9; i++) {
				int[] check = new int[9];
				
				for (int j = 0; j < 9; j++) {
					check[arr[i][j] - 1]++;
				}
				for (int k = 0; k < 9; k++) {
					if (check[k] == 0) {
						res = 0;
						break;
					}
				}
			}
			
			if (res == 1) {
				// 열 체크
				for (int i = 0; i < 9; i++) {
					int[] check = new int[9];
					
					for (int j = 0; j < 9; j++) {
						check[arr[j][i] - 1]++;
					}
					for (int k = 0; k < 9; k++) {
						if (check[k] == 0) {
							res = 0;
							break;
						}
					}
				}
			}
			
			if (res == 1) {
				// 격자 체크
				for (int i = 0; i <= 6; i += 3) {
					for (int j = 0; j <= 6; j += 3) {
						int[] check = new int[9];
						int r = i + 3;
						int c = j + 3;
						
						for (int a = i; a < r; a++) { 
							for (int b = j; b < c; b++) {
								check[arr[a][b] - 1] ++;
							}
						}
						
						for (int k = 0; k < 9; k++) {
							if (check[k] == 0) {
								res = 0;
								break;
							}
						}
					}
				}
			}
			
			System.out.println("#" + tc + " " + res);
		}
		
		sc.close();
	}

}
