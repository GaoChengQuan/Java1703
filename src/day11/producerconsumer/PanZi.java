package day11.producerconsumer;

import java.util.LinkedList;

public class PanZi {
	private LinkedList<Cake> list = new LinkedList<Cake>();
	
	public synchronized Cake getCake() {
		if (list.size() <= 0) {
			try {
				System.out.println("getCake wait");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Cake cake = list.removeFirst();
		return cake;
	}
	
	public synchronized void putCake(Cake cake) {
		list.addLast(cake);
		notifyAll();
		System.out.println("putCake notifyAll");
	}
}
