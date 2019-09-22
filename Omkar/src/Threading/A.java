package Threading;

public class A {
	
	public static void main(String args[])
	{
	    C a=new C();
	    B b=new B();
	    Thread t1=new Thread(a);
	    Thread t2=new Thread(b);
	    t1.start();
	    t2.start();
	}
	
}
