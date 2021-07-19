import java.util.Scanner;

public class no9test {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) // 별이 증가
		{
			if (i == 2) {
				continue;
			}
			for (int y = 6; y > i; y--) {				System.out.print("0");			}
			System.out.print("***");
			for (int j = 1; j < i; j++) {				System.out.print("*");			}
			for (int j = 1; j < i; j++) {				System.out.print("*");			}
			for (int l = 6; l > i; l--) {				System.out.print("0");			}

			System.out.println("");
		}	

		for (int i = 1; i < 5; i++) // 별이 감소
		{
			if (i == 3) {
				continue;
			}
			for (int y = -1; y < i; y++) {				System.out.print("0");			}
			System.out.print("***");
			for (int j = 4; j > i; j--) {				System.out.print("*");			}
			for (int j = 4; j > i; j--) {				System.out.print("*");			}
			for (int y = -1; y < i; y++) {				System.out.print("0");			}
			System.out.println("");
		}
	
	}
}
