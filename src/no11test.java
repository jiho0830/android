import java.util.Scanner;

public class no11test {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) // 별이 감소
		{
			if (i == 3) {
				continue;
			}
			for (int y = 0; y <= i; y++) {				System.out.print("0");			}
			System.out.print("***");
			for (int j = 4; j > i; j--) {				System.out.print("*");			}
			for (int j = 4; j > i; j--) {				System.out.print("*");			}
			for (int y = 0; y <= i; y++) {				System.out.print("0");			}
			System.out.println("");
		}
	}
}