package Game_0526;

import java.util.Scanner;

public class ���� {
	int HP���� = 100;
	int hp = 0;
	int MP���� = 150;
	int mp = 0;
	int ���԰� = 0;
	int ���Ź迭[] = new int[3];
	Scanner scanner = new Scanner(System.in);

	public void �Ǹ�() {
		System.out.println("\n\n");
		Music gold = new Music("�����Ҹ�.mp3", false);
		System.out.println("\n���忡 ������ �Ǹ��Ϸ��� �մϴ�.");
		System.out.println("\n(��簡 ���� ������ Ȯ���غ���)");
		MainGame.����1.���游�������̽�();
		System.out.println("\n\n");
		System.out.println("1. ����\t" + " 2. ��\t" + " 3. ��Ÿ\t" + " 4. ���ư���");
		System.out.print("\n��簡 �Ǹ��� ������ �������ּ��� : ");
		int �Ǹ� = scanner.nextInt();
		�Ǹ�: while (true) {
			if (�Ǹ� == 1) {
				if (MainGame.����1.��������Ž��("����")) {
					System.out.println("\n\n");
					System.out.println("����ȿ� �ִ� �������");
					MainGame.����1.���湫�����();
					gold.run();
				} else {
					System.out.println("\n\n");
					System.out.println("������ �����.");
				}
			} else if (�Ǹ� == 2) {
				if (MainGame.����1.��������Ž��("��")) {
					System.out.println("\n\n");
					System.out.println("����ȿ� �ִ� ����");
					MainGame.����1.��������();
					gold.run();
				} else {
					System.out.println("\n\n");
					System.out.println("������ �����.");
				}
			} else if (�Ǹ� == 3) {
				if (MainGame.����1.��������Ž��("��Ÿ")) {
					System.out.println("\n\n");
					if (MainGame.����1.��������Ž��("��Ÿ")) {
						System.out.println("����ȿ� �ִ� ��Ÿ�����۵��̴�");
						MainGame.����1.�����Ÿ���();
						gold.run();
					} else {
						System.out.println("\n\n");
						System.out.println("������ �����.");
					}
				} else {
					System.out.println("\n\n");
					System.out.println("������ �����.");
				}
			} else if (�Ǹ� == 4) {
				System.out.println("\n\n");
				System.out.println("�ڷ� ���ư��ϴ�.\n");
				break �Ǹ�;
			}
			System.out.println("\n\n");
			MainGame.����1.���游�������̽�();
			System.out.println("1. ����\t" + " 2. ��\t" + " 3. ��Ÿ\t" + " 4. ���ư���");
			System.out.print("���� �Ǹ��� ������ : ");
			�Ǹ� = scanner.nextInt();
		}
	}

	public int[] ���(int a) {
		System.out.println("\n\n");
		System.out.println("���忡�� ������ �����Ϸ��� �մϴ�.\n");
		System.out.println("���� �پ��� ���ǵ��� �ִ�.\n");
		System.out.println("\n1. hp����\t" + "2. mp����\t" + "3. ���ư���\n");
		System.out.print("\n���� ������ ������ : ");
		int ���� = scanner.nextInt();
		while (true) {
			if (���� == 1) {
				if (a > HP����) {
					hp += 1;
					a -= HP����;
					System.out.println("\n\n");
					System.out.println(HP���� + "��带 �����ϰ� hp������ 1�� �����߽��ϴ�.");
					System.out.println("����" + a + "��峲�ҽ��ϴ�.");
				} else {
					System.out.println("��尡 �����մϴ�.");
				}
			} else if (���� == 2) {
				if (a > MP����) {
					mp += 1;
					a -= MP����;
					System.out.println("\n\n");
					System.out.println(MP���� + "��带 �����ϰ� mp������ 1�� �����߽��ϴ�.");
					System.out.println("����" + a + "��峲�ҽ��ϴ�.");
				} else {
					System.out.println("\n\n");
					System.out.println("��尡 �����մϴ�.");
				}
			} else if (���� == 3) {
				System.out.println("\n\n");
				System.out.println("�ڷ� ���ư��ϴ�.");
				break;
			}
			System.out.println("\n\n");
			System.out.println("1. hp����\t" + "2. mp����\t" + "3. ���ư���");
			System.out.print("���� ������ ������ : ");
			���� = scanner.nextInt();
		}
		���Ź迭[0] = a;
		���Ź迭[1] = hp;
		���Ź迭[2] = mp;
		return ���Ź迭;
	}

	public void ��ȯ�ϱ�() {
		System.out.println("\n\n");
		System.out.println("���������� ����ǰ���� ������ ��ȯ�Ϸ��� �մϴ�.");
		��ȯ�ϱ�: while (true) {
			if (MainGame.����1.��������Ž��("��Ÿ")) {
				System.out.println("\n\n");
				System.out.println("����ȿ� �ִ� ��Ÿ���ǵ��̴�");
				MainGame.����1.����κ��������̽�("��Ÿ");
			} else {
				System.out.println("\n\n");
				System.out.println("�����״� ��ȯ�� ������ ���°� ����");
				break ��ȯ�ϱ�;
			}
			System.out.println("\n\n");
			System.out.println("���� ��ȯ�� �غ���?");
			if (MainGame.�÷��̾�.����.equals("�˻�")) {
				System.out.println("\n\n");
				System.out.println("1. ������ ��˰� �ܴ��� ���� (��ս��������� 1�� �ʿ��մϴ�.)\n");
				System.out.println("2. ������ ��˰� ��ο� ���� (������� ���� 1�� �� �񷽿�������1�� �ʿ��մϴ�.)\n");
				System.out.println("3. ���ư��� \n");
				int ��ȯ���� = scanner.nextInt();
				switch (��ȯ����) {
				case 1:
					if (MainGame.����1.����Ž��("��ս���������")) {
						MainGame.����1.��������("��ս���������");
						System.out.println("��ս����������� �ǳ��ݴϴ�.\n\n");
						MainGame.����1.����ֱ�("����", "�����Ѵ��", 0, 0, 90, 0, 700);
						MainGame.����1.����ֱ�("��", "�ܴ��ѹ���", 400, 400, 0, 40, 700);
					} else {
						System.out.println("������ �����ʽ��ϴ�.\n\n");
						System.out.println("�ٽ� Ȯ�����ּ���\n");
					}
					break;
				case 2:
					if ((MainGame.����1.����Ž��("������ǰ���")) && (MainGame.����1.����Ž��("�񷽿�������"))) {
						MainGame.����1.��������("������ǰ���");
						MainGame.����1.��������("�񷽿�������");
						System.out.println("������� ���װ� �񷽿��� ������ �ǳ��ݴϴ�.\n\n");
						MainGame.����1.����ֱ�("����", "�����´��", 0, 0, 250, 0, 1000);
						MainGame.����1.����ֱ�("��", "��ο����", 800, 800, 0, 80, 1000);
					} else {
						System.out.println("������ �����ʽ��ϴ�.\n\n");
						System.out.println("�ٽ� Ȯ�����ּ���\n");
					}
					break;
				case 3:
					System.out.println("�ڷ� ���ư��ϴ�\n\n");
					break ��ȯ�ϱ�;
				}
			} else if (MainGame.�÷��̾�.����.equals("�ų�")) {
				System.out.println("\n\n");
				System.out.println("1. ������ �����ð� �ܴ��� ���� (��ս���������1��)\n");
				System.out.println("2. ��ο� �����ð� ������ ���� (������� ����1�� �� ��������1��)\n");
				System.out.println("3. ���ư��� \n");
				int ��ȯ���� = scanner.nextInt();
				switch (��ȯ����) {
				case 1:
					if (MainGame.����1.����Ž��("��ս���������")) {
						MainGame.����1.��������("��ս���������");
						System.out.println("��ս����������� �ǳ��ݴϴ�.\n");
						MainGame.����1.����ֱ�("����", "�����Ѷ�����", 0, 0, 150, 0, 700);
						MainGame.����1.����ֱ�("��", "�ܴ�������", 200, 200, 0, 30, 700);
					} else {
						System.out.println("������ �����ʽ��ϴ�.\n");
						System.out.println("�ٽ� Ȯ�����ּ���\n");
					}
					break;
				case 2:
					if ((MainGame.����1.����Ž��("������ǰ���")) && (MainGame.����1.����Ž��("�񷽿�������"))) {
						MainGame.����1.��������("������ǰ���");
						MainGame.����1.��������("�񷽿�������");
						System.out.println("������� ���װ� �񷽿��� ������ �ǳ��ݴϴ�.\n");
						MainGame.����1.����ֱ�("����", "��ο������", 0, 0, 400, 0, 1000);
						MainGame.����1.����ֱ�("��", "����������", 400, 400, 0, 30, 1000);
					} else {
						System.out.println("������ �����ʽ��ϴ�.\n");
						System.out.println("�ٽ� Ȯ�����ּ���\n");
					}
					break;
				case 3:
					System.out.println("�ڷ� ���ư��ϴ�\n");
					break ��ȯ�ϱ�;
				}
			}
		} // ��ȯ�ϱ� ����
	}
}