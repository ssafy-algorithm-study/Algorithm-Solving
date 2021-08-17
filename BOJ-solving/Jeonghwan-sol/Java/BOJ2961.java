import java.util.Scanner;

public class BOJ2961 {
	
	static int N;
	static int[][] arr;
	static boolean[] isSelected;
	static int minGap = Integer.MAX_VALUE;
	
	private static void generateSubSet(int cnt) {
		int S = 1;
		int B = 0;
		int gap;
		
		if (cnt == N) {
			for (int i = 0; i < N; i++) {
				if (isSelected[i]) {
					S *= arr[i][0];
					B += arr[i][1]; 
				}
			}
			
			gap = Math.abs(S - B);
			
			if (minGap > gap && S != 1 && B != 0) {
				minGap = gap;
			}

			return;
		}
		
		isSelected[cnt] = true;
		generateSubSet(cnt + 1);
		
		isSelected[cnt] = false;
		generateSubSet(cnt + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][2];
		isSelected = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		generateSubSet(0);
		
		System.out.println(minGap);
		sc.close();
	}
}
