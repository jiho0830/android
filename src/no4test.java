import java.util.Scanner;
public class no4test {
	public static void main(String args[]) {
		long beforTime = System.currentTimeMillis();//�ڵ� ������ �ð� �޾ƿ���
		Scanner scan = new Scanner(System.in);
		System.out.print("����(������-11����) : ");
		int n = scan.nextInt();
		while(n<12){
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
			long afterTime = System.currentTimeMillis();
			long time = (afterTime-beforTime)/1000;
			System.out.println("�ɸ� �Ⱓ : " + time +"��\n");
			System.out.print("����(������-11����) : ");
			n = scan.nextInt();
		}
	}
}