import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1233 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			char[] tree = new char[N + 1];
			
			int index = 0;
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				index = Integer.parseInt(st.nextToken());
				tree[index] = st.nextToken().charAt(0);
			}
			
			int left, right;
			boolean result = true;
			
			for (int n = 0; n <= N; n++) {
				left = n * 2;
				right = n * 2 + 1;
				
				if (Character.isDigit(tree[n])) {
					if (left <= N) {
						result = false;
					}
				} else {
					if (left <= N && right <= N) {
						if (Character.isDigit(tree[left]) && !Character.isDigit(tree[right])) {
							result = false;
						}
					} else {
						result = false;
					}
				}
				
				if (!result) {
					break;
				}
			}
			System.out.println("#" + tc + " " + (result == true ? 1 : 0));
		}
	}

}
