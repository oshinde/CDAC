package FileHandlingAssignments;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;


public class C {

	public void RafWrite() throws Exception {
		try (RandomAccessFile a = new RandomAccessFile("C:\\Users\\atuls\\OneDrive\\Desktop\\CDAC\\Omkar\\RAF.txt",
				"rw")) {
			a.writeUTF("omkar is mad!!");
			a.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void RafRead() throws Exception {
		try (RandomAccessFile a = new RandomAccessFile("C:\\Users\\atuls\\OneDrive\\Desktop\\CDAC\\Omkar\\RAF.txt",
				"r")) {
			a.seek(0);
			byte b[] = new byte[(int) a.length()];
			a.read(b);
			String c = new String(b);
			System.out.println(c);
		}
	}
	public void RafAgain() throws Exception, Exception {
		try (RandomAccessFile a = new RandomAccessFile("C:\\Users\\atuls\\OneDrive\\Desktop\\CDAC\\Omkar\\RAF.txt",
				"rw")) {
			a.seek(a.length());
			byte b[]=new byte[(int)a.length()];
			int k=System.in.read(b);
			a.write(b, 0, k);
			
		}
		
	}
}
