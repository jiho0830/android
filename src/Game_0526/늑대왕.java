package Game_0526;

public class 늑대왕 extends 필드보스몬스터 {
	public 늑대왕() {
		this.이름 = "늑대왕";
		this.hp = 530;
		this.최대hp = 530;
		this.경험치 = 400;
		this.골드 = 400;
		this.공격력 = 50;
		this.방어력 = 25;
		this.판매아이템 = "늑대왕의가죽";
	}

	static String 드랍아이템 = "단계2열쇠";

	public int 특수능력(int a, int b) // a는 몬스터의 공격력,b는 플레이어의 방어력
	{
		System.out.println("\n                                   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                                       " + this.이름 + "이 특수능력을 발동한다.");
		System.out.println("                                       늑대왕이 하울링을 합니다.");
		a *= 2;
		System.out.println("                                       늑대왕이 크게 울부짖습니다. 데미지는 " + (a - b) + "입니다.");
		return a;
	}
}
