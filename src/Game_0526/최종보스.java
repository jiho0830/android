package Game_0526;

public class �������� extends �ʵ庸������ {
	public ��������() {
		this.�̸� = "����";
		this.hp = 1530;
		this.�ִ�hp = 1530;
		this.����ġ = 400;
		this.��� = 400;
		this.���ݷ� = 40;
		this.���� = 50;
		this.�Ǹž����� = "������ ����";
	}

	public int Ư���ɷ�(int a, int b) // a�� ������ ���ݷ�,b�� �÷��̾��� ����
	{

		System.out.println("\n                                   ��������������������������������������������������������������������������������������������");
		System.out.println("                                       " + this.�̸� + "�� Ư���ɷ��� �ߵ��Ѵ�.");
		System.out.println("                                       ������ ������ �����ϴ�.");
		a *= 3;
		this.hp += a / 2;
		System.out.println("                                       ������ ������ ��ȯ�մϴ�. �������� " + (a - b) + "�Դϴ�.");
		System.out.println("                                       ������ �������� ������ �����մϴ�.");
		System.out.printf("                                       ���� ������ hp : %d / %d\n", this.hp, this.�ִ�hp);
		return a;
	}
}
