package Game_0526;

public class �����ʵ�ȿ�� extends Thread {
	boolean stop;
	int ȿ��������;

	public �����ʵ�ȿ��(int a) {
		this.ȿ�������� = a;
		this.stop = false;
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				wait();
				System.out.println(
						"\n                                                                 ��������������������������������������������������������������������������������������������");
				System.out.println("                                                                 ������ �ʵ�ȿ���� �ߵ��մϴ�");
				System.out.println("                                                                 ������ �����ð� " + ȿ��������
						+ " �� �������� �޽��ϴ�.");
				MainGame.�÷��̾�.hp -= ȿ��������;
				if (MainGame.�÷��̾�.hp <= 0) {
					MainGame.�÷��̾�.hp = 0;
					stop = true;
				}
				System.out.printf(
						"                                                                 ���� �÷��̾��� ���� ü���� %d / %d�Դϴ�.\n",
						MainGame.�÷��̾�.hp, MainGame.�÷��̾�.�ִ�hp);
				System.out.println(
						"\n                                                                 ��������������������������������������������������������������������������������������������");
				Thread.sleep(6000);
			} catch (Exception e) {
			}
		}
	}

	public void stop(boolean stop) {
		this.stop = stop;
	}

}
