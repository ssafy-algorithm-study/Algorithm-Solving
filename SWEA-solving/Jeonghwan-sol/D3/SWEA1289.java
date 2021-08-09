package D3;
import java.util.Scanner;

public class SWEA1289 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // test case number
		
		for (int tc = 1; tc <= T; tc++) {
			String s = sc.next(); // 원래 상태
			int cnt = 0; // 바꾼 횟수 저장할 변수
			
			// 시작이 1인 경우
			if (s.startsWith("1")) {
				cnt++;
			}
			
			for (int j = 0; j < s.length() - 1; j++) {
				if (s.charAt(j) != s.charAt(j + 1)) {
					cnt++;
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
		}
		
		sc.close();
	}
}