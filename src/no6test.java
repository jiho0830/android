import java.util.Scanner;//import�� ���� �ܺ� Ŭ������ ȣ��

public class no6test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//�̷��� ��ü������ �ϸ� System.in�� �Է��� ���� ����Ʈ ������ �д°��� ����������.
		
		String name;
		int age;
		
		System.out.print("�̸��� : ");
		name = scan.nextLine();//�� next + �ڷ��� ()�� �⺻ �̶�� �����ϸ� �ɲ�����.
		//name = scan.nextLine(); �̷��� �ϸ� ���� ��ü�� �޾Ƶ鿩�� �ڿ� ���� �ڷ������� ������� ���δ� �޾� ���δ�
		//�׷��� ���� ù ��ĵ���� ����� ���ڸ� ���� �Է��� �ϰԵǸ� �տ� ���常 �Է¹ް� ���� ���ڴ� �ؿ� �ִ� nextInt������ �ٷ� �޾� ���δ�
		//ex : ����ȣ 90�̶�� ������ �Է��ϸ� next()�� ����ȣ�� �Է¹ް� �ڿ� �����ִ� 90�� �ٷ� ������ ���� nextInt()�� �ްԵȴ�
		//�̷��� �ϸ� ������� '�̸��� : ����ȣ 90 ���̴� : ����ȣ 90'�̶�� ������� ��Եȴ�
		//���� ������ ������ �ִ� ������ nextLine() ���� ����
		System.out.print("���̴� : ");
		age = scan.nextInt();//�̷��� next������ ���� ���� ���·� �ް� �Ҽ� �ִµ� ������ü�� �������� nextLine()���� ������ �ȴ�
		
		scan.close(); // scan���� ���Ḧ �����Ѵ�.
		System.out.println("�̸��� : " + name + '\n' + "���̴� : " + age);
	}

}
