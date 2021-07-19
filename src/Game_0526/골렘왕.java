package Game_0526;

public class 골렘왕 extends 필드보스몬스터 {
	public 골렘왕() {
		this.이름 = "골렘왕";
		this.hp = 1530;
		this.최대hp = 530;
		this.경험치 = 400;
		this.골드 = 400;
		this.공격력 = 40;
		this.방어력 = 50;
		this.판매아이템 = "골렘왕의파편";
		// this.드랍아이템 = "3단계열쇠";
	}

	static String 드랍아이템 = "단계3열쇠";

	public int 특수능력(int a, int b) // a는 몬스터의 공격력,b는 플레이어의 방어력
	{
		Music 골렘공격 = new Music("골렘사운드.MP3", false);
		골렘공격.start();
		System.out.println("\n                                   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                                   " + this.이름 + "이 특수능력을 발동한다.");
		System.out.println("                                       " + "골렘왕이 스윙을 시전합니다.");
		a *= 2;
		this.방어력 += 50;
		System.out.println("                                       골렘왕이 크게 스윙을 시전합니다. 데미지는 " + (a - b) + "입니다.");
		System.out
				.println("                                       골렘왕의 방어력이 크게 올라갑니다. 방어력이 " + this.방어력 + "으로 증가했습니다.");
		return a;
	}
}
