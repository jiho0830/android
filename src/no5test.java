import java.util.Scanner;
public class no5test {
	public static void main(String args[])
	{
		System.out.println("�⵵, ��, ��, ������ �������� �и��Ϸ� ������� �Է��ϼ��� ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int date = input.nextInt();
		String day = input.next();
		input.close();
		
		System.out.println("������ " + year + "�� " + month + "�� " + date + "�� " + day + "�Դϴ�.");
	}

}
