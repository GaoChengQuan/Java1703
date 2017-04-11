package day11.producerconsumer;

import java.util.Random;

public class ConsumerThread extends Thread {
	private PanZi panZi;

	public ConsumerThread(String name, PanZi panZi) {
		super(name);
		this.panZi = panZi;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Cake cake = panZi.getCake();
			System.out.println(Thread.currentThread().getName() + " getCake " + cake);
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
