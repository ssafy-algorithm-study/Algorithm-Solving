import java.util.Scanner;

public class SWEA1936 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		char res;
		
		if (A == 1) {
			if (B == 2) {
				res = 'B';
			} else {
				res = 'A';
			}
		} else if (A == 2) {
			if (B == 1) {
				res = 'A';
			} else {
				res = 'B';
			}
		} else {
			if (B == 1) {
				res = 'B';
			} else {
				res = 'A';
			}
		}
		
		System.out.println(res);
		sc.close();
	}
}
