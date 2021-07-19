package Game_0526;

public class 필드보스몬스터 extends 몬스터// 필드보스
{
	String 판매아이템;

	public int 공격(int a) // a는 플레이어의 방어력
	{
		데미지 = 0;
		데미지 += 공격력;
		System.out.println("\n                                   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                                       몬스터의 공격!!!!!!!");
		if (a < 데미지) {
			System.out.println("                                       몬스터의 데미지는 " + (데미지 - a) + "입니다.");
		} else {
			System.out.println("                                       몬스터의 공격력이 너무 낮아서 데미지가 안들어올꺼 같다.");
		}
		return 데미지;
	}

	public void 보스공격받기(int a) // a는 플레이어의 공격력
	{
		//Music 회피 = new Music("회피.mp3", false);
		int 회피율;
		회피율 = (int) (Math.random() * 11);
		if (회피율 > 2) {
			if (방어력 >= a) {
				hp = hp - 0;
				System.out.println("방어력이 높아서 데미지가 들어가지 않습니다.");
			} else {
				hp = hp + 방어력 - a;
				if (hp <= 0) {
					hp = 0;
				}
				System.out.println("몬스터에게 " + (a - 방어력) + "의 데미지를 입혔습니다.");
			}

			System.out.printf("몬스터 hp : %d / %d\n", this.hp, this.최대hp);
			System.out.println("\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		} else {
			//회피.start();
			System.out.println("공격이 회피되었습니다.");
			System.out.println("\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		}
	}

	public String 아이템드랍() {
		// 대장장이마을 추가, 그후에 무기별로 생성자 생성해서 팔수 있게 할려고함
		return 판매아이템;
	}

}
