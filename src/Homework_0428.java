import java.util.Scanner;

/*
 * 1��° ���� ���� ��Դµ� �ɸ��� �ð� 10��
 * 2��° ���� �����ϴµ� �ɸ��� �ð� 10~15
 */
public class Homework_0428 {
	public static void main(String[] args) {
		int hours = 7;
		int minutes = 30;
		int card = 100000; // ������ ī�� �ʸ���
		int cash = 100000; // ������ ���� �ʸ���
		boolean brush1 = false;
		boolean brush2 = true;
		boolean ��� = false;
		Scanner scaner = new Scanner(System.in);

		System.out.printf("������ 21���̰� ���� �ð��� %d�� : %d���Դϴ�. \n", hours, minutes);
		System.out.println("���� ����� ģ����� ���� ����� 11:00�ÿ� �ֽ��ϴ�.\n" + "��� ��ұ��� ���µ� �ɸ��� �ð��� 10���Դϴ�.");
		System.out.println(" ��� �ð��� ���� �ʰ� �����غ� �սô�.");
		System.out.println("���ݺ��� �ൿ�� �����մϴ�. ");
		System.out.println("������ ���� �����߿��� ���ø� �˴ϴ�.");
		System.out.println("-----------------------------------------");
		// ���� ����
		System.out.println(" ���� �ڴٰ� �ῡ�� �����ϴ�.\n" + "\n�Ͼ�� �ŽǷ� �ɾ����.\n" + "���� �����߿��� ���ÿ�.\n");
		System.out.print("A 1. ���� �Դ´�  " + "2. �Ĵ´�.\n" + " ���� �ൿ�� : ");
		int answer = scaner.nextInt();
		if (answer == 1) // �Ͼ�� ���� �Դ´ٴ� �亯
		{
			brush2 = false; // ���� ��Ա� ���� ��ġ�� �ϸ� ���� �ȸԱ� ���� �� ���� (�ص忬���� ���)
			System.out.println("\nQ : ���� �Դ´�\n" + "���� ��� ���� ���ΰ� ?");
			System.out
					.print("\nA 1. ���� �����ؼ� �Դ´�. " + "2. ���Ѽ� �Դ´�. " + "3. ���� �ִ� �������� ������ �Դ´�.\n" + " ���� ��ħ���� �Դ� ����� : ");
			answer = scaner.nextInt();
			if (answer == 1) // ���� ���� �����ؼ� �Դ´ٴ� �亯
			{
				System.out.println("\nQ : ���� ���� �Դ´�.\n" + " ���� ���� ������ ? ");
				System.out.print("\nA 1. ��� " + "2. ������ " + "3. � \n" + " ���� ���� ���� ������ : ");
				answer = scaner.nextInt();
				if (answer == 1) // ���� ����� ���� �԰ڴٴ� �亯
				{
					minutes += 20;
					System.out.println("\n����� �Ծ����� 20���� ������, �ľ�߰ڴ�.");
					System.out.println("\nQ : �䵵 �Ծ����� ����.\n" + " ��� ������?");
					System.out.print("\nA 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
					{
						System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
						System.out.print("\n��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("\n���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.println("\n�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("\n�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("Ŭ��¡��")) {
								System.out.println("\n�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("\n�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else {
							System.out.print("\n���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.println("\n�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("\n�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						}
					} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
					{
						brush1 = true;
						System.out.println("Q : ��ġ�ߴµ�");
						if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
						{
							System.out.println(" ���� ���� ���ƾ���");
						} else // ��԰� ��ġ������ ����
						{
							System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
						}
					} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
					{
						System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}
								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("Ŭ��¡��")) {
							System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else {
							System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						}
					}
				} else if (answer == 2) // ���� �������� �԰ڴٴ� �亯
				{
					minutes += 30;
					System.out.println("�������� ���� �Ծ����� 30���� ������, �ľ�߰ڴ�.");
					System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
					System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
					{
						System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("Ŭ��¡��")) {
								System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else {
							System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						}
					} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
					{
						brush1 = true;
						System.out.println("Q : ��ġ�ߴµ�");
						if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
						{
							System.out.println(" ���� ���� ���ƾ���");
						} else // ��԰� ��ġ������ ����
						{
							System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
						}
					} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
					{
						System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}
								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("Ŭ��¡��")) {
							System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else {
							System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						}
					}
				} else if (answer == 3) // ���� ��� �����԰ڴٴ� �亯
				{
					minutes += 30;
					System.out.println("��� ���� �Ծ����� 30���� ������, �ľ�߰ڴ�.");
					System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
					System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
					{
						System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("Ŭ��¡��")) {
								System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else {
							System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						}
					} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
					{
						brush1 = true;
						System.out.println("Q : ��ġ�ߴµ�");
						if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
						{
							System.out.println(" ���� ���� ���ƾ���");
						} else // ��԰� ��ġ������ ����
						{
							System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
						}
					} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
					{
						System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}
								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("Ŭ��¡��")) {
							System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else {
							System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						}
					}
				}
			} else if (answer == 2) // ���� ���Ѽ� �Դ´ٴ� �亯
			{
				System.out.println("Q : ��������� ���Ѽ� �Դ´�.\n" + " ���� ���Ѽ� ������ ? ");
				System.out.print(
						"(��ޱ��� �ɸ��� �ð�)A 1. �߽�(���20��) " + "2. ���(���30��) " + "3. �ѽ�(���30��) \n" + " ���� ���Ѹ��� ������ : ");
				answer = scaner.nextInt();
				if (answer == 1) // �߱����� ��Ų�ٴ� �亯
				{
					System.out.println("Q : �߽����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
					System.out.print("A 1. ¥���(5000��)" + "2. «��(6000��) " + "3. ������(6000��)\n" + " ���� �ֹ��� : ");
					answer = scaner.nextInt();
					if (answer == 1) // ¥����� ����� �Դ�.
					{
						minutes += 30;
						int a = (int) (Math.random() * 2);// ��������
						if (a == 1) // ¥��� ī�����
						{
							card -= 5000;
							System.out.printf("¥��� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n", card,
									cash);
							System.out.println("¥����� �Ծ����� 30���� ������ �ľ�߰ڴ�.");
						} else // ¥��� ���ݰ���
						{
							cash -= 5000;
							System.out.printf("¥��� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n", card,
									cash);
							System.out.println("¥����� �Ծ����� 30���� ������ �ľ�߰ڴ�.");
						}
						System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
						System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
						{
							System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else {
								System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							}
						} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
						{
							brush1 = true;
							System.out.println("Q : ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
						{
							System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}
									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("Ŭ��¡��")) {
								System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else {
								System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							}
						}
					} else if (answer == 2)// «���� ����� �Դ�.
					{
						minutes += 30;
						int a = (int) (Math.random() * 2);// ��������
						if (a == 1) // «�� ī�����
						{
							card -= 6000;
							System.out.printf("«���� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %dn\n",
									card, cash);
							System.out.println("«���� �Ծ����� 30���� ������ �ľ�߰ڴ�.");
						} else // «�� ���ݰ���
						{
							cash -= 6000;
							System.out.printf("«���� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n", card,
									cash);
							System.out.println("«���� �Ծ����� 30���� ������ �ľ�߰ڴ�.");
						}
						System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
						System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
						{
							System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else {
								System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							}
						} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
						{
							brush1 = true;
							System.out.println("Q : ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
						{
							System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}
									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("Ŭ��¡��")) {
								System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else {
								System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							}
						}
					} else if (answer == 3) // ������ ����� �Դ�.
					{
						minutes += 30;
						int a = (int) (Math.random() * 2);// ��������
						if (a == 1) // ������ ī�����
						{
							card -= 6000;
							System.out.printf("�������� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("�������� �Ծ����� 30���� ������ �ľ�߰ڴ�.");
						} else // ������ ���ݰ���
						{
							cash -= 6000;
							System.out.printf("�������� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("�������� �Ծ����� 30���� ������ �ľ�߰ڴ�.");
						}
						System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
						System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
						{
							System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else {
								System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							}
						} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
						{
							brush1 = true;
							System.out.println("Q : ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
						{
							System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}
									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("Ŭ��¡��")) {
								System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else {
								System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							}
						}
					}
				} else if (answer == 2) // ����� ��Ų�ٴ� �亯
				{
					System.out.println("Q : ������� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
					System.out.print("A 1. ��������(9000��)" + "2. ���(8000��) " + "3. ����(5000��)\n" + " ���� �ֹ��� : ");
					answer = scaner.nextInt();
					if (answer == 1) // �������Ű� ����� �Դ�.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// ��������
						if (a == 1) // �������� ī�����
						{
							card -= 9000;
							System.out.printf("�������Ű� ����� �Դ�.\n" + "ī�� 9õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("�������Ÿ� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						} else // �������� ���ݰ���
						{
							cash -= 9000;
							System.out.printf("�������Ű� ����� �Դ�.\n" + "���� 9õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("�������Ÿ� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						}
						System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
						System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
						{
							System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else {
								System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							}
						} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
						{
							brush1 = true;
							System.out.println("Q : ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
						{
							System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}
									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("Ŭ��¡��")) {
								System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else {
								System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							}
						}
					} else if (answer == 2)// ����� ����� �Դ�.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// ��������
						if (a == 1) // ����� ī�����
						{
							card -= 8000;
							System.out.printf("����� ����� �Դ�.\n" + "ī�� 8õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("����� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						} else // ����� ���ݰ���
						{
							cash -= 8000;
							System.out.printf("����� ����� �Դ�.\n" + "���� 8õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("����� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						}
						System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
						System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
						{
							System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else {
								System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							}
						} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
						{
							brush1 = true;
							System.out.println("Q : ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
						{
							System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}
									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("Ŭ��¡��")) {
								System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else {
								System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							}
						}
					} else if (answer == 3) // ���Ű� ����� �Դ�.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// ��������
						if (a == 1) // ����ī�����
						{
							card -= 5000;
							System.out.printf("���Ű� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n", card,
									cash);
							System.out.println("���Ÿ� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						} else // �������ݰ���
						{
							cash -= 5000;
							System.out.printf("���Ű� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n", card,
									cash);
							System.out.println("���Ÿ� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						}
						System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
						System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
						{
							System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else {
								System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							}
						} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
						{
							brush1 = true;
							System.out.println("Q : ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
						{
							System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}
									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("Ŭ��¡��")) {
								System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else {
								System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							}
						}
					}
				} else if (answer == 3) // �ѽ��� ��Ų�ٴ� �亯
				{
					System.out.println("Q : �ѽ����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
					System.out.print("A 1. ��ġ�(7000��)" + "2. �����(7000��) " + "3. ���(6000��)\n" + " ���� �ֹ��� : ");
					answer = scaner.nextInt();
					if (answer == 1) // ��ġ��� ����� �Դ�.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// ��������
						if (a == 1) // ��ġ� ī�����
						{
							card -= 7000;
							System.out.printf("��ġ��� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("��ġ��� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						} else // ��ġ� ���ݰ���
						{
							cash -= 7000;
							System.out.printf("��ġ��� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("��ġ��� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						}
						System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
						System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
						{
							System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else {
								System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							}
						} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
						{
							brush1 = true;
							System.out.println("Q : ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
						{
							System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}
									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("Ŭ��¡��")) {
								System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else {
								System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							}
						}
					} else if (answer == 2)// ������� ����� �Դ�.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// ��������
						if (a == 1) // ������� ī�����
						{
							card -= 7000;
							System.out.printf("������� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("������� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						} else // ������� ���ݰ���
						{
							cash -= 7000;
							System.out.printf("������� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n",
									card, cash);
							System.out.println("������� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						}
						System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
						System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
						{
							System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else {
								System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							}
						} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
						{
							brush1 = true;
							System.out.println("Q : ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
						{
							System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}
									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("Ŭ��¡��")) {
								System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else {
								System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							}
						}
					} else if (answer == 3) // ����� ����� �Դ�.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// ��������
						if (a == 1) // ��� ī�����
						{
							card -= 6000;
							System.out.printf("����� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n", card,
									cash);
							System.out.println("����� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						} else // ��� ���ݰ���
						{
							cash -= 6000;
							System.out.printf("����� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� ī�� �ܾ� : %d,  ���� ���� �ܾ� : %d\n", card,
									cash);
							System.out.println("����� �Ծ����� 40���� ������ �ľ�߰ڴ�.");
						}
						System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
						System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
						{
							System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							} else {
								System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								} else {
									System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
								}
							}
						} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
						{
							brush1 = true;
							System.out.println("Q : ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
						{
							System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
							System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
							shower1 = scaner.next();
							if (shower1.equals("��Ǫ")) {
								System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}
									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("�ٵ����")) {
								System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("Ŭ��¡��")) {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("Ŭ��¡��")) {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else if (shower1.equals("Ŭ��¡��")) {
								System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							} else {
								System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
								shower2 = scaner.next();
								if (shower2.equals("��Ǫ")) {
									System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("�ٵ����")) {
										System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else if (shower2.equals("�ٵ����")) {
									System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
									shower3 = scaner.next();
									if (shower3.equals("����")) {
										System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								} else {
									System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
									shower3 = scaner.next();
									if (shower3.equals("��Ǫ")) {
										System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									} else {
										System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
										brush1 = true;
										System.out.println(" ��ġ�ߴµ�");
										if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
										{
											System.out.println(" ���� ���� ���ƾ���");
										} else // ��԰� ��ġ������ ����
										{
											System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
										}

									}
								}
							}
						}
					}
				}
			} else if (answer == 3) // ���� �ִ� �������� ���� �����Դ� �ٴ� �亯
			{
				System.out.println("Q : ���� �ִ� �������� ������ �Դ´�." + " ����� ������ ���� �ִ�.");
				System.out.print("(�ִ� 3������)�������� ���� ���� ���� : ");
				String subdish1, subdish2, subdish3;
				answer = scaner.nextInt();
				switch (answer) {
				case 1: {
					minutes += 20;
					System.out.print("�������� ������ : ");
					subdish1 = scaner.next();
					System.out.printf("���̶� ���� %s(��)�� ���� �Ծ����", subdish1);
					System.out.println("���� 20�� ���� �Ծ����� �ľ�߰ڴ�.");
					System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
					System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
					{
						System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("Ŭ��¡��")) {
								System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else {
							System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						}
					} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
					{
						brush1 = true;
						System.out.println("Q : ��ġ�ߴµ�");
						if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
						{
							System.out.println(" ���� ���� ���ƾ���");
						} else // ��԰� ��ġ������ ����
						{
							System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
						}
					} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
					{
						System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}
								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("Ŭ��¡��")) {
							System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else {
							System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						}
					}
					break;
				}
				case 2: {
					minutes += 20;
					System.out.print("�������� ������ : ");
					subdish1 = scaner.next();
					System.out.print("�� ���� �������� ������ : ");
					subdish2 = scaner.next();
					System.out.printf("���̶� ���� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2);
					System.out.println("���� 20�� ���� �Ծ����� �ľ�߰ڴ�.");
					System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
					System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
					{
						System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("Ŭ��¡��")) {
								System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else {
							System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						}
					} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
					{
						brush1 = true;
						System.out.println("Q : ��ġ�ߴµ�");
						if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
						{
							System.out.println(" ���� ���� ���ƾ���");
						} else // ��԰� ��ġ������ ����
						{
							System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
						}
					} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
					{
						System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}
								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("Ŭ��¡��")) {
							System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else {
							System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						}
					}
					break;
				}
				case 3: {
					minutes += 20;
					System.out.print("�������� ������ : ");
					subdish1 = scaner.next();
					System.out.print("�� ���� �������� ������ : ");
					subdish2 = scaner.next();
					System.out.print("�� ���� �������� ������ : ");
					subdish3 = scaner.next();
					System.out.printf("���̶� ���� %s(��)�� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2, subdish3);
					System.out.println("���� 20�� ���� �Ծ����� �ľ�߰ڴ�.");
					System.out.println("Q : �䵵 �Ծ����� ����.\n" + " ��� ������?");
					System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
					{
						System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("Ŭ��¡��")) {
								System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						} else {
							System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							} else {
								System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �ϴ� �����ϳ�.");
							}
						}
					} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
					{
						brush1 = true;
						System.out.println("Q : ��ġ�ߴµ�");
						if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
						{
							System.out.println(" ���� ���� ���ƾ���");
						} else // ��԰� ��ġ������ ����
						{
							System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
						}
					} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
					{
						System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
						System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
						shower1 = scaner.next();
						if (shower1.equals("��Ǫ")) {
							System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}
								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("�ٵ����")) {
							System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("Ŭ��¡��")) {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("Ŭ��¡��")) {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else if (shower1.equals("Ŭ��¡��")) {
							System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						} else {
							System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
							shower2 = scaner.next();
							if (shower2.equals("��Ǫ")) {
								System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("�ٵ����")) {
									System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else if (shower2.equals("�ٵ����")) {
								System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
								shower3 = scaner.next();
								if (shower3.equals("����")) {
									System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							} else {
								System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
								shower3 = scaner.next();
								if (shower3.equals("��Ǫ")) {
									System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								} else {
									System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
									brush1 = true;
									System.out.println(" ��ġ�ߴµ�");
									if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
									{
										System.out.println(" ���� ���� ���ƾ���");
									} else // ��԰� ��ġ������ ����
									{
										System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
									}

								}
							}
						}
					}
					break;
				}
				}
			}
		} else if (answer == 2) // �Ͼ�� �Ĵ´ٴ� �亱
		{
			System.out.println("Q : �ϴ� �ľ�� �Ѵ�.\n" + " ��� ������?");
			System.out.print("A 1. ������ �Ѵ�.  " + "2. ��ġ�� �Ѵ�.  " + "3. �Ѵ� �Ѵ�.\n" + " ���� �ൿ�� : ");
			String shower1, shower2, shower3, shower4;
			answer = scaner.nextInt();
			if (answer == 1) // �Ͼ�� ������ �Ѵٴ� �亱
			{
				minutes += 15;
				System.out.println("Q : ������ ����\n" + "��Ƿ� ����");
				System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
				shower1 = scaner.next();
				if (shower1.equals("��Ǫ")) {
					System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
					shower2 = scaner.next();
					if (shower2.equals("�ٵ����")) {
						System.out.println("�� �������� �ٵ���� �׸��� Ŭ��¡������ �ľ����.\n" + "������ �������� ��Ծ����.\n");
						System.out.println("Q : ���� �Դ´�\n" + "���� ��� ���� ���ΰ� ?");
						System.out.print("A 1. ���� �����ؼ� �Դ´�. " + "2. ���Ѽ� �Դ´�. " + "3. ���� �ִ� �������� ������ �Դ´�.\n"
								+ " ���� ��ħ���� �Դ� ����� : ");
						answer = scaner.nextInt();
						if (answer == 1) // ���� ���� �����ؼ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ���� ���� �Դ´�.\n" + " ���� ���� ������ ? ");
							System.out.print("A 1. ��� " + "2. ������ " + "3. � \n" + " ���� ���� ���� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // ���� ����� ���� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("����� �Ծ����� 30���� ������. ");
							} else if (answer == 2) // ���� �������� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("�������� ���� �Ծ����� 30���� ������. ");
							} else if (answer == 3) // ���� ��� �����԰ڴٴ� �亯
							{
								minutes += 40;
								System.out.println("��� ���� �Ծ����� 40���� ������.");
							}
						} else if (answer == 2) // ���� ���Ѽ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ��������� ���Ѽ� �Դ´�.\n" + " ���� ���Ѽ� ������ ? ");
							System.out.print("(��ޱ��� �ɸ��� �ð�)A 1. �߽�(���30��) " + "2. ���(���30��) " + "3. �ѽ�(���50��) \n"
									+ " ���� ���Ѹ��� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // �߱����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �߽����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ¥���(5000��)" + "2. «��(6000��) " + "3. ������(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ¥����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ¥��� ī�����
									{
										card -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("¥��� ���ְ� �߸Ծ���.");
									} else // ¥��� ���ݰ���
									{
										cash -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("¥����� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// «���� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // «�� ī�����
									{
										card -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									} else // «�� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ������ ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������ ī�����
									{
										card -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									} else // ������ ���ݰ���
									{
										cash -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 2) // ����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : ������� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ��������(9000��)" + "2. ���(8000��) " + "3. ����(5000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // �������Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // �������� ī�����
									{
										card -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "ī�� 9õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									} else // �������� ���ݰ���
									{
										cash -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "���� 9õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����� ī�����
									{
										card -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 8õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ����� ���ݰ���
									{
										cash -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 8õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ���Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����ī�����
									{
										card -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									} else // �������ݰ���
									{
										cash -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 3) // �ѽ��� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �ѽ����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out.print(
										"A 1. ��ġ�(7000��)" + "2. �����(7000��) " + "3. ���(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ��ġ��� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��ġ� ī�����
									{
										card -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									} else // ��ġ� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ������� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������� ī�����
									{
										card -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("������� ���ְ� �߸Ծ���.");
									} else // ������� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("������� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��� ī�����
									{
										card -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ��� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								}
							}
						} else if (answer == 3) // ���� �ִ� �������� ���� �����Դ� �ٴ� �亯
						{
							System.out.println("Q : ���� �ִ� �������� ������ �Դ´�." + " ����� ������ ���� �ִ�.");
							System.out.print("(�ִ� 3������)�������� ���� ���� ���� : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� ���� �Ծ����", subdish1);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 2: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 3: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish3 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2, subdish3);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							}
						}
					} else {
						System.out.println("�� �������� Ŭ��¡�� �׸��� �ٵ���÷� �ľ����.\n" + "������ �������� ��Ծ����.\n");
						System.out.println("Q : ���� �Դ´�\n" + "���� ��� ���� ���ΰ� ?");
						System.out.print("A 1. ���� �����ؼ� �Դ´�. " + "2. ���Ѽ� �Դ´�. " + "3. ���� �ִ� �������� ������ �Դ´�.\n"
								+ " ���� ��ħ���� �Դ� ����� : ");
						answer = scaner.nextInt();
						if (answer == 1) // ���� ���� �����ؼ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ���� ���� �Դ´�.\n" + " ���� ���� ������ ? ");
							System.out.print("A 1. ��� " + "2. ������ " + "3. � \n" + " ���� ���� ���� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // ���� ����� ���� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("����� �Ծ����� 30���� ������. ");
							} else if (answer == 2) // ���� �������� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("�������� ���� �Ծ����� 30���� ������. ");
							} else if (answer == 3) // ���� ��� �����԰ڴٴ� �亯
							{
								minutes += 40;
								System.out.println("��� ���� �Ծ����� 40���� ������.");
							}
						} else if (answer == 2) // ���� ���Ѽ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ��������� ���Ѽ� �Դ´�.\n" + " ���� ���Ѽ� ������ ? ");
							System.out.print("(��ޱ��� �ɸ��� �ð�)A 1. �߽�(���30��) " + "2. ���(���30��) " + "3. �ѽ�(���50��) \n"
									+ " ���� ���Ѹ��� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // �߱����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �߽����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ¥���(5000��)" + "2. «��(6000��) " + "3. ������(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ¥����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ¥��� ī�����
									{
										card -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("¥��� ���ְ� �߸Ծ���.");
									} else // ¥��� ���ݰ���
									{
										cash -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("¥����� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// «���� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // «�� ī�����
									{
										card -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									} else // «�� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ������ ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������ ī�����
									{
										card -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									} else // ������ ���ݰ���
									{
										cash -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 2) // ����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : ������� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ��������(9000��)" + "2. ���(8000��) " + "3. ����(5000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // �������Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // �������� ī�����
									{
										card -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "ī�� 9õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									} else // �������� ���ݰ���
									{
										cash -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "���� 9õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����� ī�����
									{
										card -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 8õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ����� ���ݰ���
									{
										cash -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 8õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ���Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����ī�����
									{
										card -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									} else // �������ݰ���
									{
										cash -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 3) // �ѽ��� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �ѽ����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out.print(
										"A 1. ��ġ�(7000��)" + "2. �����(7000��) " + "3. ���(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ��ġ��� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��ġ� ī�����
									{
										card -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									} else // ��ġ� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ������� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������� ī�����
									{
										card -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("������� ���ְ� �߸Ծ���.");
									} else // ������� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("������� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��� ī�����
									{
										card -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ��� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								}
							}
						} else if (answer == 3) // ���� �ִ� �������� ���� �����Դ� �ٴ� �亯
						{
							System.out.println("Q : ���� �ִ� �������� ������ �Դ´�." + " ����� ������ ���� �ִ�.");
							System.out.print("(�ִ� 3������)�������� ���� ���� ���� : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� ���� �Ծ����", subdish1);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 2: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 3: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish3 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2, subdish3);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							}
						}
					}
				} else if (shower1.equals("�ٵ����")) {
					System.out.print("���� �ٵ���� ���� �ϰ�\n" + "�� �������� : ");
					shower2 = scaner.next();
					if (shower2.equals("Ŭ��¡��")) {
						System.out.println("�� �������� Ŭ��¡�� �׸��� ��Ǫ�� �ľ����.\n" + "������ �������� ��Ծ����.\n");
						System.out.println("Q : ���� �Դ´�\n" + "���� ��� ���� ���ΰ� ?");
						System.out.print("A 1. ���� �����ؼ� �Դ´�. " + "2. ���Ѽ� �Դ´�. " + "3. ���� �ִ� �������� ������ �Դ´�.\n"
								+ " ���� ��ħ���� �Դ� ����� : ");
						answer = scaner.nextInt();
						if (answer == 1) // ���� ���� �����ؼ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ���� ���� �Դ´�.\n" + " ���� ���� ������ ? ");
							System.out.print("A 1. ��� " + "2. ������ " + "3. � \n" + " ���� ���� ���� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // ���� ����� ���� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("����� �Ծ����� 30���� ������. ");
							} else if (answer == 2) // ���� �������� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("�������� ���� �Ծ����� 30���� ������. ");
							} else if (answer == 3) // ���� ��� �����԰ڴٴ� �亯
							{
								minutes += 40;
								System.out.println("��� ���� �Ծ����� 40���� ������.");
							}
						} else if (answer == 2) // ���� ���Ѽ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ��������� ���Ѽ� �Դ´�.\n" + " ���� ���Ѽ� ������ ? ");
							System.out.print("(��ޱ��� �ɸ��� �ð�)A 1. �߽�(���30��) " + "2. ���(���30��) " + "3. �ѽ�(���50��) \n"
									+ " ���� ���Ѹ��� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // �߱����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �߽����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ¥���(5000��)" + "2. «��(6000��) " + "3. ������(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ¥����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ¥��� ī�����
									{
										card -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("¥��� ���ְ� �߸Ծ���.");
									} else // ¥��� ���ݰ���
									{
										cash -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("¥����� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// «���� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // «�� ī�����
									{
										card -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									} else // «�� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ������ ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������ ī�����
									{
										card -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									} else // ������ ���ݰ���
									{
										cash -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 2) // ����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : ������� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ��������(9000��)" + "2. ���(8000��) " + "3. ����(5000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // �������Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // �������� ī�����
									{
										card -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "ī�� 9õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									} else // �������� ���ݰ���
									{
										cash -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "���� 9õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����� ī�����
									{
										card -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 8õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ����� ���ݰ���
									{
										cash -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 8õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ���Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����ī�����
									{
										card -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									} else // �������ݰ���
									{
										cash -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 3) // �ѽ��� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �ѽ����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out.print(
										"A 1. ��ġ�(7000��)" + "2. �����(7000��) " + "3. ���(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ��ġ��� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��ġ� ī�����
									{
										card -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									} else // ��ġ� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ������� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������� ī�����
									{
										card -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("������� ���ְ� �߸Ծ���.");
									} else // ������� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("������� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��� ī�����
									{
										card -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ��� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								}
							}
						} else if (answer == 3) // ���� �ִ� �������� ���� �����Դ� �ٴ� �亯
						{
							System.out.println("Q : ���� �ִ� �������� ������ �Դ´�." + " ����� ������ ���� �ִ�.");
							System.out.print("(�ִ� 3������)�������� ���� ���� ���� : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� ���� �Ծ����", subdish1);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 2: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 3: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish3 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2, subdish3);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							}
						}
					} else {
						System.out.println("�� �������� ��Ǫ �׸��� Ŭ��¡������ �ľ����.\n" + "������ �������� ��Ծ����.\n");
						System.out.println("Q : ���� �Դ´�\n" + "���� ��� ���� ���ΰ� ?");
						System.out.print("A 1. ���� �����ؼ� �Դ´�. " + "2. ���Ѽ� �Դ´�. " + "3. ���� �ִ� �������� ������ �Դ´�.\n"
								+ " ���� ��ħ���� �Դ� ����� : ");
						answer = scaner.nextInt();
						if (answer == 1) // ���� ���� �����ؼ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ���� ���� �Դ´�.\n" + " ���� ���� ������ ? ");
							System.out.print("A 1. ��� " + "2. ������ " + "3. � \n" + " ���� ���� ���� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // ���� ����� ���� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("����� �Ծ����� 30���� ������. ");
							} else if (answer == 2) // ���� �������� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("�������� ���� �Ծ����� 30���� ������. ");
							} else if (answer == 3) // ���� ��� �����԰ڴٴ� �亯
							{
								minutes += 40;
								System.out.println("��� ���� �Ծ����� 40���� ������.");
							}
						} else if (answer == 2) // ���� ���Ѽ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ��������� ���Ѽ� �Դ´�.\n" + " ���� ���Ѽ� ������ ? ");
							System.out.print("(��ޱ��� �ɸ��� �ð�)A 1. �߽�(���30��) " + "2. ���(���30��) " + "3. �ѽ�(���50��) \n"
									+ " ���� ���Ѹ��� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // �߱����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �߽����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ¥���(5000��)" + "2. «��(6000��) " + "3. ������(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ¥����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ¥��� ī�����
									{
										card -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("¥��� ���ְ� �߸Ծ���.");
									} else // ¥��� ���ݰ���
									{
										cash -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("¥����� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// «���� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // «�� ī�����
									{
										card -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									} else // «�� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ������ ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������ ī�����
									{
										card -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									} else // ������ ���ݰ���
									{
										cash -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 2) // ����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : ������� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ��������(9000��)" + "2. ���(8000��) " + "3. ����(5000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // �������Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // �������� ī�����
									{
										card -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "ī�� 9õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									} else // �������� ���ݰ���
									{
										cash -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "���� 9õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����� ī�����
									{
										card -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 8õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ����� ���ݰ���
									{
										cash -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 8õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ���Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����ī�����
									{
										card -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									} else // �������ݰ���
									{
										cash -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 3) // �ѽ��� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �ѽ����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out.print(
										"A 1. ��ġ�(7000��)" + "2. �����(7000��) " + "3. ���(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ��ġ��� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��ġ� ī�����
									{
										card -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									} else // ��ġ� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ������� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������� ī�����
									{
										card -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("������� ���ְ� �߸Ծ���.");
									} else // ������� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("������� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��� ī�����
									{
										card -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ��� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								}
							}
						} else if (answer == 3) // ���� �ִ� �������� ���� �����Դ� �ٴ� �亯
						{
							System.out.println("Q : ���� �ִ� �������� ������ �Դ´�." + " ����� ������ ���� �ִ�.");
							System.out.print("(�ִ� 3������)�������� ���� ���� ���� : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� ���� �Ծ����", subdish1);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 2: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 3: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish3 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2, subdish3);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							}
						}
					}
				} else {
					System.out.print("���� Ŭ��¡�� ���� �ϰ�\n" + "�� �������� : ");
					shower2 = scaner.next();
					if (shower2.equals("��Ǫ")) {
						System.out.println("�� �������� ��Ǫ �׸��� �ٵ���÷� �ľ����.\n" + "������ �������� ��Ծ����.\n");
						System.out.println("Q : ���� �Դ´�\n" + "���� ��� ���� ���ΰ� ?");
						System.out.print("A 1. ���� �����ؼ� �Դ´�. " + "2. ���Ѽ� �Դ´�. " + "3. ���� �ִ� �������� ������ �Դ´�.\n"
								+ " ���� ��ħ���� �Դ� ����� : ");
						answer = scaner.nextInt();
						if (answer == 1) // ���� ���� �����ؼ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ���� ���� �Դ´�.\n" + " ���� ���� ������ ? ");
							System.out.print("A 1. ��� " + "2. ������ " + "3. � \n" + " ���� ���� ���� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // ���� ����� ���� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("����� �Ծ����� 30���� ������. ");
							} else if (answer == 2) // ���� �������� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("�������� ���� �Ծ����� 30���� ������. ");
							} else if (answer == 3) // ���� ��� �����԰ڴٴ� �亯
							{
								minutes += 40;
								System.out.println("��� ���� �Ծ����� 40���� ������.");
							}
						} else if (answer == 2) // ���� ���Ѽ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ��������� ���Ѽ� �Դ´�.\n" + " ���� ���Ѽ� ������ ? ");
							System.out.print("(��ޱ��� �ɸ��� �ð�)A 1. �߽�(���30��) " + "2. ���(���30��) " + "3. �ѽ�(���50��) \n"
									+ " ���� ���Ѹ��� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // �߱����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �߽����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ¥���(5000��)" + "2. «��(6000��) " + "3. ������(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ¥����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ¥��� ī�����
									{
										card -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("¥��� ���ְ� �߸Ծ���.");
									} else // ¥��� ���ݰ���
									{
										cash -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("¥����� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// «���� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // «�� ī�����
									{
										card -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									} else // «�� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ������ ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������ ī�����
									{
										card -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									} else // ������ ���ݰ���
									{
										cash -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 2) // ����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : ������� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ��������(9000��)" + "2. ���(8000��) " + "3. ����(5000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // �������Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // �������� ī�����
									{
										card -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "ī�� 9õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									} else // �������� ���ݰ���
									{
										cash -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "���� 9õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����� ī�����
									{
										card -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 8õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ����� ���ݰ���
									{
										cash -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 8õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ���Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����ī�����
									{
										card -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									} else // �������ݰ���
									{
										cash -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 3) // �ѽ��� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �ѽ����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out.print(
										"A 1. ��ġ�(7000��)" + "2. �����(7000��) " + "3. ���(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ��ġ��� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��ġ� ī�����
									{
										card -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									} else // ��ġ� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ������� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������� ī�����
									{
										card -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("������� ���ְ� �߸Ծ���.");
									} else // ������� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("������� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��� ī�����
									{
										card -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ��� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								}
							}
						} else if (answer == 3) // ���� �ִ� �������� ���� �����Դ� �ٴ� �亯
						{
							System.out.println("Q : ���� �ִ� �������� ������ �Դ´�." + " ����� ������ ���� �ִ�.");
							System.out.print("(�ִ� 3������)�������� ���� ���� ���� : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� ���� �Ծ����", subdish1);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 2: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 3: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish3 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2, subdish3);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							}
						}
					} else {
						System.out.println("�� �������� �ٵ���� �׸��� ��Ǫ�� �ľ����.\n" + "������ �������� ��Ծ����.\n");
						System.out.println("Q : ���� �Դ´�\n" + "���� ��� ���� ���ΰ� ?");
						System.out.print("A 1. ���� �����ؼ� �Դ´�. " + "2. ���Ѽ� �Դ´�. " + "3. ���� �ִ� �������� ������ �Դ´�.\n"
								+ " ���� ��ħ���� �Դ� ����� : ");
						answer = scaner.nextInt();
						if (answer == 1) // ���� ���� �����ؼ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ���� ���� �Դ´�.\n" + " ���� ���� ������ ? ");
							System.out.print("A 1. ��� " + "2. ������ " + "3. � \n" + " ���� ���� ���� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // ���� ����� ���� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("����� �Ծ����� 30���� ������. ");
							} else if (answer == 2) // ���� �������� �԰ڴٴ� �亯
							{
								minutes += 30;
								System.out.println("�������� ���� �Ծ����� 30���� ������. ");
							} else if (answer == 3) // ���� ��� �����԰ڴٴ� �亯
							{
								minutes += 40;
								System.out.println("��� ���� �Ծ����� 40���� ������.");
							}
						} else if (answer == 2) // ���� ���Ѽ� �Դ´ٴ� �亯
						{
							System.out.println("Q : ��������� ���Ѽ� �Դ´�.\n" + " ���� ���Ѽ� ������ ? ");
							System.out.print("(��ޱ��� �ɸ��� �ð�)A 1. �߽�(���30��) " + "2. ���(���30��) " + "3. �ѽ�(���50��) \n"
									+ " ���� ���Ѹ��� ������ : ");
							answer = scaner.nextInt();
							if (answer == 1) // �߱����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �߽����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ¥���(5000��)" + "2. «��(6000��) " + "3. ������(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ¥����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ¥��� ī�����
									{
										card -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("¥��� ���ְ� �߸Ծ���.");
									} else // ¥��� ���ݰ���
									{
										cash -= 5000;
										System.out.printf("¥��� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("¥����� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// «���� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // «�� ī�����
									{
										card -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									} else // «�� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("«���� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("«���� �Ծ����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ������ ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������ ī�����
									{
										card -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									} else // ������ ���ݰ���
									{
										cash -= 6000;
										System.out.printf("�������� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������� �Ծ����� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 2) // ����� ��Ų�ٴ� �亯
							{
								System.out.println("Q : ������� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out
										.print("A 1. ��������(9000��)" + "2. ���(8000��) " + "3. ����(5000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // �������Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // �������� ī�����
									{
										card -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "ī�� 9õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									} else // �������� ���ݰ���
									{
										cash -= 9000;
										System.out.printf("�������Ű� ����� �Դ�.\n" + "���� 9õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("�������Ÿ� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����� ī�����
									{
										card -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 8õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ����� ���ݰ���
									{
										cash -= 8000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 8õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ���Ű� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ����ī�����
									{
										card -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "ī�� 5õ�� ����\n" + "���� �ܾ� : %d\n", card);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									} else // �������ݰ���
									{
										cash -= 5000;
										System.out.printf("���Ű� ����� �Դ�.\n" + "���� 5õ�� ����\n" + "���� �ܾ� : %d\n", cash);
										System.out.println("���Ÿ� ���ְ� �߸Ծ���.");
									}
								}
							} else if (answer == 3) // �ѽ��� ��Ų�ٴ� �亯
							{
								System.out.println("Q : �ѽ����� ��������� �ֹ��Ѵ�.\n" + " ���� �޴��� �ֹ��ұ� ? ");
								System.out.print(
										"A 1. ��ġ�(7000��)" + "2. �����(7000��) " + "3. ���(6000��)\n" + " ���� �ֹ��� : ");
								answer = scaner.nextInt();
								if (answer == 1) // ��ġ��� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��ġ� ī�����
									{
										card -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									} else // ��ġ� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("��ġ��� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("��ġ��� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 2)// ������� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ������� ī�����
									{
										card -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "ī�� 7õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("������� ���ְ� �߸Ծ���.");
									} else // ������� ���ݰ���
									{
										cash -= 7000;
										System.out.printf("������� ����� �Դ�.\n" + "���� 7õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("������� ���ְ� �߸Ծ���.");
									}
								} else if (answer == 3) // ����� ����� �Դ�.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// ��������
									if (a == 1) // ��� ī�����
									{
										card -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "ī�� 6õ�� ����\n" + "���� ī�� �ܾ� : %d\n", card);
										System.out.println("����� ���ְ� �߸Ծ���.");
									} else // ��� ���ݰ���
									{
										cash -= 6000;
										System.out.printf("����� ����� �Դ�.\n" + "���� 6õ�� ����\n" + "���� ���� �ܾ� : %d\n", cash);
										System.out.println("����� ���ְ� �߸Ծ���.");
									}
								}
							}
						} else if (answer == 3) // ���� �ִ� �������� ���� �����Դ� �ٴ� �亯
						{
							System.out.println("Q : ���� �ִ� �������� ������ �Դ´�." + " ����� ������ ���� �ִ�.");
							System.out.print("(�ִ� 3������)�������� ���� ���� ���� : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� ���� �Ծ����", subdish1);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 2: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							case 3: {
								System.out.print("�������� ������ : ");
								subdish1 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish2 = scaner.next();
								System.out.print("�� ���� �������� ������ : ");
								subdish3 = scaner.next();
								System.out.printf("���̶� ���� %s(��)�� %s(��)�� %s(��)�� ���� �Ծ����", subdish1, subdish2, subdish3);
								System.out.println("���� ���ְ� �߸Ծ���.");
								break;
							}
							}
						}
					}
				}
			} else if (answer == 2) // �Ͼ�� ��ġ�� �Ѵٴ� �亯
			{
				brush1 = true;
				minutes += 5;
				System.out.println(" ��ġ�ߴµ�");
				if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
				{
					System.out.println(" ���� ���� ���ƾ���");
				} else // ��԰� ��ġ������ ����
				{
					System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
				}
			} else if (answer == 3) // ������ ��ġ �Ѵ� �Ѵٴ� �亯
			{
				minutes += 20;
				System.out.println("Q : ������ ����\n" + " ��Ƿ� ���� ");
				System.out.print("��ǿ��� ��Ǫ, �ٵ����, Ŭ��¡��, ĩ���� �ִ�.\n" + "��ɷ� ���� ������ ?  ");
				shower1 = scaner.next();
				if (shower1.equals("��Ǫ")) {
					System.out.print("���� ��Ǫ���� �ϰ�\n" + "�� �������� : ");
					shower2 = scaner.next();
					if (shower2.equals("�ٵ����")) {
						System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� :");
						shower3 = scaner.next();
						if (shower3.equals("Ŭ��¡��")) {
							System.out.println("�� �������� Ŭ��¡�� �׸��� ��ġ�ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}
						} else {
							System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡�� �ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					} else if (shower2.equals("Ŭ��¡��")) {
						System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
						shower3 = scaner.next();
						if (shower3.equals("�ٵ����")) {
							System.out.println("�� �������� �ٵ���� �׸��� ��ġ�ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� ��ġ�ϰ� �ٵ���� �ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					} else {
						System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
						shower3 = scaner.next();
						if (shower3.equals("�ٵ����")) {
							System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					}
				} else if (shower1.equals("�ٵ����")) {
					System.out.print("���� �ٵ���� �ϰ� \n" + "�� �������� : ");
					shower2 = scaner.next();
					if (shower2.equals("��Ǫ")) {
						System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
						shower3 = scaner.next();
						if (shower3.equals("Ŭ��¡��")) {
							System.out.println("�� �������� Ŭ��¡���ϰ� ��ġ�ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� ��ġ�ϰ� Ŭ��¡���ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					} else if (shower2.equals("Ŭ��¡��")) {
						System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� : ");
						shower3 = scaner.next();
						if (shower3.equals("����")) {
							System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					} else {
						System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
						shower3 = scaner.next();
						if (shower3.equals("��Ǫ")) {
							System.out.println("�� �������� ��Ǫ�ϰ� Ŭ��¡���ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� Ŭ��¡���ϰ� ��Ǫ�ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					}
				} else if (shower1.equals("Ŭ��¡��")) {
					System.out.print("���� Ŭ��¡�� �ϰ� \n" + "�� �������� : ");
					shower2 = scaner.next();
					if (shower2.equals("��Ǫ")) {
						System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
						shower3 = scaner.next();
						if (shower3.equals("�ٵ����")) {
							System.out.println("�� �������� �ٵ�����ϰ� ��ġ�ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� ��ġ�ϰ� �ٵ�����ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					} else if (shower2.equals("�ٵ����")) {
						System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
						shower3 = scaner.next();
						if (shower3.equals("����")) {
							System.out.println("�� �������� �����ϰ� ��ġ�ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� ��ġ�ϰ� �����ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					} else {
						System.out.print("�� �������� ��ġ�ϰ�\n" + " �� �������� :");
						shower3 = scaner.next();
						if (shower3.equals("��Ǫ")) {
							System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					}
				} else {
					System.out.print("���� ��ġ�ϰ� \n" + "�� �������� : ");
					shower2 = scaner.next();
					if (shower2.equals("��Ǫ")) {
						System.out.print("�� �������� ��Ǫ�ϰ�\n" + "�� �������� : ");
						shower3 = scaner.next();
						if (shower3.equals("�ٵ����")) {
							System.out.println("�� �������� �ٵ�����ϰ� Ŭ��¡���ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� Ŭ��¡���ϰ� �ٵ�����ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					} else if (shower2.equals("�ٵ����")) {
						System.out.print("�� �������� �ٵ�����ϰ�\n" + " �� �������� : ");
						shower3 = scaner.next();
						if (shower3.equals("����")) {
							System.out.println("�� �������� �����ϰ� Ŭ��¡���ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� Ŭ��¡���ϰ� �����ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					} else {
						System.out.print("�� �������� Ŭ��¡���ϰ�\n" + " �� �������� :");
						shower3 = scaner.next();
						if (shower3.endsWith("��Ǫ")) {
							System.out.println("�� �������� ��Ǫ�ϰ� �ٵ�����ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						} else {
							System.out.println("�� �������� �ٵ�����ϰ� ��Ǫ�ؾ���.");
							brush1 = true;
							System.out.println(" ��ġ�ߴµ�");
							if (brush1 == brush2) // ��ġ������ ��Դ°Ŵ� ����
							{
								System.out.println(" ���� ���� ���ƾ���");
							} else // ��԰� ��ġ������ ����
							{
								System.out.println(" ���� ��԰� �ϴ� ��ġ�� �����ϳ�");
							}

						}
					}
				}
			}
		}

		if (minutes >= 60) // 60�� �̻��� �Ǹ� 1�ð��� �þ�� ���� ǥ���� ���ǹ�
		{
			minutes -= 60;
			hours += 1;
		}
		System.out.printf("[���� ���� ���� �ִ� �ݾ��� ������ %d, ī�忡�� %d, ���� �ð��� %d�� %d���Դϴ�.]\n\n", cash, card, hours, minutes);

		System.out.println("���� �� tv���� ������ �ϱ⿹���� ���´�.\n");
		{// ������ ���� ���ǹ�
			int �µ�;
			int �µ�1;
			boolean rain = false;
			boolean rain1 = false;
			boolean rain2 = false;
			boolean wind = false;
			boolean wind1 = false;
			boolean ���û = false;
			int �ٶ����� = 0;
			int �ٶ�����1 = 0;
			int �񰭵� = 0;
			int �񰭵�1 = 0;
			String �ٶ�����;// 00 �ٶ�
			String �񼼱�;// 00 ��
			{
				�µ� = (int) (Math.random() * 11) + 16;
				int �� = (int) (Math.random() * 2);
				if (�� == 1) {
					rain = true;
					rain2 = true;
					�񰭵� = (int) (Math.random() * 2);
				} else {
					rain = false;
				}
				int �ٶ� = (int) (Math.random() * 2);
				if (�ٶ� == 1) {
					wind = true;
					�ٶ����� = (int) (Math.random() * 2);
				} else {
					wind = false;
				}

			}
			System.out.printf("�ȳ��Ͻʴϱ� ��󿹺��Դϴ�. ������ �����Դϴ�.\n\n");
			{
				if (�µ� > 24) {
					System.out.printf(" ���� ��ħ�� ����  %d�� �Դϴ�.\n", �µ�);
				} else if (�µ� < 21) {
					System.out.printf(" ���� ��ħ�� �߿� %d�� �Դϴ�.\n", �µ�);
				} else {
					System.out.printf(" ���� ��ħ�� ����� %d�� �Դϴ�.\n", �µ�);
				}
			}
			{
				if (rain == true && �񰭵� == 1) {
					System.out.println("��� ���Ѻ� ������.");
				} else if (rain == true && �񰭵� == 0) {
					System.out.println("��� ���� �� ������");
				} else {
					System.out.println("��� ������ �ʰ�");
				}
			}
			{
				if (wind == true && �ٶ����� == 1) {
					System.out.println("�ٶ��� ���� �ٶ��� �ִϴ�.\n\n");
				} else if (wind == true && �񰭵� == 0) {
					System.out.println("�ٶ��� ���� �ٶ��� �ִϴ�.\n\n");
				} else {
					System.out.println("�ٶ��� ���� �ʽ��ϴ�.\n\n");
				}
			}
			{
				�µ�1 = (int) (Math.random() * 11) + 16;
				int �� = (int) (Math.random() * 2);
				if (�� == 1) {
					rain1 = true;
					�񰭵�1 = (int) (Math.random() * 2);
				} else {
					rain1 = false;
				}
				int �ٶ� = (int) (Math.random() * 2);
				if (�ٶ� == 1) {
					wind1 = true;
					�ٶ�����1 = (int) (Math.random() * 2);
				} else {
					wind1 = false;
				}
			}
			int �µ�����;
			if (�µ� > �µ�1) {
				�µ����� = �µ� - �µ�1;
			} else if (�µ� < �µ�1) {
				�µ����� = �µ�1 - �µ�;
			} else {
				�µ����� = 0;
			}
			System.out.printf("�̾ ���ĳ����Դϴ�.\n");
			{
				if (�µ� > �µ�1) {
					System.out.printf("��ħ���� �µ��� %d�� ������ %d���� ���̸�\n", �µ�����, �µ�1);
				} else if (�µ� < �µ�1) {
					System.out.printf("��ħ���� �µ��� %d�� �ö� %d���� ���̸�\n", �µ�����, �µ�1);
				} else {
					System.out.printf("��ħ�� ������ %d���� ���̸�\n", �µ�1);
				}
			}
			�µ� = 0;
			{
				if (rain1 == true && rain == true) {
					if (�񰭵� > �񰭵�1) {
						System.out.println("�������� ���Ѻ� ������.");
					} else if (�񰭵� < �񰭵�1) {
						System.out.println("�������� ���Ѻ� ������.");
					} else {
						if (�񰭵�1 == 1)
							System.out.println("������ �����ϰ� ���Ѻ� ������.");
						else {
							System.out.println("������ �����ϰ� ���Ѻ� ������.");
						}
					}
				} else if (rain1 == true && rain == false) {
					if (�񰭵�1 == 1) {
						System.out.println("�� ������ ���� �������� �޸� ���Ŀ��� ���� �� ������");
					} else {
						System.out.println("�� ������ ���� �������� �޸� ���Ŀ��� ���� �� ������");
					}
				} else if (rain1 == false && rain == true) {
					if (�񰭵� == 1) {
						System.out.println("���Ѻ� ���� �������� �ٸ��� ���Ŀ��� �� ������ ������");
					} else {
						System.out.println("���Ѻ� ���� �������� �ٸ��� ���Ŀ��� �� ������ ������");
					}
				} else {
					System.out.println("������ �����ϰ� ��� ������ �ʰ�");
				}
			}
			rain = false;
			�񰭵� = 0;
			{
				if (wind1 == true && wind == true) {
					if (�ٶ����� > �ٶ�����1) {
						System.out.println(" �������� ���� �ٶ��� �ִϴ�.\n\n");
					} else if (�ٶ����� < �ٶ�����1) {
						System.out.println(" �������� ���� �ٶ��� �ִϴ�.\n\n");
					} else {
						if (�ٶ�����1 == 1)
							System.out.println("������ �����ϰ� ���� �ٶ��� �ִϴ�.\n\n");
						else {
							System.out.println("������ �����ϰ� ���� �ٶ��� �ִϴ�.\n\n");
						}
					}
				} else if (wind1 == true && wind == false) {
					if (�ٶ�����1 == 1) {
						System.out.println("�ٶ��� ���� ���� �������� �ٸ��� ���Ŀ��� ���� �ٶ��� �ִϴ�.\n\n");
					} else {
						System.out.println("�ٶ��� ���� ���� �������� �ٸ��� ���Ŀ��� ���� �ٶ��� �ִϴ�.\n\n");
					}
				} else if (wind1 == false && wind == true) {
					if (�ٶ����� == 1) {
						System.out.println("���� �ٶ��� �δ� �������� �ٸ��� ���Ŀ��� �ٶ��� �Ⱥִϴ�.\n\n");
					} else {
						System.out.println("���� �ٶ��� �δ� �������� �ٸ��� ���Ŀ��� �ٶ��� �Ⱥִϴ�.\n\n");
					}
				} else {
					System.out.println("������ �����ϰ� �ٶ��� ���� �ʽ��ϴ�.\n\n");
				}
			}
			wind = false;
			�ٶ����� = 0;
			{
				�µ� = (int) (Math.random() * 11) + 16;
				int �� = (int) (Math.random() * 2);
				if (�� == 1) {
					rain = true;
					�񰭵� = (int) (Math.random() * 2);
				} else {
					rain = false;
				}
				int �ٶ� = (int) (Math.random() * 2);
				if (�ٶ� == 1) {
					wind = true;
					�ٶ����� = (int) (Math.random() * 2);
				} else {
					wind = false;
				}

			}
			if (�µ� > �µ�1) {
				�µ����� = �µ� - �µ�1;
			} else if (�µ� < �µ�1) {
				�µ����� = �µ�1 - �µ�;
			} else {
				�µ����� = 0;
			}
			System.out.printf("�̾ ���ᳯ���Դϴ�.\n");
			if (�µ� > �µ�1) {
				System.out.printf("���ĺ���  �µ��� %d�� �ö� %d���� ���̸�\n", �µ�����, �µ�);
			} else if (�µ� < �µ�1) {
				System.out.printf("���ĺ��� �µ��� %d�� ������ %d���� ���̸�\n", �µ�����, �µ�);
			} else {
				System.out.printf("���Ŀ� ������ �µ��� %d�� ���̸�\n", �µ�);
			}
			if (rain1 == true && rain == true) {
				if (�񰭵� > �񰭵�1) {
					System.out.println("���ĺ��� ���Ѻ� ������.");
				} else if (�񰭵� < �񰭵�1) {
					System.out.println("���ĺ��� ���Ѻ� ������.");
				} else {
					if (�񰭵� == 1)
						System.out.println("���Ŀ� �����ϰ� ���Ѻ� ������.");
					else {
						System.out.println("���Ŀ� �����ϰ� ���Ѻ� ������.");
					}
				}
			} else if (rain == true && rain1 == false) {
				if (�񰭵� == 1) {
					System.out.println("�� ������ ���� ���Ŀʹ� �޸� ���ῡ�� ���� �� ������");
				} else {
					System.out.println("�� ������ ���� ���Ŀʹ� �޸� ���ῡ�� ���� �� ������");
				}
			} else if (rain == false && rain1 == true) {
				if (�񰭵�1 == 1) {
					System.out.println("���Ѻ� ���� ���Ŀʹ� �ٸ��� ���ῡ�� �� ������ ������");
				} else {
					System.out.println("���Ѻ� ���� ���Ŀʹ� �ٸ��� ���ῡ�� �� ������ ������");
				}
			} else {
				System.out.println("���Ŀ� �����ϰ� ��� ������ �ʰ�");
			}

			if (wind == true && wind1 == true) {
				if (�ٶ����� > �ٶ�����1) {
					System.out.println("���ĺ��� ���� �ٶ��� �ִϴ�.\n\n");
				} else if (�ٶ����� < �ٶ�����1) {
					System.out.println("���ĺ��� ���� �ٶ��� �ִϴ�.\n\n");
				} else {
					if (�ٶ����� == 1)
						System.out.println("���Ŀ� �����ϰ� ���� �ٶ��� �ִϴ�.\n\n");
					else {
						System.out.println("���Ŀ� �����ϰ� ���� �ٶ��� �ִϴ�.\n\n");
					}
				}
			} else if (wind == true && wind1 == false) {
				if (�ٶ����� == 1) {
					System.out.println("�ٶ��� ���� ���� ���Ŀʹ� �ٸ��� ���ῡ�� ���� �ٶ��� �ִϴ�.\n\n");
				} else {
					System.out.println("�ٶ��� ���� ���� ���Ŀʹ� �ٸ��� ���ῡ�� ���� �ٶ��� �ִϴ�.\n\n");
				}
			} else if (wind == false && wind1 == true) {
				if (�ٶ�����1 == 1) {
					System.out.println("���� �ٶ��� �δ� ���Ŀʹ� �ٸ��� ���ῡ�� �ٶ��� �Ⱥִϴ�.\n\n");
				} else {
					System.out.println("���� �ٶ��� �δ� ���Ŀʹ� �ٸ��� ���ῡ�� �ٶ��� �Ⱥִϴ�.\n\n");
				}
			} else {
				System.out.println("���Ŀ� �����ϰ� �ٶ��� ���� �ʽ��ϴ�.\n\n");
			}

			if (rain == true || rain1 == true || rain2 == true) {
				��� = true;
				���û = true;
				if (��� = true) {
					System.out.println("���� �� �´ٴ� ��� ì�ܾ���\n");
				} else {
					System.out.println("���� �� �ȿ��� ����� ��ì�ܾ���\n");
				}
			}
			String top, pants, outer; // �Ƿ�
			String bag; // �Ǽ��縮
			String shoes; // �Ź�
			boolean perfume = false;// ���
			boolean bracelet = false;// ����
			boolean watch = false;
			int topnumber = 0;
			int pantsnumber = 0;
			int outernumber = 0;
			int bagnumber = 0;
			int shoesnumber = 0;
			int watchnumber = 0;
			int q1, q2, q3, q4, q5, q6, q7;
			int clothtime = 0;
			System.out.println(" ���� ���� ������ �ʹ����� ����. ");
			System.out.println(
					" ���� ������ �̷��� �ִ�.\n" + "1. ����  " + "2. ����  " + "3. ����  " + "4. ����  " + "5. �Ǽ��縮  " + "6. �Ź�  ");
			System.out.print("���� ������� ���ڸ� �ߺ������ʰ� �ۼ����ּ���(ex : 123456)  : ");
			answer = scaner.nextInt();
			q7 = answer;
			q6 = q7 % 10;
			q5 = (q7 % 100) - q6;
			q5 /= 10;
			q4 = (q7 % 1000) - q6 - (q5 * 10);
			q4 /= 100;
			q3 = (q7 % 10000) - q6 - (q5 * 10) - (q4 * 100);
			q3 /= 1000;
			q2 = (q7 % 100000) - q6 - (q5 * 10) - (q4 * 100) - (q3 * 1000);
			q2 /= 10000;
			q1 = (q7 / 100000);
			System.out.println("\nù��° �����Դϴ�.");
			switch (q1) {
			case 1: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ƽ\t" + "2. ��Ʈ\t" + "3. ������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. û����\t" + "2. ������\t" + "3. ��������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" ������ �̷��� 3������ �ִ�.");
				System.out.print("1. ����\t" + " 2. �����\t" + "3. �װ�����\t" + "4. �� �Դ´�.\n" + "�ƿ��ʹ� ���� ������ : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" ������ �̷��� �ִ�.\n");
				System.out.print("1. ����\t" + "2. ũ�ν���\t" + "3. ������Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" �Ǽ��縮�� �̷��� �ִ�.");
				System.out.print("1. �Ѵ������Ѵ�\t" + "2. ����\t" + "3. �ð�\t" + "4. �ƹ��͵� ���Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				switch (answer) {
				case 1:
					watch = true;
					bracelet = true;
					break;
				case 2:
					watch = false;
					bracelet = true;
					break;
				case 3:
					watch = true;
					bracelet = false;
					break;
				case 4:
					watch = false;
					bracelet = false;
					break;
				}
			}
				break;
			case 6: {
				System.out.println(" �Źߴ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ŀ��\t" + "2. �ȭ\t " + " 3. ����\n" + "�Ź��� ���� ������ : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;
			}
			System.out.println("\n�ι�° �����Դϴ�.");
			switch (q2) {

			case 1: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ƽ\t" + "2. ��Ʈ\t" + "3. ������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. û����\t" + "2. ������\t" + "3. ��������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" ������ �̷��� 3������ �ִ�.");
				System.out.print("1. ����\t" + " 2. �����\t" + "3. �װ�����\t" + "4. �� �Դ´�.\n" + "�ƿ��ʹ� ���� ������ : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" ������ �̷��� �ִ�.\n");
				System.out.print("1. ����\t" + "2. ũ�ν���\t" + "3. ������Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" �Ǽ��縮�� �̷��� �ִ�.");
				System.out.print("1. �Ѵ������Ѵ�\t" + "2. ����\t" + "3. �ð�\t" + "4. �ƹ��͵� ���Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				switch (answer) {
				case 1:
					watch = true;
					bracelet = true;
					break;
				case 2:
					watch = false;
					bracelet = true;
					break;
				case 3:
					watch = true;
					bracelet = false;
					break;
				case 4:
					watch = false;
					bracelet = false;
					break;
				}
			}
				break;
			case 6: {
				System.out.println(" �Źߴ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ŀ��\t" + "2. �ȭ\t " + " 3. ����\n" + "�Ź��� ���� ������ : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;

			}
			System.out.println("\n����° �����Դϴ�.");
			switch (q3) {

			case 1: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ƽ\t" + "2. ��Ʈ\t" + "3. ������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. û����\t" + "2. ������\t" + "3. ��������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" ������ �̷��� 3������ �ִ�.");
				System.out.print("1. ����\t" + " 2. �����\t" + "3. �װ�����\t" + "4. �� �Դ´�.\n" + "�ƿ��ʹ� ���� ������ : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" ������ �̷��� �ִ�.\n");
				System.out.print("1. ����\t" + "2. ũ�ν���\t" + "3. ������Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" �Ǽ��縮�� �̷��� �ִ�.");
				System.out.print("1. �Ѵ������Ѵ�\t" + "2. ����\t" + "3. �ð�\t" + "4. �ƹ��͵� ���Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				switch (answer) {
				case 1:
					watch = true;
					bracelet = true;
					break;
				case 2:
					watch = false;
					bracelet = true;
					break;
				case 3:
					watch = true;
					bracelet = false;
					break;
				case 4:
					watch = false;
					bracelet = false;
					break;
				}
			}
				break;
			case 6: {
				System.out.println(" �Źߴ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ŀ��\t" + "2. �ȭ\t " + " 3. ����\n" + "�Ź��� ���� ������ : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;

			}
			System.out.println("\n�׹�° �����Դϴ�.");
			switch (q4) {

			case 1: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ƽ\t" + "2. ��Ʈ\t" + "3. ������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. û����\t" + "2. ������\t" + "3. ��������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" ������ �̷��� 3������ �ִ�.");
				System.out.print("1. ����\t" + " 2. �����\t" + "3. �װ�����\t" + "4. �� �Դ´�.\n" + "�ƿ��ʹ� ���� ������ : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" ������ �̷��� �ִ�.\n");
				System.out.print("1. ����\t" + "2. ũ�ν���\t" + "3. ������Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" �Ǽ��縮�� �̷��� �ִ�.");
				System.out.print("1. �Ѵ������Ѵ�\t" + "2. ����\t" + "3. �ð�\t" + "4. �ƹ��͵� ���Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				switch (answer) {
				case 1:
					watch = true;
					bracelet = true;
					break;
				case 2:
					watch = false;
					bracelet = true;
					break;
				case 3:
					watch = true;
					bracelet = false;
					break;
				case 4:
					watch = false;
					bracelet = false;
					break;
				}
			}
				break;
			case 6: {
				System.out.println(" �Źߴ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ŀ��\t" + "2. �ȭ\t " + " 3. ����\n" + "�Ź��� ���� ������ : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;

			}
			System.out.println("\n�ټ���° �����Դϴ�.");
			switch (q5) {

			case 1: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ƽ\t" + "2. ��Ʈ\t" + "3. ������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. û����\t" + "2. ������\t" + "3. ��������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" ������ �̷��� 3������ �ִ�.");
				System.out.print("1. ����\t" + " 2. �����\t" + "3. �װ�����\t" + "4. �� �Դ´�.\n" + "�ƿ��ʹ� ���� ������ : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" ������ �̷��� �ִ�.\n");
				System.out.print("1. ����\t" + "2. ũ�ν���\t" + "3. ������Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" �Ǽ��縮�� �̷��� �ִ�.");
				System.out.print("1. �Ѵ������Ѵ�\t" + "2. ����\t" + "3. �ð�\t" + "4. �ƹ��͵� ���Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				switch (answer) {
				case 1:
					watch = true;
					bracelet = true;
					break;
				case 2:
					watch = false;
					bracelet = true;
					break;
				case 3:
					watch = true;
					bracelet = false;
					break;
				case 4:
					watch = false;
					bracelet = false;
					break;
				}
			}
				break;
			case 6: {
				System.out.println(" �Źߴ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ŀ��\t" + "2. �ȭ\t " + " 3. ����\n" + "�Ź��� ���� ������ : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;

			}
			System.out.println("\n������ �����Դϴ�.");
			switch (q6) {

			case 1: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ƽ\t" + "2. ��Ʈ\t" + "3. ������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" ���Ǵ� �̷��� 3������ �ִ�.");
				System.out.print("1. û����\t" + "2. ������\t" + "3. ��������\n" + "���Ǵ� ���� ������ : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" ������ �̷��� 3������ �ִ�.");
				System.out.print("1. ����\t" + " 2. �����\t" + "3. �װ�����\t" + "4. �� �Դ´�.\n" + "�ƿ��ʹ� ���� ������ : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" ������ �̷��� �ִ�.\n");
				System.out.print("1. ����\t" + "2. ũ�ν���\t" + "3. ������Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" �Ǽ��縮�� �̷��� �ִ�.");
				System.out.print("1. �Ѵ������Ѵ�\t" + "2. ����\t" + "3. �ð�\t" + "4. �ƹ��͵� ���Ѵ�.\n" + "���� �����ұ� : ");
				answer = scaner.nextInt();
				switch (answer) {
				case 1:
					watch = true;
					bracelet = true;
					break;
				case 2:
					watch = false;
					bracelet = true;
					break;
				case 3:
					watch = true;
					bracelet = false;
					break;
				case 4:
					watch = false;
					bracelet = false;
					break;
				}
			}
				break;
			case 6: {
				System.out.println(" �Źߴ� �̷��� 3������ �ִ�.");
				System.out.print("1. ����Ŀ��\t" + "2. �ȭ\t " + " 3. ����\n" + "�Ź��� ���� ������ : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;
			}
			System.out.println("���ó��� ���� ���� �̷��� �ȴ�.\n");
			{
				if (topnumber == 1) {
					System.out.println("���Ǵ� ����Ƽ��.\n");
					clothtime += 1;
				} else if (topnumber == 2) {
					System.out.println("���Ǵ� ��Ʈ��.\n");
					clothtime += 2;
				} else if (topnumber == 3) {
					System.out.println("���Ǵ� �������̴�.\n");
					clothtime += 3;
				}
			}
			{
				if (pantsnumber == 1) {
					System.out.println("���Ǵ� û������.\n");
				} else if (pantsnumber == 2) {
					System.out.println("���Ǵ� ��������.\n");
					clothtime += 2;
				} else if (pantsnumber == 3) {
					System.out.println("���Ǵ� ����������.\n");
					clothtime += 3;
				}
			}

			{
				if (outernumber == 1) {
					System.out.println("������ �����̴�.\n");
				} else if (outernumber == 2) {
					System.out.println("������ ������̴�.\n");
					clothtime += 2;
				} else if (outernumber == 3) {
					System.out.println("������ �װ����۴�.\n");
					clothtime += 3;
				} else if (outernumber == 4) {
					System.out.println("������ ���Դ���.\n");
				}
			}
			{
				if (bagnumber == 1) {
					System.out.println("������ �����̴�.\n");
				} else if (bagnumber == 2) {
					System.out.println("������ ũ�ν����̴�.\n");
					clothtime += 2;
				} else if (bagnumber == 3) {
					System.out.println("������ ������Ѵ�.\n");
				}
			}
			{
				if ((watch == true) && (bracelet == true)) {
					System.out.println("����� �ð踦 �����Ѵ�.\n");
					clothtime += 1;
				} else if ((watch == false) && (bracelet == true)) {
					System.out.println("�ð�� ������ ��� ����.\n");
					clothtime += 2;
				} else if ((watch == true) && (bracelet == false)) {
					System.out.println("�ð�� �����ϰ� ����� ������.\n");
					clothtime += 3;
				} else if ((watch == false) && (bracelet == false)) {
					System.out.println("�ð�� ���� �Ѵ� ������Ѵ�.");
				}
			}
			{
				if (shoesnumber == 1) {
					System.out.println("�Ź��� ����Ŀ���.\n");
				} else if (shoesnumber == 2) {
					System.out.println("�Ź��� �ȭ��.\n");
					clothtime += 2;
				} else if (shoesnumber == 3) {
					System.out.println("�Ź��� ���δ�.\n");
					clothtime += 3;
				}
			}

			System.out.printf("���� �� �Ծ���.\n" + "�غ��ϴµ� %d�� �ɷȴ�.\n\n", clothtime);
			minutes += clothtime;
			if (minutes >= 60) {
				minutes -= 60;
				hours += 1;
			}
			{
				System.out.println("���� ������.\n" + "�ϱ⿹���� ��� ���Դ�.\n\n");
				int ��� = (int) (Math.random() * 2);
				{
					if (��� == 1) {
						System.out.println("�ۿ� ��´�.\n");

					} else if (��� == 0) {
						System.out.println("�ۿ� �� �ȿ´�.\n");
					}
				}
				if (rain2 == true) {
					if (��� == 1) {
						System.out.println("��ħ�� ��´ٰ� �ߴµ� ��Ȯ�ϳ�\n");
					} else if (��� == 0) {
						System.out.println("��ħ�� ��´ٰ� �ߴµ� �� �ȿ´�.\n");
					}
				} else if (rain2 == false) {
					if (��� == 1) {
						System.out.println("��ħ�� �� �ȿ´ٰ� �ߴµ� ��´�. \n");
					} else if (��� == 0) {
						System.out.println("��ħ�� �� �ȿ´ٰ� �ߴµ� ��Ȯ�ϳ�.\n");
					}
				}
			}
			System.out.printf("[���� ���� ��� �ð��� %d�� %d���Դϴ�.]\n", hours, minutes);
			if (hours <= 10) {
				if ((hours == 10) && (minutes > 50)) {
					System.out.println("�ð� ������ ����. ��� �ð��� ��Ű�� ���Ҳ� ����.\n" + "�������ʹ� ���� ���θ���\n");
				} else {
					System.out.println("�ð� ������ �ִ�. ������ ����� ���Ѽ� �����̴�.\n\n");
				}
			} else {
				System.out.println("�ð� ������ ����. ��� �ð��� ��Ű�� ���Ҳ� ����.\n" + "�������ʹ� ���� ���θ���\n");
			}

		}
	}
}
