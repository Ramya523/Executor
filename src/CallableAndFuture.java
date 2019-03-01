import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture implements Callable {
	 String name;

	public String call()
	{
		//this.name=Thread.currentThread().getName();
		//return name;
		System.out.println(Thread.currentThread().getName());
		return Thread.currentThread().getName();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService ex1=Executors.newSingleThreadExecutor();
		Callable task=new CallableAndFuture();
		Future<String> obj=ex1.submit(task);
		System.out.println(obj);

	}

}
