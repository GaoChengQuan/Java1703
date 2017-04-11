package day11.producerconsumer;

public class Main {
	public static void main(String[] args) {
		PanZi panZi = new PanZi();
		ProducerThread producerThread = new ProducerThread("生产蛋糕", panZi);
		producerThread.start();
		ConsumerThread consumerThread = new ConsumerThread("消费蛋糕", panZi);
		consumerThread.start();
		
	}
}
