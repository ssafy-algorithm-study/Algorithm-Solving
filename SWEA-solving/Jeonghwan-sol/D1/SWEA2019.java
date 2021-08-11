import java.util.Scanner;

public class SWEA2019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 1;
		
		for (int i = 0; i <= N; i++) {
			System.out.print(num + " ");
			num *= 2;
		}
		
		sc.close();
	}
}
