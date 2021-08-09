import java.util.Scanner;
import java.util.Stack;

public class SWEA1218 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for (int tc = 1; tc <= T; tc++) {
			Stack<String> stack = new Stack<String>();
			int n = sc.nextInt();
			String[] str = sc.next().split("");
			int state = 1;
			
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals("(") || str[i].equals("{") || str[i].equals("[") || str[i].equals("<")) {
					stack.push(str[i]);
				} else if (stack.size() != 0) {
					if (str[i].equals(")") && stack.peek().equals("(")) {
						stack.pop();
					} else if (str[i].equals("}") && stack.peek().equals("{")) {
						stack.pop();
					} else if (str[i].equals("]") && stack.peek().equals("[")) {
						stack.pop();
					} else if (str[i].equals(">") && stack.peek().equals("<")) {
						stack.pop();
					} else {
						break;
					}
				} else {
					state = 0;
					break;
				}
			}
			
			if (stack.size() != 0) {
				state = 0;
			}
			System.out.println("#" + tc + " " + state);
		}
		sc.close();
	}

}
