package Game_0526;

public class ����1 extends ���� implements Runnable {
	boolean stop;

	public ����1() {
		this.stop = false;
	}

	public void stop(boolean stop) {
		this.stop = stop;
	}

	public int ����() // a�� �÷��̾��� ����
	{
		������ = 0;
		������ += ���ݷ�;
		System.out.println("                                       ������ ����!!");
		return ������;
	}

	public void ���ݹޱ�(int a)// a�� �÷��̾��� ������
	{
		if (���� >= a) {
			hp = hp - 0;
			System.out.println("������ ���Ƽ� �������� ���� �ʽ��ϴ�.");
		} else {
			hp = hp + ���� - a;
			if (hp <= 0) {
				hp = 0;
			}
			System.out.println("���Ϳ��� " + (a - ����) + "�� �������� �������ϴ�.");
		}

		System.out.printf("���� ������ hp : %d / %d\n", this.hp, this.�ִ�hp);
	}

	Runnable todo = new Runnable() {
		@Override
		public void run() {
			while (!stop) {
				try {
					if (MainGame.�÷��̾�.hp == 0) {
						stop = true;
						break;
					}
					int a = ����();
					MainGame.�÷��̾�.���ݹޱ�(a);
					Thread.sleep(3000);
				} catch (Exception e) {
					return;
				}
			}
		}
	};
}
