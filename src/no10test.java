public class no10test {
	public static void main(String[] args) {
		int n = 4;// ū��4  �߰���5 ������6
		for (int i = 1; i < 5; i++) // ���� ����
		{
			if (i == 2) {
				continue;
			}
			for (int y = n; y > i; y--) {
				System.out.print("0");
			}
			System.out.print("***");
			for (int j = (n-5); j < i; j++) {
				System.out.print("*");
			}
			for (int j = (n-5); j < i; j++) {
				System.out.print("*");
			}
			for (int l = n; l > i; l--) {
				System.out.print("0");
			}
			System.out.println("");
		}
		for (int i = 1; i < 5; i++) // ���� ����
		{
			if (i == 3) {
				continue;
			}
			for (int y = (5-n); y < i; y++) {
				System.out.print("0");
			}
			System.out.print("***");
			for (int j = (10-n); j > i; j--) {
				System.out.print("*");
			}
			for (int j = (10-n); j > i; j--) {
				System.out.print("*");
			}
			for (int y = (5-n); y < i; y++) {
				System.out.print("0");
			}
			System.out.println("");
		}

	}
}
