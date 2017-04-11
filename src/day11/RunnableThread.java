package day11;

public class RunnableThread implements Runnable{

	private int start;
	
	public RunnableThread(int start) {
		this.start = start;
	}

	@Override
	public void run() {
		for (int i = start; i <= 100; i += 2) {
			System.out.println(i);
		}
	}


}
