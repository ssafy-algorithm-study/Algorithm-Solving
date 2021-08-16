import java.util.Arrays;
import java.util.Scanner;

public class SWEA1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int[] arr = new int[10];
			int sum = 0;
			int avg = 0;
			
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for (int j = 1; j < 9; j++) {
				sum += arr[j];
			}
			
			avg = (int) Math.round(((sum / 8.0) * 10) / 10.0);
			
			System.out.println("#" + tc + " " + avg);
		}
		sc.close();
	}
}
