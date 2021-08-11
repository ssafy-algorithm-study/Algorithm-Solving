import java.util.LinkedList;
import java.util.Scanner;

public class SWEA1228 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			LinkedList<Integer> list = new LinkedList<>();
			
			for (int i = 0; i < N; i++) {
				int num = sc.nextInt();
				list.add(num);
			}
			
			int oCnt = sc.nextInt();
			
			for (int oc = 0; oc < oCnt; oc++) {
				sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				LinkedList<Integer> sList = new LinkedList<>();
				
				for (int j = 0; j < y; j++) {
					sList.add(sc.nextInt());
				}
				list.addAll(x, sList);
			}
			
			System.out.print("#" + tc);
			for (int k = 0; k < 10; k++) {
				System.out.print(" " + list.get(k));
			}
			System.out.println();

		}
		sc.close();
	}
}
