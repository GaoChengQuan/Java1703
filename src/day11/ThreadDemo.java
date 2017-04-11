package day11;

import org.junit.Test;

public class ThreadDemo {
	public static void main(String[] args) {
		NumThread thread1 = new NumThread("奇数线程", 1);
		thread1.start();
		
		NumThread thread2 = new NumThread("偶数线程", 2);
		thread2.start();
	}
	
	@Test
	public void test() {
		RunnableThread runnableThread = new RunnableThread(1);
		Thread thread = new Thread(runnableThread);
		thread.start();
	}
	
	@Test
	public void test1() {
		//Unhandled exception type InterruptedException
		System.out.println("start");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("over");
	}
}
