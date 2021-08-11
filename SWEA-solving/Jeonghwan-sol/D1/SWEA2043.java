import java.util.Scanner;

public class SWEA2043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 1;
		
		while (K != P) {
			K++;
			cnt++;
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
