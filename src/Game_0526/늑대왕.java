package Game_0526;

public class ����� extends �ʵ庸������ {
	public �����() {
		this.�̸� = "�����";
		this.hp = 530;
		this.�ִ�hp = 530;
		this.����ġ = 400;
		this.��� = 400;
		this.���ݷ� = 50;
		this.���� = 25;
		this.�Ǹž����� = "������ǰ���";
	}

	static String ��������� = "�ܰ�2����";

	public int Ư���ɷ�(int a, int b) // a�� ������ ���ݷ�,b�� �÷��̾��� ����
	{
		System.out.println("\n                                   ��������������������������������������������������������������������������������������������");
		System.out.println("                                       " + this.�̸� + "�� Ư���ɷ��� �ߵ��Ѵ�.");
		System.out.println("                                       ������� �Ͽ︵�� �մϴ�.");
		a *= 2;
		System.out.println("                                       ������� ũ�� ���¢���ϴ�. �������� " + (a - b) + "�Դϴ�.");
		return a;
	}
}
