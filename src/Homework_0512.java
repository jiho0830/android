import java.util.Scanner;

public class Homework_0512 {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println(" 다음중 해당 번호를 고르시오");
		System.out.println(" 1. 마름모\n" + " 2. 별\n" + " 3. 원\n" + " 4. 스도쿠\n" + " 5. 종료");
		System.out.print(" 내가 고를 번호는 : ");
		int abcd = scaner.nextInt();
		System.out.println("");
		while (abcd < 5) {
			switch (abcd) {
			case 1: {
				Scanner scan = new Scanner(System.in);
				System.out.print(" 1. 마름모(2이상입력) : ");
				int n = scan.nextInt();
				while (n > 1) {
					{
						for (int i = 1; i < n; i++) {
							for (int y = n - 2; y >= i; y--) {
								System.out.print(" ");
							}
							for (int j = 0; j < i; j++) {
								System.out.print("*");
							}
							for (int k = 1; k < i; k++) {
								System.out.print("*");
							}
							for (int l = n - 2; l >= i; l--) {
								System.out.print(" ");
							}
							System.out.println();
						}
					} // 여기까지가 별이 증가
					{
						int a = n - 1;
						for (int i = 1; i < a; i++) {
							for (int y = 1; y <= i; y++) {
								System.out.print(" ");
							}
							for (int j = (a - 1); j >= i; j--) {
								System.out.print("*");
							}
							for (int k = (a - 2); k >= i; k--) {
								System.out.print("*");
							}
							for (int l = 1; l <= i; l++) {
								System.out.print(" ");
							}
							System.out.println("");
						}
					}
					System.out.println("");
					System.out.print(" 1. 마름모(2이상입력) : ");
					n = scan.nextInt();
					System.out.println("");
				}
				System.out.println("");
				System.out.println(" 다음중 해당 번호를 고르시오");
				System.out.println(" 1. 마름모\n" + " 2. 별\n" + " 3. 원\n" + " 4. 스도쿠\n" + " 5. 종료");
				System.out.print(" 내가 고를 번호는 : ");
				abcd = scaner.nextInt();
				System.out.println("");
			}
				break;
			case 2: {

				Scanner scan = new Scanner(System.in);
				System.out.print(" 2. 별(5이상입력) : ");
				int n = scan.nextInt();
				while (n > 4) {
					{
						for (int i = 1; i + (n / 5) < n; i++) {
							for (int y = (n * 3); y >= i; y--) {
								System.out.print(" ");
							}
							for (int j = 0; j < i; j++) {
								System.out.print("*");
							}
							for (int k = 1; k < i; k++) {
								System.out.print("*");
							}
							System.out.println();
						}

					} // 여기까지가 별이 증가
					{
						for (int i = 0; i < n / 2 + 1; i++) {
							for (int y = 1; y <= i; y++) {
								System.out.print("   ");
							}
							for (int j = n; j > i; j--) {
								System.out.print("******");
							}
							System.out.println();
						}
					} // 여기까지가 별이 감소
					{
						for (int i = 1; i <= n; i++) {
							{
								for (int j = ((n / 2)) * 3; j > i; j--) {
									System.out.print(" ");// 위에서 아래쪽 앞에 있는 공간
								} // 00
							}
							if (i <= n / 3) {
								for (int y = n; y >= i; y--) {
									System.out.print("*");
								}
							}
							if (i <= n / 3) {
								if (n % 2 == 0) {
									System.out.print("**");
								} else {
									System.out.print("*****");
								}
							}
							if (i <= n / 3) {
								for (int y1 = 1; y1 < i; y1++) {
									System.out.print("****");
								}
							}
							if (i <= n / 3) {
								for (int y1 = 0; y1 < n; y1++) {
									System.out.print("*");//
								}
							}
							if (i > n / 3)// 왼쪽다리
							{
								if (n > 4) {

									int num1 = n;
									int num2, num3;
									int[] arr = { 6, 8, 14, 14, 22, 22 };
									num1 -= 5;
									num2 = num1 / 6;
									num2 *= 22;
									num3 = num1 % 6;
									num3 = arr[num3];
									int num = (num2 + num3 + 14) / 2;
									for (int num5 = num / 3; num5 + n / 3 >= i; num5--) {
										System.out.print("***");
									}
									if (num % 3 == 1) {
										{
											System.out.print(" ");

										}
									} else if (num % 3 == 2) {
										{
											System.out.print("  ");

										}
									}
								}
							}
							if (i > n / 3) {
								System.out.print(" ");
							}
							if (i > n / 3) {
								for (int y1 = n / 3; y1 + 1 < i; y1++) {
									System.out.print("    ");//
								}
							}

							if (i > n / 3) {
								System.out.print(" ");
							}
							if (i > n / 3) {
								for (int y1 = n / 3; y1 + 1 < i; y1++) {
									System.out.print("    ");//
								}
							}
							if (i > n / 3) {
								if (n > 4) {

									int num1 = n;
									int num2, num3;
									int[] arr = { 6, 8, 14, 14, 22, 22 };
									num1 -= 5;
									num2 = num1 / 6;
									num2 *= 22;
									num3 = num1 % 6;
									num3 = arr[num3];
									int num = (num2 + num3 + 14) / 2;

									if (num % 3 == 1) {
										{
											for (int num5 = 0; num5 + n / 3 >= i; num5--)
												System.out.print(" ");

										}
									} else if (num % 3 == 2) {
										{
											System.out.print("  ");

										}
									}
									for (int num5 = num / 3; num5 + n / 3 >= i; num5--) {
										System.out.print("***");

									}
								}
							}

							if (i > n / 3) {
								for (int y2 = n; y2 > i; y2--) {
									System.out.print("");// 오른쪽다리
								}
							}

							if (i <= n / 3) {
								for (int l = n; l >= i; l--) {
									System.out.print("*");
								} // 00
							}
							System.out.println("");

						} // 여기서 별 아래 다리부분
					}
					System.out.println("");
					System.out.print(" 2. 별(5이상입력) : ");
					n = scan.nextInt();
					System.out.println("");
				}
				System.out.println("");
				System.out.println(" 다음중 해당 번호를 고르시오");
				System.out.println(" 1. 마름모\n" + " 2. 별\n" + " 3. 원\n" + " 4. 스도쿠\n" + " 5. 종료");
				System.out.print(" 내가 고를 번호는 : ");
				abcd = scaner.nextInt();
				System.out.println("");
			}
				break;
			case 3: {
				Scanner scan = new Scanner(System.in);
				System.out.print(" 3. 원(3이상입력) : ");
				int n = scan.nextInt();
				while (n > 2) {
					int rr = n * n;
					n = n * 2 + 1;
					for (int x = 0; x <= n; x++) {
						for (int y = 0; y < n; y++) {
							int r = ((x - n / 2) * (x - n / 2)) + ((y - n / 2) * (y - n / 2));
							if (r <= rr) {
								System.out.print(" *");
							} else {
								System.out.print("  ");
							}
						}
						System.out.println("");
					}
					System.out.println("");
					System.out.print(" 3. 원(3이상입력) : ");
					n = scan.nextInt();
					System.out.println("");

				}
				System.out.println("");
				System.out.println(" 다음중 해당 번호를 고르시오");
				System.out.println(" 1. 마름모\n" + " 2. 별\n" + " 3. 원\n" + " 4. 스도쿠\n" + " 5. 종료");
				System.out.print(" 내가 고를 번호는 : ");
				abcd = scaner.nextInt();
				System.out.println("");

			}
				break;
			case 4: {
				Scanner scan = new Scanner(System.in);
				System.out.print(" 4.스도쿠(11이하입력) : ");
				int n = scan.nextInt();
				while (n < 12) {
					int[][] arr;
					arr = new int[n][n];
					for (int i2 = 0; i2 < n; i2++) {
						for (int i = 0; i < n; i++) {
							arr[i2][i] = (int) (Math.random() * n) + 1;
							for (int j = 0; j < i; j++) {
								if (arr[i2][i] == arr[i2][j]) {
									i--;
								}
							}
						}
						for (int i = 0; i < n; i++) {
							for (int j = 0; j < i2; j++) {
								if (arr[i2][i] == arr[j][i]) {
									i2--;
								}
							}
						}

					}
					for (int j = 0; j < n; j++) {
						for (int i = 0; i < n; i++) {
							System.out.print(arr[j][i] + " ");
						}
						System.out.println("");
					}
					System.out.println("");
					System.out.print("숫자(스도쿠-11이하) : ");
					n = scan.nextInt();
					System.out.println("");
				}
				System.out.println("");
				System.out.println(" 다음중 해당 번호를 고르시오");
				System.out.println(" 1. 마름모\n" + " 2. 별\n" + " 3. 원\n" + " 4. 스도쿠\n" + " 5. 종료");
				System.out.print(" 내가 고를 번호는 : ");
				abcd = scaner.nextInt();
				System.out.println("");

			}
				break;
			}

		}
		System.out.println(" 종료합니다.");
	}
}
