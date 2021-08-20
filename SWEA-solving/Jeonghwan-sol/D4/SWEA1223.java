import java.util.Scanner;
import java.util.Stack;

public class SWEA1223 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> numStack = new Stack<>();
		Stack<Character> opStack = new Stack<>();
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			String str = sc.next();
			String tmp = "";
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if (c - '0' >= 0 && c - '0' <= 9) {
					tmp += c;
				} else {
					if (c == '*') {
						opStack.push(c);
					} else {
						while(!opStack.isEmpty() && (opStack.peek() == '*' || opStack.peek() == '+')) {
							tmp += opStack.pop();
						}
						opStack.push(c);
					}
				}
			}
			
			while(!opStack.empty()) {
				tmp += opStack.pop();
			}
			
			for (int j = 0; j < N; j++) {
				char c = tmp.charAt(j);
				
				if (c - '0' >= 0 && c - '0' <= 9) {
					numStack.push(c - '0');
				} else {
					int n1 = numStack.pop();
					int n2 = numStack.pop();
					
					if (c == '*') {
						numStack.push(n1 * n2);
					} else {
						numStack.push(n1 + n2);
					}
				}
			}
			
			System.out.println("#" + tc + " " + numStack.pop());
		}
		
		sc.close();
	}
}
