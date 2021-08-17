import java.util.Scanner;

// 스위치 켜고 끄기

// 켜져있으면 1, 꺼져있으면 0

// 남학생은 1, 여학생 2
public class BOJ1244 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 스위치 개수
		
        if(N <= 0 || N > 100) {
			return;
		}
		
		int[] switchArr = new int[N];
		
		for (int i = 0; i < N; i++) {
			switchArr[i] = sc.nextInt();
		}
		
		int S = sc.nextInt(); // 학생수
		
		if(S <= 0 || S > 100) {
			return;
		}
		
		int[][] studentsInfo = new int[S][2];
 		
		for (int i = 0; i < S; i++) {
			studentsInfo[i][0] = sc.nextInt(); // i번째 학생이 남자인지 여자인지
			studentsInfo[i][1] = sc.nextInt(); // i번째 학생이 받을 스위치 번호
		}
		
		for (int i = 0; i < S; i++) {
			if(studentsInfo[i][0] == 1 && studentsInfo[i][1] <= N) { // 남학생이라면 && 유효한 스위치번호
				int newIndex = studentsInfo[i][1];
				while(newIndex <= N) {
					switchArr[newIndex-1] = switchArr[newIndex-1] == 0 ? 1 : 0;
					newIndex *= 2;
				}
			} else if(studentsInfo[i][0] == 2 && studentsInfo[i][1] <= N) { // 여학생이고 && 유효한 스위치 번호인지
				int centerIndex = studentsInfo[i][1];
				
				// 변동값 초기화
				int v  = 1;
				
				// 스위치 변화시킬 인덱스 start, end
				int start = 0; 
				int end = 0;
				while(centerIndex - 1 - v >= 0 && centerIndex + v < N && switchArr[centerIndex - 1 - v] == switchArr[centerIndex - 1 + v]) { // 좌우 대칭이 달라질 때까지 반복
					start = centerIndex - v;
					end = centerIndex + v;
					v++;
				}
				
				for (int j = start; j <= end; j++) {
					switchArr[j-1] = switchArr[j-1] == 1 ? 0 : 1; 
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(switchArr[i] + " ");
		}
		
//		System.out.println("N:" +N);
//		System.out.println("S:" +S);
//		System.out.println(Arrays.toString(switchArr));
//		System.out.println(Arrays.deepToString(studentsInfo));
	}

}
