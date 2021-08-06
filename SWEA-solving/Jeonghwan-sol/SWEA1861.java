import java.util.Scanner;

public class SWEA1861 {

	static int[][] rooms;	// 방 배열
	static int[][] visit;	// 방문 배열
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int N;
	
	// (i, j)위치에서부터 최장 거리 계산
	private static void check(int i, int j) {
		visit[i][j] = 1;
		
		for (int d = 0; d < 4; d++) {
			int nx = i + dx[d];
			int ny = j + dy[d];
			
			if (!inRange(nx, ny)) continue;
			if (rooms[nx][ny] == rooms[i][j] + 1) {
				check(nx, ny);
				visit[i][j] = visit[nx][ny] + 1;
			}
		}
	}
	
	private static boolean inRange(int nx, int ny) {
		return (nx >= 0 && ny >= 0 && nx < N && ny < N);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			
			rooms = new int[N][N];
			visit = new int[N][N];
			
			// 룸 넘버 배정
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					rooms[i][j] = sc.nextInt();
				}
			}
			
			// 탐색
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (visit[i][j] == 0) {
						check(i, j);
					}
				}
			}
			
			int max = -1;
			int no = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (max < visit[i][j]) {
						max = visit[i][j];
						no = rooms[i][j];
						
					} else if (max == visit[i][j] ) {
						no = Math.min(no, rooms[i][j]);
					}
				}
			}
			System.out.println("#" + tc + " " + no + " " + max);
		}
		
		sc.close();
	}
}
