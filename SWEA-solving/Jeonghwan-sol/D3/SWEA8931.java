import java.util.Scanner;
import java.util.Stack;

public class SWEA8931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			Stack<Integer> stack = new Stack<>();
			int K = sc.nextInt();
			int res = 0;
			
			for (int i = 0; i < K; i++) {
				int n = sc.nextInt();
				
				if (n == 0) {
					if (stack.size() == 0) {
						continue;
					} else {
						stack.pop();
					}
				} else {
					stack.push(n);
				}
			}
			
			for (int num : stack) {
				res += num;
			}
			
			System.out.println("#" + tc + " " + res);
		}
		
		sc.close();
	}

}
