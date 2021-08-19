import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3109 {
	
	static int R, C;
	static char[][] map;
	static int[] dir = {-1, 0, 1};
	static int answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		
		for (int i = 0; i < R; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for (int i = 0; i < R; i++) {
			connect(i, 0);	// 행값, 열값
		}
		
		System.out.println(answer);
	}
	
	private static boolean connect(int x, int y) {
		// 1. 종료조건 : 끝 열에 도착한 경우, 파이프라인 한개 완성
		if (y == C - 1) {
			answer++;
			return true;
		}
		
		// 2. 반복조건 : 끝에 아직 도달을 안해서 3방향을 체크 하면서 나가는 작업
		// 				 3 방향 중에서 한 방향이라도 성공을 하면
		for (int i = 0; i < 3; i++) {	// 우상, 우, 우하
			int nx = x + dir[i];
			int ny = y + 1;
			
			if (nx >= 0 && ny >= 0 && nx < R && ny < C && map[nx][ny] != 'x') {
				map[nx][ny] = 'x';		// 방문 표시
				boolean result = connect(nx, ny);
				
				if (result == true) {
					return true;
				}
			}
		}
		return false;
	}
}
