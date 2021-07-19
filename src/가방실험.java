
public class 가방실험 {
	// String[] bag;// 가방배열
	// int[] 포션가방;// 포션가방을 따로 만든 이유는 일반 가방은 string배열이라서 포션 사용갯수(int)를 표현하기에는 너무 어려움
	boolean 열쇠조각;
	int 가방크기 = 5;
	int 가방길이;
	가방실험[] 객체가방;
	int 판매가;
	int 수입가;
	String 물건이름;

	public 가방실험() // 매개변수에 따른 가방크기 생성자 생성,포션가방도 생성
	{
		this.객체가방 = new 가방실험[5];
		this.가방길이 = 0;
	}

	public 가방실험(int c, int j, String string) {
		this.판매가 = c;
		this.수입가 = j;
		this.물건이름 = string;
		// TODO Auto-generated constructor stub
	}

	// 이제 여기에 가방에 물건을 넣고 꺼내고 탐색하고 보여주는 메소드
	public 가방실험[] 가방제거(String 제거하는물건) // 제거한다음에 해당 빈공간을 null값으로 바꾼다음 앞으로 한칸씩 이동하게 만들예정
	{
		for (int i = 0; i < this.가방길이; i++) {
			// if(this.bag[i] != null && this.bag[i].equals(제거하는물건)){
			if (this.객체가방[i].equals(제거하는물건)) {
				this.객체가방[i] = null;
				for (int j = i; j < this.가방길이 - 1; j++) {
					this.객체가방[j] = this.객체가방[j + 1];
					this.객체가방[j + 1] = null;
				}
				this.가방길이 -= 1;
			}
		}
		return this.객체가방;
	}

	public void 가방넣기(int c, int j, String string) {
		for (int i = 0; i < 객체가방.length; i++) {
			if (this.가방길이 == this.가방크기) {
				System.out.println("현재 가방이 꽉차있음. ");
				break;
			} else {
				if (this.객체가방[i] == null) {
					this.객체가방[i] = new 가방실험(c, j, string);
					this.가방길이 += 1;
					System.out.printf(string + "을 얻었다.\n");
					break;
				}
			}
		}
	}

	public void 가방탐색(String 찾는물건) // 가방배열에서 찾고자 하는물건을 반복문을 통해서 비교
	{
		열쇠조각 = false;
		for (int i = 0; i < 객체가방.length; i++) {
			if (this.객체가방[i] != null && this.객체가방[i].물건이름.equals(찾는물건)) {
				System.out.println(객체가방[i].물건이름);
			}
		}
	}

	public void 가방인터페이스() {
		System.out.println("무기가방");
		for (int i = 0; i < 객체가방.length; i++) {
			if (객체가방[i] == null) {
				System.out.printf(" 비어있음\t\t");
			} else {
				if (this.객체가방[i].물건이름.equals("가죽")) {
					System.out.printf(this.객체가방[i].물건이름 + " : %s\t", this.객체가방[i].물건이름);
					System.out.printf(this.객체가방[i].판매가 + " : %s\t", this.객체가방[i].판매가);
					System.out.printf(this.객체가방[i].수입가 + " : %s\t", this.객체가방[i].수입가);
				} else {
					System.out.println(123456);
				}
			}
		}
	}
}
