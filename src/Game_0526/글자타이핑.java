package Game_0526;

public class ����Ÿ���� extends Thread {
	String s;
	int ����Ÿ����;

	public ����Ÿ����(String s, int ����Ÿ����) {
		this.s = s;
		this.����Ÿ���� = ����Ÿ����;
	}

	@Override
	public void run() {
		for (int i = 0; i < s.length(); i++) {
			// ���ѷα� Ÿ���� ȿ��
			try {
				Thread.sleep(this.����Ÿ����);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(s.charAt(i));
		}
		// TODO Auto-generated method stub
	}
}
