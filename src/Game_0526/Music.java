package Game_0526;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	private Player player;
	private boolean isloop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;

	public Music(String name, boolean isloop) {
		try {
			this.isloop = isloop;
			file = new File("./music/" + name);
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

	public void close() {
		isloop = false;
		player.close();
		this.interrupt();
	}

	@Override
	public void run() {
		try {
			do {				
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
				player.play();
			} while (isloop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
