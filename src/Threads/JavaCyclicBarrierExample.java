package Threads;



import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Service2 implements Runnable {
	
	private final CyclicBarrier cyclicBarrier;

	public Service2(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		System.out.println("Starting service Two....");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Service Two has finished its work.. waiting for others...");
		try {
			cyclicBarrier.await();
		} catch (InterruptedException e) {
			System.out.println("Service one interrupted!");
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			System.out.println("Service one interrupted!");
			e.printStackTrace();
		}
		System.out.println("The wait is over, lets complete Service two!");

	}

}

class Service1 implements Runnable {

	private final CyclicBarrier cyclicBarrier;

	public Service1(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		System.out.println("Starting service One...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out
				.println("Service One has finished its work... waiting for others...");
		try {
			cyclicBarrier.await();
		} catch (InterruptedException e) {
			System.out.println("Service one interrupted!");
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			System.out.println("Service one interrupted!");
			e.printStackTrace();
		}
		System.out.println("The wait is over, lets complete Service One!");

	}

}


/**
 * 
 * @author anirudh
 *
 */
public class JavaCyclicBarrierExample {
	
	
	public static void main(String[] args) {
		
		//3 threads are part of the barrier, ServiceOne, ServiceTwo and this main thread calling them.
		final CyclicBarrier barrier = new CyclicBarrier(3);
		Thread serviceOneThread = new Thread(new Service1(barrier));
		Thread serviceTwoThread = new Thread(new Service2(barrier));
		
		System.out.println("Starting both the services at"+new Date());
		
		serviceOneThread.start();
		serviceTwoThread.start();
		
		try {
			barrier.await();
		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupted!");
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			System.out.println("Main Thread interrupted!");
			e.printStackTrace();
		}
		System.out.println("Ending both the services at"+new Date());
	}
	
	
}
