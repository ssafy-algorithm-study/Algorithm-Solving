import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1247 {
	static Point home;
	static Point company;
	static Point[] customers;
	static int ans, N;
	static int[] selected;
	static boolean[] flag;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			ans = Integer.MAX_VALUE;
			N = Integer.parseInt(br.readLine());
			customers = new Point[N];
			selected = new int[N];
			flag = new boolean[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			company = new Point(x, y);
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			home = new Point(x, y);
			
			for (int i = 0; i < N; i++) {
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				customers[i] = new Point(x, y);
			}
			
			perm(0);
			System.out.println("#" + tc + " " + ans);
		}

	}

	private static void perm(int cnt) {
		if (cnt == N) {
			int tmp = calc(selected);
			
			ans = Math.min(ans, tmp);
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (!flag[i]) {
				flag[i] = true;
				selected[cnt] = i;
				
				perm(cnt + 1);
				flag[i] = false;
			}
		}
		
	}

	private static int calc(int[] selected) {
		int sum = 0;
		
		sum += getDistance(company, customers[selected[0]]);
		
		int i = 0;
		
		for (i = 0; i < selected.length - 1; i++) {
			int from = selected[i];
			int to = selected[i + 1];
			
			sum += getDistance(customers[from], customers[to]);
		}
		
		sum += getDistance(customers[selected[i]], home);
		
		return sum;
	}

	private static int getDistance(Point p1, Point p2) {
		return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
	}
}

class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}