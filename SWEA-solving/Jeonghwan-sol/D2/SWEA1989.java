import java.util.Scanner;

public class SWEA1989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int flag = 0;
			
			String[] str = sc.next().split("");
			
			for (int i = 0; i < str.length / 2; i++) {
				if (str[i].equals(str[(str.length - 1) - i])) {
					flag = 1;
				} else {
					flag = 0;
				}
			}
			
			System.out.println("#" + tc + " " + flag);
		}
		
		sc.close();
	}
}
