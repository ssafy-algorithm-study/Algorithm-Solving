import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA1225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			Queue<Integer> queue = new LinkedList<Integer>();
			
			for (int i = 0; i < 8; i++) {
				queue.offer(sc.nextInt());
			}
			
			int state = 0; // 암호 생성 상태
			
			while (state == 0) {
				for (int j = 1; j <= 5; j++) {
					int outN = queue.poll();
					int inN = outN - j;
					
					if (inN > 0) {
						queue.offer(inN);
					} else {
						queue.offer(0);
						state = 1;
						break;
					}
				}
			}
			
			System.out.print("#" + n);
			for (int i = 0; i < 8; i++) {
				System.out.print(" "+ queue.poll());
			}
			System.out.println();
		}
		
		sc.close();
	}

}
