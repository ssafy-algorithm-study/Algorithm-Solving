package D1;

import java.util.Scanner;

public class SWEA2058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		
		while (N != 0) {
			sum += N % 10;
			N = (int) Math.floor(N / 10);
		}
		
		System.out.println(sum);
		sc.close();
	}
}
