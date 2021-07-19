package Game_0526;

public class 최종보스 extends 필드보스몬스터 {
	public 최종보스() {
		this.이름 = "마왕";
		this.hp = 1530;
		this.최대hp = 1530;
		this.경험치 = 400;
		this.골드 = 400;
		this.공격력 = 40;
		this.방어력 = 50;
		this.판매아이템 = "마왕의 심장";
	}

	public int 특수능력(int a, int b) // a는 마왕의 공격력,b는 플레이어의 방어력
	{

		System.out.println("\n                                   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                                       " + this.이름 + "이 특수능력을 발동한다.");
		System.out.println("                                       마왕이 번개를 내립니다.");
		a *= 3;
		this.hp += a / 2;
		System.out.println("                                       마왕이 번개를 소환합니다. 데미지는 " + (a - b) + "입니다.");
		System.out.println("                                       마왕이 데미지의 절반을 흡혈합니다.");
		System.out.printf("                                       현재 마왕의 hp : %d / %d\n", this.hp, this.최대hp);
		return a;
	}
}
