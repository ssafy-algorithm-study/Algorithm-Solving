import java.util.Base64;
import java.util.Scanner;

public class SWEA1928 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			String encoded = sc.next();
			String decoded = new String(Base64.getDecoder().decode(encoded));
			
			System.out.println("#" + tc + " " + decoded);
		}
		
		sc.close();
	}

}
