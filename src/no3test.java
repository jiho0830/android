import java.util.Scanner;

public class no3test {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자(마름모-2이상) : ");
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
			System.out.print("숫자(마름모-2이상) : ");
			 n = scan.nextInt();
		}

	}
}