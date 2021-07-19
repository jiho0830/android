package Game_0526;

public class 몬스터 extends 유닛 implements Runnable {
	boolean stop;

	public 몬스터() {
		this.stop = false;
	}

	public void stop(boolean stop) {
		this.stop = stop;
	}

	public int 공격() // a는 플레이어의 방어력
	{
		Music 몬스터타격 = new Music("몬스터공격.mp3", false);
		데미지 = 0;
		데미지 += 공격력;
		몬스터타격.start();
		System.out.println("\n                                   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                                       몬스터의 공격!!");
		return 데미지;
	}

	public void 공격받기(int a)// a는 플레이어의 데미지
	{
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

		System.out.printf("현재 몬스터의 hp : %d / %d\n", this.hp, this.최대hp);
		System.out.println("\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				if (MainGame.플레이어.hp == 0) {
					stop = true;
					break;
				}
				int a = 공격();
				MainGame.플레이어.공격받기(a);
				Thread.sleep(3000);
			} catch (Exception e) {
				return;
			}
		}
	}
}
