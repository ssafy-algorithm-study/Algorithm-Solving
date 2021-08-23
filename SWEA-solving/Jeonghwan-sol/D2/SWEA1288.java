import java.util.Scanner;

public class SWEA1288 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int N = Integer.parseInt(str);
			int cnt = 0;
			boolean[] check = new boolean[10];
			int x = 1;
			
			while (true) {
				for (int i = 0; i < str.length(); i++) {
					int tmp = Integer.parseInt(str.substring(i, i+1));
					
					if (check[tmp] == false) {
						check[tmp] = true;
						cnt++;
					}
				}
				
				if (cnt == 10) {
					break;
				}
				
				x++;
				str = Integer.toString(N * x);
			}
			
			System.out.println("#" + tc + " " + str);
		}
		
		sc.close();
	}

}
