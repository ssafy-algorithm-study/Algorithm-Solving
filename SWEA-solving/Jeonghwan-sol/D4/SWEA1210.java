package D4;
import java.util.Scanner;

public class SWEA1210 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			sc.nextLine();
			String[][] ladder = new String[100][100];
			
			for(int i = 0; i < 100; i ++) {
				ladder[i] = sc.nextLine().split(" ");
			}
			
			int end = 0;
			
			for (int j = 0; j < 100; j++) {
				if (ladder[99][j].equals("2")) {
					end = j;
					break;
				}
			}
			
			int x = 99, y = end;
			
			while (x > 0) {
				if ((y + 1 < 100) && ladder[x][y + 1].equals("1")) {
					do {
						y++;
					} while ((y + 1 < 100) && ladder[x][y + 1].equals("1"));
				} else if ((y - 1 >= 0) && ladder[x][y - 1].equals("1")) {
					do {
						y--;
					} while ((y - 1 >= 0) && ladder[x][y - 1].equals("1"));
				}
				x--;
			}
			System.out.println("#" + tc + " " + y);
		}
		sc.close();
	}
}
