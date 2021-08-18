import java.util.Scanner;

public class SWEA2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int wavelength = 0;
			
			for (int i = 1; i < 10; i++) {
				String sub = str.substring(0, i);
				String subNext = str.substring(i, i + i);
				
				if (sub.equals(subNext)) {
					wavelength = i;
					break;
				}
			}
			
			System.out.println("#" + tc + " " + wavelength);
		}
	
		sc.close();
	}
}
