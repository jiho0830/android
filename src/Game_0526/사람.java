package Game_0526;

import java.util.Scanner;

public class 사람 extends 유닛 {

	int mp;
	String 직업;
	// 직업별 클래스를 만들어서 상속할 예정이었으나 조건문에서 객체를 만들면 조건문안에서만 사용이 되므로
	// 해당직업클래스는 일단 보류

	/*
	 * 가방(드랍템을 줍기위한 것) 가낭을 어떻게 구현할 것인가 1. 배열 2. 연결리스트? 3. 클래스 마을에서 무기를 구매해서 내가 구매한
	 * 무기를 표현해야함 인벤토리 구현을 어떻게 할까 그러기 위해서는 무기를 구매하고 판매도 가능하게 해야함 마을 클래스도 만들어야하나? 마을은
	 * 대장장이 구현할려고함
	 */

	public 사람(int hp, int mp, int 레벨, int 공격력, int 방어력, String 직업, int 경험치, int 골드) {
		this.hp = hp;
		this.최대hp = hp;
		this.mp = mp;
		this.최대mp = mp;
		this.레벨 = 레벨;
		this.공격력 = 공격력;
		this.방어력 = 방어력;
		this.직업 = 직업;
		this.경험치 = 경험치;
		this.골드 = 골드;
	}

	public void 인터페이스() {
		if (this.경험치 >= 100) {
			this.레벨 += (this.경험치 / 100);
			this.공격력 += (10) * (this.경험치 / 100);
			this.hp += (200) * (this.경험치 / 100);
			this.최대hp += (200) * (this.경험치 / 100);
			this.mp += (100) * (this.경험치 / 100);
			this.최대mp += (100) * (this.경험치 / 100);
			this.경험치 = this.경험치 % 100;
		}
		System.out.println("===================================");
		System.out.println("현재 당신의 이름 : " + this.이름);
		System.out.println("현재 당신의 직업 : " + this.직업);
		System.out.println("현재 당신의 레벨 : " + this.레벨);
		System.out.printf("현재 당신의 경험치 : %d / 100\n", this.경험치);
		System.out.printf("현재 당신의 hp : %d / %d\n", this.hp, this.최대hp);
		System.out.printf("현재 당신의 mp : %d / %d\n", this.mp, this.최대mp);
		System.out.println("현재 당신의 공격력 : " + this.공격력);
		System.out.println("현재 당신의 방어력 : " + this.방어력);
		System.out.println("현재 당신의 골드 : " + this.골드);
		MainGame.가방1.인벤인터페이스();
		System.out.println("===================================");
	}

	스킬 기술 = new 스킬();// 여기서 스킬 생성

	public int 공격(int a) // a는 몬스터의 방어력
	{
		Music 기본타격음 = new Music("기본타격음.mp3", false);
		Music 기본총소리 = new Music("기본총소리.mp3", false);
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 일반 공격");
		System.out.println("2. 특수 공격");
		System.out.print("내가 공격할 방법을 고르시오 : ");
		int num = scanner.nextInt();
		데미지 = 0;
		while (true) {

			if (num == 1) {
				데미지 += 공격력;
				if (a > 데미지) {
					데미지 = a;
				}
				if (직업.equals("검사")) {
					기본타격음.start();
				} else if (직업.equals("검사")) {
					기본총소리.start();
				}
				System.out.println("\n┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
				System.out.println("    나의 데미지는 " + (데미지 - a) + "입니다.");
				break;
			} else if (num == 2)
				if (직업.equals("검사")) {
					System.out.println("특수 공격을 한다");
					System.out.println("1. 루인");
					System.out.println("2. 버닝브레이크");
					System.out.println("3. 인피니티");
					System.out.print("내가 공격할 방법을 고르시오 : ");
					num = scanner.nextInt();
					if (num == 1) {
						if (mp > 10) {
							데미지 = 기술.루인(공격력, 레벨);
							mp -= 30;
							기본타격음.run();
							System.out.println("\n┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("플레이어의 데미지는 " + (데미지 - a) + "입니다.");
							System.out.println("소모되는 mp는 " + 30 + "입니다.");
							System.out.printf("현재 플레이어의 남은 mp은 %d / %d입니다.\n", this.mp, this.최대mp);
							break;
						} else {
							System.out.println("남은 mp가 없습니다.");
							System.out.println("다시 선택하시오");
						}
					} else if (num == 2) {
						if (mp > 20) {
							데미지 = 기술.버닝브레이크(공격력, 레벨);
							mp -= 60;
							기본타격음.run();
							System.out.println("\n┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("플레이어의 데미지는 " + (데미지 - a) + "입니다.");
							System.out.println("소모되는 mp는 " + 60 + "입니다.");
							System.out.printf("현재 플레이어의 남은 mp은 %d / %d입니다.\n", this.mp, this.최대mp);
							break;
						} else {
							System.out.println("남은 mp가 없습니다.");
							System.out.println("다시 선택하시오");
						}
					} else if (num == 3) {
						if (mp > 30) {
							데미지 = 기술.인피니티(공격력, 레벨);
							mp -= 90;
							기본타격음.run();
							System.out.println("\n┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("플레이어의 데미지는 " + (데미지 - a) + "입니다.");
							System.out.println("소모되는 mp는 " + 90 + "입니다.");
							System.out.printf("현재 플레이어의 남은 mp은 %d / %d입니다.\n", this.mp, this.최대mp);
							break;
						} else {
							System.out.println("남은 mp가 없습니다.");
							System.out.println("다시 선택하시오");
						}
					}
					System.out.println("1. 일반 공격");
					System.out.println("2. 특수 공격");
					System.out.print("내가 공격할 방법을 고르시오 : ");
					num = scanner.nextInt();
				} else if (직업.equals("거너")) {

					System.out.println("특수 공격을 한다");
					System.out.println("1. 교차사격");
					System.out.println("2. 버스트샷");
					System.out.println("3. 스나이핑");
					System.out.print("내가 공격할 방법을 고르시오 : ");
					num = scanner.nextInt();
					if (num == 1) {
						if (mp > 10) {
							데미지 = 기술.교차사격(공격력, 레벨);
							mp -= 30;
							기본총소리.run();
							System.out.println("\n┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("플레이어의 데미지는 " + (데미지 - a) + "입니다.");
							System.out.println("소모되는 mp는 " + 30 + "입니다.");
							System.out.printf("현재 플레이어의 남은 mp은 %d / %d입니다.\n", this.mp, this.최대mp);
							break;
						} else {
							System.out.println("남은 mp가 없습니다.");
							System.out.println("다시 선택하시오");
						}
					} else if (num == 2) {
						if (mp > 20) {
							데미지 = 기술.버스트샷(공격력, 레벨);
							mp -= 60;
							기본총소리.run();
							System.out.println("\n┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("플레이어의 데미지는 " + (데미지 - a) + "입니다.");
							System.out.println("소모되는 mp는 " + 60 + "입니다.");
							System.out.printf("현재 플레이어의 남은 mp은 %d / %d입니다.\n", this.mp, this.최대mp);
							break;
						} else {
							System.out.println("남은 mp가 없습니다.");
							System.out.println("다시 선택하시오");
						}
					} else if (num == 3) {
						if (mp > 30) {
							데미지 = 기술.스나이핑(공격력, 레벨);
							mp -= 90;
							기본총소리.run();
							System.out.println("\n┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("플레이어의 데미지는 " + (데미지 - a) + "입니다.");
							System.out.println("소모되는 mp는 " + 90 + "입니다.");
							System.out.printf("현재 플레이어의 남은 mp은 %d / %d입니다.\n", this.mp, this.최대mp);
							break;
						} else {
							System.out.println("남은 mp가 없습니다.");
							System.out.println("다시 선택하시오");
						}
					}
					System.out.println("1. 일반 공격");
					System.out.println("2. 특수 공격");
					System.out.print("내가 공격할 방법을 고르시오 : ");
					num = scanner.nextInt();
				}
		}
		return 데미지;
	}

	public void 공격받기(int a)// a는 공격하는 몬스터의 데미지
	{
		if (방어력 >= a) {
			hp = hp - 0;
			System.out.println("                                       플레이어의 방어력이 높아서 데미지를 받지 않습니다.");

		} else {
			if (직업.equals("거너")) // 거너 클래스는 일정확률로 데미지 회피
			{
				int 확률 = (int) (Math.random() * 11);
				if (확률 <= 3) {
					System.out.println("                                       거너 클래스의 패시브로 회피했습니다.");

				} else {
					hp = hp + 방어력 - a;
					if (hp <= 0) {
						hp = 0;
					}
					System.out.println("                                       플레이어는 " + (a - 방어력) + "의 데미지를 받았습니다.");
				}
			} else if (직업.equals("검사"))// 검사 클래스는 일정확률로 데미지 절반 감소
			{
				int 확률 = (int) (Math.random() * 11);
				if (확률 <= 7) {
					System.out.println("                                       검사 클래스의 패시브로 데미지의 절반을 방어했습니다.");
					hp = hp + (방어력 - a) / 2;
					if (hp <= 0) {
						hp = 0;
					}
					System.out
							.println("                                       플레이어는 " + (a - 방어력) / 2 + "의 데미지를 받았습니다.");
				} else {
					hp = hp + 방어력 - a;
					if (hp <= 0) {
						hp = 0;
					}
					System.out.println("                                       플레이어는 " + (a - 방어력) + "의 데미지를 받았습니다");
				}
			}
		}
		System.out.printf("                                       현재 플레이어의 남은 체력은 %d / %d입니다.\n", this.hp, this.최대hp);
		System.out.println("\n                                   ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}

	public boolean 도망() // 도망치는데 실패하면 일정데미지를 피해받음
	{
		int a = (int) (Math.random() * 2);
		if (a == 1) {
			System.out.println("도망을 치는데 성공하였다");
			return true;
		} else {
			System.out.println("도망을 치는데 실패하였다");
			System.out.println("50의 데미지를 받았습니다");
			hp -= 50;
			return false;

		}
	}
}
