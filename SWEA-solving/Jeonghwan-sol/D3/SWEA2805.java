package D3;
import java.util.Scanner;

public class SWEA2805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String[][] farm = new String[N][N];
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				String line = sc.next();
				farm[i] = line.split("");
			}
			
			int start = (int) Math.floor(N / 2);
			int end = start;

			for (int i = 0; i < N; i++) {
				for (int j = start; j <= end; j++) {
					sum += Integer.parseInt(farm[i][j]);
				}
				if (i > (N / 2) - 1) {
					start++;
					end--;
				} else {
					start--;
					end++;
				}
			}
	
			System.out.println("#" + tc + " " + sum);
		}
		sc.close();
	}
}
