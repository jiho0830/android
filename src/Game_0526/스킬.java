package Game_0526;

public class 스킬 extends 유닛 {

	public int 루인(int 공격력, int 레벨) {
		System.out.println("강력한 루인공격 발동!!");
		return 데미지 = 공격력 + 레벨 * 2;
	}

	public int 버닝브레이크(int 공격력, int 레벨) {
		System.out.println("강력한 버닝브레이크 발동!!");
		return 데미지 = 공격력 * 2 + 레벨 * 3;
	}

	public int 인피니티(int 공격력, int 레벨) {
		System.out.println("강력한 인피니티 발동!!");
		return 데미지 = 공격력 * 3;
	}

	public int 교차사격(int 공격력, int 레벨) {
		System.out.println("강력한 교차사격 발동!!");
		return 데미지 = 공격력 + 레벨 * 2;
	}

	public int 버스트샷(int 공격력, int 레벨) {
		System.out.println("강력한 버스트샷 발동!!");
		return 데미지 = 공격력 * 2 + 레벨 * 3;
	}

	public int 스나이핑(int 공격력, int 레벨) {
		System.out.println("강력한 스나이핑 발동!!");
		return 데미지 = 공격력 * 3;
	}
}
