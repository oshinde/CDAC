package Threading;

public class C implements Runnable {
	
	
	
	
	
	     public void run()
	    {
	        for(int i=0;i<50;i++)
	        {
	            System.out.println(Thread.currentThread()+" "+i+"C");
	        }
	    }
	
}
	