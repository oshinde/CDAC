package Threading;


class Child1 implements Runnable{
	synchronized public void run() 
	{
		for (int i=1;i<=10;i++) 
		{
			System.out.println("exeu"+i);
		}
		
	}
	
	public static void main(String args[]) {
		Child1 c= new Child1();
		Child1 d = new Child1();
		Thread t = new Thread(c);
		Thread r = new Thread(d);
		t.start();
		r.start();
		
	}
}