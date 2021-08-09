package D1;
import java.util.Scanner;

public class SWEA2068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int max = 0;
			
			for(int i = 0; i < 10; i++) {
				int tmp = sc.nextInt();
			
				if (max < tmp) {
					max = tmp;
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
		sc.close();
	}
}
