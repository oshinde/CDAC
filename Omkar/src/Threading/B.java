package Threading;



public class B implements Runnable {
	 
		     public void run()
		    {
		        for(int i=50;i>=1;i--)
		        {
		            System.out.println(Thread.currentThread()+" "+i+"B");
		        }
		    }
		
		

	}


