import java.util.Scanner;

public class SWEA7236 {
	
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1,  1, 1, 0, -1, -1, -1};
	static int N;
	static String[][] map;
	
	public static int getCnt(int r, int c) {
		int cnt = 0;
		
		for (int i = 0; i < 8; i++) {
			int nr = r + dx[i];
			int nc = c + dy[i];
			
			if ((nr >= 0 && nr < N) && (nc >= 0&& nc < N)) {
				if (map[nr][nc].equals("W")) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			map = new String[N][N];
			
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.next();
				}
			}
			
			int max = getCnt(0, 0);
			
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					int cnt = getCnt(r, c);
					
					max = Math.max(max, cnt);
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
		
		sc.close();
	}

}
