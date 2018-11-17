package Threads;


import java.util.concurrent.CountDownLatch;


class ServiceTwo implements Runnable{
	
	private final CountDownLatch latch;

	public ServiceTwo(CountDownLatch latch) {
		this.latch = latch;
	}



	@Override
	public void run() {
		System.out.println("started service Two");
		latch.countDown();
		
	}

}

class ServiceOne implements Runnable{
	
	private final CountDownLatch latch;
	
	

	public ServiceOne(CountDownLatch latch) {
		this.latch = latch;
	}



	@Override
	public void run() {
		System.out.println("Started service One");
		//reduce count of Count Down Latch by 1.
		latch.countDown();
		
	}

}

/**
 * 
 * @author anirudh
 *
 */
public class JavaCountDownLatchExample {

	public static void main(String[] args) {
		// intialising count down latch by 2, as it will wait for 2 threads to
		// finish execution
		final CountDownLatch latch = new CountDownLatch(2);

		// making two threads for 2 services
		Thread serviceOneThread = new Thread(new ServiceOne(latch));
		Thread serviceTwoThread = new Thread(new ServiceTwo(latch));

		serviceOneThread.start();
		serviceTwoThread.start();

		// latch waits till the count becomes 0
		// this way we can make sure that the execution of main thread only
		// finishes ones 2 services have executed
		try {
			latch.await();
			System.out.println("Starting main Thread!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
