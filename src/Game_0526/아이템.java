package Game_0526;

public class 아이템 extends 유닛 {
	public 아이템() {
	}

	public 아이템(String i아이템종류, String i아이템이름, int ihp, int i최대hp, int i공격력, int i방어력, int i골드) {
		this.아이템종류 = i아이템종류;
		this.아이템이름 = i아이템이름;
		this.hp = ihp;
		this.최대hp = i최대hp;
		this.공격력 = i공격력;
		this.방어력 = i방어력;
		this.골드 = i골드;
	}
}
