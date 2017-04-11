package day11.producerconsumer;

import java.util.Random;

public class ProducerThread extends Thread{
	private PanZi panZi;
	
	public ProducerThread(String name, PanZi panZi) {
		super(name);
		this.panZi = panZi;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Cake cake = new Cake("No." + i);
			System.out.println(Thread.currentThread().getName() + " putCake " + cake);
			panZi.putCake(cake);
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
