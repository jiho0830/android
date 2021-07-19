package Game_0526;

public class 글자타이핑 extends Thread {
	String s;
	int 글자타이핑;

	public 글자타이핑(String s, int 글자타이핑) {
		this.s = s;
		this.글자타이핑 = 글자타이핑;
	}

	@Override
	public void run() {
		for (int i = 0; i < s.length(); i++) {
			// 프롤로그 타이핑 효과
			try {
				Thread.sleep(this.글자타이핑);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(s.charAt(i));
		}
		// TODO Auto-generated method stub
	}
}
