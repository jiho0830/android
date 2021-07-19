package Game_0526;

import java.util.Scanner;

public class MainGame // 게임진행을 위한 메인클래스
{
	public static 사람 플레이어;
	public static 가방 가방1;

	public static void main(String args[]) throws InterruptedException {
		/*
		 * 배경설명부분 스레드로 일반몬스터와 필드보스몬스터와는 자동전투 보스몬스터에 필드효과부여 가방클래스에서 String배열이 아닌 클래스배열로
		 * 생성
		 */

		System.out.print(" _   __        _         _      _   \n");
		System.out.print("| | / /       (_)       | |    | |  \n");
		System.out.print("| |/ /  _ __   _   __ _ | |__  | |_ \n");
		System.out.print("|    \\ | '_ \\ | | / _` || '_ \\ | __|\n");
		System.out.print("| |\\  \\| | | || || (_| || | | || |_ \n");
		System.out.print("\\_| \\_/|_| |_||_| \\__, ||_| |_| \\__|\n");
		System.out.print("                   __/ |            \n");
		System.out.print("                  |___/             \n");
		시간안내 시간안내 = new 시간안내();
		시간안내.start();
		Music gold = new Music("동전소리.mp3", false);
		Music 아이템 = new Music("아이템획득.mp3", false);
		Music outintro = new Music("인트로음악배경.mp3", true);
		Scanner scanner = new Scanner(System.in);
		플레이어 = new 사람(3000, 1000, 1, 300, 0, "", 0, 1000);
		// 순서대로 hp,mp,레벨,공격력,방어력,직업,경험치,돈
		// 가방 - 아이템종류,이름,hp,최대hp,공격력,방어력.골드
		int[] 시장구매배열;// 포션구매확인을 위한 배열
		가방1 = new 가방();
		outintro.start();
		String 출력문 = ("  [             용사 이야기                ]\n\n" + "  옛날 옛날 아주 먼 옛날에 사람들을 괴롭히기 좋아하는 마왕이 살았어요.\n\n"
				+ "  그러다가 어느날 마왕은 자신의 성에서 마을 사람들이 축제로 즐거워 하는 모습을 보게 되는데\n\n"
				+ "  마왕은 자기만 빼고 축제를 즐기는 사람들을 보다가 그만 심술이 나서, \n\n" + "  마왕은 마왕의 친구들과 같이 마을 사람들을 괴롭히기 시작했어요.\n\n"
				+ "  마을 사람들은 마왕과 마왕의 친구들 때문에 축제를 즐기지 못하게 되는데 \n\n" + "  이때 우연히 근처를 지나가는 용사님이 마을에 찾아왔어요.\n\n"
				+ "  마왕과 마왕의 친구들 때문에 축제를 즐기지 못하는 사람들을 위해\n\n" + "  용사가 직접 마왕과 마왕의 친구들을 혼내주고 축제를 다시 시작하려고 합니다.\n\n"
				+ "  이 용사의 이름은 : ");
		글자타이핑 타이핑 = new 글자타이핑(출력문, 15);
		타이핑.start();
		// 장비가방 장비가방 = new 장비가방();
		// 게임 시작시 이름과 직업
		플레이어.이름 = scanner.next();
		System.out.printf("\n\n  " + 플레이어.이름 + " 용사의 직업을 선택해주세요.\n");
		System.out.println("\n  1. 검사\n" + "   (검사는 높은 확률로 피격시 데미지의 일부분을 방어한다.)\n" + "   (체력과 방어력이 추가됩니다.)\n");
		System.out.println("\n  2. 거너\n" + "   (거너는 낮은 확률로 피격시 데미지를 회피한다.)\n" + "   (공격력이 추가됩니다.)\n");
		대검 대검 = new 대검();
		방패 방패 = new 방패();
		라이플 라이플 = new 라이플();
		방탄조끼 방탄조끼 = new 방탄조끼();
		강력한대검 강력한대검 = new 강력한대검();
		단단한방패 단단한방패 = new 단단한방패();
		강력한라이플 강력한라이플 = new 강력한라이플();
		단단한조끼 단단한조끼 = new 단단한조끼();
		빛나는대검 빛나는대검 = new 빛나는대검();
		어두운방패 어두운방패 = new 어두운방패();
		어두운라이플 어두운라이플 = new 어두운라이플();
		빛나는조끼 빛나는조끼 = new 빛나는조끼();
		System.out.print("\n  용사님의 직업은 :  ");
		int num = scanner.nextInt();

		if (num == 1) {
			플레이어.직업 = "검사";
			System.out.println("\n  " + 플레이어.직업 + " 입니다.\n");
			플레이어.hp += 200;
			플레이어.최대hp += 200;
			플레이어.방어력 += 10;
			Thread.sleep(700);
			System.out.println("\n  대검과 방패가 지급됩니다.\n\n");
			가방1.가방넣기(대검.아이템종류, 대검.아이템이름, 대검.hp, 대검.최대hp, 대검.공격력, 대검.방어력, 대검.골드);
			Thread.sleep(700);
			가방1.가방넣기(방패.아이템종류, 방패.아이템이름, 방패.hp, 방패.최대hp, 방패.공격력, 방패.방어력, 방패.골드);
			Thread.sleep(700);
		} else if (num == 2) {
			플레이어.직업 = "거너";
			System.out.println("\n  " + 플레이어.직업 + " 입니다.\n");
			플레이어.공격력 += 50;
			Thread.sleep(700);
			System.out.println("\n  라이플과 방탄조끼가 지급됩니다.\n\n");
			가방1.가방넣기(라이플.아이템종류, 라이플.아이템이름, 라이플.hp, 라이플.최대hp, 라이플.공격력, 라이플.방어력, 라이플.골드);
			Thread.sleep(700);
			가방1.가방넣기(방탄조끼.아이템종류, 방탄조끼.아이템이름, 방탄조끼.hp, 방탄조끼.최대hp, 방탄조끼.공격력, 방탄조끼.방어력, 방탄조끼.골드);
			Thread.sleep(700);
		}
		System.out.println("마을로 이동하겠습니다.\n");
		Thread.sleep(700);
		outintro.close();
		game: while (true) {
			System.out.println("잠시만 기다려주세요.\n");
			출력문 = ("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶(엔터)");
			Music intromu = new Music("인트로음악2.mp3", true);
			intromu.start();
			타이핑 = new 글자타이핑(출력문, 50);
			타이핑.start();
			로딩창대기열 로딩창대기열 = new 로딩창대기열();
			로딩창대기열.start();
			// 이동할 장소
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n마을에 도착을 했습니다.\n");
			System.out.println("이제 이동할 장소를 골라주세요\n");
			System.out.println("1. 몬스터필드\n");
			System.out.println("2. 시장\n");
			System.out.println("3. 용사님 정보창\n");
			System.out.print("내가 이동할 장소를 선택해 주세요 : ");
			int 장소 = scanner.nextInt();
			if (장소 == 1) // 사냥터
			{
				intromu.close();// 인트로 음악종료
				Music battle = new Music("일반전투음악.mp3", true);// 사냥터전용음악
				battle.start();
				battle: while (true) // 사냥반복문
				{
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					가방1.가방부분인터페이스("기타");
					System.out.println("몬스터필드로 이동합니다.\n");
					System.out.println("필드는 4곳이 있습니다.\n");
					System.out.println("1. 습지\n");
					System.out.println("2. 밀림(단계1열쇠필요)\n");
					System.out.println("3. 사원(단계2열쇠필요)\n");
					System.out.println("4. 마왕성(단계1,2,3열쇠필요)\n");
					System.out.println("5. 돌아가기\n");
					System.out.print("내가 이동할 필드를 선택해 주세요 : ");
					int 사냥터 = scanner.nextInt();
					if (사냥터 == 1) // 1단계 사냥터
					{
						System.out.println("\n\n");
						System.out.println("습지에 도착을 했습니다\n");
						System.out.println("습지에서 일반몬스터와 필드보스가 있다.\n");
						System.out.println("1. 일반몬스터\n");
						System.out.println("2. 보스\n");
						System.out.print("습지에서 어디를 갈까? : ");
						사냥터 = scanner.nextInt();
						if (사냥터 == 1) // 1단계필드에서 일반몬스터
						{
							슬라임 슬라임 = new 슬라임();
							System.out.println("\n\n");
							System.out.println("습지에서 " + 슬라임.이름 + "이 나타났다.");
							슬라임.start();// 슬라임 자동공격
							while (플레이어.hp > 0) {
								System.out.println("1. 공격하기\t" + "2. 도망가기\t" + "3. 가방");
								System.out.print("용사의 행동은 : ");
								if (플레이어.hp > 0)
									num = scanner.nextInt();
								{
									if (num == 1) {
										플레이어.공격(슬라임.방어력);
										슬라임.공격받기(플레이어.데미지);
										if (슬라임.hp <= 0) {
											슬라임.stop(true);
											System.out.println("\n\n");
											System.out.println("슬라임이 기절했습니다.\n");
											Thread.sleep(800);
											슬라임.보상금(플레이어.레벨);
											플레이어.경험치 += 슬라임.경험치;
											System.out.println(슬라임.경험치 + "만큼의 경험치가 올랐습니다.\n");
											Thread.sleep(800);
											플레이어.골드 += 슬라임.골드;
											System.out.println(슬라임.골드 + "만큼의 골드가 올랐습니다.\n");
											gold.start();
											Thread.sleep(800);
											break;
										}
									} else if (num == 2) {
										if (플레이어.도망() == true) {
											슬라임.stop(true);
											break;
										}
									} else if (num == 3) {
										가방1.포션가방인터페이스();
										System.out.println("\n 포션을 고르세요.");
										System.out.println("1. hp\t" + "2. mp");
										System.out.print("내가 사용할 포션 : ");
										int z = scanner.nextInt();
										if (z == 1) //// hp포션 사용시 내 hp회복과 남은 포션갯수
										{
											if (가방1.포션가방[0] > 0) {
												System.out.println("\nhp포션을 사용합니다");
												가방1.포션가방[0] -= 1;
												플레이어.hp += 50;
												if (플레이어.hp > 플레이어.최대hp) {
													플레이어.hp = 플레이어.최대hp;
												}
												System.out.println("hp가 증가했습니다.");
												System.out.println("플레이어의 hp는 " + 플레이어.hp + "입니다.");
												System.out.println("남은 hp포션의 갯수는 " + 가방1.포션가방[0] + "개 입니다.");
											} else {
												System.out.println("hp포션이 없습니다.");
											}

										} else if (z == 2) // mp포션 사용시 내 mp회복과 남은 포션갯수
										{

											if (가방1.포션가방[1] > 0) {
												System.out.println("\nmp포션을 사용합니다");
												가방1.포션가방[1] -= 1;
												플레이어.mp += 50;
												if (플레이어.mp > 플레이어.최대mp) {
													플레이어.mp = 플레이어.최대mp;
												}
												System.out.println("mp가  증가했습니다.");
												System.out.println("플레이어의 mp는 " + 플레이어.mp + "입니다.");
												System.out.println("남은 mp포션의 갯수는 " + 가방1.포션가방[1] + "개 입니다.");
											} else {
												System.out.println("mp포션이 없습니다.");
											}
										}
									} //
								}
							}
						} else if (사냥터 == 2)// 1단계필드에서 보스몬스터
						{
							대왕슬라임 대왕슬라임 = new 대왕슬라임();
							// 보스필드효과 필드효과1 = new 보스필드효과(50);
							System.out.println("\n\n");
							System.out.println("\n습지의 보스" + 대왕슬라임.이름 + "이 나타났다.");
							// 필드효과1.start();// 보스 필드효과
							대왕슬라임.start();// 자동공격
							boolean 슬라임특수능력 = true;
							while (true) {
								if ((슬라임특수능력 == true) && (대왕슬라임.hp < 대왕슬라임.최대hp / 2)) {
									대왕슬라임.특수능력(대왕슬라임.공격력);
									슬라임특수능력 = false;
								}
								if (플레이어.hp <= 0) {
									대왕슬라임.stop(true);
									// 필드효과1.stop(true);
									System.out.println("플레이어가 죽었습니다.");
									플레이어.hp = 1;
									System.out.println("플레이어는 hp가 1로 부활합니다.");
									System.out.println("마을로 돌아갑니다.");
									System.out.println("마을로 이동중입니다.\n");
									battle.close();
									break battle;
								}
								System.out.println("1. 공격하기\t" + "2. 도망가기    3. 가방\n");
								System.out.print("나의 행동은 : ");
								num = scanner.nextInt();
								if (num == 1) {
									플레이어.공격(대왕슬라임.방어력);
									대왕슬라임.보스공격받기(플레이어.데미지);
									if (대왕슬라임.hp <= 0) {
										대왕슬라임.stop(true);
										// 필드효과1.stop(true);
										System.out.println("습지의 대왕슬라임이 기절했습니다.\n");
										플레이어.경험치 += 대왕슬라임.경험치;
										System.out.println(대왕슬라임.경험치 + "만큼의 경험치가 올랐습니다.\n");
										Thread.sleep(800);
										플레이어.골드 += 대왕슬라임.골드;
										System.out.println(대왕슬라임.골드 + "만큼의 골드가 올랐습니다.\n");
										gold.run();
										Thread.sleep(800);
										if (가방1.가방탐색(대왕슬라임.드랍아이템) == false) // 해당열쇠가 있으면 더이상 열쇠를 얻을수 없음
										{
											단계1열쇠 단계1열쇠 = new 단계1열쇠();
											아이템.run();
											가방1.가방넣기(단계1열쇠.아이템종류, 단계1열쇠.아이템이름, 0, 0, 0, 0, 단계1열쇠.골드);
											Thread.sleep(800);
										}
										가방1.가방넣기("기타", 대왕슬라임.판매아이템, 0, 0, 0, 0, 600);
										Thread.sleep(1000);
										break;
									}
								} else if (num == 2) {
									if (플레이어.도망() == true) {
										대왕슬라임.stop(true);
										// 필드효과1.stop(true);
										break;
									}
								} else if (num == 3) {
									가방1.포션가방인터페이스();
									System.out.println("\n 포션을 고르세요.");
									System.out.println("1. hp\t" + "2. mp");
									System.out.print("내가 사용할 포션 : ");
									int z = scanner.nextInt();
									if (z == 1) //// hp포션 사용시 내 hp회복과 남은 포션갯수
									{
										if (가방1.포션가방[0] > 0) {
											System.out.println("\nhp포션을 사용합니다");
											가방1.포션가방[0] -= 1;
											플레이어.hp += 50;
											if (플레이어.hp > 플레이어.최대hp) {
												플레이어.hp = 플레이어.최대hp;
											}
											System.out.println("hp가 증가했습니다.");
											System.out.println("플레이어의 hp는 " + 플레이어.hp + "입니다.");
											System.out.println("남은 hp포션의 갯수는 " + 가방1.포션가방[0] + "개 입니다.");
										} else {
											System.out.println("hp포션이 없습니다.");
										}

									} else if (z == 2) // mp포션 사용시 내 mp회복과 남은 포션갯수
									{

										if (가방1.포션가방[1] > 0) {
											System.out.println("\nmp포션을 사용합니다");
											가방1.포션가방[1] -= 1;
											플레이어.mp += 50;
											if (플레이어.mp > 플레이어.최대mp) {
												플레이어.mp = 플레이어.최대mp;
											}
											System.out.println("mp가  증가했습니다.");
											System.out.println("플레이어의 mp는 " + 플레이어.mp + "입니다.");
											System.out.println("남은 mp포션의 갯수는 " + 가방1.포션가방[1] + "개 입니다.");
										} else {
											System.out.println("mp포션이 없습니다.");
										}
									}
								}
							}
						}
					} else if (사냥터 == 2)// 2단계 사냥필드
					{
						System.out.println("\n\n");
						System.out.println("밀림 입장시 습지의 왕의 열쇠가 필요합니다.\n");
						Thread.sleep(1000);
						if (가방1.가방탐색("단계1열쇠") == true) {
							System.out.println("조건이 충족되었습니다.\n");
							System.out.println("밀림에 도착을 했습니다.\n");
							System.out.println("밀림에는 일반몬스터와 필드보스가 있습니다.\n");
							System.out.println("1. 일반몬스터");
							System.out.println("2. 보스");
							System.out.print("밀림에서 어디를 갈까? : ");
							사냥터 = scanner.nextInt();
							if (사냥터 == 1) // 2단계필드에서 일반몬스터
							{
								늑대 늑대 = new 늑대();
								System.out.println("\n\n");
								System.out.println("야생의" + 늑대.이름 + "이 나타났다.");
								늑대.start();// 늑대 자동공격
								while (true) {
									if (플레이어.hp <= 0) {
										늑대.stop(true);
										System.out.println("플레이어가 죽었습니다.");
										플레이어.hp = 1;
										System.out.println("플레이어는 hp가 1로 부활합니다.");
										System.out.println("마을로 돌아갑니다.");
										System.out.println("마을로 이동중입니다.\n");
										battle.close();
										break battle;
									}
									System.out.println("1. 공격하기\t" + "2. 도망가기\t" + "3. 가방");
									System.out.print("나의 행동은 : ");
									num = scanner.nextInt();
									{
										if (num == 1) {
											플레이어.공격(늑대.방어력);
											늑대.공격받기(플레이어.데미지);
											if (늑대.hp <= 0) {
												늑대.stop(true);
												System.out.println("늑대가 기절했습니다.\n");
												늑대.보상금(플레이어.레벨);
												플레이어.경험치 += 늑대.경험치;
												System.out.println(늑대.경험치 + "만큼의 경험치가 올랐습니다.\n");
												Thread.sleep(800);
												플레이어.골드 += 늑대.골드;
												System.out.println(늑대.골드 + "만큼의 골드가 올랐습니다.\n");
												gold.start();
												Thread.sleep(800);
												break;
											}
										} else if (num == 2) {
											if (플레이어.도망() == true) {
												늑대.stop(true);
												break;
											}
										} else if (num == 3) {

											가방1.포션가방인터페이스();
											System.out.println("내가 사용할 포션을 고르시오.");
											System.out.println("1. hp\t" + "2. mp");
											System.out.print("내가 사용할 포션 : ");
											int z = scanner.nextInt();
											if (z == 1) //// hp포션 사용시 내 hp회복과 남은 포션갯수
											{
												System.out.println("\nhp포션을 사용합니다");
												if (가방1.포션가방[0] > 0) {
													가방1.포션가방[0] -= 1;
													플레이어.hp += 50;
													if (플레이어.hp > 플레이어.최대hp) {
														플레이어.hp = 플레이어.최대hp;
													}
													System.out.println("hp가 증가했습니다.");
													System.out.println("플레이어의 hp는 " + 플레이어.hp + "입니다.");
													System.out.println("남은 hp포션의 갯수는 " + 가방1.포션가방[0] + "개 입니다.");
												} else {
													System.out.println("hp포션이 없습니다.");
												}

											} else if (z == 2) // mp포션 사용시 내 mp회복과 남은 포션갯수
											{
												System.out.println("\nmp포션을 사용합니다");
												if (가방1.포션가방[1] > 0) {
													가방1.포션가방[1] -= 1;
													플레이어.mp += 50;
													if (플레이어.mp > 플레이어.최대mp) {
														플레이어.mp = 플레이어.최대mp;
													}
													System.out.println("mp가  증가했습니다.");
													System.out.println("플레이어의 mp는 " + 플레이어.mp + "입니다.");
													System.out.println("남은 mp포션의 갯수는 " + 가방1.포션가방[1] + "개 입니다.");
												} else {
													System.out.println("mp포션이 없습니다.");
												}
											}
											System.out.println();
										}
									}
								}
							} else if (사냥터 == 2) // 2단계필드에서 보스몬스터
							{
								System.out.println("\n\n");
								늑대왕 늑대왕 = new 늑대왕();
								// 보스필드효과 필드효과2 = new 보스필드효과(70);
								System.out.println("밀림의 보스" + 늑대왕.이름 + "이 나타났다.");
								늑대왕.start();
								// 필드효과2.start();
								int 보스공격횟수 = 0;
								while (true) {
									if (보스공격횟수 == 3) {
										늑대왕.데미지 = 늑대왕.특수능력(늑대왕.공격력, 플레이어.방어력);
										플레이어.공격받기(늑대왕.데미지);
										보스공격횟수 = 0;
									}
									if (플레이어.hp <= 0) {
										늑대왕.stop(true);
										// 필드효과2.stop(true);
										System.out.println("플레이어가 죽었습니다.");
										플레이어.hp = 1;
										System.out.println("플레이어는 hp가 1로 부활합니다.");
										System.out.println("마을로 돌아갑니다.");
										System.out.println("마을로 이동중입니다.\n");
										battle.close();
										break battle;
									}
									System.out.println("1. 공격하기\t" + "2. 도망가기    3. 가방");
									System.out.print("나의 행동은 : ");
									num = scanner.nextInt();
									if (num == 1) {
										보스공격횟수 += 1;
										플레이어.공격(늑대왕.방어력);
										늑대왕.보스공격받기(플레이어.데미지);
										if (늑대왕.hp <= 0) {
											늑대왕.stop(true);
											// 필드효과2.stop(true);
											System.out.println("밀림의 늑대왕이 기절했습니다.\n");
											플레이어.경험치 += 늑대왕.경험치;
											System.out.println(늑대왕.경험치 + "만큼의 경험치가 올랐습니다.\n");
											Thread.sleep(700);
											플레이어.골드 += 늑대왕.골드;
											System.out.println(늑대왕.골드 + "만큼의 골드가 올랐습니다.\n");
											gold.run();
											Thread.sleep(700);
											if (가방1.가방탐색(늑대왕.드랍아이템) == false) // 해당열쇠가 있으면 더이상 열쇠를 얻을수 없음
											{
												단계2열쇠 단계2열쇠 = new 단계2열쇠();
												아이템.run();
												가방1.가방넣기(단계2열쇠.아이템종류, 단계2열쇠.아이템이름, 0, 0, 0, 0, 단계2열쇠.골드);
												Thread.sleep(700);
											}
											가방1.가방넣기("기타", 늑대왕.판매아이템, 0, 0, 0, 0, 800);
											Thread.sleep(800);
											아이템.run();
											break;
										}
									} else if (num == 2) {
										if (플레이어.도망() == true) {
											늑대왕.stop(true);
											// 필드효과2.stop(true);
											break;
										}
									} else if (num == 3) {

										가방1.포션가방인터페이스();
										System.out.println("내가 사용할 포션을 고르시오.");
										System.out.println("1. hp\t" + "2. mp");
										System.out.print("내가 사용할 포션 : ");
										int z = scanner.nextInt();
										if (z == 1) //// hp포션 사용시 내 hp회복과 남은 포션갯수
										{
											System.out.println("\nhp포션을 사용합니다");
											if (가방1.포션가방[0] > 0) {
												가방1.포션가방[0] -= 1;
												플레이어.hp += 50;
												if (플레이어.hp > 플레이어.최대hp) {
													플레이어.hp = 플레이어.최대hp;
												}
												System.out.println("hp가 증가했습니다.");
												System.out.println("플레이어의 hp는 " + 플레이어.hp + "입니다.");
												System.out.println("남은 hp포션의 갯수는 " + 가방1.포션가방[0] + "개 입니다.");
											} else {
												System.out.println("hp포션이 없습니다.");
											}

										} else if (z == 2) // mp포션 사용시 내 mp회복과 남은 포션갯수
										{
											System.out.println("\nmp포션을 사용합니다");
											if (가방1.포션가방[1] > 0) {
												가방1.포션가방[1] -= 1;
												플레이어.mp += 50;
												if (플레이어.mp > 플레이어.최대mp) {
													플레이어.mp = 플레이어.최대mp;
												}
												System.out.println("mp가  증가했습니다.");
												System.out.println("플레이어의 mp는 " + 플레이어.mp + "입니다.");
												System.out.println("남은 mp포션의 갯수는 " + 가방1.포션가방[1] + "개 입니다.");
											} else {
												System.out.println("mp포션이 없습니다.");
											}
										}
										System.out.println();
									}
								}
							}
						} else {
							System.out.println("조건이 충족되지 않습니다.");
							System.out.println("마을로 돌아갑니다.");
							System.out.println("마을로 이동중입니다.\n");
							battle.close();
							break battle;
						}
					} else if (사냥터 == 3) // 3단계사냥필드
					{
						System.out.println("\n\n");
						System.out.println("사원 필드 입장시 밀림의 왕의 열쇠가 필요합니다.\n");
						Thread.sleep(1000);
						if (가방1.가방탐색(늑대왕.드랍아이템) == true) {
							System.out.println("조건이 충족되었습니다.");
							System.out.println("사원에 도착을 했습니다");
							System.out.println("사원에는 일반몬스터와 필드보스가 있다.\n");
							System.out.println("1. 일반몬스터");
							System.out.println("2. 보스");
							System.out.print("사원에서 어느쪽으로 갈까? : ");
							사냥터 = scanner.nextInt();
							if (사냥터 == 1) // 3단계필드에서 일반몬스터
							{
								System.out.println("\n\n");
								골렘 골렘 = new 골렘();
								System.out.println("야생의" + 골렘.이름 + "이 나타났다.");
								골렘.start();
								while (true) {
									if (플레이어.hp <= 0) {
										골렘.stop(true);
										System.out.println("플레이어가 죽었습니다.");
										플레이어.hp = 1;
										System.out.println("플레이어는 hp가 1로 부활합니다.");
										System.out.println("마을로 돌아갑니다.");
										System.out.println("마을로 이동중입니다.\n");
										battle.close();
										break battle;
									}
									System.out.println("1. 공격하기\t" + "2. 도망가기\t" + "3. 가방");
									System.out.print("나의 행동은 : ");
									num = scanner.nextInt();
									{
										if (num == 1) {
											플레이어.공격(골렘.방어력);
											골렘.공격받기(플레이어.데미지);
											if (골렘.hp <= 0) {
												골렘.stop(true);
												System.out.println("골렘이 기절했습니다.\n");
												골렘.보상금(플레이어.레벨);
												플레이어.경험치 += 골렘.경험치;
												System.out.println(골렘.경험치 + "만큼의 경험치가 올랐습니다.\n");
												Thread.sleep(800);
												플레이어.골드 += 골렘.골드;
												System.out.println(골렘.골드 + "만큼의 골드가 올랐습니다.\n");
												gold.run();
												Thread.sleep(800);
												break;
											}
										} else if (num == 2) {
											if (플레이어.도망() == true) {
												골렘.stop(true);
												break;
											}
										} else if (num == 3) {
											가방1.포션가방인터페이스();
											System.out.println("내가 사용할 포션을 고르시오.");
											System.out.println("1. hp\t" + "2. mp");
											System.out.print("내가 사용할 포션 : ");
											int z = scanner.nextInt();
											if (z == 1) //// hp포션 사용시 내 hp회복과 남은 포션갯수
											{
												System.out.println("hp포션을 사용합니다");
												if (가방1.포션가방[0] > 0) {
													가방1.포션가방[0] -= 1;
													플레이어.hp += 50;
													if (플레이어.hp > 플레이어.최대hp) {
														플레이어.hp = 플레이어.최대hp;
													}
													System.out.println("hp가 증가했습니다.");
													System.out.println("플레이어의 hp는 " + 플레이어.hp + "입니다.");
													System.out.println("남은 hp포션의 갯수는 " + 가방1.포션가방[0] + "개 입니다.");
												} else {
													System.out.println("hp포션이 없습니다.");
												}

											} else if (z == 2) // mp포션 사용시 내 mp회복과 남은 포션갯수
											{
												System.out.println("mp포션을 사용합니다");
												if (가방1.포션가방[1] > 0) {
													가방1.포션가방[1] -= 1;
													플레이어.mp += 50;
													if (플레이어.mp > 플레이어.최대mp) {
														플레이어.mp = 플레이어.최대mp;
													}
													System.out.println("mp가  증가했습니다.");
													System.out.println("플레이어의 mp는 " + 플레이어.mp + "입니다.");
													System.out.println("남은 mp포션의 갯수는 " + 가방1.포션가방[1] + "개 입니다.");
												} else {
													System.out.println("mp포션이 없습니다.");
												}
											}
											System.out.println();
										}
									}
								}
							} else if (사냥터 == 2) // 3단계필드에서 보스몬스터
							{
								System.out.println("\n\n");
								골렘왕 골렘왕 = new 골렘왕();
								// 보스필드효과 필드효과3 = new 보스필드효과(80);
								System.out.println("사원의 보스" + 골렘왕.이름 + "이 나타났다.");
								골렘왕.start();
								// 필드효과3.start();
								int 보스공격횟수 = 0;
								while (true) {
									if (보스공격횟수 >= 3) {
										골렘왕.데미지 = 골렘왕.특수능력(골렘왕.공격력, 플레이어.방어력);
										플레이어.공격받기(골렘왕.데미지);
										보스공격횟수 = 0;
									}
									if (플레이어.hp <= 0) {
										골렘왕.stop(true);
										// 필드효과3.stop(true);
										System.out.println("플레이어가 죽었습니다.");
										플레이어.hp = 1;
										System.out.println("플레이어는 hp가 1로 부활합니다.");
										System.out.println("마을로 돌아갑니다.");
										System.out.println("마을로 이동중입니다.\n");
										battle.close();
										break battle;
									}
									System.out.println("1. 공격하기\t" + "2. 도망가기    3.가방");
									System.out.print("나의 행동은 : ");
									num = scanner.nextInt();
									if (num == 1) {
										보스공격횟수 += 1;
										플레이어.공격(골렘왕.방어력);
										골렘왕.보스공격받기(플레이어.데미지);
										if (골렘왕.hp <= 0) {
											골렘왕.stop(true);
											// 필드효과3.stop(true);
											System.out.println("사원의 골렘왕이 기절했습니다.\n");
											플레이어.경험치 += 골렘왕.경험치;
											System.out.println(골렘왕.경험치 + "만큼의 경험치가 올랐습니다.\n");
											Thread.sleep(800);
											플레이어.골드 += 골렘왕.골드;
											System.out.println(골렘왕.골드 + "만큼의 골드가 올랐습니다.\n");
											gold.run();
											Thread.sleep(800);
											if (가방1.가방탐색(골렘왕.드랍아이템) == false) // 해당열쇠가 있으면 더이상 열쇠를 얻을수 없음
											{
												단계3열쇠 단계3열쇠 = new 단계3열쇠();
												아이템.run();
												가방1.가방넣기(단계3열쇠.아이템종류, 단계3열쇠.아이템이름, 0, 0, 0, 0, 단계3열쇠.골드);
												Thread.sleep(800);
											}
											가방1.가방넣기("기타", 골렘왕.판매아이템, 0, 0, 0, 0, 800);
											Thread.sleep(800);
											아이템.run();
											break;
										}
									} else if (num == 2) {
										if (플레이어.도망() == true) {
											골렘왕.stop(true);
											// 필드효과3.stop(true);
											break;
										}
									} else if (num == 3) {

										가방1.포션가방인터페이스();
										System.out.println("내가 사용할 포션을 고르시오.");
										System.out.println("1. hp\t" + "2. mp");
										System.out.print("내가 사용할 포션 : ");
										int z = scanner.nextInt();
										if (z == 1) //// hp포션 사용시 내 hp회복과 남은 포션갯수
										{
											System.out.println("\nhp포션을 사용합니다");
											if (가방1.포션가방[0] > 0) {
												가방1.포션가방[0] -= 1;
												플레이어.hp += 50;
												if (플레이어.hp > 플레이어.최대hp) {
													플레이어.hp = 플레이어.최대hp;
												}
												System.out.println("hp가 증가했습니다.");
												System.out.println("플레이어의 hp는 " + 플레이어.hp + "입니다.");
												System.out.println("남은 hp포션의 갯수는 " + 가방1.포션가방[0] + "개 입니다.");
											} else {
												System.out.println("hp포션이 없습니다.");
											}

										} else if (z == 2) // mp포션 사용시 내 mp회복과 남은 포션갯수
										{
											System.out.println("\nmp포션을 사용합니다");
											if (가방1.포션가방[1] > 0) {
												가방1.포션가방[1] -= 1;
												플레이어.mp += 50;
												if (플레이어.mp > 플레이어.최대mp) {
													플레이어.mp = 플레이어.최대mp;
												}
												System.out.println("mp가  증가했습니다.");
												System.out.println("플레이어의 mp는 " + 플레이어.mp + "입니다.");
												System.out.println("남은 mp포션의 갯수는 " + 가방1.포션가방[1] + "개 입니다.");
											} else {
												System.out.println("mp포션이 없습니다.");
											}
										}
										System.out.println();
									}
								}
							}
						} else {
							System.out.println("조건이 충족되지 않습니다.\n");
							System.out.println("마을로 돌아갑니다.\n");
							System.out.println("마을로 이동중입니다.\n");
							battle.close();
							break battle;
						}
					} else if (사냥터 == 4) // 마왕성
					{
						System.out.println("\n\n\n\n");
						System.out.println("마왕성이 잠겨있다\n");
						System.out.println("열쇠가 3개 필요해 보인다.\n");
						Thread.sleep(1000);
						// if (가방1.가방탐색(골렘왕.드랍아이템) == 가방1.가방탐색(늑대왕.드랍아이템) == 가방1.가방탐색(대왕슬라임.드랍아이템) ==
						// true)
						if (가방1.가방탐색(대왕슬라임.드랍아이템) == true) {
							battle.close();
							Music 마왕전용 = new Music("마왕전투.mp3", true);
							마왕전용.start();
							가방1.가방제거(대왕슬라임.드랍아이템);
							// 가방1.가방제거(늑대왕.드랍아이템);
							// 가방1.가방제거(골렘왕.드랍아이템);
							Thread.sleep(1000);
							System.out.println("1단계열쇠를 사용합니다.\n");
							Thread.sleep(1000);
							System.out.println("2단계열쇠를 사용합니다.\n");
							Thread.sleep(1000);
							System.out.println("3단계열쇠를 사용합니다.\n");
							Thread.sleep(1000);
							System.out.println("마왕성으로 입장합니다.\n\n\n\n");
							최종보스 최종보스 = new 최종보스();
							System.out.println("마지막 최종보스 " + 최종보스.이름 + "이 나타났다.");
							String 마왕대사 = ("내 친구들을 괴롭히는 것도 모잘라서 여기까지 오다니 가만 안두겠다(엔터)");
							글자타이핑 마왕입장 = new 글자타이핑(마왕대사, 50);
							마왕입장.start();
							로딩창대기열 마왕대기열 = new 로딩창대기열();
							마왕대기열.start();
							// 최종보스필드효과 마왕효과 = new 최종보스필드효과(100);
							// 마왕효과.start();
							int 보스공격횟수 = 0;
							최종보스.start();
							while (true) {
								if (보스공격횟수 >= 3) {
									최종보스.데미지 = 최종보스.특수능력(최종보스.공격력, 플레이어.방어력);
									플레이어.공격받기(최종보스.데미지);
									보스공격횟수 = 0;
								}
								if (플레이어.hp <= 0) {
									// 마왕효과.stop(true);
									최종보스.stop(true);
									마왕전용.close();
									System.out.println("플레이어가 죽었습니다.");
									플레이어.hp = 1;
									System.out.println("플레이어는 hp가 1로 부활합니다.");
									System.out.println("마을로 돌아갑니다.");
									System.out.println("마을로 이동중입니다.\n");
									break battle;
								}
								System.out.println("1. 공격하기\t" + "2. 도망가기");
								System.out.print("나의 행동은 : ");
								num = scanner.nextInt();
								if (num == 1) {
									보스공격횟수 += 1;
									플레이어.공격(최종보스.방어력);
									최종보스.보스공격받기(플레이어.데미지);
									if (최종보스.hp <= 0) {
										최종보스.stop(true);
										마왕전용.close();
										// 마왕효과.stop(true);
										System.out.println("마왕을 크게 혼내줬습니다. 마왕이 가져간 축제물품들을 찾았습니다.\n");
										Thread.sleep(1000);
										System.out.println("물건들을 가지고 마을로 돌아가서 축제를 다시 시작합니다.");
										가방1.가방넣기("기타", "마을 축제 물건들", 0, 0, 0, 0, 0);
										Thread.sleep(1000);
										System.out.println("마을로 돌아갑니다.\n");
										Thread.sleep(1000);
										break game;
									}
								} else if (num == 2) {
									if (플레이어.도망() == true) {
										// 마왕효과.stop(true);
										최종보스.stop(true);
										마왕전용.close();
										break;
									}
								}
							}
						} else {
							System.out.println("\n조건이 충족되지 않습니다.\n");
							System.out.println("\n마을로 돌아갑니다.\n");
							System.out.println("\n마을로 이동중입니다.\n");
							battle.close();
							break battle;
						}
					} else if (사냥터 == 5) // 사냥터 이동에서 마을로 다시 돌아가는 것
					{
						System.out.println("\n돌아가기를 션택하셨습니다.\n");
						System.out.println("마을로 돌아갑니다.\n");
						System.out.println("마을로 이동중입니다.\n");
						break;
					}
					if (플레이어.경험치 >= 100) {
						플레이어.레벨 += (플레이어.경험치 / 100);
						플레이어.공격력 += (10) * (플레이어.경험치 / 100);
						플레이어.hp += (200) * (플레이어.경험치 / 100);
						플레이어.최대hp += (200) * (플레이어.경험치 / 100);
						플레이어.mp += (100) * (플레이어.경험치 / 100);
						플레이어.최대mp += (100) * (플레이어.경험치 / 100);
						플레이어.경험치 = 플레이어.경험치 % 100;
						System.out.println("\n레벨이 올랐습니다!!. 능력치도 증가합니다.\n");
						System.out.println("\n공격력이 증가합니다.\n");
						System.out.println("\nhp가 증가합니다.\n");
						System.out.println("\nmp가 증가합니다\n");
						플레이어.인터페이스();
					}
					if (플레이어.hp <= 0) {
						// 슬라임.stop(true);
						System.out.println("\n플레이어가 죽었습니다.\n");
						플레이어.hp = 1;
						System.out.println("플레이어는 hp가 1로 부활합니다.\n");
						System.out.println("마을로 돌아갑니다.\n");
						System.out.println("마을로 이동중입니다.\n");
						battle.close();
						break battle;
					}
					System.out.println("\n사냥이 끝났습니다.\n");
					System.out.println("사냥을 계속 하시겠습니까?\n");
					System.out.println("1. 예.\t" + " 2. 아니오.\n");
					System.out.print("나의 행동은 : ");
					num = scanner.nextInt();
					if (num == 2) {
						System.out.println("\n마을로 돌아갑니다.\n");
						System.out.println("마을로 이동중입니다.\n");
						break battle;
					}
				}
				battle.close();
			} else if (장소 == 2) // 시장클래스 물약의 구매와 판매를 만들예정
			{
				intromu.close();
				Music 시장사운드 = new Music("시장.mp3", true);
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("시장으로 이동을 한다.");
				시장사운드.start();
				시장 시장 = new 시장();
				시장: while (true) {
					System.out.println("\n\n");
					System.out.println("1. 구매한다     2.교환한다    3. 뒤로가기\n");
					System.out.print("시장에서 내가 할 행동은 : ");
					int 시장행동 = scanner.nextInt();
					if (시장행동 == 1) {
						시장구매배열 = 시장.장사(플레이어.골드);
						플레이어.골드 = 시장구매배열[0];
						// 배열 0= 플레이어골드, 1=hp포션, 2=mp포션
						가방1.포션가방넣기(시장구매배열);
					} // else if (시장행동 == 2) {시장.판매();}
					else if (시장행동 == 2) {
						시장.교환하기();
					} else if (시장행동 == 3) {
						시장사운드.close();
						System.out.println("\n마을로 돌아갑니다.\n");
						System.out.println("\n마을로 이동중입니다.\n");
						break 시장;
					}
				}
				시장사운드.close();
			} else if (장소 == 3)
			// 현재 플레이어의 인터페이스를 보여줌
			{
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\n무기 또는 방어구 또는 물약을 사용하려고 합니다\n");
				System.out.println("\n1번 사용\t" + "2번 사용안함\n");
				System.out.print("사용합니까 : ");
				int 사용 = scanner.nextInt();
				if (사용 == 1) {
					인터페이스: while (true) {
						플레이어.인터페이스();
						가방1.가방인터페이스();
						System.out.println("무기를 사용할경우 '무기'라고 입력을");
						System.out.println("방어구를 사용할 경우 '방어구'라고 입력울");
						System.out.println("hp포션을 사용할 경우 'hp'이라고 입력하십시오");
						System.out.println("mp포션을 사용할 경우 'mp'이라고 입력하십시오");
						System.out.print("내가 사용할 물건 : ");
						String a = scanner.next();
						if (a.equals("무기")) {
							if (가방1.가방종류탐색("무기")) {
								가방1.인벤무기장착();
							} else {
								System.out.println("\n장착가능한 무기가 없습니다.\n");
								System.out.println("\n다시 선택해 주세요\n");
							}
						} else if (a.equals("방어구")) {
							if (가방1.가방종류탐색("방어구")) {
								가방1.인벤방어구장착();
							} else {
								System.out.println("\n장착가능한 방어구가 없습니다.\n");
								System.out.println("\n다시 선택해 주세요\n");
							}
						} else if (a.equals("hp")) //// hp포션 사용시 내 hp회복과 남은 포션갯수반환
						{
							while (true) {
								System.out.println("\nhp포션을 사용합니다\n");
								if (가방1.포션가방[0] > 0) {
									가방1.포션가방[0] -= 1;
									플레이어.hp += 50;
									if (플레이어.hp > 플레이어.최대hp) {
										플레이어.hp = 플레이어.최대hp;
									}
									System.out.println("\nhp가 증가했습니다.");
									System.out.println("\n플레이어의 hp는 " + 플레이어.hp + "입니다.");
									System.out.println("\n남은 hp포션의 갯수는 " + 가방1.포션가방[0] + "개 입니다.");
									System.out.println("\n계속 사용합니까?");
									System.out.println("\n1. 사용한다.  2. 사용안한다.");
									System.out.print("\n나의 선택 : ");
									int 포션사용 = scanner.nextInt();
									if (포션사용 == 2) {
										break;
									}
								} else {
									System.out.println("\nhp포션이 없습니다.");
									break;
								}
							}
						} else if (a.equals("mp")) // mp포션 사용시 내 mp회복과 남은 포션갯수반환
						{
							while (true) {
								System.out.println("\nmp포션을 사용합니다");
								if (가방1.포션가방[1] > 0) {
									가방1.포션가방[1] -= 1;
									플레이어.mp += 50;
									if (플레이어.mp > 플레이어.최대mp) {
										플레이어.mp = 플레이어.최대mp;
									}
									System.out.println("\nmp가  증가했습니다.");
									System.out.println("\n플레이어의 mp는 " + 플레이어.mp + "입니다.");
									System.out.println("\n남은 mp포션의 갯수는 " + 가방1.포션가방[1] + "개 입니다.");
									System.out.println("\n계속 사용합니까?");
									System.out.println("\n1. 사용한다.  2. 사용안한다.");
									System.out.print("\n나의 선택 : ");
									int 포션사용 = scanner.nextInt();
									if (포션사용 == 2) {
										break;
									}
								} else {
									System.out.println("\nmp포션이 없습니다.");
									break;
								}
							}
						}
						플레이어.인터페이스();
						가방1.가방인터페이스();
						System.out.println();
						System.out.println("\n계속해서 사용합니까?");
						System.out.println("\n1. 예.\t" + " 2. 아니오.");
						System.out.print("나의 행동은 : ");
						num = scanner.nextInt();
						if (num == 2) {
							System.out.println("\n뒤로 돌아갑니다.");
							break 인터페이스;
						}
					}
				}
				intromu.close();
			}
		} // 게임끝
		Music 엔딩곡 = new Music("엔딩곡.mp3", true);
		엔딩곡.start();
		String 마무리멘트 = (" 용사님은 마왕이 가져간 축제 물건들을 가져왔습니다.\n\n" + " 용사님이 가져온 물건덕분에 마을에서는 다시 축제를 시작 할 수가 있게 되었는데\n\n"
				+ " 용사한테 크게 혼쭐이 난 마왕은 자신의 성에서\n\n" + " 마왕의 친구들과 같이 사람들이 축제를 즐기는 모습을 보면서 많이 부러워 했어요.\n\n"
				+ " 사실 마왕도 같이 축제를 즐기고 싶어했지만 이미 마을 사람들을 괴롭혔으니 같이 축제를 즐길수는 없겠죠?\n\n"
				+ " 이렇게 다시 축제를 즐기게 되면서 마을사람들은 행복하게 축제를 즐겼답니다.\n\n"
				+ " 용사이야기 끝~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		글자타이핑 마무리 = new 글자타이핑(마무리멘트, 15);
		마무리.start();
	}
}
