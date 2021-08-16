import java.util.Scanner;

public class SWEA1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int tc = sc.nextInt();
			int[] scores = new int[1000];
			int[] cnt = new int[101];
			int answer = 0;
			
			for (int j = 0; j < scores.length; j++) {
				scores[j] = sc.nextInt();
				cnt[scores[j]]++;
			}
			
			for (int k = 1; k < cnt.length; k++) {
				if (cnt[answer] <= cnt[k]) {
					answer = k;
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
		
		sc.close();
	}
}
