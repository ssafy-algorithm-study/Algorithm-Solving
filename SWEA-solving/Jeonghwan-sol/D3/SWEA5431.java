import java.util.Scanner;

public class SWEA5431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] res = new int[N];
			
			for (int i = 0; i < K; i++) {
				int idx = sc.nextInt() - 1;

				res[idx] = 1;
			}
			
			System.out.print("#" + tc);
			
			for (int j = 0; j < N; j++) {
				if (res[j] == 0) {
					System.out.print(" " + (j + 1));
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
