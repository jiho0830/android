package Game_0526;

public class ��ս����� extends �ʵ庸������ {
	public ��ս�����() {
		this.�̸� = "��ս�����";
		this.hp = 530;
		this.�ִ�hp = 530;
		this.����ġ = 350;
		this.��� = 300;
		this.���ݷ� = 50;
		this.���� = 15;
		this.�Ǹž����� = "��ս���������";
	}

	static String ��������� = "�ܰ�1����";

	public void Ư���ɷ�(int a) {
		Music �����ӽ�ų = new Music("�����ӽ�ų.MP3", false);
		�����ӽ�ų.start();
		System.out.println("\n                                   ��������������������������������������������������������������������������������������������");
		System.out.println("                                       " + this.�̸� + "�� Ư���ɷ��� �ߵ��Ѵ�.");
		System.out.println("                                       ��� �������� hp�� ȸ���� �մϴ�.�Ѽ�����");
		hp += a;
		if (hp > 530) {
			hp = 530;
		}
		System.out.printf("                                       ��ս����� hp : %d / %d\n", this.hp, this.�ִ�hp);
		System.out.println("\n                                   ��������������������������������������������������������������������������������������������");

	}
}
