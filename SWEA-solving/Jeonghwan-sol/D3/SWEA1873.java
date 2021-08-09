import java.util.Scanner;

public class SWEA0803 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// 테스트 케이스 수
		
		for (int tc = 1; tc <= T; tc++) {
			int H = sc.nextInt();	// 맵 높이
			int W = sc.nextInt();	// 맵 너비
			String[][] gameMap = new String[H][W];	// 게임 맵 배열
			
			for (int i = 0; i < H; i++) {
				gameMap[i] = sc.next().split("");
			}
	
			int nCommand = sc.nextInt();	// 명령어 수
			String[] commands = new String[nCommand]; // 명령어 배열
			
			commands = sc.next().split("");
			
			// 탱크 정보
			int tH = 0;		// 탱크 y 좌표
			int tW = 0;		// 탱크 x 좌표
			char tD = '-';	// 탱크 방향
			
			// 탱크 초기 위치 탐색 후 설정
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (gameMap[i][j].equals("^")) {
						tH = i;
						tW = j;
						tD = 'u';
					} else if (gameMap[i][j].equals(">")) {
						tH = i;
						tW = j;
						tD = 'r';
					} else if (gameMap[i][j].equals("v")) {
						tH = i;
						tW = j;
						tD = 'd';
					} else if (gameMap[i][j].equals("<")) {
						tH = i;
						tW = j;
						tD = 'l';
					}
				}
			}
			
			// 명령어 실행
			for (String c : commands) {
				switch (c) {
					case "U":
						tD = 'u';
						if (tH != 0 && gameMap[tH - 1][tW].equals(".") && tH !=0) {
								gameMap[tH][tW] = ".";
								tH--;
						}
						gameMap[tH][tW] = "^";
						break;
					case "D":
						tD = 'd';
						if (tH != (H - 1) && gameMap[tH + 1][tW].equals(".")) {
								gameMap[tH][tW] = ".";
								tH++;
						}
						gameMap[tH][tW] = "v";
						break;
					case "L":
						tD = 'l';
						if (tW != 0 && gameMap[tH][tW - 1].equals(".")) {
								gameMap[tH][tW] = ".";
								tW--;
						}
						gameMap[tH][tW] = "<";
						break;
					case "R":
						tD = 'r';
						if (tW != W - 1 && gameMap[tH][tW + 1].equals(".")) {
								gameMap[tH][tW] = ".";
								tW++;
						}
						gameMap[tH][tW] = ">";
						break;
					case "S":
						if (tD == 'u') {
							for (int i = tH; i >= 0; i--) {
								if (gameMap[i][tW].equals("*")) {
									gameMap[i][tW] = ".";
									break;
								} else if (gameMap[i][tW].equals("#")) {
									break;
								}
							}
						}
						else if (tD == 'd') {
							for (int i = tH; i < H; i++) {
								if (gameMap[i][tW].equals("*")) {
									gameMap[i][tW] = ".";
									break;
								} else if (gameMap[i][tW].equals("#")) {
									break;
								}
							}
						}
						else if (tD == 'r') {
							for (int i = tW; i < W; i++) {
								if (gameMap[tH][i].equals("*")) {
									gameMap[tH][i] = ".";
									break;
								} else if (gameMap[tH][i].equals("#")) {
									break;
								}
							}
						}
						else if (tD == 'l') {
							for (int i = tW; i >= 0; i--) {
								if (gameMap[tH][i].equals("*")) {
									gameMap[tH][i] = ".";
									break;
								} else if (gameMap[tH][i].equals("#")) {
									break;
								}
							}
						}
						break;
					default:
						break;
				}
				
			}
			
			// 결과값 출력
			System.out.print("#" + tc + " ");
			
			for (int a = 0; a < H; a++) {
				for (int b = 0; b < W; b++) {
					System.out.print(gameMap[a][b]);
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
