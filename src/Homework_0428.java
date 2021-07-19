import java.util.Scanner;

/*
 * 1번째 조건 내가 밥먹는데 걸리는 시간 10분
 * 2번째 조건 샤워하는데 걸리는 시간 10~15
 */
public class Homework_0428 {
	public static void main(String[] args) {
		int hours = 7;
		int minutes = 30;
		int card = 100000; // 최초의 카드 십만원
		int cash = 100000; // 최초의 현금 십만원
		boolean brush1 = false;
		boolean brush2 = true;
		boolean 우산 = false;
		Scanner scaner = new Scanner(System.in);

		System.out.printf("오늘은 21일이고 현재 시간은 %d시 : %d분입니다. \n", hours, minutes);
		System.out.println("오늘 약속은 친구들과 점심 약속이 11:00시에 있습니다.\n" + "약속 장소까지 가는데 걸리는 시간은 10분입니다.");
		System.out.println(" 약속 시간에 늦지 않게 외출준비를 합시다.");
		System.out.println("지금부터 행동을 시작합니다. ");
		System.out.println("다음에 오는 보기중에서 고르시면 됩니다.");
		System.out.println("-----------------------------------------");
		// 질문 시작
		System.out.println(" 잠을 자다가 잠에서 깼습니다.\n" + "\n일어나서 거실로 걸어나간다.\n" + "다음 보기중에서 고르시오.\n");
		System.out.print("A 1. 밥을 먹는다  " + "2. 씻는다.\n" + " 나의 행동은 : ");
		int answer = scaner.nextInt();
		if (answer == 1) // 일어나서 밥을 먹는다는 답변
		{
			brush2 = false; // 만일 밥먹기 전에 양치를 하면 밥을 안먹기 위한 참 거짓 (앤드연산자 사용)
			System.out.println("\nQ : 밥을 먹는다\n" + "밥을 어떻게 먹을 것인가 ?");
			System.out
					.print("\nA 1. 내가 조리해서 먹는다. " + "2. 시켜서 먹는다. " + "3. 집에 있는 반찬으로 차려서 먹는다.\n" + " 내가 아침밥을 먹는 방법은 : ");
			answer = scaner.nextInt();
			if (answer == 1) // 내가 밥을 조리해서 먹는다는 답변
			{
				System.out.println("\nQ : 내가 만들어서 먹는다.\n" + " 뭐를 만들어서 먹을까 ? ");
				System.out.print("\nA 1. 라면 " + "2. 볶음밥 " + "3. 찌개 \n" + " 나의 만들어서 먹을 음식은 : ");
				answer = scaner.nextInt();
				if (answer == 1) // 내가 라면을 끓여 먹겠다는 답변
				{
					minutes += 20;
					System.out.println("\n라면을 먹었더니 20분이 지났네, 씻어야겠다.");
					System.out.println("\nQ : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
					System.out.print("\nA 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // 일어나서 샤워만 한다는 답볍
					{
						System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
						System.out.print("\n욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("\n먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.println("\n그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("\n그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("클랜징폼")) {
								System.out.println("\n그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("\n그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else {
							System.out.print("\n먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.println("\n그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("\n그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						}
					} else if (answer == 2) // 일어나서 양치만 한다는 답변
					{
						brush1 = true;
						System.out.println("Q : 양치했는데");
						if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
						{
							System.out.println(" 밥은 먹지 말아야지");
						} else // 밥먹고 양치했으니 개운
						{
							System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
						}
					} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
					{
						System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}
								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("클랜징폼")) {
							System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else {
							System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						}
					}
				} else if (answer == 2) // 내가 볶음밥을 먹겠다는 답변
				{
					minutes += 30;
					System.out.println("볶음밥을 만들어서 먹었더니 30분이 지났네, 씻어야겠다.");
					System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
					System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // 일어나서 샤워만 한다는 답볍
					{
						System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("클랜징폼")) {
								System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else {
							System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						}
					} else if (answer == 2) // 일어나서 양치만 한다는 답변
					{
						brush1 = true;
						System.out.println("Q : 양치했는데");
						if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
						{
							System.out.println(" 밥은 먹지 말아야지");
						} else // 밥먹고 양치했으니 개운
						{
							System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
						}
					} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
					{
						System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}
								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("클랜징폼")) {
							System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else {
							System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						}
					}
				} else if (answer == 3) // 내가 찌개를 끓여먹겠다는 답변
				{
					minutes += 30;
					System.out.println("찌개를 만들어서 먹었더니 30분이 지났네, 씻어야겠다.");
					System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
					System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // 일어나서 샤워만 한다는 답볍
					{
						System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("클랜징폼")) {
								System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else {
							System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						}
					} else if (answer == 2) // 일어나서 양치만 한다는 답변
					{
						brush1 = true;
						System.out.println("Q : 양치했는데");
						if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
						{
							System.out.println(" 밥은 먹지 말아야지");
						} else // 밥먹고 양치했으니 개운
						{
							System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
						}
					} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
					{
						System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}
								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("클랜징폼")) {
							System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else {
							System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						}
					}
				}
			} else if (answer == 2) // 밥을 시켜서 먹는다는 답변
			{
				System.out.println("Q : 배달음식을 시켜서 먹는다.\n" + " 뭐를 시켜서 먹을까 ? ");
				System.out.print(
						"(배달까지 걸리는 시간)A 1. 중식(배달20분) " + "2. 양식(배달30분) " + "3. 한식(배달30분) \n" + " 내가 시켜먹을 음식은 : ");
				answer = scaner.nextInt();
				if (answer == 1) // 중국집을 시킨다는 답변
				{
					System.out.println("Q : 중식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
					System.out.print("A 1. 짜장면(5000원)" + "2. 짬뽕(6000원) " + "3. 볶음밥(6000원)\n" + " 나의 주문은 : ");
					answer = scaner.nextInt();
					if (answer == 1) // 짜장면이 배달이 왔다.
					{
						minutes += 30;
						int a = (int) (Math.random() * 2);// 랜던변수
						if (a == 1) // 짜장면 카드결제
						{
							card -= 5000;
							System.out.printf("짜장면 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n", card,
									cash);
							System.out.println("짜장면을 먹었으니 30분이 지났네 씻어야겠다.");
						} else // 짜장면 현금결제
						{
							cash -= 5000;
							System.out.printf("짜장면 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n", card,
									cash);
							System.out.println("짜장면을 먹었으니 30분이 지났네 씻어야겠다.");
						}
						System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
						System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // 일어나서 샤워만 한다는 답볍
						{
							System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else {
								System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							}
						} else if (answer == 2) // 일어나서 양치만 한다는 답변
						{
							brush1 = true;
							System.out.println("Q : 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
						{
							System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}
									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("클랜징폼")) {
								System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else {
								System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							}
						}
					} else if (answer == 2)// 짬뽕이 배달이 왔다.
					{
						minutes += 30;
						int a = (int) (Math.random() * 2);// 랜던변수
						if (a == 1) // 짬뽕 카드결제
						{
							card -= 6000;
							System.out.printf("짬뽕이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %dn\n",
									card, cash);
							System.out.println("짬뽕을 먹었으니 30분이 지났네 씻어야겠다.");
						} else // 짬뽕 현금결제
						{
							cash -= 6000;
							System.out.printf("짬뽕이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n", card,
									cash);
							System.out.println("짬뽕을 먹었으니 30분이 지났네 씻어야겠다.");
						}
						System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
						System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // 일어나서 샤워만 한다는 답볍
						{
							System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else {
								System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							}
						} else if (answer == 2) // 일어나서 양치만 한다는 답변
						{
							brush1 = true;
							System.out.println("Q : 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
						{
							System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}
									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("클랜징폼")) {
								System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else {
								System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							}
						}
					} else if (answer == 3) // 볶음밥 배달이 왔다.
					{
						minutes += 30;
						int a = (int) (Math.random() * 2);// 랜던변수
						if (a == 1) // 볶음밥 카드결제
						{
							card -= 6000;
							System.out.printf("볶음밥이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("볶음밥을 먹었으니 30분이 지났네 씻어야겠다.");
						} else // 볶음밥 현금결제
						{
							cash -= 6000;
							System.out.printf("볶음밥이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("볶음밥을 먹었으니 30분이 지났네 씻어야겠다.");
						}
						System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
						System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // 일어나서 샤워만 한다는 답볍
						{
							System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else {
								System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							}
						} else if (answer == 2) // 일어나서 양치만 한다는 답변
						{
							brush1 = true;
							System.out.println("Q : 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
						{
							System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}
									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("클랜징폼")) {
								System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else {
								System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							}
						}
					}
				} else if (answer == 2) // 양식을 시킨다는 답변
				{
					System.out.println("Q : 양식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
					System.out.print("A 1. 수제버거(9000원)" + "2. 돈까스(8000원) " + "3. 버거(5000원)\n" + " 나의 주문은 : ");
					answer = scaner.nextInt();
					if (answer == 1) // 수제버거가 배달이 왔다.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// 랜던변수
						if (a == 1) // 수제버거 카드결제
						{
							card -= 9000;
							System.out.printf("수제버거가 배달이 왔다.\n" + "카드 9천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("수제버거를 먹었으니 40분이 지났네 씻어야겠다.");
						} else // 수제버거 현금결제
						{
							cash -= 9000;
							System.out.printf("수제버거가 배달이 왔다.\n" + "현금 9천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("수제버거를 먹었으니 40분이 지났네 씻어야겠다.");
						}
						System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
						System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // 일어나서 샤워만 한다는 답볍
						{
							System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else {
								System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							}
						} else if (answer == 2) // 일어나서 양치만 한다는 답변
						{
							brush1 = true;
							System.out.println("Q : 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
						{
							System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}
									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("클랜징폼")) {
								System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else {
								System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							}
						}
					} else if (answer == 2)// 돈까스가 배달이 왔다.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// 랜던변수
						if (a == 1) // 돈까스가 카드결제
						{
							card -= 8000;
							System.out.printf("돈까스가 배달이 왔다.\n" + "카드 8천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("돈까스를 먹었으니 40분이 지났네 씻어야겠다.");
						} else // 돈까스가 현금결제
						{
							cash -= 8000;
							System.out.printf("돈까스가 배달이 왔다.\n" + "현금 8천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("돈까스를 먹었으니 40분이 지났네 씻어야겠다.");
						}
						System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
						System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // 일어나서 샤워만 한다는 답볍
						{
							System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else {
								System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							}
						} else if (answer == 2) // 일어나서 양치만 한다는 답변
						{
							brush1 = true;
							System.out.println("Q : 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
						{
							System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}
									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("클랜징폼")) {
								System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else {
								System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							}
						}
					} else if (answer == 3) // 버거가 배달이 왔다.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// 랜던변수
						if (a == 1) // 버거카드결제
						{
							card -= 5000;
							System.out.printf("버거가 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n", card,
									cash);
							System.out.println("버거를 먹었으니 40분이 지났네 씻어야겠다.");
						} else // 버거현금결제
						{
							cash -= 5000;
							System.out.printf("버거가 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n", card,
									cash);
							System.out.println("버거를 먹었으니 40분이 지났네 씻어야겠다.");
						}
						System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
						System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // 일어나서 샤워만 한다는 답볍
						{
							System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else {
								System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							}
						} else if (answer == 2) // 일어나서 양치만 한다는 답변
						{
							brush1 = true;
							System.out.println("Q : 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
						{
							System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}
									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("클랜징폼")) {
								System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else {
								System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							}
						}
					}
				} else if (answer == 3) // 한식을 시킨다는 답변
				{
					System.out.println("Q : 한식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
					System.out.print("A 1. 김치찌개(7000원)" + "2. 된장찌개(7000원) " + "3. 백반(6000원)\n" + " 나의 주문은 : ");
					answer = scaner.nextInt();
					if (answer == 1) // 김치찌개가 배달이 왔다.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// 랜던변수
						if (a == 1) // 김치찌개 카드결제
						{
							card -= 7000;
							System.out.printf("김치찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("김치찌개를 먹었으니 40분이 지났네 씻어야겠다.");
						} else // 김치찌개 현금결제
						{
							cash -= 7000;
							System.out.printf("김치찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("김치찌개를 먹었으니 40분이 지났네 씻어야겠다.");
						}
						System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
						System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // 일어나서 샤워만 한다는 답볍
						{
							System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else {
								System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							}
						} else if (answer == 2) // 일어나서 양치만 한다는 답변
						{
							brush1 = true;
							System.out.println("Q : 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
						{
							System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}
									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("클랜징폼")) {
								System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else {
								System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							}
						}
					} else if (answer == 2)// 된장찌개가 배달이 왔다.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// 랜던변수
						if (a == 1) // 된장찌개가 카드결제
						{
							card -= 7000;
							System.out.printf("된장찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("된장찌개를 먹었으니 40분이 지났네 씻어야겠다.");
						} else // 된장찌개가 현금결제
						{
							cash -= 7000;
							System.out.printf("된장찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n",
									card, cash);
							System.out.println("된장찌개를 먹었으니 40분이 지났네 씻어야겠다.");
						}
						System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
						System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // 일어나서 샤워만 한다는 답볍
						{
							System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else {
								System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							}
						} else if (answer == 2) // 일어나서 양치만 한다는 답변
						{
							brush1 = true;
							System.out.println("Q : 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
						{
							System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}
									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("클랜징폼")) {
								System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else {
								System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							}
						}
					} else if (answer == 3) // 백반이 배달이 왔다.
					{
						minutes += 40;
						int a = (int) (Math.random() * 2);// 랜던변수
						if (a == 1) // 백반 카드결제
						{
							card -= 6000;
							System.out.printf("백반이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n", card,
									cash);
							System.out.println("백반을 먹었으니 40분이 지났네 씻어야겠다.");
						} else // 백반 현금결제
						{
							cash -= 6000;
							System.out.printf("백반이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 카드 잔액 : %d,  남은 현금 잔액 : %d\n", card,
									cash);
							System.out.println("백반을 먹었으니 40분이 지났네 씻어야겠다.");
						}
						System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
						System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
						String shower1, shower2, shower3, shower4;
						answer = scaner.nextInt();
						if (answer == 1) // 일어나서 샤워만 한다는 답볍
						{
							System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							} else {
								System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								} else {
									System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
								}
							}
						} else if (answer == 2) // 일어나서 양치만 한다는 답변
						{
							brush1 = true;
							System.out.println("Q : 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
						{
							System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
							System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
							shower1 = scaner.next();
							if (shower1.equals("샴푸")) {
								System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}
									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시 해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("바디워시")) {
								System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("클랜징폼")) {
										System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("클랜징폼")) {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else if (shower1.equals("클랜징폼")) {
								System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 양치해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 양치하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							} else {
								System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
								shower2 = scaner.next();
								if (shower2.equals("샴푸")) {
									System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("바디워시")) {
										System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else if (shower2.equals("바디워시")) {
									System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
									shower3 = scaner.next();
									if (shower3.equals("샤워")) {
										System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								} else {
									System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
									shower3 = scaner.next();
									if (shower3.equals("샴푸")) {
										System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									} else {
										System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
										brush1 = true;
										System.out.println(" 양치했는데");
										if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
										{
											System.out.println(" 밥은 먹지 말아야지");
										} else // 밥먹고 양치했으니 개운
										{
											System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
										}

									}
								}
							}
						}
					}
				}
			} else if (answer == 3) // 집에 있는 반찬으로 밥을 차려먹는 다는 답변
			{
				System.out.println("Q : 집에 있는 반찬으로 차려서 먹는다." + " 냉장고에 반찬이 많이 있다.");
				System.out.print("(최대 3개까지)꺼내먹을 반찬 가지 수는 : ");
				String subdish1, subdish2, subdish3;
				answer = scaner.nextInt();
				switch (answer) {
				case 1: {
					minutes += 20;
					System.out.print("꺼내먹을 반찬은 : ");
					subdish1 = scaner.next();
					System.out.printf("밥이랑 반찬 %s(이)랑 같이 먹어야지", subdish1);
					System.out.println("밥을 20분 동안 먹었으니 씻어야겠다.");
					System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
					System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // 일어나서 샤워만 한다는 답볍
					{
						System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("클랜징폼")) {
								System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else {
							System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						}
					} else if (answer == 2) // 일어나서 양치만 한다는 답변
					{
						brush1 = true;
						System.out.println("Q : 양치했는데");
						if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
						{
							System.out.println(" 밥은 먹지 말아야지");
						} else // 밥먹고 양치했으니 개운
						{
							System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
						}
					} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
					{
						System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}
								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("클랜징폼")) {
							System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else {
							System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						}
					}
					break;
				}
				case 2: {
					minutes += 20;
					System.out.print("꺼내먹을 반찬은 : ");
					subdish1 = scaner.next();
					System.out.print("그 다음 꺼내먹을 반찬은 : ");
					subdish2 = scaner.next();
					System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2);
					System.out.println("밥을 20분 동안 먹었으니 씻어야겠다.");
					System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
					System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // 일어나서 샤워만 한다는 답볍
					{
						System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("클랜징폼")) {
								System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else {
							System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						}
					} else if (answer == 2) // 일어나서 양치만 한다는 답변
					{
						brush1 = true;
						System.out.println("Q : 양치했는데");
						if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
						{
							System.out.println(" 밥은 먹지 말아야지");
						} else // 밥먹고 양치했으니 개운
						{
							System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
						}
					} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
					{
						System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}
								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("클랜징폼")) {
							System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else {
							System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						}
					}
					break;
				}
				case 3: {
					minutes += 20;
					System.out.print("꺼내먹을 반찬은 : ");
					subdish1 = scaner.next();
					System.out.print("그 다음 꺼내먹을 반찬은 : ");
					subdish2 = scaner.next();
					System.out.print("그 다음 꺼내먹을 반찬은 : ");
					subdish3 = scaner.next();
					System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2, subdish3);
					System.out.println("밥을 20분 동안 먹었으니 씻어야겠다.");
					System.out.println("Q : 밥도 먹었으니 씻자.\n" + " 어디를 씻을까?");
					System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
					String shower1, shower2, shower3, shower4;
					answer = scaner.nextInt();
					if (answer == 1) // 일어나서 샤워만 한다는 답볍
					{
						System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("클랜징폼")) {
								System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						} else {
							System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							} else {
								System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 하니 상쾌하네.");
							}
						}
					} else if (answer == 2) // 일어나서 양치만 한다는 답변
					{
						brush1 = true;
						System.out.println("Q : 양치했는데");
						if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
						{
							System.out.println(" 밥은 먹지 말아야지");
						} else // 밥먹고 양치했으니 개운
						{
							System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
						}
					} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
					{
						System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
						System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
						shower1 = scaner.next();
						if (shower1.equals("샴푸")) {
							System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}
								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시 해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("바디워시")) {
							System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("클랜징폼")) {
									System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("클랜징폼")) {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else if (shower1.equals("클랜징폼")) {
							System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 양치해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 양치하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						} else {
							System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
							shower2 = scaner.next();
							if (shower2.equals("샴푸")) {
								System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("바디워시")) {
									System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else if (shower2.equals("바디워시")) {
								System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
								shower3 = scaner.next();
								if (shower3.equals("샤워")) {
									System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							} else {
								System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
								shower3 = scaner.next();
								if (shower3.equals("샴푸")) {
									System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								} else {
									System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
									brush1 = true;
									System.out.println(" 양치했는데");
									if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
									{
										System.out.println(" 밥은 먹지 말아야지");
									} else // 밥먹고 양치했으니 개운
									{
										System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
									}

								}
							}
						}
					}
					break;
				}
				}
			}
		} else if (answer == 2) // 일어나서 씻는다는 답볍
		{
			System.out.println("Q : 일단 씻어야 한다.\n" + " 어디를 씻을까?");
			System.out.print("A 1. 샤워를 한다.  " + "2. 양치만 한다.  " + "3. 둘다 한다.\n" + " 나의 행동은 : ");
			String shower1, shower2, shower3, shower4;
			answer = scaner.nextInt();
			if (answer == 1) // 일어나서 샤워만 한다는 답볍
			{
				minutes += 15;
				System.out.println("Q : 샤워를 하자\n" + "욕실로 들어가자");
				System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
				shower1 = scaner.next();
				if (shower1.equals("샴푸")) {
					System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
					shower2 = scaner.next();
					if (shower2.equals("바디워시")) {
						System.out.println("그 다음에는 바디워시 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 다했으니 밥먹어야지.\n");
						System.out.println("Q : 밥을 먹는다\n" + "밥을 어떻게 먹을 것인가 ?");
						System.out.print("A 1. 내가 조리해서 먹는다. " + "2. 시켜서 먹는다. " + "3. 집에 있는 반찬으로 차려서 먹는다.\n"
								+ " 내가 아침밥을 먹는 방법은 : ");
						answer = scaner.nextInt();
						if (answer == 1) // 내가 밥을 조리해서 먹는다는 답변
						{
							System.out.println("Q : 내가 만들어서 먹는다.\n" + " 뭐를 만들어서 먹을까 ? ");
							System.out.print("A 1. 라면 " + "2. 볶음밥 " + "3. 찌개 \n" + " 나의 만들어서 먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 내가 라면을 끓여 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("라면을 먹었더니 30분이 지났네. ");
							} else if (answer == 2) // 내가 볶음밥을 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("볶음밥을 만들어서 먹었더니 30분이 지났네. ");
							} else if (answer == 3) // 내가 찌개를 끓여먹겠다는 답변
							{
								minutes += 40;
								System.out.println("찌개를 만들어서 먹었더니 40분이 지났네.");
							}
						} else if (answer == 2) // 밥을 시켜서 먹는다는 답변
						{
							System.out.println("Q : 배달음식을 시켜서 먹는다.\n" + " 뭐를 시켜서 먹을까 ? ");
							System.out.print("(배달까지 걸리는 시간)A 1. 중식(배달30분) " + "2. 양식(배달30분) " + "3. 한식(배달50분) \n"
									+ " 내가 시켜먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 중국집을 시킨다는 답변
							{
								System.out.println("Q : 중식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 짜장면(5000원)" + "2. 짬뽕(6000원) " + "3. 볶음밥(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 짜장면이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짜장면 카드결제
									{
										card -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짜장면 맛있게 잘먹었다.");
									} else // 짜장면 현금결제
									{
										cash -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짜장면을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 짬뽕이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짬뽕 카드결제
									{
										card -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									} else // 짬뽕 현금결제
									{
										cash -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 볶음밥 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 볶음밥 카드결제
									{
										card -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									} else // 볶음밥 현금결제
									{
										cash -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 2) // 양식을 시킨다는 답변
							{
								System.out.println("Q : 양식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 수제버거(9000원)" + "2. 돈까스(8000원) " + "3. 버거(5000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 수제버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 수제버거 카드결제
									{
										card -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "카드 9천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									} else // 수제버거 현금결제
									{
										cash -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "현금 9천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 돈까스가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 돈까스가 카드결제
									{
										card -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "카드 8천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									} else // 돈까스가 현금결제
									{
										cash -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "현금 8천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 버거카드결제
									{
										card -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("버거를 맛있게 잘먹었다.");
									} else // 버거현금결제
									{
										cash -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("버거를 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 3) // 한식을 시킨다는 답변
							{
								System.out.println("Q : 한식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out.print(
										"A 1. 김치찌개(7000원)" + "2. 된장찌개(7000원) " + "3. 백반(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 김치찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 김치찌개 카드결제
									{
										card -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									} else // 김치찌개 현금결제
									{
										cash -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 된장찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 된장찌개가 카드결제
									{
										card -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									} else // 된장찌개가 현금결제
									{
										cash -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 백반이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 백반 카드결제
									{
										card -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("백반을 맛있게 잘먹었다.");
									} else // 백반 현금결제
									{
										cash -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("백반을 맛있게 잘먹었다.");
									}
								}
							}
						} else if (answer == 3) // 집에 있는 반찬으로 밥을 차려먹는 다는 답변
						{
							System.out.println("Q : 집에 있는 반찬으로 차려서 먹는다." + " 냉장고에 반찬이 많이 있다.");
							System.out.print("(최대 3개까지)꺼내먹을 반찬 가지 수는 : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 같이 먹어야지", subdish1);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 2: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 3: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish3 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2, subdish3);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							}
						}
					} else {
						System.out.println("그 다음에는 클랜징폼 그리고 바디워시로 씻어야지.\n" + "샤워를 다했으니 밥먹어야지.\n");
						System.out.println("Q : 밥을 먹는다\n" + "밥을 어떻게 먹을 것인가 ?");
						System.out.print("A 1. 내가 조리해서 먹는다. " + "2. 시켜서 먹는다. " + "3. 집에 있는 반찬으로 차려서 먹는다.\n"
								+ " 내가 아침밥을 먹는 방법은 : ");
						answer = scaner.nextInt();
						if (answer == 1) // 내가 밥을 조리해서 먹는다는 답변
						{
							System.out.println("Q : 내가 만들어서 먹는다.\n" + " 뭐를 만들어서 먹을까 ? ");
							System.out.print("A 1. 라면 " + "2. 볶음밥 " + "3. 찌개 \n" + " 나의 만들어서 먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 내가 라면을 끓여 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("라면을 먹었더니 30분이 지났네. ");
							} else if (answer == 2) // 내가 볶음밥을 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("볶음밥을 만들어서 먹었더니 30분이 지났네. ");
							} else if (answer == 3) // 내가 찌개를 끓여먹겠다는 답변
							{
								minutes += 40;
								System.out.println("찌개를 만들어서 먹었더니 40분이 지났네.");
							}
						} else if (answer == 2) // 밥을 시켜서 먹는다는 답변
						{
							System.out.println("Q : 배달음식을 시켜서 먹는다.\n" + " 뭐를 시켜서 먹을까 ? ");
							System.out.print("(배달까지 걸리는 시간)A 1. 중식(배달30분) " + "2. 양식(배달30분) " + "3. 한식(배달50분) \n"
									+ " 내가 시켜먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 중국집을 시킨다는 답변
							{
								System.out.println("Q : 중식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 짜장면(5000원)" + "2. 짬뽕(6000원) " + "3. 볶음밥(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 짜장면이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짜장면 카드결제
									{
										card -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짜장면 맛있게 잘먹었다.");
									} else // 짜장면 현금결제
									{
										cash -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짜장면을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 짬뽕이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짬뽕 카드결제
									{
										card -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									} else // 짬뽕 현금결제
									{
										cash -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 볶음밥 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 볶음밥 카드결제
									{
										card -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									} else // 볶음밥 현금결제
									{
										cash -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 2) // 양식을 시킨다는 답변
							{
								System.out.println("Q : 양식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 수제버거(9000원)" + "2. 돈까스(8000원) " + "3. 버거(5000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 수제버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 수제버거 카드결제
									{
										card -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "카드 9천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									} else // 수제버거 현금결제
									{
										cash -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "현금 9천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 돈까스가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 돈까스가 카드결제
									{
										card -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "카드 8천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									} else // 돈까스가 현금결제
									{
										cash -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "현금 8천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 버거카드결제
									{
										card -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("버거를 맛있게 잘먹었다.");
									} else // 버거현금결제
									{
										cash -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("버거를 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 3) // 한식을 시킨다는 답변
							{
								System.out.println("Q : 한식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out.print(
										"A 1. 김치찌개(7000원)" + "2. 된장찌개(7000원) " + "3. 백반(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 김치찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 김치찌개 카드결제
									{
										card -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									} else // 김치찌개 현금결제
									{
										cash -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 된장찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 된장찌개가 카드결제
									{
										card -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									} else // 된장찌개가 현금결제
									{
										cash -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 백반이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 백반 카드결제
									{
										card -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("백반을 맛있게 잘먹었다.");
									} else // 백반 현금결제
									{
										cash -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("백반을 맛있게 잘먹었다.");
									}
								}
							}
						} else if (answer == 3) // 집에 있는 반찬으로 밥을 차려먹는 다는 답변
						{
							System.out.println("Q : 집에 있는 반찬으로 차려서 먹는다." + " 냉장고에 반찬이 많이 있다.");
							System.out.print("(최대 3개까지)꺼내먹을 반찬 가지 수는 : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 같이 먹어야지", subdish1);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 2: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 3: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish3 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2, subdish3);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							}
						}
					}
				} else if (shower1.equals("바디워시")) {
					System.out.print("먼저 바디워시 먼저 하고\n" + "그 다음에는 : ");
					shower2 = scaner.next();
					if (shower2.equals("클랜징폼")) {
						System.out.println("그 다음에는 클랜징폼 그리고 샴푸로 씻어야지.\n" + "샤워를 다했으니 밥먹어야지.\n");
						System.out.println("Q : 밥을 먹는다\n" + "밥을 어떻게 먹을 것인가 ?");
						System.out.print("A 1. 내가 조리해서 먹는다. " + "2. 시켜서 먹는다. " + "3. 집에 있는 반찬으로 차려서 먹는다.\n"
								+ " 내가 아침밥을 먹는 방법은 : ");
						answer = scaner.nextInt();
						if (answer == 1) // 내가 밥을 조리해서 먹는다는 답변
						{
							System.out.println("Q : 내가 만들어서 먹는다.\n" + " 뭐를 만들어서 먹을까 ? ");
							System.out.print("A 1. 라면 " + "2. 볶음밥 " + "3. 찌개 \n" + " 나의 만들어서 먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 내가 라면을 끓여 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("라면을 먹었더니 30분이 지났네. ");
							} else if (answer == 2) // 내가 볶음밥을 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("볶음밥을 만들어서 먹었더니 30분이 지났네. ");
							} else if (answer == 3) // 내가 찌개를 끓여먹겠다는 답변
							{
								minutes += 40;
								System.out.println("찌개를 만들어서 먹었더니 40분이 지났네.");
							}
						} else if (answer == 2) // 밥을 시켜서 먹는다는 답변
						{
							System.out.println("Q : 배달음식을 시켜서 먹는다.\n" + " 뭐를 시켜서 먹을까 ? ");
							System.out.print("(배달까지 걸리는 시간)A 1. 중식(배달30분) " + "2. 양식(배달30분) " + "3. 한식(배달50분) \n"
									+ " 내가 시켜먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 중국집을 시킨다는 답변
							{
								System.out.println("Q : 중식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 짜장면(5000원)" + "2. 짬뽕(6000원) " + "3. 볶음밥(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 짜장면이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짜장면 카드결제
									{
										card -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짜장면 맛있게 잘먹었다.");
									} else // 짜장면 현금결제
									{
										cash -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짜장면을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 짬뽕이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짬뽕 카드결제
									{
										card -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									} else // 짬뽕 현금결제
									{
										cash -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 볶음밥 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 볶음밥 카드결제
									{
										card -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									} else // 볶음밥 현금결제
									{
										cash -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 2) // 양식을 시킨다는 답변
							{
								System.out.println("Q : 양식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 수제버거(9000원)" + "2. 돈까스(8000원) " + "3. 버거(5000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 수제버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 수제버거 카드결제
									{
										card -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "카드 9천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									} else // 수제버거 현금결제
									{
										cash -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "현금 9천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 돈까스가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 돈까스가 카드결제
									{
										card -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "카드 8천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									} else // 돈까스가 현금결제
									{
										cash -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "현금 8천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 버거카드결제
									{
										card -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("버거를 맛있게 잘먹었다.");
									} else // 버거현금결제
									{
										cash -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("버거를 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 3) // 한식을 시킨다는 답변
							{
								System.out.println("Q : 한식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out.print(
										"A 1. 김치찌개(7000원)" + "2. 된장찌개(7000원) " + "3. 백반(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 김치찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 김치찌개 카드결제
									{
										card -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									} else // 김치찌개 현금결제
									{
										cash -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 된장찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 된장찌개가 카드결제
									{
										card -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									} else // 된장찌개가 현금결제
									{
										cash -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 백반이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 백반 카드결제
									{
										card -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("백반을 맛있게 잘먹었다.");
									} else // 백반 현금결제
									{
										cash -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("백반을 맛있게 잘먹었다.");
									}
								}
							}
						} else if (answer == 3) // 집에 있는 반찬으로 밥을 차려먹는 다는 답변
						{
							System.out.println("Q : 집에 있는 반찬으로 차려서 먹는다." + " 냉장고에 반찬이 많이 있다.");
							System.out.print("(최대 3개까지)꺼내먹을 반찬 가지 수는 : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 같이 먹어야지", subdish1);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 2: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 3: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish3 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2, subdish3);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							}
						}
					} else {
						System.out.println("그 다음에는 샴푸 그리고 클랜징폼으로 씻어야지.\n" + "샤워를 다했으니 밥먹어야지.\n");
						System.out.println("Q : 밥을 먹는다\n" + "밥을 어떻게 먹을 것인가 ?");
						System.out.print("A 1. 내가 조리해서 먹는다. " + "2. 시켜서 먹는다. " + "3. 집에 있는 반찬으로 차려서 먹는다.\n"
								+ " 내가 아침밥을 먹는 방법은 : ");
						answer = scaner.nextInt();
						if (answer == 1) // 내가 밥을 조리해서 먹는다는 답변
						{
							System.out.println("Q : 내가 만들어서 먹는다.\n" + " 뭐를 만들어서 먹을까 ? ");
							System.out.print("A 1. 라면 " + "2. 볶음밥 " + "3. 찌개 \n" + " 나의 만들어서 먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 내가 라면을 끓여 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("라면을 먹었더니 30분이 지났네. ");
							} else if (answer == 2) // 내가 볶음밥을 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("볶음밥을 만들어서 먹었더니 30분이 지났네. ");
							} else if (answer == 3) // 내가 찌개를 끓여먹겠다는 답변
							{
								minutes += 40;
								System.out.println("찌개를 만들어서 먹었더니 40분이 지났네.");
							}
						} else if (answer == 2) // 밥을 시켜서 먹는다는 답변
						{
							System.out.println("Q : 배달음식을 시켜서 먹는다.\n" + " 뭐를 시켜서 먹을까 ? ");
							System.out.print("(배달까지 걸리는 시간)A 1. 중식(배달30분) " + "2. 양식(배달30분) " + "3. 한식(배달50분) \n"
									+ " 내가 시켜먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 중국집을 시킨다는 답변
							{
								System.out.println("Q : 중식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 짜장면(5000원)" + "2. 짬뽕(6000원) " + "3. 볶음밥(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 짜장면이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짜장면 카드결제
									{
										card -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짜장면 맛있게 잘먹었다.");
									} else // 짜장면 현금결제
									{
										cash -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짜장면을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 짬뽕이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짬뽕 카드결제
									{
										card -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									} else // 짬뽕 현금결제
									{
										cash -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 볶음밥 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 볶음밥 카드결제
									{
										card -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									} else // 볶음밥 현금결제
									{
										cash -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 2) // 양식을 시킨다는 답변
							{
								System.out.println("Q : 양식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 수제버거(9000원)" + "2. 돈까스(8000원) " + "3. 버거(5000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 수제버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 수제버거 카드결제
									{
										card -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "카드 9천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									} else // 수제버거 현금결제
									{
										cash -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "현금 9천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 돈까스가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 돈까스가 카드결제
									{
										card -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "카드 8천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									} else // 돈까스가 현금결제
									{
										cash -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "현금 8천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 버거카드결제
									{
										card -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("버거를 맛있게 잘먹었다.");
									} else // 버거현금결제
									{
										cash -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("버거를 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 3) // 한식을 시킨다는 답변
							{
								System.out.println("Q : 한식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out.print(
										"A 1. 김치찌개(7000원)" + "2. 된장찌개(7000원) " + "3. 백반(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 김치찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 김치찌개 카드결제
									{
										card -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									} else // 김치찌개 현금결제
									{
										cash -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 된장찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 된장찌개가 카드결제
									{
										card -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									} else // 된장찌개가 현금결제
									{
										cash -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 백반이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 백반 카드결제
									{
										card -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("백반을 맛있게 잘먹었다.");
									} else // 백반 현금결제
									{
										cash -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("백반을 맛있게 잘먹었다.");
									}
								}
							}
						} else if (answer == 3) // 집에 있는 반찬으로 밥을 차려먹는 다는 답변
						{
							System.out.println("Q : 집에 있는 반찬으로 차려서 먹는다." + " 냉장고에 반찬이 많이 있다.");
							System.out.print("(최대 3개까지)꺼내먹을 반찬 가지 수는 : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 같이 먹어야지", subdish1);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 2: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 3: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish3 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2, subdish3);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							}
						}
					}
				} else {
					System.out.print("먼저 클랜징폼 먼저 하고\n" + "그 다음에는 : ");
					shower2 = scaner.next();
					if (shower2.equals("샴푸")) {
						System.out.println("그 다음에는 샴푸 그리고 바디워시로 씻어야지.\n" + "샤워를 다했으니 밥먹어야지.\n");
						System.out.println("Q : 밥을 먹는다\n" + "밥을 어떻게 먹을 것인가 ?");
						System.out.print("A 1. 내가 조리해서 먹는다. " + "2. 시켜서 먹는다. " + "3. 집에 있는 반찬으로 차려서 먹는다.\n"
								+ " 내가 아침밥을 먹는 방법은 : ");
						answer = scaner.nextInt();
						if (answer == 1) // 내가 밥을 조리해서 먹는다는 답변
						{
							System.out.println("Q : 내가 만들어서 먹는다.\n" + " 뭐를 만들어서 먹을까 ? ");
							System.out.print("A 1. 라면 " + "2. 볶음밥 " + "3. 찌개 \n" + " 나의 만들어서 먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 내가 라면을 끓여 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("라면을 먹었더니 30분이 지났네. ");
							} else if (answer == 2) // 내가 볶음밥을 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("볶음밥을 만들어서 먹었더니 30분이 지났네. ");
							} else if (answer == 3) // 내가 찌개를 끓여먹겠다는 답변
							{
								minutes += 40;
								System.out.println("찌개를 만들어서 먹었더니 40분이 지났네.");
							}
						} else if (answer == 2) // 밥을 시켜서 먹는다는 답변
						{
							System.out.println("Q : 배달음식을 시켜서 먹는다.\n" + " 뭐를 시켜서 먹을까 ? ");
							System.out.print("(배달까지 걸리는 시간)A 1. 중식(배달30분) " + "2. 양식(배달30분) " + "3. 한식(배달50분) \n"
									+ " 내가 시켜먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 중국집을 시킨다는 답변
							{
								System.out.println("Q : 중식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 짜장면(5000원)" + "2. 짬뽕(6000원) " + "3. 볶음밥(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 짜장면이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짜장면 카드결제
									{
										card -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짜장면 맛있게 잘먹었다.");
									} else // 짜장면 현금결제
									{
										cash -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짜장면을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 짬뽕이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짬뽕 카드결제
									{
										card -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									} else // 짬뽕 현금결제
									{
										cash -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 볶음밥 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 볶음밥 카드결제
									{
										card -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									} else // 볶음밥 현금결제
									{
										cash -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 2) // 양식을 시킨다는 답변
							{
								System.out.println("Q : 양식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 수제버거(9000원)" + "2. 돈까스(8000원) " + "3. 버거(5000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 수제버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 수제버거 카드결제
									{
										card -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "카드 9천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									} else // 수제버거 현금결제
									{
										cash -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "현금 9천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 돈까스가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 돈까스가 카드결제
									{
										card -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "카드 8천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									} else // 돈까스가 현금결제
									{
										cash -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "현금 8천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 버거카드결제
									{
										card -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("버거를 맛있게 잘먹었다.");
									} else // 버거현금결제
									{
										cash -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("버거를 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 3) // 한식을 시킨다는 답변
							{
								System.out.println("Q : 한식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out.print(
										"A 1. 김치찌개(7000원)" + "2. 된장찌개(7000원) " + "3. 백반(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 김치찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 김치찌개 카드결제
									{
										card -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									} else // 김치찌개 현금결제
									{
										cash -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 된장찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 된장찌개가 카드결제
									{
										card -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									} else // 된장찌개가 현금결제
									{
										cash -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 백반이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 백반 카드결제
									{
										card -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("백반을 맛있게 잘먹었다.");
									} else // 백반 현금결제
									{
										cash -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("백반을 맛있게 잘먹었다.");
									}
								}
							}
						} else if (answer == 3) // 집에 있는 반찬으로 밥을 차려먹는 다는 답변
						{
							System.out.println("Q : 집에 있는 반찬으로 차려서 먹는다." + " 냉장고에 반찬이 많이 있다.");
							System.out.print("(최대 3개까지)꺼내먹을 반찬 가지 수는 : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 같이 먹어야지", subdish1);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 2: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 3: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish3 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2, subdish3);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							}
						}
					} else {
						System.out.println("그 다음에는 바디워시 그리고 샴푸로 씻어야지.\n" + "샤워를 다했으니 밥먹어야지.\n");
						System.out.println("Q : 밥을 먹는다\n" + "밥을 어떻게 먹을 것인가 ?");
						System.out.print("A 1. 내가 조리해서 먹는다. " + "2. 시켜서 먹는다. " + "3. 집에 있는 반찬으로 차려서 먹는다.\n"
								+ " 내가 아침밥을 먹는 방법은 : ");
						answer = scaner.nextInt();
						if (answer == 1) // 내가 밥을 조리해서 먹는다는 답변
						{
							System.out.println("Q : 내가 만들어서 먹는다.\n" + " 뭐를 만들어서 먹을까 ? ");
							System.out.print("A 1. 라면 " + "2. 볶음밥 " + "3. 찌개 \n" + " 나의 만들어서 먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 내가 라면을 끓여 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("라면을 먹었더니 30분이 지났네. ");
							} else if (answer == 2) // 내가 볶음밥을 먹겠다는 답변
							{
								minutes += 30;
								System.out.println("볶음밥을 만들어서 먹었더니 30분이 지났네. ");
							} else if (answer == 3) // 내가 찌개를 끓여먹겠다는 답변
							{
								minutes += 40;
								System.out.println("찌개를 만들어서 먹었더니 40분이 지났네.");
							}
						} else if (answer == 2) // 밥을 시켜서 먹는다는 답변
						{
							System.out.println("Q : 배달음식을 시켜서 먹는다.\n" + " 뭐를 시켜서 먹을까 ? ");
							System.out.print("(배달까지 걸리는 시간)A 1. 중식(배달30분) " + "2. 양식(배달30분) " + "3. 한식(배달50분) \n"
									+ " 내가 시켜먹을 음식은 : ");
							answer = scaner.nextInt();
							if (answer == 1) // 중국집을 시킨다는 답변
							{
								System.out.println("Q : 중식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 짜장면(5000원)" + "2. 짬뽕(6000원) " + "3. 볶음밥(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 짜장면이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짜장면 카드결제
									{
										card -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짜장면 맛있게 잘먹었다.");
									} else // 짜장면 현금결제
									{
										cash -= 5000;
										System.out.printf("짜장면 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짜장면을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 짬뽕이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 짬뽕 카드결제
									{
										card -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									} else // 짬뽕 현금결제
									{
										cash -= 6000;
										System.out.printf("짬뽕이 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("짬뽕을 먹었으니 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 볶음밥 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 볶음밥 카드결제
									{
										card -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									} else // 볶음밥 현금결제
									{
										cash -= 6000;
										System.out.printf("볶음밥이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("볶음밥을 먹었으니 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 2) // 양식을 시킨다는 답변
							{
								System.out.println("Q : 양식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out
										.print("A 1. 수제버거(9000원)" + "2. 돈까스(8000원) " + "3. 버거(5000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 수제버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 수제버거 카드결제
									{
										card -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "카드 9천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									} else // 수제버거 현금결제
									{
										cash -= 9000;
										System.out.printf("수제버거가 배달이 왔다.\n" + "현금 9천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("수제버거를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 돈까스가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 돈까스가 카드결제
									{
										card -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "카드 8천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									} else // 돈까스가 현금결제
									{
										cash -= 8000;
										System.out.printf("돈까스가 배달이 왔다.\n" + "현금 8천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("돈까스를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 버거가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 버거카드결제
									{
										card -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "카드 5천원 결제\n" + "남은 잔액 : %d\n", card);
										System.out.println("버거를 맛있게 잘먹었다.");
									} else // 버거현금결제
									{
										cash -= 5000;
										System.out.printf("버거가 배달이 왔다.\n" + "현금 5천원 결제\n" + "남은 잔액 : %d\n", cash);
										System.out.println("버거를 맛있게 잘먹었다.");
									}
								}
							} else if (answer == 3) // 한식을 시킨다는 답변
							{
								System.out.println("Q : 한식으로 배달음식을 주문한다.\n" + " 무슨 메뉴를 주문할까 ? ");
								System.out.print(
										"A 1. 김치찌개(7000원)" + "2. 된장찌개(7000원) " + "3. 백반(6000원)\n" + " 나의 주문은 : ");
								answer = scaner.nextInt();
								if (answer == 1) // 김치찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 김치찌개 카드결제
									{
										card -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									} else // 김치찌개 현금결제
									{
										cash -= 7000;
										System.out.printf("김치찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("김치찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 2)// 된장찌개가 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 된장찌개가 카드결제
									{
										card -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "카드 7천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									} else // 된장찌개가 현금결제
									{
										cash -= 7000;
										System.out.printf("된장찌개가 배달이 왔다.\n" + "현금 7천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("된장찌개를 맛있게 잘먹었다.");
									}
								} else if (answer == 3) // 백반이 배달이 왔다.
								{
									minutes += 30;
									int a = (int) (Math.random() * 2);// 랜던변수
									if (a == 1) // 백반 카드결제
									{
										card -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "카드 6천원 결제\n" + "남은 카드 잔액 : %d\n", card);
										System.out.println("백반을 맛있게 잘먹었다.");
									} else // 백반 현금결제
									{
										cash -= 6000;
										System.out.printf("백반이 배달이 왔다.\n" + "현금 6천원 결제\n" + "남은 현금 잔액 : %d\n", cash);
										System.out.println("백반을 맛있게 잘먹었다.");
									}
								}
							}
						} else if (answer == 3) // 집에 있는 반찬으로 밥을 차려먹는 다는 답변
						{
							System.out.println("Q : 집에 있는 반찬으로 차려서 먹는다." + " 냉장고에 반찬이 많이 있다.");
							System.out.print("(최대 3개까지)꺼내먹을 반찬 가지 수는 : ");
							String subdish1, subdish2, subdish3;
							answer = scaner.nextInt();
							switch (answer) {
							case 1: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 같이 먹어야지", subdish1);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 2: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							case 3: {
								System.out.print("꺼내먹을 반찬은 : ");
								subdish1 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish2 = scaner.next();
								System.out.print("그 다음 꺼내먹을 반찬은 : ");
								subdish3 = scaner.next();
								System.out.printf("밥이랑 반찬 %s(이)랑 %s(이)랑 %s(이)랑 같이 먹어야지", subdish1, subdish2, subdish3);
								System.out.println("밥을 맛있게 잘먹었다.");
								break;
							}
							}
						}
					}
				}
			} else if (answer == 2) // 일어나서 양치만 한다는 답변
			{
				brush1 = true;
				minutes += 5;
				System.out.println(" 양치했는데");
				if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
				{
					System.out.println(" 밥은 먹지 말아야지");
				} else // 밥먹고 양치했으니 개운
				{
					System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
				}
			} else if (answer == 3) // 샤워랑 양치 둘다 한다는 답변
			{
				minutes += 20;
				System.out.println("Q : 샤워를 하자\n" + " 욕실로 들어가자 ");
				System.out.print("욕실에는 샴푸, 바디워시, 클랜징폼, 칫솔이 있다.\n" + "어떤걸로 먼저 씻을까 ?  ");
				shower1 = scaner.next();
				if (shower1.equals("샴푸")) {
					System.out.print("먼저 샴푸먼저 하고\n" + "그 다음에는 : ");
					shower2 = scaner.next();
					if (shower2.equals("바디워시")) {
						System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 :");
						shower3 = scaner.next();
						if (shower3.equals("클랜징폼")) {
							System.out.println("그 다음에는 클랜징폼 그리고 양치해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}
						} else {
							System.out.println("그 다음에는 양치하고 클랜징폼 해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					} else if (shower2.equals("클랜징폼")) {
						System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
						shower3 = scaner.next();
						if (shower3.equals("바디워시")) {
							System.out.println("그 다음에는 바디워시 그리고 양치해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 양치하고 바디워시 해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					} else {
						System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
						shower3 = scaner.next();
						if (shower3.equals("바디워시")) {
							System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					}
				} else if (shower1.equals("바디워시")) {
					System.out.print("먼저 바디워시 하고 \n" + "그 다음에는 : ");
					shower2 = scaner.next();
					if (shower2.equals("샴푸")) {
						System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
						shower3 = scaner.next();
						if (shower3.equals("클랜징폼")) {
							System.out.println("그 다음에는 클랜징폼하고 양치해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 양치하고 클랜징폼해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					} else if (shower2.equals("클랜징폼")) {
						System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 : ");
						shower3 = scaner.next();
						if (shower3.equals("샤워")) {
							System.out.println("그 다음에는 샤워하고 양치해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 양치하고 샤워해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					} else {
						System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
						shower3 = scaner.next();
						if (shower3.equals("샴푸")) {
							System.out.println("그 다음에는 샴푸하고 클랜징폼해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 클랜징폼하고 샴푸해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					}
				} else if (shower1.equals("클랜징폼")) {
					System.out.print("먼저 클랜징폼 하고 \n" + "그 다음에는 : ");
					shower2 = scaner.next();
					if (shower2.equals("샴푸")) {
						System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
						shower3 = scaner.next();
						if (shower3.equals("바디워시")) {
							System.out.println("그 다음에는 바디워시하고 양치해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 양치하고 바디워시해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					} else if (shower2.equals("바디워시")) {
						System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
						shower3 = scaner.next();
						if (shower3.equals("샤워")) {
							System.out.println("그 다음에는 샤워하고 양치해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 양치하고 샤워해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					} else {
						System.out.print("그 다음에는 양치하고\n" + " 그 다음에는 :");
						shower3 = scaner.next();
						if (shower3.equals("샴푸")) {
							System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					}
				} else {
					System.out.print("먼저 양치하고 \n" + "그 다음에는 : ");
					shower2 = scaner.next();
					if (shower2.equals("샴푸")) {
						System.out.print("그 다음에는 샴푸하고\n" + "그 다음에는 : ");
						shower3 = scaner.next();
						if (shower3.equals("바디워시")) {
							System.out.println("그 다음에는 바디워시하고 클랜징폼해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 클랜징폼하고 바디워시해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					} else if (shower2.equals("바디워시")) {
						System.out.print("그 다음에는 바디워시하고\n" + " 그 다음에는 : ");
						shower3 = scaner.next();
						if (shower3.equals("샤워")) {
							System.out.println("그 다음에는 샤워하고 클랜징폼해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 클랜징폼하고 샤워해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					} else {
						System.out.print("그 다음에는 클랜징폼하고\n" + " 그 다음에는 :");
						shower3 = scaner.next();
						if (shower3.endsWith("샴푸")) {
							System.out.println("그 다음에는 샴푸하고 바디워시해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						} else {
							System.out.println("그 다음에는 바디워시하고 샴푸해야지.");
							brush1 = true;
							System.out.println(" 양치했는데");
							if (brush1 == brush2) // 양치했으니 밥먹는거는 포기
							{
								System.out.println(" 밥은 먹지 말아야지");
							} else // 밥먹고 양치했으니 개운
							{
								System.out.println(" 역시 밥먹고 하는 양치는 상쾌하네");
							}

						}
					}
				}
			}
		}

		if (minutes >= 60) // 60분 이상이 되면 1시간이 늘어나는 것을 표현한 조건문
		{
			minutes -= 60;
			hours += 1;
		}
		System.out.printf("[지금 현재 남아 있는 금액은 현금은 %d, 카드에는 %d, 현재 시간은 %d시 %d분입니다.]\n\n", cash, card, hours, minutes);

		System.out.println("지금 막 tv에서 오늘의 일기예보가 나온다.\n");
		{// 날씨에 대한 조건문
			int 온도;
			int 온도1;
			boolean rain = false;
			boolean rain1 = false;
			boolean rain2 = false;
			boolean wind = false;
			boolean wind1 = false;
			boolean 기상청 = false;
			int 바람강도 = 0;
			int 바람강도1 = 0;
			int 비강도 = 0;
			int 비강도1 = 0;
			String 바람세기;// 00 바람
			String 비세기;// 00 비
			{
				온도 = (int) (Math.random() * 11) + 16;
				int 비 = (int) (Math.random() * 2);
				if (비 == 1) {
					rain = true;
					rain2 = true;
					비강도 = (int) (Math.random() * 2);
				} else {
					rain = false;
				}
				int 바람 = (int) (Math.random() * 2);
				if (바람 == 1) {
					wind = true;
					바람강도 = (int) (Math.random() * 2);
				} else {
					wind = false;
				}

			}
			System.out.printf("안녕하십니까 기상예보입니다. 오늘의 날씨입니다.\n\n");
			{
				if (온도 > 24) {
					System.out.printf(" 오늘 아침의 더운  %d도 입니다.\n", 온도);
				} else if (온도 < 21) {
					System.out.printf(" 오늘 아침의 추운 %d도 입니다.\n", 온도);
				} else {
					System.out.printf(" 오늘 아침의 평범한 %d도 입니다.\n", 온도);
				}
			}
			{
				if (rain == true && 비강도 == 1) {
					System.out.println("비는 강한비가 내리며.");
				} else if (rain == true && 비강도 == 0) {
					System.out.println("비는 약한 비가 내리며");
				} else {
					System.out.println("비는 내리지 않고");
				}
			}
			{
				if (wind == true && 바람강도 == 1) {
					System.out.println("바람은 강한 바람이 붑니다.\n\n");
				} else if (wind == true && 비강도 == 0) {
					System.out.println("바람은 약한 바람이 붑니다.\n\n");
				} else {
					System.out.println("바람은 불지 않습니다.\n\n");
				}
			}
			{
				온도1 = (int) (Math.random() * 11) + 16;
				int 비 = (int) (Math.random() * 2);
				if (비 == 1) {
					rain1 = true;
					비강도1 = (int) (Math.random() * 2);
				} else {
					rain1 = false;
				}
				int 바람 = (int) (Math.random() * 2);
				if (바람 == 1) {
					wind1 = true;
					바람강도1 = (int) (Math.random() * 2);
				} else {
					wind1 = false;
				}
			}
			int 온도차이;
			if (온도 > 온도1) {
				온도차이 = 온도 - 온도1;
			} else if (온도 < 온도1) {
				온도차이 = 온도1 - 온도;
			} else {
				온도차이 = 0;
			}
			System.out.printf("이어서 오후날씨입니다.\n");
			{
				if (온도 > 온도1) {
					System.out.printf("아침보다 온도가 %d도 내려간 %d도를 보이며\n", 온도차이, 온도1);
				} else if (온도 < 온도1) {
					System.out.printf("아침보다 온도가 %d도 올라간 %d도를 보이며\n", 온도차이, 온도1);
				} else {
					System.out.printf("아침과 동일한 %d도를 보이며\n", 온도1);
				}
			}
			온도 = 0;
			{
				if (rain1 == true && rain == true) {
					if (비강도 > 비강도1) {
						System.out.println("오전보다 약한비가 내리며.");
					} else if (비강도 < 비강도1) {
						System.out.println("오전보다 강한비가 내리며.");
					} else {
						if (비강도1 == 1)
							System.out.println("오전과 동일하게 강한비가 내리며.");
						else {
							System.out.println("오전과 동일하게 약한비가 내리며.");
						}
					}
				} else if (rain1 == true && rain == false) {
					if (비강도1 == 1) {
						System.out.println("비가 내리지 않은 오전과는 달리 오후에는 강한 비가 내리며");
					} else {
						System.out.println("비가 내리지 않은 오전과는 달리 오후에는 약한 비가 내리며");
					}
				} else if (rain1 == false && rain == true) {
					if (비강도 == 1) {
						System.out.println("강한비가 내린 오전과는 다르게 오후에는 비가 내리지 않으며");
					} else {
						System.out.println("약한비가 내린 오전과는 다르게 오후에는 비가 내리지 않으며");
					}
				} else {
					System.out.println("오전과 동일하게 비는 내리지 않고");
				}
			}
			rain = false;
			비강도 = 0;
			{
				if (wind1 == true && wind == true) {
					if (바람강도 > 바람강도1) {
						System.out.println(" 오전보다 약한 바람이 붑니다.\n\n");
					} else if (바람강도 < 바람강도1) {
						System.out.println(" 오전보다 강한 바람이 붑니다.\n\n");
					} else {
						if (바람강도1 == 1)
							System.out.println("오전과 동일하게 강한 바람이 붑니다.\n\n");
						else {
							System.out.println("오전과 동일하게 약한 바람이 붑니다.\n\n");
						}
					}
				} else if (wind1 == true && wind == false) {
					if (바람강도1 == 1) {
						System.out.println("바람이 불지 않은 오전과는 다르게 오후에는 강한 바람이 붑니다.\n\n");
					} else {
						System.out.println("바람이 불지 않은 오전과는 다르게 오후에는 약한 바람이 붑니다.\n\n");
					}
				} else if (wind1 == false && wind == true) {
					if (바람강도 == 1) {
						System.out.println("강한 바람이 부는 오전과는 다르게 오후에는 바람이 안붑니다.\n\n");
					} else {
						System.out.println("약한 바람이 부는 오전과는 다르게 오후에는 바람이 안붑니다.\n\n");
					}
				} else {
					System.out.println("오전과 동일하게 바람은 불지 않습니다.\n\n");
				}
			}
			wind = false;
			바람강도 = 0;
			{
				온도 = (int) (Math.random() * 11) + 16;
				int 비 = (int) (Math.random() * 2);
				if (비 == 1) {
					rain = true;
					비강도 = (int) (Math.random() * 2);
				} else {
					rain = false;
				}
				int 바람 = (int) (Math.random() * 2);
				if (바람 == 1) {
					wind = true;
					바람강도 = (int) (Math.random() * 2);
				} else {
					wind = false;
				}

			}
			if (온도 > 온도1) {
				온도차이 = 온도 - 온도1;
			} else if (온도 < 온도1) {
				온도차이 = 온도1 - 온도;
			} else {
				온도차이 = 0;
			}
			System.out.printf("이어서 저녁날씨입니다.\n");
			if (온도 > 온도1) {
				System.out.printf("오후보다  온도가 %d도 올라간 %d도를 보이며\n", 온도차이, 온도);
			} else if (온도 < 온도1) {
				System.out.printf("오후보다 온도가 %d도 내려간 %d도를 보이며\n", 온도차이, 온도);
			} else {
				System.out.printf("오후와 동일한 온도인 %d도 보이며\n", 온도);
			}
			if (rain1 == true && rain == true) {
				if (비강도 > 비강도1) {
					System.out.println("오후보다 강한비가 내리며.");
				} else if (비강도 < 비강도1) {
					System.out.println("오후보다 약한비가 내리며.");
				} else {
					if (비강도 == 1)
						System.out.println("오후와 동일하게 강한비가 내리며.");
					else {
						System.out.println("오후와 동일하게 약한비가 내리며.");
					}
				}
			} else if (rain == true && rain1 == false) {
				if (비강도 == 1) {
					System.out.println("비가 내리지 않은 오후와는 달리 저녁에는 강한 비가 내리며");
				} else {
					System.out.println("비가 내리지 않은 오후와는 달리 저녁에는 약한 비가 내리며");
				}
			} else if (rain == false && rain1 == true) {
				if (비강도1 == 1) {
					System.out.println("강한비가 내린 오후와는 다르게 저녁에는 비가 내리지 않으며");
				} else {
					System.out.println("약한비가 내린 오후와는 다르게 저녁에는 비가 내리지 않으며");
				}
			} else {
				System.out.println("오후와 동일하게 비는 내리지 않고");
			}

			if (wind == true && wind1 == true) {
				if (바람강도 > 바람강도1) {
					System.out.println("오후보다 강한 바람이 붑니다.\n\n");
				} else if (바람강도 < 바람강도1) {
					System.out.println("오후보다 약한 바람이 붑니다.\n\n");
				} else {
					if (바람강도 == 1)
						System.out.println("오후와 동일하게 강한 바람이 붑니다.\n\n");
					else {
						System.out.println("오후와 동일하게 약한 바람이 붑니다.\n\n");
					}
				}
			} else if (wind == true && wind1 == false) {
				if (바람강도 == 1) {
					System.out.println("바람이 불지 않은 오후와는 다르게 저녁에는 강한 바람이 붑니다.\n\n");
				} else {
					System.out.println("바람이 불지 않은 오후와는 다르게 저녁에는 약한 바람이 붑니다.\n\n");
				}
			} else if (wind == false && wind1 == true) {
				if (바람강도1 == 1) {
					System.out.println("강한 바람이 부는 오후와는 다르게 저녁에는 바람이 안붑니다.\n\n");
				} else {
					System.out.println("약한 바람이 부는 오후와는 다르게 저녁에는 바람이 안붑니다.\n\n");
				}
			} else {
				System.out.println("오후와 동일하게 바람은 불지 않습니다.\n\n");
			}

			if (rain == true || rain1 == true || rain2 == true) {
				우산 = true;
				기상청 = true;
				if (우산 = true) {
					System.out.println("오늘 비가 온다니 우산 챙겨야지\n");
				} else {
					System.out.println("오늘 비가 안오네 우산은 안챙겨야지\n");
				}
			}
			String top, pants, outer; // 의류
			String bag; // 악세사리
			String shoes; // 신발
			boolean perfume = false;// 향수
			boolean bracelet = false;// 팔찌
			boolean watch = false;
			int topnumber = 0;
			int pantsnumber = 0;
			int outernumber = 0;
			int bagnumber = 0;
			int shoesnumber = 0;
			int watchnumber = 0;
			int q1, q2, q3, q4, q5, q6, q7;
			int clothtime = 0;
			System.out.println(" 이제 옷을 입으러 옷방으로 가자. ");
			System.out.println(
					" 옷의 종류는 이렇게 있다.\n" + "1. 상의  " + "2. 하의  " + "3. 외투  " + "4. 가방  " + "5. 악세사리  " + "6. 신발  ");
			System.out.print("고르는 순서대로 숫자를 중복되지않게 작성해주세요(ex : 123456)  : ");
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
			System.out.println("\n첫번째 질문입니다.");
			switch (q1) {
			case 1: {
				System.out.println(" 상의는 이렇게 3종류가 있다.");
				System.out.print("1. 긴팔티\t" + "2. 니트\t" + "3. 맨투맨\n" + "상의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" 하의는 이렇게 3종류가 있다.");
				System.out.print("1. 청바지\t" + "2. 슬랙스\t" + "3. 조거팬츠\n" + "하의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" 외투는 이렇게 3종류가 있다.");
				System.out.print("1. 자켓\t" + " 2. 가디건\t" + "3. 항공점퍼\t" + "4. 안 입는다.\n" + "아우터는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" 가방은 이렇게 있다.\n");
				System.out.print("1. 백팩\t" + "2. 크로스백\t" + "3. 착용안한다.\n" + "뭐를 착용할까 : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" 악세사리는 이렇게 있다.");
				System.out.print("1. 둘다착용한다\t" + "2. 팔찌\t" + "3. 시계\t" + "4. 아무것도 안한다.\n" + "뭐를 착용할까 : ");
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
				System.out.println(" 신발는 이렇게 3종류가 있다.");
				System.out.print("1. 스니커즈\t" + "2. 운동화\t " + " 3. 구두\n" + "신발은 뭐를 신을까 : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;
			}
			System.out.println("\n두번째 질문입니다.");
			switch (q2) {

			case 1: {
				System.out.println(" 상의는 이렇게 3종류가 있다.");
				System.out.print("1. 긴팔티\t" + "2. 니트\t" + "3. 맨투맨\n" + "상의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" 하의는 이렇게 3종류가 있다.");
				System.out.print("1. 청바지\t" + "2. 슬랙스\t" + "3. 조거팬츠\n" + "하의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" 외투는 이렇게 3종류가 있다.");
				System.out.print("1. 자켓\t" + " 2. 가디건\t" + "3. 항공점퍼\t" + "4. 안 입는다.\n" + "아우터는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" 가방은 이렇게 있다.\n");
				System.out.print("1. 백팩\t" + "2. 크로스백\t" + "3. 착용안한다.\n" + "뭐를 착용할까 : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" 악세사리는 이렇게 있다.");
				System.out.print("1. 둘다착용한다\t" + "2. 팔찌\t" + "3. 시계\t" + "4. 아무것도 안한다.\n" + "뭐를 착용할까 : ");
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
				System.out.println(" 신발는 이렇게 3종류가 있다.");
				System.out.print("1. 스니커즈\t" + "2. 운동화\t " + " 3. 구두\n" + "신발은 뭐를 신을까 : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;

			}
			System.out.println("\n세번째 질문입니다.");
			switch (q3) {

			case 1: {
				System.out.println(" 상의는 이렇게 3종류가 있다.");
				System.out.print("1. 긴팔티\t" + "2. 니트\t" + "3. 맨투맨\n" + "상의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" 하의는 이렇게 3종류가 있다.");
				System.out.print("1. 청바지\t" + "2. 슬랙스\t" + "3. 조거팬츠\n" + "하의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" 외투는 이렇게 3종류가 있다.");
				System.out.print("1. 자켓\t" + " 2. 가디건\t" + "3. 항공점퍼\t" + "4. 안 입는다.\n" + "아우터는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" 가방은 이렇게 있다.\n");
				System.out.print("1. 백팩\t" + "2. 크로스백\t" + "3. 착용안한다.\n" + "뭐를 착용할까 : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" 악세사리는 이렇게 있다.");
				System.out.print("1. 둘다착용한다\t" + "2. 팔찌\t" + "3. 시계\t" + "4. 아무것도 안한다.\n" + "뭐를 착용할까 : ");
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
				System.out.println(" 신발는 이렇게 3종류가 있다.");
				System.out.print("1. 스니커즈\t" + "2. 운동화\t " + " 3. 구두\n" + "신발은 뭐를 신을까 : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;

			}
			System.out.println("\n네번째 질문입니다.");
			switch (q4) {

			case 1: {
				System.out.println(" 상의는 이렇게 3종류가 있다.");
				System.out.print("1. 긴팔티\t" + "2. 니트\t" + "3. 맨투맨\n" + "상의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" 하의는 이렇게 3종류가 있다.");
				System.out.print("1. 청바지\t" + "2. 슬랙스\t" + "3. 조거팬츠\n" + "하의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" 외투는 이렇게 3종류가 있다.");
				System.out.print("1. 자켓\t" + " 2. 가디건\t" + "3. 항공점퍼\t" + "4. 안 입는다.\n" + "아우터는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" 가방은 이렇게 있다.\n");
				System.out.print("1. 백팩\t" + "2. 크로스백\t" + "3. 착용안한다.\n" + "뭐를 착용할까 : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" 악세사리는 이렇게 있다.");
				System.out.print("1. 둘다착용한다\t" + "2. 팔찌\t" + "3. 시계\t" + "4. 아무것도 안한다.\n" + "뭐를 착용할까 : ");
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
				System.out.println(" 신발는 이렇게 3종류가 있다.");
				System.out.print("1. 스니커즈\t" + "2. 운동화\t " + " 3. 구두\n" + "신발은 뭐를 신을까 : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;

			}
			System.out.println("\n다섯번째 질문입니다.");
			switch (q5) {

			case 1: {
				System.out.println(" 상의는 이렇게 3종류가 있다.");
				System.out.print("1. 긴팔티\t" + "2. 니트\t" + "3. 맨투맨\n" + "상의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" 하의는 이렇게 3종류가 있다.");
				System.out.print("1. 청바지\t" + "2. 슬랙스\t" + "3. 조거팬츠\n" + "하의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" 외투는 이렇게 3종류가 있다.");
				System.out.print("1. 자켓\t" + " 2. 가디건\t" + "3. 항공점퍼\t" + "4. 안 입는다.\n" + "아우터는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" 가방은 이렇게 있다.\n");
				System.out.print("1. 백팩\t" + "2. 크로스백\t" + "3. 착용안한다.\n" + "뭐를 착용할까 : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" 악세사리는 이렇게 있다.");
				System.out.print("1. 둘다착용한다\t" + "2. 팔찌\t" + "3. 시계\t" + "4. 아무것도 안한다.\n" + "뭐를 착용할까 : ");
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
				System.out.println(" 신발는 이렇게 3종류가 있다.");
				System.out.print("1. 스니커즈\t" + "2. 운동화\t " + " 3. 구두\n" + "신발은 뭐를 신을까 : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;

			}
			System.out.println("\n마지막 질문입니다.");
			switch (q6) {

			case 1: {
				System.out.println(" 상의는 이렇게 3종류가 있다.");
				System.out.print("1. 긴팔티\t" + "2. 니트\t" + "3. 맨투맨\n" + "상의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				topnumber = answer;
			}
				break;
			case 2: {
				System.out.println(" 하의는 이렇게 3종류가 있다.");
				System.out.print("1. 청바지\t" + "2. 슬랙스\t" + "3. 조거팬츠\n" + "하의는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				pantsnumber = answer;
			}
				break;
			case 3: {
				System.out.println(" 외투는 이렇게 3종류가 있다.");
				System.out.print("1. 자켓\t" + " 2. 가디건\t" + "3. 항공점퍼\t" + "4. 안 입는다.\n" + "아우터는 뭐를 입을까 : ");
				answer = scaner.nextInt();
				outernumber = answer;
			}
				break;
			case 4: {
				System.out.println(" 가방은 이렇게 있다.\n");
				System.out.print("1. 백팩\t" + "2. 크로스백\t" + "3. 착용안한다.\n" + "뭐를 착용할까 : ");
				answer = scaner.nextInt();
				bagnumber = answer;
			}
				break;
			case 5: {
				System.out.println(" 악세사리는 이렇게 있다.");
				System.out.print("1. 둘다착용한다\t" + "2. 팔찌\t" + "3. 시계\t" + "4. 아무것도 안한다.\n" + "뭐를 착용할까 : ");
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
				System.out.println(" 신발는 이렇게 3종류가 있다.");
				System.out.print("1. 스니커즈\t" + "2. 운동화\t " + " 3. 구두\n" + "신발은 뭐를 신을까 : ");
				answer = scaner.nextInt();
				shoesnumber = answer;
			}
				break;
			}
			System.out.println("오늘내가 입을 옷은 이렇게 된다.\n");
			{
				if (topnumber == 1) {
					System.out.println("상의는 긴팔티다.\n");
					clothtime += 1;
				} else if (topnumber == 2) {
					System.out.println("상의는 니트다.\n");
					clothtime += 2;
				} else if (topnumber == 3) {
					System.out.println("상의는 맨투맨이다.\n");
					clothtime += 3;
				}
			}
			{
				if (pantsnumber == 1) {
					System.out.println("하의는 청바지다.\n");
				} else if (pantsnumber == 2) {
					System.out.println("하의는 슬랙스다.\n");
					clothtime += 2;
				} else if (pantsnumber == 3) {
					System.out.println("하의는 조거팬츠다.\n");
					clothtime += 3;
				}
			}

			{
				if (outernumber == 1) {
					System.out.println("외투는 자켓이다.\n");
				} else if (outernumber == 2) {
					System.out.println("외투는 가디건이다.\n");
					clothtime += 2;
				} else if (outernumber == 3) {
					System.out.println("외투는 항공점퍼다.\n");
					clothtime += 3;
				} else if (outernumber == 4) {
					System.out.println("외투는 안입느다.\n");
				}
			}
			{
				if (bagnumber == 1) {
					System.out.println("가방은 백팩이다.\n");
				} else if (bagnumber == 2) {
					System.out.println("가방은 크로스백이다.\n");
					clothtime += 2;
				} else if (bagnumber == 3) {
					System.out.println("가방은 착용안한다.\n");
				}
			}
			{
				if ((watch == true) && (bracelet == true)) {
					System.out.println("팔찌와 시계를 착용한다.\n");
					clothtime += 1;
				} else if ((watch == false) && (bracelet == true)) {
					System.out.println("시계는 안차고 팔찌만 찬다.\n");
					clothtime += 2;
				} else if ((watch == true) && (bracelet == false)) {
					System.out.println("시계는 착용하고 팔찌는 안찬다.\n");
					clothtime += 3;
				} else if ((watch == false) && (bracelet == false)) {
					System.out.println("시계와 팔찌 둘다 착용안한다.");
				}
			}
			{
				if (shoesnumber == 1) {
					System.out.println("신발은 스니커즈다.\n");
				} else if (shoesnumber == 2) {
					System.out.println("신발은 운동화다.\n");
					clothtime += 2;
				} else if (shoesnumber == 3) {
					System.out.println("신발은 구두다.\n");
					clothtime += 3;
				}
			}

			System.out.printf("옷을 다 입었다.\n" + "준비하는데 %d분 걸렸다.\n\n", clothtime);
			minutes += clothtime;
			if (minutes >= 60) {
				minutes -= 60;
				hours += 1;
			}
			{
				System.out.println("이제 나가자.\n" + "일기예보를 듣고 나왔다.\n\n");
				int 기상 = (int) (Math.random() * 2);
				{
					if (기상 == 1) {
						System.out.println("밖에 비온다.\n");

					} else if (기상 == 0) {
						System.out.println("밖에 비가 안온다.\n");
					}
				}
				if (rain2 == true) {
					if (기상 == 1) {
						System.out.println("아침에 비온다고 했는데 정확하네\n");
					} else if (기상 == 0) {
						System.out.println("아침에 비온다고 했는데 비가 안온다.\n");
					}
				} else if (rain2 == false) {
					if (기상 == 1) {
						System.out.println("아침에 비 안온다고 했는데 비온다. \n");
					} else if (기상 == 0) {
						System.out.println("아침에 비 안온다고 했는데 정확하네.\n");
					}
				}
			}
			System.out.printf("[지금 현재 출발 시간은 %d시 %d분입니다.]\n", hours, minutes);
			if (hours <= 10) {
				if ((hours == 10) && (minutes > 50)) {
					System.out.println("시간 여유가 없다. 약속 시간을 지키지 못할꺼 같다.\n" + "다음부터는 좀더 서두르자\n");
				} else {
					System.out.println("시간 여유가 있다. 오늘은 약속을 지켜서 다행이다.\n\n");
				}
			} else {
				System.out.println("시간 여유가 없다. 약속 시간을 지키지 못할꺼 같다.\n" + "다음부터는 좀더 서두르자\n");
			}

		}
	}
}
