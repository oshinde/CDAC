package FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D {
	File g=new File("C:\\Users\\atuls\\OneDrive\\Desktop\\CDAC\\Omkar\\Omkar3.txt");
	public void WriteMethod(){
		try(FileWriter n=new FileWriter(g)) {
			char arr[]= {'a','b','c'};
			n.write(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ReadMethod() throws Exception {
		char[] arr1= null;
		try(FileReader m=new FileReader(g)) {
			arr1=new char[(int)g.length()];
			m.read(arr1);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		for(int i=0;i<g.length();i++)
		{
			System.out.println(arr1[i]);
		}
	}
	public void DataWrite() {
		
	}
	
	public void DemoWrite() throws Exception {
		try (FileOutputStream h=new FileOutputStream(g)){
			DataOutputStream dos=new DataOutputStream(h);
			dos.writeInt(100);
			dos.writeUTF("Omkar Rocks");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void DemoRead() throws Exception {
		try(FileInputStream j=new FileInputStream(g)) {
			DataInputStream dis=new DataInputStream(j);
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
