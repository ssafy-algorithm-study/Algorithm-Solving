import java.util.Scanner;

public class BOJ2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] paper = new int[100][100];
		int area = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					paper[j][k] = 1;
				}
			}
		}
		
		for (int a = 0; a < 100; a++) {
			for (int b = 0; b < 100; b++) {
				if (paper[a][b] == 1) {
					area++;
				}
			}
		}
		
		System.out.println(area);
		sc.close();
	}
}
