import java.util.Scanner;

public class SWEA1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			int num = i;
			String line = "";
			
			while (num != 0) {
				if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
					line += "-";
				} 
				num = num / 10;
			} 
			
			if (line.equals("")) {
				System.out.print(i + " ");
			} else {
				System.out.print(line + " ");
			}
			
		}
		
		sc.close();
	}
}
