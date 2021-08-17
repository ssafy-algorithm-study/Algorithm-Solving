/*
다행히 원래 메모리가 무슨 값이었는지 알고 있었던 원재는 바로 원래 값으로 되돌리려고 했으나 메모리 값을 바꿀 때 또 문제가 생겼다.

메모리 bit중 하나를 골라 0인지 1인지 결정하면 해당 값이 메모리의 끝까지 덮어씌우는 것이다.

예를 들어 지금 메모리 값이 0100이고, 3번째 bit를 골라 1로 설정하면 0111이 된다.

원래 상태가 주어질 때 초기화 상태 (모든 bit가 0) 에서 원래 상태로 돌아가는데 최소 몇 번이나 고쳐야 하는지 계산
*/

/*
 * 문제 해결과정 >>
 * 1. 문제 잘 읽고 이해하기 (독해)
 * 	- 익숙한 용어로 재해석, 재정의, 제약조건 파악
 * 	- 주어진 테스트 케이스로 결과 확인하기
 * 
 * 2. 알고리즘 설계
 * 	- 전체 진행계획(작업 순서), 사용할 알고리즘, 자료구조 선택
 * 
 * 3. 구현
 * 	- 입력(입력확인) - 처리 - 출력
 * 
 * 4. 실행 및 디버깅
 * 	- 실행 결과 체크(값, 출력 포맷)
 * 
 * 5. 개선방법 찾기(최적화)
 */

package com.day1;

import java.util.Scanner;

public class SW1289_MemoryRecovery {

	public static void main(String[] args) {
		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
//		String[] strArr = new String[T]; // 입력 비트 담을 문자열 배열
//		for(int test_case = 0; test_case < T; test_case++)
//		{
//			strArr[test_case] = sc.next();
//			
//		}
//		for(int i = 1; i <= T; i++)
//		{
//			int count = 0;
//			char bit = '0';
//			for (int j = 0; j < strArr[i-1].length(); j++) {
//				if(strArr[i-1].charAt(j) != bit) {
//					count++;
//					bit = bit == '1' ? '0' : '1';
//				}
//			}
//			System.out.println("#" + (i) + " " + count);
//		}
		
		
		
		// -------------------------------------
		
		for(int tc = 1; tc <= T; tc++) {
			String s = sc.next(); // 한줄. 원래상태
			int cnt = 0; // 바꾼 횟수 저장할 변수
			
			//시작이 1인 경우
			if(s.startsWith("1")) {
				cnt++;
			}
			for (int j = 0; j < s.length() - 1; j++) {
				if(s.charAt(j) != s.charAt(j + 1)) {
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}
