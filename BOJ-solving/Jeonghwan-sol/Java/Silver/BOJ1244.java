import java.util.Scanner;

public class BOJ1244 {
	
	private static int turnSwitch (int n) {
		return n == 0 ? 1 : 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int nStd = sc.nextInt();
		
		while (nStd-- > 0) {
			int gender = sc.nextInt();
			int num = sc.nextInt();
			
			if (gender == 1) {
				for (int i = num; i <= n; i += num) {
					 arr[i] = turnSwitch(arr[i]);
				}
			} else if (gender == 2) {
				int r = num + 1;
				int l = num - 1;
				
				arr[num] = turnSwitch(arr[num]);
				
				while (l >= 1 && r <=n ) {
					if (arr[l] == arr[r]) {
						arr[l] = turnSwitch(arr[l]);
						arr[r] = turnSwitch(arr[r]);
						l--;
						r++;
					} else {
						break;
					}
				}
			}
		}
		
		for (int j = 1; j <= n; j++) {
			System.out.print(arr[j] + " ");
			if (j % 20 == 0) {
				System.out.println();
			}
		}
		
		sc.close();
	}
}
