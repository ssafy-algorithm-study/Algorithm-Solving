import java.util.Scanner;

public class BOJ12927 {
	
	static int N;
	static char[] sw;
	
	private static boolean check() {
		for (int i = 1; i <= N; i++) {
			if (sw[i] == 'Y') {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		N = input.length();
		sw = new char[N + 1];
		int cnt = 0;
		
		sw[0] = '-';
		
		for (int i = 1; i <= N; i++) {
			sw[i] = input.charAt(i - 1);
		}
		
		for (int j = 1; j <= N; j++) {
			if (check()) {
				break;
			}
			
			if (sw[j] == 'Y') {
				cnt++;
	
				for (int k = j; k <= N; k += j) {
					sw[k] = (sw[k] == 'Y') ? 'N' : 'Y'; 
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}

}
