package Game_0526;

import java.util.Scanner;

public class ��� extends ���� {

	int mp;
	String ����;
	// ������ Ŭ������ ���� ����� �����̾����� ���ǹ����� ��ü�� ����� ���ǹ��ȿ����� ����� �ǹǷ�
	// �ش�����Ŭ������ �ϴ� ����

	/*
	 * ����(������� �ݱ����� ��) ������ ��� ������ ���ΰ� 1. �迭 2. ���Ḯ��Ʈ? 3. Ŭ���� �������� ���⸦ �����ؼ� ���� ������
	 * ���⸦ ǥ���ؾ��� �κ��丮 ������ ��� �ұ� �׷��� ���ؼ��� ���⸦ �����ϰ� �Ǹŵ� �����ϰ� �ؾ��� ���� Ŭ������ �������ϳ�? ������
	 * �������� �����ҷ�����
	 */

	public ���(int hp, int mp, int ����, int ���ݷ�, int ����, String ����, int ����ġ, int ���) {
		this.hp = hp;
		this.�ִ�hp = hp;
		this.mp = mp;
		this.�ִ�mp = mp;
		this.���� = ����;
		this.���ݷ� = ���ݷ�;
		this.���� = ����;
		this.���� = ����;
		this.����ġ = ����ġ;
		this.��� = ���;
	}

	public void �������̽�() {
		if (this.����ġ >= 100) {
			this.���� += (this.����ġ / 100);
			this.���ݷ� += (10) * (this.����ġ / 100);
			this.hp += (200) * (this.����ġ / 100);
			this.�ִ�hp += (200) * (this.����ġ / 100);
			this.mp += (100) * (this.����ġ / 100);
			this.�ִ�mp += (100) * (this.����ġ / 100);
			this.����ġ = this.����ġ % 100;
		}
		System.out.println("===================================");
		System.out.println("���� ����� �̸� : " + this.�̸�);
		System.out.println("���� ����� ���� : " + this.����);
		System.out.println("���� ����� ���� : " + this.����);
		System.out.printf("���� ����� ����ġ : %d / 100\n", this.����ġ);
		System.out.printf("���� ����� hp : %d / %d\n", this.hp, this.�ִ�hp);
		System.out.printf("���� ����� mp : %d / %d\n", this.mp, this.�ִ�mp);
		System.out.println("���� ����� ���ݷ� : " + this.���ݷ�);
		System.out.println("���� ����� ���� : " + this.����);
		System.out.println("���� ����� ��� : " + this.���);
		MainGame.����1.�κ��������̽�();
		System.out.println("===================================");
	}

	��ų ��� = new ��ų();// ���⼭ ��ų ����

	public int ����(int a) // a�� ������ ����
	{
		Music �⺻Ÿ���� = new Music("�⺻Ÿ����.mp3", false);
		Music �⺻�ѼҸ� = new Music("�⺻�ѼҸ�.mp3", false);
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. �Ϲ� ����");
		System.out.println("2. Ư�� ����");
		System.out.print("���� ������ ����� ���ÿ� : ");
		int num = scanner.nextInt();
		������ = 0;
		while (true) {

			if (num == 1) {
				������ += ���ݷ�;
				if (a > ������) {
					������ = a;
				}
				if (����.equals("�˻�")) {
					�⺻Ÿ����.start();
				} else if (����.equals("�˻�")) {
					�⺻�ѼҸ�.start();
				}
				System.out.println("\n��������������������������������������������������������������������������������������������");
				System.out.println("    ���� �������� " + (������ - a) + "�Դϴ�.");
				break;
			} else if (num == 2)
				if (����.equals("�˻�")) {
					System.out.println("Ư�� ������ �Ѵ�");
					System.out.println("1. ����");
					System.out.println("2. ���׺극��ũ");
					System.out.println("3. ���Ǵ�Ƽ");
					System.out.print("���� ������ ����� ���ÿ� : ");
					num = scanner.nextInt();
					if (num == 1) {
						if (mp > 10) {
							������ = ���.����(���ݷ�, ����);
							mp -= 30;
							�⺻Ÿ����.run();
							System.out.println("\n��������������������������������������������������������������������������������������������");
							System.out.println("�÷��̾��� �������� " + (������ - a) + "�Դϴ�.");
							System.out.println("�Ҹ�Ǵ� mp�� " + 30 + "�Դϴ�.");
							System.out.printf("���� �÷��̾��� ���� mp�� %d / %d�Դϴ�.\n", this.mp, this.�ִ�mp);
							break;
						} else {
							System.out.println("���� mp�� �����ϴ�.");
							System.out.println("�ٽ� �����Ͻÿ�");
						}
					} else if (num == 2) {
						if (mp > 20) {
							������ = ���.���׺극��ũ(���ݷ�, ����);
							mp -= 60;
							�⺻Ÿ����.run();
							System.out.println("\n��������������������������������������������������������������������������������������������");
							System.out.println("�÷��̾��� �������� " + (������ - a) + "�Դϴ�.");
							System.out.println("�Ҹ�Ǵ� mp�� " + 60 + "�Դϴ�.");
							System.out.printf("���� �÷��̾��� ���� mp�� %d / %d�Դϴ�.\n", this.mp, this.�ִ�mp);
							break;
						} else {
							System.out.println("���� mp�� �����ϴ�.");
							System.out.println("�ٽ� �����Ͻÿ�");
						}
					} else if (num == 3) {
						if (mp > 30) {
							������ = ���.���Ǵ�Ƽ(���ݷ�, ����);
							mp -= 90;
							�⺻Ÿ����.run();
							System.out.println("\n��������������������������������������������������������������������������������������������");
							System.out.println("�÷��̾��� �������� " + (������ - a) + "�Դϴ�.");
							System.out.println("�Ҹ�Ǵ� mp�� " + 90 + "�Դϴ�.");
							System.out.printf("���� �÷��̾��� ���� mp�� %d / %d�Դϴ�.\n", this.mp, this.�ִ�mp);
							break;
						} else {
							System.out.println("���� mp�� �����ϴ�.");
							System.out.println("�ٽ� �����Ͻÿ�");
						}
					}
					System.out.println("1. �Ϲ� ����");
					System.out.println("2. Ư�� ����");
					System.out.print("���� ������ ����� ���ÿ� : ");
					num = scanner.nextInt();
				} else if (����.equals("�ų�")) {

					System.out.println("Ư�� ������ �Ѵ�");
					System.out.println("1. �������");
					System.out.println("2. ����Ʈ��");
					System.out.println("3. ��������");
					System.out.print("���� ������ ����� ���ÿ� : ");
					num = scanner.nextInt();
					if (num == 1) {
						if (mp > 10) {
							������ = ���.�������(���ݷ�, ����);
							mp -= 30;
							�⺻�ѼҸ�.run();
							System.out.println("\n��������������������������������������������������������������������������������������������");
							System.out.println("�÷��̾��� �������� " + (������ - a) + "�Դϴ�.");
							System.out.println("�Ҹ�Ǵ� mp�� " + 30 + "�Դϴ�.");
							System.out.printf("���� �÷��̾��� ���� mp�� %d / %d�Դϴ�.\n", this.mp, this.�ִ�mp);
							break;
						} else {
							System.out.println("���� mp�� �����ϴ�.");
							System.out.println("�ٽ� �����Ͻÿ�");
						}
					} else if (num == 2) {
						if (mp > 20) {
							������ = ���.����Ʈ��(���ݷ�, ����);
							mp -= 60;
							�⺻�ѼҸ�.run();
							System.out.println("\n��������������������������������������������������������������������������������������������");
							System.out.println("�÷��̾��� �������� " + (������ - a) + "�Դϴ�.");
							System.out.println("�Ҹ�Ǵ� mp�� " + 60 + "�Դϴ�.");
							System.out.printf("���� �÷��̾��� ���� mp�� %d / %d�Դϴ�.\n", this.mp, this.�ִ�mp);
							break;
						} else {
							System.out.println("���� mp�� �����ϴ�.");
							System.out.println("�ٽ� �����Ͻÿ�");
						}
					} else if (num == 3) {
						if (mp > 30) {
							������ = ���.��������(���ݷ�, ����);
							mp -= 90;
							�⺻�ѼҸ�.run();
							System.out.println("\n��������������������������������������������������������������������������������������������");
							System.out.println("�÷��̾��� �������� " + (������ - a) + "�Դϴ�.");
							System.out.println("�Ҹ�Ǵ� mp�� " + 90 + "�Դϴ�.");
							System.out.printf("���� �÷��̾��� ���� mp�� %d / %d�Դϴ�.\n", this.mp, this.�ִ�mp);
							break;
						} else {
							System.out.println("���� mp�� �����ϴ�.");
							System.out.println("�ٽ� �����Ͻÿ�");
						}
					}
					System.out.println("1. �Ϲ� ����");
					System.out.println("2. Ư�� ����");
					System.out.print("���� ������ ����� ���ÿ� : ");
					num = scanner.nextInt();
				}
		}
		return ������;
	}

	public void ���ݹޱ�(int a)// a�� �����ϴ� ������ ������
	{
		if (���� >= a) {
			hp = hp - 0;
			System.out.println("                                       �÷��̾��� ������ ���Ƽ� �������� ���� �ʽ��ϴ�.");

		} else {
			if (����.equals("�ų�")) // �ų� Ŭ������ ����Ȯ���� ������ ȸ��
			{
				int Ȯ�� = (int) (Math.random() * 11);
				if (Ȯ�� <= 3) {
					System.out.println("                                       �ų� Ŭ������ �нú�� ȸ���߽��ϴ�.");

				} else {
					hp = hp + ���� - a;
					if (hp <= 0) {
						hp = 0;
					}
					System.out.println("                                       �÷��̾�� " + (a - ����) + "�� �������� �޾ҽ��ϴ�.");
				}
			} else if (����.equals("�˻�"))// �˻� Ŭ������ ����Ȯ���� ������ ���� ����
			{
				int Ȯ�� = (int) (Math.random() * 11);
				if (Ȯ�� <= 7) {
					System.out.println("                                       �˻� Ŭ������ �нú�� �������� ������ ����߽��ϴ�.");
					hp = hp + (���� - a) / 2;
					if (hp <= 0) {
						hp = 0;
					}
					System.out
							.println("                                       �÷��̾�� " + (a - ����) / 2 + "�� �������� �޾ҽ��ϴ�.");
				} else {
					hp = hp + ���� - a;
					if (hp <= 0) {
						hp = 0;
					}
					System.out.println("                                       �÷��̾�� " + (a - ����) + "�� �������� �޾ҽ��ϴ�");
				}
			}
		}
		System.out.printf("                                       ���� �÷��̾��� ���� ü���� %d / %d�Դϴ�.\n", this.hp, this.�ִ�hp);
		System.out.println("\n                                   ��������������������������������������������������������������������������������������������");
	}

	public boolean ����() // ����ġ�µ� �����ϸ� ������������ ���ع���
	{
		int a = (int) (Math.random() * 2);
		if (a == 1) {
			System.out.println("������ ġ�µ� �����Ͽ���");
			return true;
		} else {
			System.out.println("������ ġ�µ� �����Ͽ���");
			System.out.println("50�� �������� �޾ҽ��ϴ�");
			hp -= 50;
			return false;

		}
	}
}
