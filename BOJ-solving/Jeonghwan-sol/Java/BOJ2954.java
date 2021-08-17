import java.util.Scanner;

public class BOJ2954 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] arr = sc.nextLine().split("");	
			String res = "";	
			
			for (int i = 0; i < arr.length; i++) {	
				res += arr[i];	
				
				if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
					i += 2; 
				}
			}
			
			System.out.println(res);	
			sc.close();
		}
	}
