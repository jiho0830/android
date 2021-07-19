package Threadpro;

public class Threadproject extends Thread {
	@Override
	public void run() {
		// 서브스레드
		try {
			String s=("아주아주 먼옛날에" + "집에서 아주아주" + "집에서 아주아주" + "집에서 아주아주" + "집에서 아주아주" + "집에서 아주아주");
			for (int i = 0; i < s.length(); i++) { // 프롤로그 타이핑 효과
				Thread.sleep(500);
		      System.out.print( s.charAt(i) );
		    }
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// 메인스레드
		Threadproject thread123 = new Threadproject();
		thread123.start();

	}

}
