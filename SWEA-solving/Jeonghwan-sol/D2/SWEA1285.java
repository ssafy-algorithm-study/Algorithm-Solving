import java.util.Scanner;

public class SWEA1285 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int min = Integer.MAX_VALUE;
			int cnt = 0;
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for (int j = 0; j < N; j++) {
				if (min > Math.abs(arr[j])) {
					min = Math.abs(arr[j]);
				}
			}
			
			for (int k = 0; k < N; k++) {
				if (min == Math.abs(arr[k])) {
					cnt++;
				}
			}
			
			System.out.println("#" + tc + " " + min + " " + cnt);
		}
		
		sc.close();
	}

}
