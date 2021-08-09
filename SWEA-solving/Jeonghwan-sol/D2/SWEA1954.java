import java.util.Scanner;

public class SWEA1954 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			int dir = 1;
			int x = 0, y = -1;
			int cnt = 1;			
			
			while(true) {
				// 1. 오른쪽 (y가 증가), 왼쪽
				for (int i = 0; i < N; i++) {
					y = y + dir;
					arr[x][y] = cnt++;
				}
				
				// 2. 아래 (x가 중가), 위
				N--;	// 아래, 위인 경우 출력해야 되는 데이터 개수가 하나 줄어 든다.
				if (N == 0)
					break;
				
				for (int i = 0; i < N; i++) {
					x = x + dir;
					arr[x][y] = cnt++;
				}
				
				// 방향값 변경
				dir = dir * -1;		
			}
			
			System.out.println("#" + tc);
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
