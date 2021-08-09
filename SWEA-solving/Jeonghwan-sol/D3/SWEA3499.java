import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA3499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int half = (int) Math.ceil(((double)N / 2.0));	// 중앙 지점 체크
			String[] shuffledCard = new String[N];	// 셔플 후 저장할 배열
			Queue<String> q1 = new LinkedList<>();
			Queue<String> q2 = new LinkedList<>();
			
			// 카드 세팅
			for (int i = 0; i < N; i++) {
				if (i < half) {
					q1.offer(sc.next());
				} else {
					q2.offer(sc.next());
				}
			}

			// 카드 셔플
			for (int i = 0; i < N; i++) {
				if (i % 2 == 0) {
					shuffledCard[i] = q1.poll();
				} else {
					shuffledCard[i] = q2.poll();
				}
			}
			
			// 결과 출력
			System.out.print("#" + tc);
			
			for(String card : shuffledCard) {
				System.out.print(" " + card);
			}
			System.out.println();
		}
		sc.close();
	}
}
