package FileHandlingAssignments;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class A {
	public void First() throws Exception {
		Scanner s = new Scanner(System.in);
		int x =1;
		
		File a1 = new File("C:\\Users\\atuls\\OneDrive\\Desktop\\CDAC\\Omkar\\Omkar5.txt");
		while (x!=0){

			try (FileOutputStream a2 = new FileOutputStream(a1,true)) {
				try (DataOutputStream dos = new DataOutputStream(a2)) {
					x = s.nextInt();
					if (x != 0) {
						dos.writeInt(x);
					}
					;
				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			

		}
		FileInputStream a3 = new FileInputStream(a1);
		DataInputStream d1=new DataInputStream(a3);
		while(d1.available()!=0) {
		System.out.println(d1.readInt());
		}
		d1.close();
		s.close();
	}

	

}
