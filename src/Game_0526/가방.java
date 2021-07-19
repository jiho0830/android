package Game_0526;

import java.util.Scanner;

public class 가방 extends 유닛 {
	가방[] bag;// 가방배열
	int[] 포션가방;// 포션가방을 따로 만든 이유는 일반 가방은 string배열이라서 포션 사용갯수(int)를 표현하기에는 너무 어려움
	boolean 가방참;
	int 가방크기 = 10;
	int 가방길이;
	가방[] 플레이어인벤;
	Scanner scanner = new Scanner(System.in);

	public 가방() // 매개변수에 따른 가방크기 생성자 생성,포션가방도 생성
	{
		this.bag = new 가방[가방크기];
		this.포션가방 = new int[2];
		this.가방길이 = 0;
		this.플레이어인벤 = new 가방[2];
	}

	public 가방(String i아이템종류, String i아이템이름, int ihp, int i최대hp, int i공격력, int i방어력, int i골드) {
		this.아이템종류 = i아이템종류;
		this.아이템이름 = i아이템이름;
		this.hp = ihp;
		this.최대hp = i최대hp;
		this.공격력 = i공격력;
		this.방어력 = i방어력;
		this.골드 = i골드;
	}

	public 가방(String i아이템종류, String i아이템이름, int i공격력, int i골드) {
		// TODO Auto-generated constructor stub
		this.아이템종류 = i아이템종류;
		this.아이템이름 = i아이템이름;
		this.공격력 = i공격력;
		this.골드 = i골드;
	}

	public 가방(String i아이템종류, String i아이템이름, int ihp, int i방어력, int i골드) {
		// TODO Auto-generated constructor stub
		this.아이템종류 = i아이템종류;
		this.아이템이름 = i아이템이름;
		this.hp = ihp;
		this.골드 = i골드;
		this.방어력 = i방어력;
	}

	public void 가방무기넣기(String i아이템종류, String i아이템이름, int i공격력, int i골드) {

		for (int i = 0; i < bag.length; i++) {
			if (this.가방길이 == this.가방크기) {
				System.out.println("현재 가방이 꽉차있음. ");
				break;
			} else {
				if (this.bag[i] == null) {
					this.bag[i] = new 가방(i아이템종류, i아이템이름, i공격력, i골드);
					this.가방길이 += 1;
					System.out.println(i아이템이름 + "이 가방에 들어간다.\n");
					break;
				}
			}
		}
	}

	public void 가방방어구장사() {
		int n = 1;
		int 방어구번호[] = new int[this.bag.length];
		{
			for (int i = 0; i < bag.length; i++) {
				if (this.bag[i] != null && this.bag[i].아이템종류.equals("방어구")) {
					System.out.printf(n + "  . " + this.bag[i].아이템이름 + "\t\t");
					n++;
					for (int z = 0; z < 방어구번호.length; z++) {
						if (방어구번호[z] == 0) {
							방어구번호[z] = i;
						}
					}
				} else {
					continue;
				}
			}
			System.out.print("\n\n어떤 방어구를 판매할까요 :");
			int 무기장착 = scanner.nextInt();
			//무기장착 -= 1;
			System.out.println(this.bag[방어구번호[무기장착]].아이템이름 + "이 팔립니다.");
			MainGame.플레이어.골드 += this.bag[방어구번호[무기장착]].골드;
			this.가방제거(this.bag[방어구번호[무기장착]].아이템이름);
		}
	}

	public void 가방무기장사() {
		int n = 1;
		int 무기번호[] = new int[bag.length];
		{
			for (int i = 0; i < bag.length; i++) {
				if (this.bag[i] != null && this.bag[i].아이템종류.equals("무기")) {
					System.out.printf(n + "  . " + this.bag[i].아이템이름 + "\t\t");
					n++;
					for (int z = 0; z < 무기번호.length; z++) {
						if (무기번호[z] == 0) {
							무기번호[z] = i;
						}
					}
				} else {
					continue;
				}
			}
			System.out.print("\n\n어떤 무기를 판매할까요 :");
			int 무기장착 = scanner.nextInt();
			//무기장착 -= 1;
			System.out.println();
			System.out.println(this.bag[무기번호[무기장착]].아이템이름 + "이 팔립니다.");
			MainGame.플레이어.골드 += this.bag[무기번호[무기장착]].골드;
			this.가방제거(this.bag[무기번호[무기장착]].아이템이름);
		}
	}

	public void 가방기타장사() {
		int n = 1;
		int 기타번호[] = new int[bag.length];
		{
			for (int i = 0; i < bag.length; i++) {
				if (this.bag[i] != null && this.bag[i].아이템종류.equals("기타")) {
					System.out.printf(n + "  . " + this.bag[i].아이템이름 + "\t\t");
					n++;
					for (int z = 0; z < 기타번호.length; z++) {
						if (기타번호[z] == 0) {
							기타번호[z] = i;
							break;
						}
					}
				} else {
					continue;
				}
			}
			System.out.print("\n\n어떤 기타아이템을 판매할까요 :");
			int 무기장착 = scanner.nextInt();
			무기장착 -= 1;
			System.out.println(this.bag[기타번호[무기장착]].아이템이름 + "이 팔립니다.");
			MainGame.플레이어.골드 += this.bag[기타번호[무기장착]].골드;
			this.가방제거(this.bag[기타번호[무기장착]].아이템이름);
		}
	}

	public void 인벤방어구장착() {
		int n = 1;
		int 방어구번호[] = new int[bag.length];
		if (this.플레이어인벤[1] == null) {
			for (int i = 0; i < bag.length; i++) {
				if (this.bag[i] != null && this.bag[i].아이템종류.equals("방어구")) {
					System.out.printf(n + "  . " + this.bag[i].아이템이름 + "\t\t");
					n++;
					for (int z = 0; z < 방어구번호.length; z++) {
						if (방어구번호[z] == 0) {
							방어구번호[z] = i;
						}
					}
				} else {
					continue;
				}
			}
			System.out.println();
			System.out.print("무슨 방어구를 장착할까요 :");
			int 무기장착 = scanner.nextInt();
			무기장착 -= 1;
			System.out.println();
			this.인벤방어구넣기(this.bag[방어구번호[무기장착]].아이템종류, this.bag[방어구번호[무기장착]].아이템이름, this.bag[방어구번호[무기장착]].hp,
					this.bag[방어구번호[무기장착]].방어력, this.bag[방어구번호[무기장착]].골드);
			this.가방제거(this.bag[방어구번호[무기장착]].아이템이름);
		} else if (this.플레이어인벤[1] != null) {
			for (int i = 0; i < bag.length; i++) {
				if (this.bag[i] != null && this.bag[i].아이템종류.equals("방어구")) {
					System.out.printf(n + "  . " + this.bag[i].아이템이름 + "\t\t");
					n++;
					for (int z = 0; z < 방어구번호.length; z++) {
						if (방어구번호[z] == 0) {
							방어구번호[z] = i;
						}
					}
				} else {
					continue;
				}
			}
			System.out.println();
			System.out.print("무슨 방어구를 장착할까요 :");
			int 무기장착 = scanner.nextInt();
			무기장착 -= 1;
			System.out.println();
			this.인벤방어구제거();
			this.인벤방어구넣기(this.bag[방어구번호[무기장착]].아이템종류, this.bag[방어구번호[무기장착]].아이템이름, this.bag[방어구번호[무기장착]].hp,
					this.bag[방어구번호[무기장착]].방어력, this.bag[방어구번호[무기장착]].골드);
			this.가방제거(this.bag[방어구번호[무기장착]].아이템이름);
		}
	}

	public void 인벤무기장착() {
		int n = 1;
		int 무기번호[] = new int[bag.length];
		if (this.플레이어인벤[0] == null) {
			for (int i = 0; i < bag.length; i++) {
				if (this.bag[i] != null && this.bag[i].아이템종류.equals("무기")) {
					System.out.printf(n + "  . " + this.bag[i].아이템이름 + "\t\t");
					n++;
					for (int z = 0; z < 무기번호.length; z++) {
						if (무기번호[z] == 0) {
							무기번호[z] = i;
						}
					}
				} else {
					continue;
				}
			}
			System.out.println();
			System.out.println("무슨 무기를 장착할까요 : ");
			int 무기장착 = scanner.nextInt();
			무기장착 -= 1;
			System.out.println();
			this.인벤무기넣기(this.bag[무기번호[무기장착]].아이템종류, this.bag[무기번호[무기장착]].아이템이름, this.bag[무기번호[무기장착]].공격력,
					this.bag[무기번호[무기장착]].골드);
			this.가방제거(this.bag[무기번호[무기장착]].아이템이름);
		} else if (this.플레이어인벤[0] != null) {
			for (int i = 0; i < bag.length; i++) {
				if (this.bag[i] != null && this.bag[i].아이템종류.equals("무기")) {
					System.out.printf(n + "  . " + this.bag[i].아이템이름 + "\t\t");
					n++;
					for (int z = 0; z < 무기번호.length; z++) {
						if (무기번호[z] == 0) {
							무기번호[z] = i;
						}
					}
				} else {
					continue;
				}
			}
			System.out.println();
			System.out.println("무슨 무기를 장착할까요 : ");
			int 무기장착 = scanner.nextInt();
			무기장착 -= 1;
			System.out.println();
			this.인벤무기제거();
			this.인벤무기넣기(this.bag[무기번호[무기장착]].아이템종류, this.bag[무기번호[무기장착]].아이템이름, this.bag[무기번호[무기장착]].공격력,
					this.bag[무기번호[무기장착]].골드);
			this.가방제거(this.bag[무기번호[무기장착]].아이템이름);
		}
	}

	public void 인벤무기넣기(String i아이템종류, String i아이템이름, int i공격력, int i골드) {

		this.플레이어인벤[0] = new 가방(i아이템종류, i아이템이름, i공격력, i골드);
		MainGame.플레이어.공격력 += i공격력;
		System.out.println(i아이템이름 + " 을 장착합니다. \n");

	}

	public void 인벤방어구넣기(String i아이템종류, String i아이템이름, int ihp, int i방어력, int i골드) {

		this.플레이어인벤[1] = new 가방(i아이템종류, i아이템이름, ihp, i방어력, i골드);
		MainGame.플레이어.hp += ihp;
		MainGame.플레이어.최대hp += ihp;
		MainGame.플레이어.방어력 += i방어력;
		System.out.println(i아이템이름 + " 을 장착합니다. \n");
	}

	public 가방[] 인벤무기제거() // 제거한다음에 해당 빈공간을 null값으로 바꾼다음 앞으로 한칸씩 이동하게 만들예정
	{
		this.가방무기넣기(플레이어인벤[0].아이템종류, 플레이어인벤[0].아이템이름, 플레이어인벤[0].공격력, 플레이어인벤[0].골드);
		MainGame.플레이어.공격력 -= this.플레이어인벤[0].공격력;
		this.플레이어인벤[0] = null;
		return this.플레이어인벤;
	}

	public 가방[] 인벤방어구제거() // 제거한다음에 해당 빈공간을 null값으로 바꾼다음 앞으로 한칸씩 이동하게 만들예정
	{
		this.가방방어구넣기(플레이어인벤[1].아이템종류, 플레이어인벤[1].아이템이름, 플레이어인벤[1].hp, 플레이어인벤[1].최대hp, 플레이어인벤[1].골드);
		MainGame.플레이어.hp -= this.플레이어인벤[1].hp;
		MainGame.플레이어.최대hp -= this.플레이어인벤[1].최대hp;
		MainGame.플레이어.방어력 -= this.플레이어인벤[1].방어력;
		this.플레이어인벤[1] = null;
		return this.플레이어인벤;
	}

	public void 인벤인터페이스() {
		if (this.플레이어인벤[0] == null) {
			System.out.println("현재 착용 무기 : 비어있음");
		} else {
			System.out.println("현재 착용 무기 : " + this.플레이어인벤[0].아이템이름);
		}
		if (this.플레이어인벤[1] == null) {
			System.out.println("현재 착용 방어구 : 비어있음");
		} else {
			System.out.println("현재 착용 방어구 : " + this.플레이어인벤[1].아이템이름);
		}
	}

	public void 가방방어구넣기(String i아이템종류, String i아이템이름, int ihp, int i방어력, int i골드) {

		for (int i = 0; i < bag.length; i++) {
			if (this.가방길이 == this.가방크기) {
				System.out.println("현재 가방이 꽉차있어요. ");
				break;
			} else {
				if (this.bag[i] == null) {
					this.bag[i] = new 가방(i아이템종류, i아이템이름, ihp, i방어력, i골드);
					this.가방길이 += 1;
					System.out.println(i아이템이름 + " 이 가방에 들어갑니다.\n");
					break;
				}
			}
		}
	}

	// 이제 여기에 가방에 물건을 넣고 꺼내고 탐색하고 보여주는 메소드
	public void 가방넣기(String i아이템종류, String i아이템이름, int ihp, int i최대hp, int i공격력, int i방어력, int i골드) {
		// 반복문을 이용해서 넣고자 하는 공간이 빈공간이 아니면 다음배열에 넣기
		// 아이템 종류는 무기/방어구/기타
		{
			for (int i = 0; i < bag.length; i++) {
				if (this.가방길이 == this.가방크기) {
					System.out.println("현재 가방이 꽉차있어요. ");
					break;
				} else {
					if (this.bag[i] == null) {
						this.bag[i] = new 가방(i아이템종류, i아이템이름, ihp, i최대hp, i공격력, i방어력, i골드);
						this.가방길이 += 1;
						System.out.println(i아이템이름 + " 이 가방에 들어갑니다.\n");
						break;
					}
				}
			}
		}
	}

	public void 포션가방넣기(int[] 포션수) // 시장에서 장사반환값을 배열로 받은다음 그 포션갯수를 매개변수로 받음
	{
		this.포션가방[0] = 포션수[1];
		this.포션가방[1] = 포션수[2];
	}

	public 가방[] 가방제거(String 제거하는물건) // 제거한다음에 해당 빈공간을 null값으로 바꾼다음 앞으로 한칸씩 이동하게 만들예정
	{
		for (int i = 0; i < this.가방길이; i++) {
			// if(this.bag[i] != null && this.bag[i].equals(제거하는물건)){
			if (this.bag[i].아이템이름.equals(제거하는물건)) {
				this.bag[i] = null;
				for (int j = i; j < this.가방길이 - 1; j++) {
					this.bag[j] = this.bag[j + 1];
					this.bag[j + 1] = null;
				}
				this.가방길이 -= 1;
			}
		}
		return this.bag;
	}

	public boolean 가방탐색(String 찾는물건) // 가방배열에서 찾고자 하는물건을 반복문을 통해서 비교
	{
		가방참 = false;
		for (int i = 0; i < bag.length; i++) {
			if (this.bag[i] != null && this.bag[i].아이템이름.equals(찾는물건)) {
				가방참 = true;
			}
		}
		return 가방참;
	}

	public boolean 가방종류탐색(String 찾는종류) // 가방배열에서 찾고자 하는물건을 반복문을 통해서 비교
	{
		가방참 = false;
		for (int i = 0; i < bag.length; i++) {
			if (this.bag[i] != null && this.bag[i].아이템종류.equals(찾는종류)) {
				가방참 = true;
			}
		}
		return 가방참;
	}

	public void 가방부분인터페이스(String 찾는종류) {
		System.out.println(
				"┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		for (int i = 0; i < bag.length; i++) {
			if (this.bag[i] != null && this.bag[i].아이템종류.equals(찾는종류)) {
				System.out.printf("(" + this.bag[i].아이템종류 + ") : " + this.bag[i].아이템이름 + "\t\t");
			} else {
				continue;
			}
		}
		System.out.println(
				"\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}

	public void 가방인터페이스() {
		System.out.println(
				"┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		for (int i = 0; i < bag.length; i++) {
			if (bag[i] == null) {
				System.out.printf(" 비어있음\t\t");
			} else {
				System.out.printf("(" + this.bag[i].아이템종류 + ") : " + this.bag[i].아이템이름 + "\t\t");
			}
		}
		System.out.println();
		System.out.println("포션 가방");
		System.out.printf(" 아이템 : hp물약 %d개\t\t" + " 아이템 : mp물약 %d개\n", this.포션가방[0], this.포션가방[1]);
		System.out.println(
				"\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}

	public void 가방만인터페이스() {
		System.out.println(
				"┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		for (int i = 0; i < bag.length; i++) {
			if (bag[i] == null) {
				System.out.printf(" 비어있음\t\t");
			} else {
				System.out.printf("(" + this.bag[i].아이템종류 + ") : " + this.bag[i].아이템이름 + "\t\t");
			}
		}
		System.out.println(
				"\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}

	public void 포션가방인터페이스() {
		System.out.println();
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println();
		System.out.println("포션 가방");
		System.out.printf(" 아이템 : hp물약 %d개\t\t" + " 아이템 : mp물약 %d개\n", this.포션가방[0], this.포션가방[1]);
		System.out.println();
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}
}
