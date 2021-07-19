package Game_0526;



public class 로딩창대기열 extends Thread {
	{
		pause(); // '중지'시키기
	}

	public static void pause() {
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
}
