import java.awt.Toolkit;
import java.util.Scanner;

public class no2test extends Thread {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
/*
 * //남은 빈공간에 대한 공식 if (i > n / 3) { if (n > 4) { int num1 = n; int num2, num3,
 * num4; int[] arr = { 2, 4, 6, 2, 10, 6 }; num1 -= 5; num2 = num1 / 6; num2 *=
 * 6; num3 = num1 % 6; num3 = arr[num3]; int num = num2 + num3; for(int
 * num5=num/2;num5>0;num5--) { System.out.print("1"); } } }
 */
