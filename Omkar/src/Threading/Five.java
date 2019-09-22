package Threading;

public class Five implements Runnable {
	int num1=50;
	int num2=0;
	int j=0;
	 void program() {
		
			for(num2=0;num2<=50;++num2) {
				System.out.println(Thread.currentThread()+ "1"+num2+"A");
			}
			for(num1=50;num1>=0;--num1) {
				System.out.println(Thread.currentThread()+"1"+num1+"B");
				}
			
		
	}
	@Override
	public void run() {
		program();
		
	}

}
