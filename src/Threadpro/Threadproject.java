package Threadpro;

public class Threadproject extends Thread {
	@Override
	public void run() {
		// ���꽺����
		try {
			String s=("���־��� �տ�����" + "������ ���־���" + "������ ���־���" + "������ ���־���" + "������ ���־���" + "������ ���־���");
			for (int i = 0; i < s.length(); i++) { // ���ѷα� Ÿ���� ȿ��
				Thread.sleep(500);
		      System.out.print( s.charAt(i) );
		    }
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// ���ν�����
		Threadproject thread123 = new Threadproject();
		thread123.start();

	}

}
