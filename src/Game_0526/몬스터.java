package Game_0526;

public class ���� extends ���� implements Runnable {
	boolean stop;

	public ����() {
		this.stop = false;
	}

	public void stop(boolean stop) {
		this.stop = stop;
	}

	public int ����() // a�� �÷��̾��� ����
	{
		Music ����Ÿ�� = new Music("���Ͱ���.mp3", false);
		������ = 0;
		������ += ���ݷ�;
		����Ÿ��.start();
		System.out.println("\n                                   ��������������������������������������������������������������������������������������������");
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
		System.out.println("\n��������������������������������������������������������������������������������������������");
	}

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
}
