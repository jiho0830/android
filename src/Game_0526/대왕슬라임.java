package Game_0526;

public class 대왕슬라임 extends 필드보스몬스터 {
	public 대왕슬라임() {
		this.이름 = "대왕슬라임";
		this.hp = 530;
		this.최대hp = 530;
		this.경험치 = 350;
		this.골드 = 300;
		this.공격력 = 50;
		this.방어력 = 15;
		this.판매아이템 = "대왕슬라임조각";
	}

	static String 드랍아이템 = "단계1열쇠";

	public void 특수능력(int a) {
		Music 슬라임스킬 = new Music("슬라임스킬.MP3", false);
		슬라임스킬.start();
		System.out.println("\n                                   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                                       " + this.이름 + "이 특수능력을 발동한다.");
		System.out.println("                                       대왕 슬라임이 hp를 회복을 합니다.뿌숑빠숑");
		hp += a;
		if (hp > 530) {
			hp = 530;
		}
		System.out.printf("                                       대왕슬라임 hp : %d / %d\n", this.hp, this.최대hp);
		System.out.println("\n                                   ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

	}
}
