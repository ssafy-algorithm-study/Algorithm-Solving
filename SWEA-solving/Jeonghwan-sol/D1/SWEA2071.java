import java.util.Scanner;

public class SWEA2071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int sum = 0;
			int avg = 0;
			for (int i = 0; i < 10; i++) {
				sum += sc.nextInt();
			}
			
			avg = (int) Math.round((double)sum / 10.0);
			
			System.out.println("#" + tc + " " + avg);
		}
		
		sc.close();
	}
}
