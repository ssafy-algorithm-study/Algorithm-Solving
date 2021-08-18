import java.util.Scanner;

public class BOJ2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		
		while(true) {
			if (N % 5 == 0) {
				ans += N / 5;
				break;
			} 
			
			N -= 3;
			ans++;
			
			if (N < 0) {
				ans = -1;
				break;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}
