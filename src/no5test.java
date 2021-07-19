import java.util.Scanner;
public class no5test {
	public static void main(String args[])
	{
		System.out.println("년도, 월, 일, 요일을 공백으로 분리하려 순서대로 입력하세요 ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int date = input.nextInt();
		String day = input.next();
		input.close();
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 " + day + "입니다.");
	}

}
