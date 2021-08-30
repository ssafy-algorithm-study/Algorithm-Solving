import java.util.Scanner;

public class SWEA1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			long res = 0;
			int max = arr[N - 1];
			
			for (int j = N - 2; j >= 0; j--) {
				if (arr[j] < max) {
					res += (max - arr[j]);
				} else if (arr[j] > max){
					max = arr[j];
				} else {
					continue;
				}
			}
			
			System.out.println("#" + tc + " " + res);
		}
		
		sc.close();
	}
}
