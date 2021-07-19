import Game_0526.사람;

public class 가방실험1 {

	public static void main(String[] args) {
		가방실험 가방실험 = new 가방실험();
		아이템 가죽 = new 아이템();
		아이템 가죽2 = new 아이템();
		가죽123 가죽12 = new 가죽123();
		가죽 = new 아이템(100, 700, "가죽");
		가죽2 = 가죽;
		가방실험.가방넣기(가죽.수입가, 가죽.판매가, 가죽.물건이름);
		가방실험.가방인터페이스();
		System.out.println();
		가방실험.가방넣기(가죽2.수입가, 가죽2.판매가, 가죽2.물건이름);
		가방실험.가방인터페이스();
		가방실험.가방탐색("가죽");
	}
}

class 가죽123 {
	String name = "가죽";
	int 판매금액 = 100;
	int 구입금액 = 700;

	void show() {
		System.out.printf(this.name, this.판매금액, this.구입금액);
	}
}
/*
 * 아이템 아이템 종류(무기, 방어구, 기타) 능력치(hp,최대hp,방어력,공격력,골드)
 *  String i아이템종류, String i아이템이름,
 * int ihp, int i최대hp, int i공격력, int i방어력, int i골드 }
 */
