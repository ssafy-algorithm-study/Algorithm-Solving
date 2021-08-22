import java.util.Scanner;

public class SWEA2005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int num = 0;
			
			System.out.println("#" + tc);
			
			for (int i = 1; i <= N; i++) {
				for (int j = 0; j < i; j++) {
					if (j == 0 || j == i - 1) {
						System.out.print(1 + " ");
					} else {
						System.out.print(num + " ");
					}
				}
				System.out.println();
				num++;
			}
		}
		
		sc.close();
	}
}
