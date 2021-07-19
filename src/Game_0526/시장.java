package Game_0526;

import java.util.Scanner;

public class 시장 {
	int HP포션 = 100;
	int hp = 0;
	int MP포션 = 150;
	int mp = 0;
	int 구입가 = 0;
	int 구매배열[] = new int[3];
	Scanner scanner = new Scanner(System.in);

	public void 판매() {
		System.out.println("\n\n");
		Music gold = new Music("동전소리.mp3", false);
		System.out.println("\n시장에 물건을 판매하려고 합니다.");
		System.out.println("\n(용사가 가진 물건을 확인해보자)");
		MainGame.가방1.가방만인터페이스();
		System.out.println("\n\n");
		System.out.println("1. 무기\t" + " 2. 방어구\t" + " 3. 기타\t" + " 4. 돌아가기");
		System.out.print("\n용사가 판매할 물건을 선택해주세요 : ");
		int 판매 = scanner.nextInt();
		판매: while (true) {
			if (판매 == 1) {
				if (MainGame.가방1.가방종류탐색("무기")) {
					System.out.println("\n\n");
					System.out.println("가방안에 있는 무기류다");
					MainGame.가방1.가방무기장사();
					gold.run();
				} else {
					System.out.println("\n\n");
					System.out.println("물건이 없어요.");
				}
			} else if (판매 == 2) {
				if (MainGame.가방1.가방종류탐색("방어구")) {
					System.out.println("\n\n");
					System.out.println("가방안에 있는 방어구다");
					MainGame.가방1.가방방어구장사();
					gold.run();
				} else {
					System.out.println("\n\n");
					System.out.println("물건이 없어요.");
				}
			} else if (판매 == 3) {
				if (MainGame.가방1.가방종류탐색("기타")) {
					System.out.println("\n\n");
					if (MainGame.가방1.가방종류탐색("기타")) {
						System.out.println("가방안에 있는 기타아이템들이다");
						MainGame.가방1.가방기타장사();
						gold.run();
					} else {
						System.out.println("\n\n");
						System.out.println("물건이 없어요.");
					}
				} else {
					System.out.println("\n\n");
					System.out.println("물건이 없어요.");
				}
			} else if (판매 == 4) {
				System.out.println("\n\n");
				System.out.println("뒤로 돌아갑니다.\n");
				break 판매;
			}
			System.out.println("\n\n");
			MainGame.가방1.가방만인터페이스();
			System.out.println("1. 무기\t" + " 2. 방어구\t" + " 3. 기타\t" + " 4. 돌아가기");
			System.out.print("내가 판매할 물건은 : ");
			판매 = scanner.nextInt();
		}
	}

	public int[] 장사(int a) {
		System.out.println("\n\n");
		System.out.println("시장에서 물건을 구매하려고 합니다.\n");
		System.out.println("여기 다양한 포션들이 있다.\n");
		System.out.println("\n1. hp포션\t" + "2. mp포션\t" + "3. 돌아가기\n");
		System.out.print("\n내가 구매할 포션은 : ");
		int 구매 = scanner.nextInt();
		while (true) {
			if (구매 == 1) {
				if (a > HP포션) {
					hp += 1;
					a -= HP포션;
					System.out.println("\n\n");
					System.out.println(HP포션 + "골드를 지불하고 hp포션을 1개 구매했습니다.");
					System.out.println("현재" + a + "골드남았습니다.");
				} else {
					System.out.println("골드가 부족합니다.");
				}
			} else if (구매 == 2) {
				if (a > MP포션) {
					mp += 1;
					a -= MP포션;
					System.out.println("\n\n");
					System.out.println(MP포션 + "골드를 지불하고 mp포션을 1개 구매했습니다.");
					System.out.println("현재" + a + "골드남았습니다.");
				} else {
					System.out.println("\n\n");
					System.out.println("골드가 부족합니다.");
				}
			} else if (구매 == 3) {
				System.out.println("\n\n");
				System.out.println("뒤로 돌아갑니다.");
				break;
			}
			System.out.println("\n\n");
			System.out.println("1. hp포션\t" + "2. mp포션\t" + "3. 돌아가기");
			System.out.print("내가 구매할 물건은 : ");
			구매 = scanner.nextInt();
		}
		구매배열[0] = a;
		구매배열[1] = hp;
		구매배열[2] = mp;
		return 구매배열;
	}

	public void 교환하기() {
		System.out.println("\n\n");
		System.out.println("보스몬스터의 전리품으로 물건을 교환하려고 합니다.");
		교환하기: while (true) {
			if (MainGame.가방1.가방종류탐색("기타")) {
				System.out.println("\n\n");
				System.out.println("가방안에 있는 기타물건들이다");
				MainGame.가방1.가방부분인터페이스("기타");
			} else {
				System.out.println("\n\n");
				System.out.println("나한테는 교환할 물건이 없는거 같다");
				break 교환하기;
			}
			System.out.println("\n\n");
			System.out.println("뭘로 교환을 해볼까?");
			if (MainGame.플레이어.직업.equals("검사")) {
				System.out.println("\n\n");
				System.out.println("1. 강력한 대검과 단단한 방패 (대왕슬라임조각 1개 필요합니다.)\n");
				System.out.println("2. 빛나는 대검과 어두운 방패 (늑대왕의 가죽 1개 와 골렘왕의파편1개 필요합니다.)\n");
				System.out.println("3. 돌아가기 \n");
				int 교환물건 = scanner.nextInt();
				switch (교환물건) {
				case 1:
					if (MainGame.가방1.가방탐색("대왕슬라임조각")) {
						MainGame.가방1.가방제거("대왕슬라임조각");
						System.out.println("대왕슬라임조각을 건내줍니다.\n\n");
						MainGame.가방1.가방넣기("무기", "강력한대검", 0, 0, 90, 0, 700);
						MainGame.가방1.가방넣기("방어구", "단단한방패", 400, 400, 0, 40, 700);
					} else {
						System.out.println("조건이 맞지않습니다.\n\n");
						System.out.println("다시 확인해주세요\n");
					}
					break;
				case 2:
					if ((MainGame.가방1.가방탐색("늑대왕의가죽")) && (MainGame.가방1.가방탐색("골렘왕의파편"))) {
						MainGame.가방1.가방제거("늑대왕의가죽");
						MainGame.가방1.가방제거("골렘왕의파편");
						System.out.println("늑대왕의 가죽과 골렘왕의 파편을 건내줍니다.\n\n");
						MainGame.가방1.가방넣기("무기", "빛나는대검", 0, 0, 250, 0, 1000);
						MainGame.가방1.가방넣기("방어구", "어두운방패", 800, 800, 0, 80, 1000);
					} else {
						System.out.println("조건이 맞지않습니다.\n\n");
						System.out.println("다시 확인해주세요\n");
					}
					break;
				case 3:
					System.out.println("뒤로 돌아갑니다\n\n");
					break 교환하기;
				}
			} else if (MainGame.플레이어.직업.equals("거너")) {
				System.out.println("\n\n");
				System.out.println("1. 강력한 라이플과 단단한 조끼 (대왕슬라임조각1개)\n");
				System.out.println("2. 어두운 라이플과 빛나는 조끼 (늑대왕의 가죽1개 과 골렘의파편1게)\n");
				System.out.println("3. 돌아가기 \n");
				int 교환물건 = scanner.nextInt();
				switch (교환물건) {
				case 1:
					if (MainGame.가방1.가방탐색("대왕슬라임조각")) {
						MainGame.가방1.가방제거("대왕슬라임조각");
						System.out.println("대왕슬라임조각을 건내줍니다.\n");
						MainGame.가방1.가방넣기("무기", "강력한라이플", 0, 0, 150, 0, 700);
						MainGame.가방1.가방넣기("방어구", "단단한조끼", 200, 200, 0, 30, 700);
					} else {
						System.out.println("조건이 맞지않습니다.\n");
						System.out.println("다시 확인해주세요\n");
					}
					break;
				case 2:
					if ((MainGame.가방1.가방탐색("늑대왕의가죽")) && (MainGame.가방1.가방탐색("골렘왕의파편"))) {
						MainGame.가방1.가방제거("늑대왕의가죽");
						MainGame.가방1.가방제거("골렘왕의파편");
						System.out.println("늑대왕의 가죽과 골렘왕의 파편을 건내줍니다.\n");
						MainGame.가방1.가방넣기("무기", "어두운라이플", 0, 0, 400, 0, 1000);
						MainGame.가방1.가방넣기("방어구", "빛나는조끼", 400, 400, 0, 30, 1000);
					} else {
						System.out.println("조건이 맞지않습니다.\n");
						System.out.println("다시 확인해주세요\n");
					}
					break;
				case 3:
					System.out.println("뒤로 돌아갑니다\n");
					break 교환하기;
				}
			}
		} // 교환하기 종료
	}
}