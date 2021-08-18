import java.util.Scanner;

public class SWEA1945 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int[] nums = {2, 3, 5, 7, 11}; 
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int[] cnt = {0, 0, 0, 0, 0};
			int N = sc.nextInt();
			int i = 0;
			
			while (true) {
				if (N % nums[i] == 0) {
					N = N / nums[i];
					cnt[i]++;
				} else {
					i++;
				}
				
				if (N == 1) {
					break;
				}
			}
			
			
			System.out.print("#" + tc);
			
			for (int c : cnt) {
				System.out.print(" " + c);
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
