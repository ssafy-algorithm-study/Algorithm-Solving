import java.util.Scanner;

public class SWEA1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[M];
			int gap = Math.abs(N - M);
			int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			
			for (int j = 0; j < M; j++) {
				B[j] = sc.nextInt();
			}
			
			for (int k = 0; k <= gap; k++) {
				int sum = 0;
				
				if (N < M) {
					for (int idx = 0; idx < N; idx++) {
						sum += (A[idx] * B[idx + k]);
					}
				} else if (N > M) {
					for (int idx = 0; idx < M; idx++) {
						sum += (B[idx] * A[idx + k]);
					}
				} else {
					for (int idx = 0; idx < N; idx++) {
						sum += (B[idx] * A[idx]);
					}
				}
				
				max = Math.max(max, sum);
			}
			
			System.out.println("#" + tc + " " + max);
		}
		
		sc.close();
	}
}
