import java.util.Scanner;

public class BOJ1992 {
	
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static boolean check(int x, int y, int size) {
		int val = arr[x][y];
		
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (val != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void QuadTree(int x, int y, int size) {
		if (check(x, y, size)) {
			sb.append(arr[x][y]);
			return;
		}
		
		int nSize = size / 2;
		
		sb.append("(");
		
		QuadTree(x, y, nSize);
		QuadTree(x, y + nSize, nSize);
		QuadTree(x + nSize, y, nSize);
		QuadTree(x + nSize, y + nSize, nSize);
		
		sb.append(")");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		arr = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String line = sc.next();
			
			for (int j = 0; j < N; j++) {
				arr[i][j] = line.charAt(j) - '0';
			}
		}
		
		QuadTree(0, 0, N);
		System.out.println(sb);
		
		sc.close();
	}
}
