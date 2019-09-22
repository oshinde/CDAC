package Threading;

public class Main {

	public static void main(String[] args) {
		Five m=new Five();
		Thread t1=new Thread(m);
		Thread t2=new Thread(m);
		t1.start();
		t2.start();
	}

}
