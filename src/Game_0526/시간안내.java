package Game_0526;

import java.util.Timer;
import java.util.TimerTask;

public class �ð��ȳ� extends Thread {
	{

		Timer timer = new Timer();// ����Ÿ�̸��� ����� �����ϴ� Ŭ����
		TimerTask task = new TimerTask()// timerŬ������ ����Ǿ�� ������ �ۼ��ؾ� �ϴ� Ŭ����
		{
			int �ð� = 1;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.printf("\n[���� �������� " + (�ð� * 5) + "�� �������ϴ�.]\n");
				�ð�++;
			}
		};
		timer.schedule(task, 60000, 120000);

		// (TimerTask task, long delay, long period)
		// delay�� ���ʽ��� ������, period�� �ݺ��ֱ�
	}
}