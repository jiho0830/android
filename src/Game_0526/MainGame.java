package Game_0526;

import java.util.Scanner;

public class MainGame // ���������� ���� ����Ŭ����
{
	public static ��� �÷��̾�;
	public static ���� ����1;

	public static void main(String args[]) throws InterruptedException {
		/*
		 * ��漳��κ� ������� �Ϲݸ��Ϳ� �ʵ庸�����Ϳʹ� �ڵ����� �������Ϳ� �ʵ�ȿ���ο� ����Ŭ�������� String�迭�� �ƴ� Ŭ�����迭��
		 * ����
		 */

		System.out.print(" _   __        _         _      _   \n");
		System.out.print("| | / /       (_)       | |    | |  \n");
		System.out.print("| |/ /  _ __   _   __ _ | |__  | |_ \n");
		System.out.print("|    \\ | '_ \\ | | / _` || '_ \\ | __|\n");
		System.out.print("| |\\  \\| | | || || (_| || | | || |_ \n");
		System.out.print("\\_| \\_/|_| |_||_| \\__, ||_| |_| \\__|\n");
		System.out.print("                   __/ |            \n");
		System.out.print("                  |___/             \n");
		�ð��ȳ� �ð��ȳ� = new �ð��ȳ�();
		�ð��ȳ�.start();
		Music gold = new Music("�����Ҹ�.mp3", false);
		Music ������ = new Music("������ȹ��.mp3", false);
		Music outintro = new Music("��Ʈ�����ǹ��.mp3", true);
		Scanner scanner = new Scanner(System.in);
		�÷��̾� = new ���(3000, 1000, 1, 300, 0, "", 0, 1000);
		// ������� hp,mp,����,���ݷ�,����,����,����ġ,��
		// ���� - ����������,�̸�,hp,�ִ�hp,���ݷ�,����.���
		int[] ���屸�Ź迭;// ���Ǳ���Ȯ���� ���� �迭
		����1 = new ����();
		outintro.start();
		String ��¹� = ("  [             ��� �̾߱�                ]\n\n" + "  ���� ���� ���� �� ������ ������� �������� �����ϴ� ������ ��Ҿ��.\n\n"
				+ "  �׷��ٰ� ����� ������ �ڽ��� ������ ���� ������� ������ ��ſ� �ϴ� ����� ���� �Ǵµ�\n\n"
				+ "  ������ �ڱ⸸ ���� ������ ���� ������� ���ٰ� �׸� �ɼ��� ����, \n\n" + "  ������ ������ ģ����� ���� ���� ������� �������� �����߾��.\n\n"
				+ "  ���� ������� ���հ� ������ ģ���� ������ ������ ����� ���ϰ� �Ǵµ� \n\n" + "  �̶� �쿬�� ��ó�� �������� ������ ������ ã�ƿԾ��.\n\n"
				+ "  ���հ� ������ ģ���� ������ ������ ����� ���ϴ� ������� ����\n\n" + "  ��簡 ���� ���հ� ������ ģ������ ȥ���ְ� ������ �ٽ� �����Ϸ��� �մϴ�.\n\n"
				+ "  �� ����� �̸��� : ");
		����Ÿ���� Ÿ���� = new ����Ÿ����(��¹�, 15);
		Ÿ����.start();
		// ��񰡹� ��񰡹� = new ��񰡹�();
		// ���� ���۽� �̸��� ����
		�÷��̾�.�̸� = scanner.next();
		System.out.printf("\n\n  " + �÷��̾�.�̸� + " ����� ������ �������ּ���.\n");
		System.out.println("\n  1. �˻�\n" + "   (�˻�� ���� Ȯ���� �ǰݽ� �������� �Ϻκ��� ����Ѵ�.)\n" + "   (ü�°� ������ �߰��˴ϴ�.)\n");
		System.out.println("\n  2. �ų�\n" + "   (�ųʴ� ���� Ȯ���� �ǰݽ� �������� ȸ���Ѵ�.)\n" + "   (���ݷ��� �߰��˴ϴ�.)\n");
		��� ��� = new ���();
		���� ���� = new ����();
		������ ������ = new ������();
		��ź���� ��ź���� = new ��ź����();
		�����Ѵ�� �����Ѵ�� = new �����Ѵ��();
		�ܴ��ѹ��� �ܴ��ѹ��� = new �ܴ��ѹ���();
		�����Ѷ����� �����Ѷ����� = new �����Ѷ�����();
		�ܴ������� �ܴ������� = new �ܴ�������();
		�����´�� �����´�� = new �����´��();
		��ο���� ��ο���� = new ��ο����();
		��ο������ ��ο������ = new ��ο������();
		���������� ���������� = new ����������();
		System.out.print("\n  ������ ������ :  ");
		int num = scanner.nextInt();

		if (num == 1) {
			�÷��̾�.���� = "�˻�";
			System.out.println("\n  " + �÷��̾�.���� + " �Դϴ�.\n");
			�÷��̾�.hp += 200;
			�÷��̾�.�ִ�hp += 200;
			�÷��̾�.���� += 10;
			Thread.sleep(700);
			System.out.println("\n  ��˰� ���а� ���޵˴ϴ�.\n\n");
			����1.����ֱ�(���.����������, ���.�������̸�, ���.hp, ���.�ִ�hp, ���.���ݷ�, ���.����, ���.���);
			Thread.sleep(700);
			����1.����ֱ�(����.����������, ����.�������̸�, ����.hp, ����.�ִ�hp, ����.���ݷ�, ����.����, ����.���);
			Thread.sleep(700);
		} else if (num == 2) {
			�÷��̾�.���� = "�ų�";
			System.out.println("\n  " + �÷��̾�.���� + " �Դϴ�.\n");
			�÷��̾�.���ݷ� += 50;
			Thread.sleep(700);
			System.out.println("\n  �����ð� ��ź������ ���޵˴ϴ�.\n\n");
			����1.����ֱ�(������.����������, ������.�������̸�, ������.hp, ������.�ִ�hp, ������.���ݷ�, ������.����, ������.���);
			Thread.sleep(700);
			����1.����ֱ�(��ź����.����������, ��ź����.�������̸�, ��ź����.hp, ��ź����.�ִ�hp, ��ź����.���ݷ�, ��ź����.����, ��ź����.���);
			Thread.sleep(700);
		}
		System.out.println("������ �̵��ϰڽ��ϴ�.\n");
		Thread.sleep(700);
		outintro.close();
		game: while (true) {
			System.out.println("��ø� ��ٷ��ּ���.\n");
			��¹� = ("��������������������������������������������������������������������������������������������(����)");
			Music intromu = new Music("��Ʈ������2.mp3", true);
			intromu.start();
			Ÿ���� = new ����Ÿ����(��¹�, 50);
			Ÿ����.start();
			�ε�â��⿭ �ε�â��⿭ = new �ε�â��⿭();
			�ε�â��⿭.start();
			// �̵��� ���
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n������ ������ �߽��ϴ�.\n");
			System.out.println("���� �̵��� ��Ҹ� ����ּ���\n");
			System.out.println("1. �����ʵ�\n");
			System.out.println("2. ����\n");
			System.out.println("3. ���� ����â\n");
			System.out.print("���� �̵��� ��Ҹ� ������ �ּ��� : ");
			int ��� = scanner.nextInt();
			if (��� == 1) // �����
			{
				intromu.close();// ��Ʈ�� ��������
				Music battle = new Music("�Ϲ���������.mp3", true);// �������������
				battle.start();
				battle: while (true) // ��ɹݺ���
				{
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					����1.����κ��������̽�("��Ÿ");
					System.out.println("�����ʵ�� �̵��մϴ�.\n");
					System.out.println("�ʵ�� 4���� �ֽ��ϴ�.\n");
					System.out.println("1. ����\n");
					System.out.println("2. �и�(�ܰ�1�����ʿ�)\n");
					System.out.println("3. ���(�ܰ�2�����ʿ�)\n");
					System.out.println("4. ���ռ�(�ܰ�1,2,3�����ʿ�)\n");
					System.out.println("5. ���ư���\n");
					System.out.print("���� �̵��� �ʵ带 ������ �ּ��� : ");
					int ����� = scanner.nextInt();
					if (����� == 1) // 1�ܰ� �����
					{
						System.out.println("\n\n");
						System.out.println("������ ������ �߽��ϴ�\n");
						System.out.println("�������� �Ϲݸ��Ϳ� �ʵ庸���� �ִ�.\n");
						System.out.println("1. �Ϲݸ���\n");
						System.out.println("2. ����\n");
						System.out.print("�������� ��� ����? : ");
						����� = scanner.nextInt();
						if (����� == 1) // 1�ܰ��ʵ忡�� �Ϲݸ���
						{
							������ ������ = new ������();
							System.out.println("\n\n");
							System.out.println("�������� " + ������.�̸� + "�� ��Ÿ����.");
							������.start();// ������ �ڵ�����
							while (�÷��̾�.hp > 0) {
								System.out.println("1. �����ϱ�\t" + "2. ��������\t" + "3. ����");
								System.out.print("����� �ൿ�� : ");
								if (�÷��̾�.hp > 0)
									num = scanner.nextInt();
								{
									if (num == 1) {
										�÷��̾�.����(������.����);
										������.���ݹޱ�(�÷��̾�.������);
										if (������.hp <= 0) {
											������.stop(true);
											System.out.println("\n\n");
											System.out.println("�������� �����߽��ϴ�.\n");
											Thread.sleep(800);
											������.�����(�÷��̾�.����);
											�÷��̾�.����ġ += ������.����ġ;
											System.out.println(������.����ġ + "��ŭ�� ����ġ�� �ö����ϴ�.\n");
											Thread.sleep(800);
											�÷��̾�.��� += ������.���;
											System.out.println(������.��� + "��ŭ�� ��尡 �ö����ϴ�.\n");
											gold.start();
											Thread.sleep(800);
											break;
										}
									} else if (num == 2) {
										if (�÷��̾�.����() == true) {
											������.stop(true);
											break;
										}
									} else if (num == 3) {
										����1.���ǰ����������̽�();
										System.out.println("\n ������ ������.");
										System.out.println("1. hp\t" + "2. mp");
										System.out.print("���� ����� ���� : ");
										int z = scanner.nextInt();
										if (z == 1) //// hp���� ���� �� hpȸ���� ���� ���ǰ���
										{
											if (����1.���ǰ���[0] > 0) {
												System.out.println("\nhp������ ����մϴ�");
												����1.���ǰ���[0] -= 1;
												�÷��̾�.hp += 50;
												if (�÷��̾�.hp > �÷��̾�.�ִ�hp) {
													�÷��̾�.hp = �÷��̾�.�ִ�hp;
												}
												System.out.println("hp�� �����߽��ϴ�.");
												System.out.println("�÷��̾��� hp�� " + �÷��̾�.hp + "�Դϴ�.");
												System.out.println("���� hp������ ������ " + ����1.���ǰ���[0] + "�� �Դϴ�.");
											} else {
												System.out.println("hp������ �����ϴ�.");
											}

										} else if (z == 2) // mp���� ���� �� mpȸ���� ���� ���ǰ���
										{

											if (����1.���ǰ���[1] > 0) {
												System.out.println("\nmp������ ����մϴ�");
												����1.���ǰ���[1] -= 1;
												�÷��̾�.mp += 50;
												if (�÷��̾�.mp > �÷��̾�.�ִ�mp) {
													�÷��̾�.mp = �÷��̾�.�ִ�mp;
												}
												System.out.println("mp��  �����߽��ϴ�.");
												System.out.println("�÷��̾��� mp�� " + �÷��̾�.mp + "�Դϴ�.");
												System.out.println("���� mp������ ������ " + ����1.���ǰ���[1] + "�� �Դϴ�.");
											} else {
												System.out.println("mp������ �����ϴ�.");
											}
										}
									} //
								}
							}
						} else if (����� == 2)// 1�ܰ��ʵ忡�� ��������
						{
							��ս����� ��ս����� = new ��ս�����();
							// �����ʵ�ȿ�� �ʵ�ȿ��1 = new �����ʵ�ȿ��(50);
							System.out.println("\n\n");
							System.out.println("\n������ ����" + ��ս�����.�̸� + "�� ��Ÿ����.");
							// �ʵ�ȿ��1.start();// ���� �ʵ�ȿ��
							��ս�����.start();// �ڵ�����
							boolean ������Ư���ɷ� = true;
							while (true) {
								if ((������Ư���ɷ� == true) && (��ս�����.hp < ��ս�����.�ִ�hp / 2)) {
									��ս�����.Ư���ɷ�(��ս�����.���ݷ�);
									������Ư���ɷ� = false;
								}
								if (�÷��̾�.hp <= 0) {
									��ս�����.stop(true);
									// �ʵ�ȿ��1.stop(true);
									System.out.println("�÷��̾ �׾����ϴ�.");
									�÷��̾�.hp = 1;
									System.out.println("�÷��̾�� hp�� 1�� ��Ȱ�մϴ�.");
									System.out.println("������ ���ư��ϴ�.");
									System.out.println("������ �̵����Դϴ�.\n");
									battle.close();
									break battle;
								}
								System.out.println("1. �����ϱ�\t" + "2. ��������    3. ����\n");
								System.out.print("���� �ൿ�� : ");
								num = scanner.nextInt();
								if (num == 1) {
									�÷��̾�.����(��ս�����.����);
									��ս�����.�������ݹޱ�(�÷��̾�.������);
									if (��ս�����.hp <= 0) {
										��ս�����.stop(true);
										// �ʵ�ȿ��1.stop(true);
										System.out.println("������ ��ս������� �����߽��ϴ�.\n");
										�÷��̾�.����ġ += ��ս�����.����ġ;
										System.out.println(��ս�����.����ġ + "��ŭ�� ����ġ�� �ö����ϴ�.\n");
										Thread.sleep(800);
										�÷��̾�.��� += ��ս�����.���;
										System.out.println(��ս�����.��� + "��ŭ�� ��尡 �ö����ϴ�.\n");
										gold.run();
										Thread.sleep(800);
										if (����1.����Ž��(��ս�����.���������) == false) // �ش翭�谡 ������ ���̻� ���踦 ������ ����
										{
											�ܰ�1���� �ܰ�1���� = new �ܰ�1����();
											������.run();
											����1.����ֱ�(�ܰ�1����.����������, �ܰ�1����.�������̸�, 0, 0, 0, 0, �ܰ�1����.���);
											Thread.sleep(800);
										}
										����1.����ֱ�("��Ÿ", ��ս�����.�Ǹž�����, 0, 0, 0, 0, 600);
										Thread.sleep(1000);
										break;
									}
								} else if (num == 2) {
									if (�÷��̾�.����() == true) {
										��ս�����.stop(true);
										// �ʵ�ȿ��1.stop(true);
										break;
									}
								} else if (num == 3) {
									����1.���ǰ����������̽�();
									System.out.println("\n ������ ������.");
									System.out.println("1. hp\t" + "2. mp");
									System.out.print("���� ����� ���� : ");
									int z = scanner.nextInt();
									if (z == 1) //// hp���� ���� �� hpȸ���� ���� ���ǰ���
									{
										if (����1.���ǰ���[0] > 0) {
											System.out.println("\nhp������ ����մϴ�");
											����1.���ǰ���[0] -= 1;
											�÷��̾�.hp += 50;
											if (�÷��̾�.hp > �÷��̾�.�ִ�hp) {
												�÷��̾�.hp = �÷��̾�.�ִ�hp;
											}
											System.out.println("hp�� �����߽��ϴ�.");
											System.out.println("�÷��̾��� hp�� " + �÷��̾�.hp + "�Դϴ�.");
											System.out.println("���� hp������ ������ " + ����1.���ǰ���[0] + "�� �Դϴ�.");
										} else {
											System.out.println("hp������ �����ϴ�.");
										}

									} else if (z == 2) // mp���� ���� �� mpȸ���� ���� ���ǰ���
									{

										if (����1.���ǰ���[1] > 0) {
											System.out.println("\nmp������ ����մϴ�");
											����1.���ǰ���[1] -= 1;
											�÷��̾�.mp += 50;
											if (�÷��̾�.mp > �÷��̾�.�ִ�mp) {
												�÷��̾�.mp = �÷��̾�.�ִ�mp;
											}
											System.out.println("mp��  �����߽��ϴ�.");
											System.out.println("�÷��̾��� mp�� " + �÷��̾�.mp + "�Դϴ�.");
											System.out.println("���� mp������ ������ " + ����1.���ǰ���[1] + "�� �Դϴ�.");
										} else {
											System.out.println("mp������ �����ϴ�.");
										}
									}
								}
							}
						}
					} else if (����� == 2)// 2�ܰ� ����ʵ�
					{
						System.out.println("\n\n");
						System.out.println("�и� ����� ������ ���� ���谡 �ʿ��մϴ�.\n");
						Thread.sleep(1000);
						if (����1.����Ž��("�ܰ�1����") == true) {
							System.out.println("������ �����Ǿ����ϴ�.\n");
							System.out.println("�и��� ������ �߽��ϴ�.\n");
							System.out.println("�и����� �Ϲݸ��Ϳ� �ʵ庸���� �ֽ��ϴ�.\n");
							System.out.println("1. �Ϲݸ���");
							System.out.println("2. ����");
							System.out.print("�и����� ��� ����? : ");
							����� = scanner.nextInt();
							if (����� == 1) // 2�ܰ��ʵ忡�� �Ϲݸ���
							{
								���� ���� = new ����();
								System.out.println("\n\n");
								System.out.println("�߻���" + ����.�̸� + "�� ��Ÿ����.");
								����.start();// ���� �ڵ�����
								while (true) {
									if (�÷��̾�.hp <= 0) {
										����.stop(true);
										System.out.println("�÷��̾ �׾����ϴ�.");
										�÷��̾�.hp = 1;
										System.out.println("�÷��̾�� hp�� 1�� ��Ȱ�մϴ�.");
										System.out.println("������ ���ư��ϴ�.");
										System.out.println("������ �̵����Դϴ�.\n");
										battle.close();
										break battle;
									}
									System.out.println("1. �����ϱ�\t" + "2. ��������\t" + "3. ����");
									System.out.print("���� �ൿ�� : ");
									num = scanner.nextInt();
									{
										if (num == 1) {
											�÷��̾�.����(����.����);
											����.���ݹޱ�(�÷��̾�.������);
											if (����.hp <= 0) {
												����.stop(true);
												System.out.println("���밡 �����߽��ϴ�.\n");
												����.�����(�÷��̾�.����);
												�÷��̾�.����ġ += ����.����ġ;
												System.out.println(����.����ġ + "��ŭ�� ����ġ�� �ö����ϴ�.\n");
												Thread.sleep(800);
												�÷��̾�.��� += ����.���;
												System.out.println(����.��� + "��ŭ�� ��尡 �ö����ϴ�.\n");
												gold.start();
												Thread.sleep(800);
												break;
											}
										} else if (num == 2) {
											if (�÷��̾�.����() == true) {
												����.stop(true);
												break;
											}
										} else if (num == 3) {

											����1.���ǰ����������̽�();
											System.out.println("���� ����� ������ ���ÿ�.");
											System.out.println("1. hp\t" + "2. mp");
											System.out.print("���� ����� ���� : ");
											int z = scanner.nextInt();
											if (z == 1) //// hp���� ���� �� hpȸ���� ���� ���ǰ���
											{
												System.out.println("\nhp������ ����մϴ�");
												if (����1.���ǰ���[0] > 0) {
													����1.���ǰ���[0] -= 1;
													�÷��̾�.hp += 50;
													if (�÷��̾�.hp > �÷��̾�.�ִ�hp) {
														�÷��̾�.hp = �÷��̾�.�ִ�hp;
													}
													System.out.println("hp�� �����߽��ϴ�.");
													System.out.println("�÷��̾��� hp�� " + �÷��̾�.hp + "�Դϴ�.");
													System.out.println("���� hp������ ������ " + ����1.���ǰ���[0] + "�� �Դϴ�.");
												} else {
													System.out.println("hp������ �����ϴ�.");
												}

											} else if (z == 2) // mp���� ���� �� mpȸ���� ���� ���ǰ���
											{
												System.out.println("\nmp������ ����մϴ�");
												if (����1.���ǰ���[1] > 0) {
													����1.���ǰ���[1] -= 1;
													�÷��̾�.mp += 50;
													if (�÷��̾�.mp > �÷��̾�.�ִ�mp) {
														�÷��̾�.mp = �÷��̾�.�ִ�mp;
													}
													System.out.println("mp��  �����߽��ϴ�.");
													System.out.println("�÷��̾��� mp�� " + �÷��̾�.mp + "�Դϴ�.");
													System.out.println("���� mp������ ������ " + ����1.���ǰ���[1] + "�� �Դϴ�.");
												} else {
													System.out.println("mp������ �����ϴ�.");
												}
											}
											System.out.println();
										}
									}
								}
							} else if (����� == 2) // 2�ܰ��ʵ忡�� ��������
							{
								System.out.println("\n\n");
								����� ����� = new �����();
								// �����ʵ�ȿ�� �ʵ�ȿ��2 = new �����ʵ�ȿ��(70);
								System.out.println("�и��� ����" + �����.�̸� + "�� ��Ÿ����.");
								�����.start();
								// �ʵ�ȿ��2.start();
								int ��������Ƚ�� = 0;
								while (true) {
									if (��������Ƚ�� == 3) {
										�����.������ = �����.Ư���ɷ�(�����.���ݷ�, �÷��̾�.����);
										�÷��̾�.���ݹޱ�(�����.������);
										��������Ƚ�� = 0;
									}
									if (�÷��̾�.hp <= 0) {
										�����.stop(true);
										// �ʵ�ȿ��2.stop(true);
										System.out.println("�÷��̾ �׾����ϴ�.");
										�÷��̾�.hp = 1;
										System.out.println("�÷��̾�� hp�� 1�� ��Ȱ�մϴ�.");
										System.out.println("������ ���ư��ϴ�.");
										System.out.println("������ �̵����Դϴ�.\n");
										battle.close();
										break battle;
									}
									System.out.println("1. �����ϱ�\t" + "2. ��������    3. ����");
									System.out.print("���� �ൿ�� : ");
									num = scanner.nextInt();
									if (num == 1) {
										��������Ƚ�� += 1;
										�÷��̾�.����(�����.����);
										�����.�������ݹޱ�(�÷��̾�.������);
										if (�����.hp <= 0) {
											�����.stop(true);
											// �ʵ�ȿ��2.stop(true);
											System.out.println("�и��� ������� �����߽��ϴ�.\n");
											�÷��̾�.����ġ += �����.����ġ;
											System.out.println(�����.����ġ + "��ŭ�� ����ġ�� �ö����ϴ�.\n");
											Thread.sleep(700);
											�÷��̾�.��� += �����.���;
											System.out.println(�����.��� + "��ŭ�� ��尡 �ö����ϴ�.\n");
											gold.run();
											Thread.sleep(700);
											if (����1.����Ž��(�����.���������) == false) // �ش翭�谡 ������ ���̻� ���踦 ������ ����
											{
												�ܰ�2���� �ܰ�2���� = new �ܰ�2����();
												������.run();
												����1.����ֱ�(�ܰ�2����.����������, �ܰ�2����.�������̸�, 0, 0, 0, 0, �ܰ�2����.���);
												Thread.sleep(700);
											}
											����1.����ֱ�("��Ÿ", �����.�Ǹž�����, 0, 0, 0, 0, 800);
											Thread.sleep(800);
											������.run();
											break;
										}
									} else if (num == 2) {
										if (�÷��̾�.����() == true) {
											�����.stop(true);
											// �ʵ�ȿ��2.stop(true);
											break;
										}
									} else if (num == 3) {

										����1.���ǰ����������̽�();
										System.out.println("���� ����� ������ ���ÿ�.");
										System.out.println("1. hp\t" + "2. mp");
										System.out.print("���� ����� ���� : ");
										int z = scanner.nextInt();
										if (z == 1) //// hp���� ���� �� hpȸ���� ���� ���ǰ���
										{
											System.out.println("\nhp������ ����մϴ�");
											if (����1.���ǰ���[0] > 0) {
												����1.���ǰ���[0] -= 1;
												�÷��̾�.hp += 50;
												if (�÷��̾�.hp > �÷��̾�.�ִ�hp) {
													�÷��̾�.hp = �÷��̾�.�ִ�hp;
												}
												System.out.println("hp�� �����߽��ϴ�.");
												System.out.println("�÷��̾��� hp�� " + �÷��̾�.hp + "�Դϴ�.");
												System.out.println("���� hp������ ������ " + ����1.���ǰ���[0] + "�� �Դϴ�.");
											} else {
												System.out.println("hp������ �����ϴ�.");
											}

										} else if (z == 2) // mp���� ���� �� mpȸ���� ���� ���ǰ���
										{
											System.out.println("\nmp������ ����մϴ�");
											if (����1.���ǰ���[1] > 0) {
												����1.���ǰ���[1] -= 1;
												�÷��̾�.mp += 50;
												if (�÷��̾�.mp > �÷��̾�.�ִ�mp) {
													�÷��̾�.mp = �÷��̾�.�ִ�mp;
												}
												System.out.println("mp��  �����߽��ϴ�.");
												System.out.println("�÷��̾��� mp�� " + �÷��̾�.mp + "�Դϴ�.");
												System.out.println("���� mp������ ������ " + ����1.���ǰ���[1] + "�� �Դϴ�.");
											} else {
												System.out.println("mp������ �����ϴ�.");
											}
										}
										System.out.println();
									}
								}
							}
						} else {
							System.out.println("������ �������� �ʽ��ϴ�.");
							System.out.println("������ ���ư��ϴ�.");
							System.out.println("������ �̵����Դϴ�.\n");
							battle.close();
							break battle;
						}
					} else if (����� == 3) // 3�ܰ����ʵ�
					{
						System.out.println("\n\n");
						System.out.println("��� �ʵ� ����� �и��� ���� ���谡 �ʿ��մϴ�.\n");
						Thread.sleep(1000);
						if (����1.����Ž��(�����.���������) == true) {
							System.out.println("������ �����Ǿ����ϴ�.");
							System.out.println("����� ������ �߽��ϴ�");
							System.out.println("������� �Ϲݸ��Ϳ� �ʵ庸���� �ִ�.\n");
							System.out.println("1. �Ϲݸ���");
							System.out.println("2. ����");
							System.out.print("������� ��������� ����? : ");
							����� = scanner.nextInt();
							if (����� == 1) // 3�ܰ��ʵ忡�� �Ϲݸ���
							{
								System.out.println("\n\n");
								�� �� = new ��();
								System.out.println("�߻���" + ��.�̸� + "�� ��Ÿ����.");
								��.start();
								while (true) {
									if (�÷��̾�.hp <= 0) {
										��.stop(true);
										System.out.println("�÷��̾ �׾����ϴ�.");
										�÷��̾�.hp = 1;
										System.out.println("�÷��̾�� hp�� 1�� ��Ȱ�մϴ�.");
										System.out.println("������ ���ư��ϴ�.");
										System.out.println("������ �̵����Դϴ�.\n");
										battle.close();
										break battle;
									}
									System.out.println("1. �����ϱ�\t" + "2. ��������\t" + "3. ����");
									System.out.print("���� �ൿ�� : ");
									num = scanner.nextInt();
									{
										if (num == 1) {
											�÷��̾�.����(��.����);
											��.���ݹޱ�(�÷��̾�.������);
											if (��.hp <= 0) {
												��.stop(true);
												System.out.println("���� �����߽��ϴ�.\n");
												��.�����(�÷��̾�.����);
												�÷��̾�.����ġ += ��.����ġ;
												System.out.println(��.����ġ + "��ŭ�� ����ġ�� �ö����ϴ�.\n");
												Thread.sleep(800);
												�÷��̾�.��� += ��.���;
												System.out.println(��.��� + "��ŭ�� ��尡 �ö����ϴ�.\n");
												gold.run();
												Thread.sleep(800);
												break;
											}
										} else if (num == 2) {
											if (�÷��̾�.����() == true) {
												��.stop(true);
												break;
											}
										} else if (num == 3) {
											����1.���ǰ����������̽�();
											System.out.println("���� ����� ������ ���ÿ�.");
											System.out.println("1. hp\t" + "2. mp");
											System.out.print("���� ����� ���� : ");
											int z = scanner.nextInt();
											if (z == 1) //// hp���� ���� �� hpȸ���� ���� ���ǰ���
											{
												System.out.println("hp������ ����մϴ�");
												if (����1.���ǰ���[0] > 0) {
													����1.���ǰ���[0] -= 1;
													�÷��̾�.hp += 50;
													if (�÷��̾�.hp > �÷��̾�.�ִ�hp) {
														�÷��̾�.hp = �÷��̾�.�ִ�hp;
													}
													System.out.println("hp�� �����߽��ϴ�.");
													System.out.println("�÷��̾��� hp�� " + �÷��̾�.hp + "�Դϴ�.");
													System.out.println("���� hp������ ������ " + ����1.���ǰ���[0] + "�� �Դϴ�.");
												} else {
													System.out.println("hp������ �����ϴ�.");
												}

											} else if (z == 2) // mp���� ���� �� mpȸ���� ���� ���ǰ���
											{
												System.out.println("mp������ ����մϴ�");
												if (����1.���ǰ���[1] > 0) {
													����1.���ǰ���[1] -= 1;
													�÷��̾�.mp += 50;
													if (�÷��̾�.mp > �÷��̾�.�ִ�mp) {
														�÷��̾�.mp = �÷��̾�.�ִ�mp;
													}
													System.out.println("mp��  �����߽��ϴ�.");
													System.out.println("�÷��̾��� mp�� " + �÷��̾�.mp + "�Դϴ�.");
													System.out.println("���� mp������ ������ " + ����1.���ǰ���[1] + "�� �Դϴ�.");
												} else {
													System.out.println("mp������ �����ϴ�.");
												}
											}
											System.out.println();
										}
									}
								}
							} else if (����� == 2) // 3�ܰ��ʵ忡�� ��������
							{
								System.out.println("\n\n");
								�񷽿� �񷽿� = new �񷽿�();
								// �����ʵ�ȿ�� �ʵ�ȿ��3 = new �����ʵ�ȿ��(80);
								System.out.println("����� ����" + �񷽿�.�̸� + "�� ��Ÿ����.");
								�񷽿�.start();
								// �ʵ�ȿ��3.start();
								int ��������Ƚ�� = 0;
								while (true) {
									if (��������Ƚ�� >= 3) {
										�񷽿�.������ = �񷽿�.Ư���ɷ�(�񷽿�.���ݷ�, �÷��̾�.����);
										�÷��̾�.���ݹޱ�(�񷽿�.������);
										��������Ƚ�� = 0;
									}
									if (�÷��̾�.hp <= 0) {
										�񷽿�.stop(true);
										// �ʵ�ȿ��3.stop(true);
										System.out.println("�÷��̾ �׾����ϴ�.");
										�÷��̾�.hp = 1;
										System.out.println("�÷��̾�� hp�� 1�� ��Ȱ�մϴ�.");
										System.out.println("������ ���ư��ϴ�.");
										System.out.println("������ �̵����Դϴ�.\n");
										battle.close();
										break battle;
									}
									System.out.println("1. �����ϱ�\t" + "2. ��������    3.����");
									System.out.print("���� �ൿ�� : ");
									num = scanner.nextInt();
									if (num == 1) {
										��������Ƚ�� += 1;
										�÷��̾�.����(�񷽿�.����);
										�񷽿�.�������ݹޱ�(�÷��̾�.������);
										if (�񷽿�.hp <= 0) {
											�񷽿�.stop(true);
											// �ʵ�ȿ��3.stop(true);
											System.out.println("����� �񷽿��� �����߽��ϴ�.\n");
											�÷��̾�.����ġ += �񷽿�.����ġ;
											System.out.println(�񷽿�.����ġ + "��ŭ�� ����ġ�� �ö����ϴ�.\n");
											Thread.sleep(800);
											�÷��̾�.��� += �񷽿�.���;
											System.out.println(�񷽿�.��� + "��ŭ�� ��尡 �ö����ϴ�.\n");
											gold.run();
											Thread.sleep(800);
											if (����1.����Ž��(�񷽿�.���������) == false) // �ش翭�谡 ������ ���̻� ���踦 ������ ����
											{
												�ܰ�3���� �ܰ�3���� = new �ܰ�3����();
												������.run();
												����1.����ֱ�(�ܰ�3����.����������, �ܰ�3����.�������̸�, 0, 0, 0, 0, �ܰ�3����.���);
												Thread.sleep(800);
											}
											����1.����ֱ�("��Ÿ", �񷽿�.�Ǹž�����, 0, 0, 0, 0, 800);
											Thread.sleep(800);
											������.run();
											break;
										}
									} else if (num == 2) {
										if (�÷��̾�.����() == true) {
											�񷽿�.stop(true);
											// �ʵ�ȿ��3.stop(true);
											break;
										}
									} else if (num == 3) {

										����1.���ǰ����������̽�();
										System.out.println("���� ����� ������ ���ÿ�.");
										System.out.println("1. hp\t" + "2. mp");
										System.out.print("���� ����� ���� : ");
										int z = scanner.nextInt();
										if (z == 1) //// hp���� ���� �� hpȸ���� ���� ���ǰ���
										{
											System.out.println("\nhp������ ����մϴ�");
											if (����1.���ǰ���[0] > 0) {
												����1.���ǰ���[0] -= 1;
												�÷��̾�.hp += 50;
												if (�÷��̾�.hp > �÷��̾�.�ִ�hp) {
													�÷��̾�.hp = �÷��̾�.�ִ�hp;
												}
												System.out.println("hp�� �����߽��ϴ�.");
												System.out.println("�÷��̾��� hp�� " + �÷��̾�.hp + "�Դϴ�.");
												System.out.println("���� hp������ ������ " + ����1.���ǰ���[0] + "�� �Դϴ�.");
											} else {
												System.out.println("hp������ �����ϴ�.");
											}

										} else if (z == 2) // mp���� ���� �� mpȸ���� ���� ���ǰ���
										{
											System.out.println("\nmp������ ����մϴ�");
											if (����1.���ǰ���[1] > 0) {
												����1.���ǰ���[1] -= 1;
												�÷��̾�.mp += 50;
												if (�÷��̾�.mp > �÷��̾�.�ִ�mp) {
													�÷��̾�.mp = �÷��̾�.�ִ�mp;
												}
												System.out.println("mp��  �����߽��ϴ�.");
												System.out.println("�÷��̾��� mp�� " + �÷��̾�.mp + "�Դϴ�.");
												System.out.println("���� mp������ ������ " + ����1.���ǰ���[1] + "�� �Դϴ�.");
											} else {
												System.out.println("mp������ �����ϴ�.");
											}
										}
										System.out.println();
									}
								}
							}
						} else {
							System.out.println("������ �������� �ʽ��ϴ�.\n");
							System.out.println("������ ���ư��ϴ�.\n");
							System.out.println("������ �̵����Դϴ�.\n");
							battle.close();
							break battle;
						}
					} else if (����� == 4) // ���ռ�
					{
						System.out.println("\n\n\n\n");
						System.out.println("���ռ��� ����ִ�\n");
						System.out.println("���谡 3�� �ʿ��� ���δ�.\n");
						Thread.sleep(1000);
						// if (����1.����Ž��(�񷽿�.���������) == ����1.����Ž��(�����.���������) == ����1.����Ž��(��ս�����.���������) ==
						// true)
						if (����1.����Ž��(��ս�����.���������) == true) {
							battle.close();
							Music �������� = new Music("��������.mp3", true);
							��������.start();
							����1.��������(��ս�����.���������);
							// ����1.��������(�����.���������);
							// ����1.��������(�񷽿�.���������);
							Thread.sleep(1000);
							System.out.println("1�ܰ迭�踦 ����մϴ�.\n");
							Thread.sleep(1000);
							System.out.println("2�ܰ迭�踦 ����մϴ�.\n");
							Thread.sleep(1000);
							System.out.println("3�ܰ迭�踦 ����մϴ�.\n");
							Thread.sleep(1000);
							System.out.println("���ռ����� �����մϴ�.\n\n\n\n");
							�������� �������� = new ��������();
							System.out.println("������ �������� " + ��������.�̸� + "�� ��Ÿ����.");
							String ���մ�� = ("�� ģ������ �������� �͵� ���߶� ������� ���ٴ� ���� �ȵΰڴ�(����)");
							����Ÿ���� �������� = new ����Ÿ����(���մ��, 50);
							��������.start();
							�ε�â��⿭ ���մ�⿭ = new �ε�â��⿭();
							���մ�⿭.start();
							// ���������ʵ�ȿ�� ����ȿ�� = new ���������ʵ�ȿ��(100);
							// ����ȿ��.start();
							int ��������Ƚ�� = 0;
							��������.start();
							while (true) {
								if (��������Ƚ�� >= 3) {
									��������.������ = ��������.Ư���ɷ�(��������.���ݷ�, �÷��̾�.����);
									�÷��̾�.���ݹޱ�(��������.������);
									��������Ƚ�� = 0;
								}
								if (�÷��̾�.hp <= 0) {
									// ����ȿ��.stop(true);
									��������.stop(true);
									��������.close();
									System.out.println("�÷��̾ �׾����ϴ�.");
									�÷��̾�.hp = 1;
									System.out.println("�÷��̾�� hp�� 1�� ��Ȱ�մϴ�.");
									System.out.println("������ ���ư��ϴ�.");
									System.out.println("������ �̵����Դϴ�.\n");
									break battle;
								}
								System.out.println("1. �����ϱ�\t" + "2. ��������");
								System.out.print("���� �ൿ�� : ");
								num = scanner.nextInt();
								if (num == 1) {
									��������Ƚ�� += 1;
									�÷��̾�.����(��������.����);
									��������.�������ݹޱ�(�÷��̾�.������);
									if (��������.hp <= 0) {
										��������.stop(true);
										��������.close();
										// ����ȿ��.stop(true);
										System.out.println("������ ũ�� ȥ������ϴ�. ������ ������ ������ǰ���� ã�ҽ��ϴ�.\n");
										Thread.sleep(1000);
										System.out.println("���ǵ��� ������ ������ ���ư��� ������ �ٽ� �����մϴ�.");
										����1.����ֱ�("��Ÿ", "���� ���� ���ǵ�", 0, 0, 0, 0, 0);
										Thread.sleep(1000);
										System.out.println("������ ���ư��ϴ�.\n");
										Thread.sleep(1000);
										break game;
									}
								} else if (num == 2) {
									if (�÷��̾�.����() == true) {
										// ����ȿ��.stop(true);
										��������.stop(true);
										��������.close();
										break;
									}
								}
							}
						} else {
							System.out.println("\n������ �������� �ʽ��ϴ�.\n");
							System.out.println("\n������ ���ư��ϴ�.\n");
							System.out.println("\n������ �̵����Դϴ�.\n");
							battle.close();
							break battle;
						}
					} else if (����� == 5) // ����� �̵����� ������ �ٽ� ���ư��� ��
					{
						System.out.println("\n���ư��⸦ �����ϼ̽��ϴ�.\n");
						System.out.println("������ ���ư��ϴ�.\n");
						System.out.println("������ �̵����Դϴ�.\n");
						break;
					}
					if (�÷��̾�.����ġ >= 100) {
						�÷��̾�.���� += (�÷��̾�.����ġ / 100);
						�÷��̾�.���ݷ� += (10) * (�÷��̾�.����ġ / 100);
						�÷��̾�.hp += (200) * (�÷��̾�.����ġ / 100);
						�÷��̾�.�ִ�hp += (200) * (�÷��̾�.����ġ / 100);
						�÷��̾�.mp += (100) * (�÷��̾�.����ġ / 100);
						�÷��̾�.�ִ�mp += (100) * (�÷��̾�.����ġ / 100);
						�÷��̾�.����ġ = �÷��̾�.����ġ % 100;
						System.out.println("\n������ �ö����ϴ�!!. �ɷ�ġ�� �����մϴ�.\n");
						System.out.println("\n���ݷ��� �����մϴ�.\n");
						System.out.println("\nhp�� �����մϴ�.\n");
						System.out.println("\nmp�� �����մϴ�\n");
						�÷��̾�.�������̽�();
					}
					if (�÷��̾�.hp <= 0) {
						// ������.stop(true);
						System.out.println("\n�÷��̾ �׾����ϴ�.\n");
						�÷��̾�.hp = 1;
						System.out.println("�÷��̾�� hp�� 1�� ��Ȱ�մϴ�.\n");
						System.out.println("������ ���ư��ϴ�.\n");
						System.out.println("������ �̵����Դϴ�.\n");
						battle.close();
						break battle;
					}
					System.out.println("\n����� �������ϴ�.\n");
					System.out.println("����� ��� �Ͻðڽ��ϱ�?\n");
					System.out.println("1. ��.\t" + " 2. �ƴϿ�.\n");
					System.out.print("���� �ൿ�� : ");
					num = scanner.nextInt();
					if (num == 2) {
						System.out.println("\n������ ���ư��ϴ�.\n");
						System.out.println("������ �̵����Դϴ�.\n");
						break battle;
					}
				}
				battle.close();
			} else if (��� == 2) // ����Ŭ���� ������ ���ſ� �ǸŸ� ���鿹��
			{
				intromu.close();
				Music ������� = new Music("����.mp3", true);
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("�������� �̵��� �Ѵ�.");
				�������.start();
				���� ���� = new ����();
				����: while (true) {
					System.out.println("\n\n");
					System.out.println("1. �����Ѵ�     2.��ȯ�Ѵ�    3. �ڷΰ���\n");
					System.out.print("���忡�� ���� �� �ൿ�� : ");
					int �����ൿ = scanner.nextInt();
					if (�����ൿ == 1) {
						���屸�Ź迭 = ����.���(�÷��̾�.���);
						�÷��̾�.��� = ���屸�Ź迭[0];
						// �迭 0= �÷��̾���, 1=hp����, 2=mp����
						����1.���ǰ���ֱ�(���屸�Ź迭);
					} // else if (�����ൿ == 2) {����.�Ǹ�();}
					else if (�����ൿ == 2) {
						����.��ȯ�ϱ�();
					} else if (�����ൿ == 3) {
						�������.close();
						System.out.println("\n������ ���ư��ϴ�.\n");
						System.out.println("\n������ �̵����Դϴ�.\n");
						break ����;
					}
				}
				�������.close();
			} else if (��� == 3)
			// ���� �÷��̾��� �������̽��� ������
			{
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\n���� �Ǵ� �� �Ǵ� ������ ����Ϸ��� �մϴ�\n");
				System.out.println("\n1�� ���\t" + "2�� ������\n");
				System.out.print("����մϱ� : ");
				int ��� = scanner.nextInt();
				if (��� == 1) {
					�������̽�: while (true) {
						�÷��̾�.�������̽�();
						����1.�����������̽�();
						System.out.println("���⸦ ����Ұ�� '����'��� �Է���");
						System.out.println("���� ����� ��� '��'��� �Է¿�");
						System.out.println("hp������ ����� ��� 'hp'�̶�� �Է��Ͻʽÿ�");
						System.out.println("mp������ ����� ��� 'mp'�̶�� �Է��Ͻʽÿ�");
						System.out.print("���� ����� ���� : ");
						String a = scanner.next();
						if (a.equals("����")) {
							if (����1.��������Ž��("����")) {
								����1.�κ���������();
							} else {
								System.out.println("\n���������� ���Ⱑ �����ϴ�.\n");
								System.out.println("\n�ٽ� ������ �ּ���\n");
							}
						} else if (a.equals("��")) {
							if (����1.��������Ž��("��")) {
								����1.�κ�������();
							} else {
								System.out.println("\n���������� ���� �����ϴ�.\n");
								System.out.println("\n�ٽ� ������ �ּ���\n");
							}
						} else if (a.equals("hp")) //// hp���� ���� �� hpȸ���� ���� ���ǰ�����ȯ
						{
							while (true) {
								System.out.println("\nhp������ ����մϴ�\n");
								if (����1.���ǰ���[0] > 0) {
									����1.���ǰ���[0] -= 1;
									�÷��̾�.hp += 50;
									if (�÷��̾�.hp > �÷��̾�.�ִ�hp) {
										�÷��̾�.hp = �÷��̾�.�ִ�hp;
									}
									System.out.println("\nhp�� �����߽��ϴ�.");
									System.out.println("\n�÷��̾��� hp�� " + �÷��̾�.hp + "�Դϴ�.");
									System.out.println("\n���� hp������ ������ " + ����1.���ǰ���[0] + "�� �Դϴ�.");
									System.out.println("\n��� ����մϱ�?");
									System.out.println("\n1. ����Ѵ�.  2. �����Ѵ�.");
									System.out.print("\n���� ���� : ");
									int ���ǻ�� = scanner.nextInt();
									if (���ǻ�� == 2) {
										break;
									}
								} else {
									System.out.println("\nhp������ �����ϴ�.");
									break;
								}
							}
						} else if (a.equals("mp")) // mp���� ���� �� mpȸ���� ���� ���ǰ�����ȯ
						{
							while (true) {
								System.out.println("\nmp������ ����մϴ�");
								if (����1.���ǰ���[1] > 0) {
									����1.���ǰ���[1] -= 1;
									�÷��̾�.mp += 50;
									if (�÷��̾�.mp > �÷��̾�.�ִ�mp) {
										�÷��̾�.mp = �÷��̾�.�ִ�mp;
									}
									System.out.println("\nmp��  �����߽��ϴ�.");
									System.out.println("\n�÷��̾��� mp�� " + �÷��̾�.mp + "�Դϴ�.");
									System.out.println("\n���� mp������ ������ " + ����1.���ǰ���[1] + "�� �Դϴ�.");
									System.out.println("\n��� ����մϱ�?");
									System.out.println("\n1. ����Ѵ�.  2. �����Ѵ�.");
									System.out.print("\n���� ���� : ");
									int ���ǻ�� = scanner.nextInt();
									if (���ǻ�� == 2) {
										break;
									}
								} else {
									System.out.println("\nmp������ �����ϴ�.");
									break;
								}
							}
						}
						�÷��̾�.�������̽�();
						����1.�����������̽�();
						System.out.println();
						System.out.println("\n����ؼ� ����մϱ�?");
						System.out.println("\n1. ��.\t" + " 2. �ƴϿ�.");
						System.out.print("���� �ൿ�� : ");
						num = scanner.nextInt();
						if (num == 2) {
							System.out.println("\n�ڷ� ���ư��ϴ�.");
							break �������̽�;
						}
					}
				}
				intromu.close();
			}
		} // ���ӳ�
		Music ������ = new Music("������.mp3", true);
		������.start();
		String ��������Ʈ = (" ������ ������ ������ ���� ���ǵ��� �����Խ��ϴ�.\n\n" + " ������ ������ ���Ǵ��п� ���������� �ٽ� ������ ���� �� ���� �ְ� �Ǿ��µ�\n\n"
				+ " ������� ũ�� ȥ���� �� ������ �ڽ��� ������\n\n" + " ������ ģ����� ���� ������� ������ ���� ����� ���鼭 ���� �η��� �߾��.\n\n"
				+ " ��� ���յ� ���� ������ ���� �;������� �̹� ���� ������� ���������� ���� ������ ������ ������?\n\n"
				+ " �̷��� �ٽ� ������ ���� �Ǹ鼭 ����������� �ູ�ϰ� ������ ����ϴ�.\n\n"
				+ " ����̾߱� ��~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		����Ÿ���� ������ = new ����Ÿ����(��������Ʈ, 15);
		������.start();
	}
}
