import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1759 {
	
	static int L;
	static int C;
	static char[] arr;
	static boolean[] visited;
	
	static void printPwd() {
		String res = "";
		
		for (int i = 0; i < C; i++) {
			if (visited[i]) {
				res += arr[i];
			}
		}
		
		System.out.println(res);
	}
	
	static boolean checkVo(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else {
			return false;
		}
	}

	static void createPwd(int len, int idx, int vo, int con) throws Exception {
		if (len == L) {
			if (vo < 1 || con <2) {
				return;
			}
			printPwd();
			return;
		}
		
		for (int i = idx; i < C; i++) {
			if (!visited[i]) {
				visited[i] = true;
				
				if (checkVo(arr[i])) {
					createPwd(len + 1, i + 1, vo + 1, con);
				} else {
					createPwd(len + 1, i +1, vo, con + 1);
				}
				visited[i] = false;
				
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new char[C];
		visited = new boolean[C];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < C; i++) {
			arr[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(arr);
		createPwd(0, 0, 0, 0);
		
		br.close();
	}
}
