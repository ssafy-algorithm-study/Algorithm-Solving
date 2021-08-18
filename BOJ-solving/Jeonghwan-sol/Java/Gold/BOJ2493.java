import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Tower> stack = new Stack<>();
		int num, height;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (num = 1; num <= N; num++) {
			height = Integer.parseInt(st.nextToken());
			
			while (!stack.empty()) {
				if (stack.peek().height >= height) {
					System.out.print(stack.peek().num + " ");
					break;
				} else {
					stack.pop();
				}
			}
			
			if (stack.isEmpty()) {
				System.out.print(0 + " ");
			}
			
			stack.push(new Tower(num, height));
		}
	}
	
	static class Tower {
		int num;
		int height;
		
		public Tower(int num, int height) {
			this.num = num;
			this.height = height;
		}
	}
}
