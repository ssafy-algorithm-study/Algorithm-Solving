import java.util.ArrayList;
import java.util.Scanner;

public class SWEA1946 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			ArrayList<String> list = new ArrayList<>();
					
			for (int i = 0; i < N; i++) {
				String c = sc.next();
				int cnt = sc.nextInt();
				
				for (int j = 0; j < cnt; j++) {
					list.add(c);
				}
			}
			
			System.out.println("#" + tc);
			
			for (int k = 0; k < list.size(); k++) {
				System.out.print(list.get(k));
				
				if ((k + 1) % 10 == 0 && k != 0) {
					System.out.println();
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
