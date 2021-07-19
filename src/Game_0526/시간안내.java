package Game_0526;

import java.util.Timer;
import java.util.TimerTask;

public class 시간안내 extends Thread {
	{

		Timer timer = new Timer();// 실제타이머의 기능을 수행하는 클래스
		TimerTask task = new TimerTask()// timer클래스가 수행되어여할 내용을 작성해야 하는 클래스
		{
			int 시간 = 1;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.printf("\n[게임 시작한지 " + (시간 * 5) + "분 지났습니다.]\n");
				시간++;
			}
		};
		timer.schedule(task, 60000, 120000);

		// (TimerTask task, long delay, long period)
		// delay는 최초시작 딜레이, period는 반복주기
	}
}