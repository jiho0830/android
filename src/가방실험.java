
public class ������� {
	// String[] bag;// ����迭
	// int[] ���ǰ���;// ���ǰ����� ���� ���� ������ �Ϲ� ������ string�迭�̶� ���� ��밹��(int)�� ǥ���ϱ⿡�� �ʹ� �����
	boolean ��������;
	int ����ũ�� = 5;
	int �������;
	�������[] ��ü����;
	int �ǸŰ�;
	int ���԰�;
	String �����̸�;

	public �������() // �Ű������� ���� ����ũ�� ������ ����,���ǰ��浵 ����
	{
		this.��ü���� = new �������[5];
		this.������� = 0;
	}

	public �������(int c, int j, String string) {
		this.�ǸŰ� = c;
		this.���԰� = j;
		this.�����̸� = string;
		// TODO Auto-generated constructor stub
	}

	// ���� ���⿡ ���濡 ������ �ְ� ������ Ž���ϰ� �����ִ� �޼ҵ�
	public �������[] ��������(String �����ϴ¹���) // �����Ѵ����� �ش� ������� null������ �ٲ۴��� ������ ��ĭ�� �̵��ϰ� ���鿹��
	{
		for (int i = 0; i < this.�������; i++) {
			// if(this.bag[i] != null && this.bag[i].equals(�����ϴ¹���)){
			if (this.��ü����[i].equals(�����ϴ¹���)) {
				this.��ü����[i] = null;
				for (int j = i; j < this.������� - 1; j++) {
					this.��ü����[j] = this.��ü����[j + 1];
					this.��ü����[j + 1] = null;
				}
				this.������� -= 1;
			}
		}
		return this.��ü����;
	}

	public void ����ֱ�(int c, int j, String string) {
		for (int i = 0; i < ��ü����.length; i++) {
			if (this.������� == this.����ũ��) {
				System.out.println("���� ������ ��������. ");
				break;
			} else {
				if (this.��ü����[i] == null) {
					this.��ü����[i] = new �������(c, j, string);
					this.������� += 1;
					System.out.printf(string + "�� �����.\n");
					break;
				}
			}
		}
	}

	public void ����Ž��(String ã�¹���) // ����迭���� ã���� �ϴ¹����� �ݺ����� ���ؼ� ��
	{
		�������� = false;
		for (int i = 0; i < ��ü����.length; i++) {
			if (this.��ü����[i] != null && this.��ü����[i].�����̸�.equals(ã�¹���)) {
				System.out.println(��ü����[i].�����̸�);
			}
		}
	}

	public void �����������̽�() {
		System.out.println("���Ⱑ��");
		for (int i = 0; i < ��ü����.length; i++) {
			if (��ü����[i] == null) {
				System.out.printf(" �������\t\t");
			} else {
				if (this.��ü����[i].�����̸�.equals("����")) {
					System.out.printf(this.��ü����[i].�����̸� + " : %s\t", this.��ü����[i].�����̸�);
					System.out.printf(this.��ü����[i].�ǸŰ� + " : %s\t", this.��ü����[i].�ǸŰ�);
					System.out.printf(this.��ü����[i].���԰� + " : %s\t", this.��ü����[i].���԰�);
				} else {
					System.out.println(123456);
				}
			}
		}
	}
}
