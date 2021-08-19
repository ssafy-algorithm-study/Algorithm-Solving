import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1987 {

	static int R, C;
	static int[][] arr;
	static boolean[][] visited;
	static boolean[] check = new boolean[26];
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	private static int route (int x, int y) {
		int cnt = 0;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny]) {
				if(!check[arr[nx][ny]]) {
					visited[nx][ny] = true;
					check[arr[nx][ny]] = true;
					cnt = Math.max(cnt, route(nx, ny));
					visited[nx][ny] = false;
				}
			}
		}
		
		check[arr[x][y]] = false;
		return cnt + 1;
	}
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		R = Integer.parseInt(line[0]);
		C = Integer.parseInt(line[1]);
		arr = new int[R][C];
		visited = new boolean[R][C];
		
		for (int i = 0; i < R; i++) {
			String l = br.readLine();
			
			for (int j = 0; j < C; j++) {
				arr[i][j] = l.charAt(j) - 'A';
			}
		}
		
		visited[0][0] = true;
		check[arr[0][0]] = true;
		System.out.print(route(0, 0));
	}
}
