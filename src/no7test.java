import java.util.Scanner;

public class no7test {
	public static void main(String args[]) {
		long beforTime = System.currentTimeMillis();// 코드 실행전 시간 받아오기
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자(스도쿠-11이하) : ");
		int n = scan.nextInt();
		while (n < 15) {
			int[][] arr;
			arr = new int[n][n];
			for (int i2 = 0; i2 < n; i2++) {
				for (int i = i2; i < n; i++) {
					arr[i2][i] = (int) (Math.random() * n) + 1;
					for (int j = 0; j < i; j++) {
						if (arr[i2][i] == arr[i2][j]) {
							i--;
						}
					}				
				}
				for (int i = i2 + 1; i < n; i++) {
					arr[i][i2] = (int) (Math.random() * n) + 1;
					for (int j = 0; j < i; j++) {
						if (arr[i][i2] == arr[j][i2]) {
							i--;
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
			long afterTime = System.currentTimeMillis();
			long time = (afterTime - beforTime) / 1000;
			System.out.println("걸린 기간 : " + time + "초\n");
			System.out.print("숫자(스도쿠-11이하) : ");
			n = scan.nextInt();
		}
	}
}