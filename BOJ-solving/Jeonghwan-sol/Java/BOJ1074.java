import java.util.Scanner;

public class BOJ1074 {
	
	static int N, r, c, count;
	
	static void moveZ(int n, int y, int x) {
		int mid = n / 2;

		if (y == r && x == c) {
			System.out.println(count);
			return;
		}
		
		if (y <= r && r < (y + n) && x <= c && c < (x + n)) {
			moveZ(mid, y, x);
			moveZ(mid, y, x + mid);
			moveZ(mid, y + mid, x);
			moveZ(mid, y + mid, x + mid);
		} else {
			count += n * n;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		
		moveZ((int) Math.pow(2, N), 0, 0);
		
		sc.close();
	}
}
