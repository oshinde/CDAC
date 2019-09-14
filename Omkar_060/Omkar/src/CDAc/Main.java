package CDAc;

public class Main {

	public static void main(String[] args) {
		String OMI[]=new String[3];
		DAC a=new DAC();
		DBDA b=new DBDA();
		MSCIT c=new MSCIT();
		OMI[0]=a.start();
		OMI[1]=b.start();
		OMI[2]=c.start();
			}

}
