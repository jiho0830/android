
public class 아이템 {
	int 판매가;
	int 수입가;
	String 물건이름;

	public 아이템() {

	}

	public 아이템(int 판, int 수, String 물건) {
		this.판매가 = 판;
		this.수입가 = 수;
		this.물건이름 = 물건;
	}

	void show() {
		System.out.printf(this.물건이름, this.판매가, this.수입가);

	}
}
