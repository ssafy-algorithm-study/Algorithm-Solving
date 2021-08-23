import java.util.Scanner;

public class SWEA1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			int bFee;
			int aFee;
			
			aFee = P * W;
			
			if (W > R) {
				bFee = Q + (W - R) * S;
			} else {
				bFee = Q;
			}
			
			System.out.println("#" + tc + " " + Math.min(aFee, bFee));
		}
		
		sc.close();
	}

}
