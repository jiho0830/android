package Game_0526;

public class �񷽿� extends �ʵ庸������ {
	public �񷽿�() {
		this.�̸� = "�񷽿�";
		this.hp = 1530;
		this.�ִ�hp = 530;
		this.����ġ = 400;
		this.��� = 400;
		this.���ݷ� = 40;
		this.���� = 50;
		this.�Ǹž����� = "�񷽿�������";
		// this.��������� = "3�ܰ迭��";
	}

	static String ��������� = "�ܰ�3����";

	public int Ư���ɷ�(int a, int b) // a�� ������ ���ݷ�,b�� �÷��̾��� ����
	{
		Music �񷽰��� = new Music("�񷽻���.MP3", false);
		�񷽰���.start();
		System.out.println("\n                                   ��������������������������������������������������������������������������������������������");
		System.out.println("                                   " + this.�̸� + "�� Ư���ɷ��� �ߵ��Ѵ�.");
		System.out.println("                                       " + "�񷽿��� ������ �����մϴ�.");
		a *= 2;
		this.���� += 50;
		System.out.println("                                       �񷽿��� ũ�� ������ �����մϴ�. �������� " + (a - b) + "�Դϴ�.");
		System.out
				.println("                                       �񷽿��� ������ ũ�� �ö󰩴ϴ�. ������ " + this.���� + "���� �����߽��ϴ�.");
		return a;
	}
}
