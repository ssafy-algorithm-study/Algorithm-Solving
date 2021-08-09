package D3;

import java.util.Scanner;

public class SWEA9229 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] snack = new int[N];
			
			for (int i = 0; i < N; i++) {
				snack[i] = sc.nextInt();
			}
			
			int max = -1;
			
			for (int j = 0; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					int tmp = snack[j] + snack[k];
					
					if (M >= tmp && max < tmp) {
						max = tmp;
					}
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
		sc.close();
	}
}
