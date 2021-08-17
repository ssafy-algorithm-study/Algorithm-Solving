import java.util.Scanner;

public class SWEA2056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			String n = sc.next();
			String[] arr = n.split("");
			String year = "";
			String month = "";
			String day = "";
			int y = 0;
			int m = 0;
			int d = 0;
			
			if (arr.length == 8) {
				for (int i = 0; i < arr.length; i++) {
					if (i < 4) {
						year += arr[i];
					} else if (i >= 4 && i < 6) {
						month += arr[i];
					} else {
						day += arr[i];
					}
				}
				
				y = Integer.parseInt(year);
				m = Integer.parseInt(month);
				d = Integer.parseInt(day);
				
				if (y >= 0 && m >= 1 && m <= 12) {
					if ((m == 2 && d >= 1 && d <= 28) || 
							((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >=1 && d <= 31)) || 
							((m == 4 || m == 6 || m == 6 || m == 9 || m == 11) && (d >=1 && d <= 30))) {
						
						System.out.println("#" + tc + " " + year + "/" + month + "/" + day);
					} else {
						System.out.println("#" + tc + " " + -1);
					}
				} else {
					System.out.println("#" + tc + " " + -1);
				}
			} else {
				System.out.println("#" + tc + " " + -1);
			}
		}
		
		sc.close();
	}
}
