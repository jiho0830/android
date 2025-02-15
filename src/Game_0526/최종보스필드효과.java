package Game_0526;

public class 최종보스필드효과 extends Thread {
	boolean stop;
	int 효과데미지;

	public 최종보스필드효과(int a) {
		this.효과데미지 = a;
		this.stop = false;
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				System.out.println("                                       용사님은 일정시간 " + 효과데미지 + " 의 데미지를 받습니다.");
				MainGame.플레이어.hp -= 효과데미지;
				if (MainGame.플레이어.hp <= 0) {
					MainGame.플레이어.hp = 0;
					stop = true;
				}
				System.out.printf("                                       현재 용사의 남은 체력은 %d / %d입니다.\n",
						MainGame.플레이어.hp, MainGame.플레이어.최대hp);
				Thread.sleep(6000);
			} catch (Exception e) {
			}
		}
	}

	public void stop(boolean stop) {
		this.stop = stop;
	}

}
