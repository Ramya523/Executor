import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Executorex implements Runnable {

	public void run()
	{
		System.out.println("running.....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Executor ex=Executors.newSingleThreadExecutor();
		ex.execute(new Executorex());
		
		ExecutorService ex1=Executors.newSingleThreadExecutor();
		ex1.execute(new Executorex());
		
		ScheduledExecutorService ex2=Executors.newSingleThreadScheduledExecutor();
		ex2.execute(new Executorex());
		
		
	}

}
