package FileHandlingAssignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class B implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int custid = 100;
	String custname = "Omkar";
	String address = "Panvel";
	int age = 22;

	public B(int custid, String custname, String address, int age) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.address = address;
		this.age = age;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void write() throws Exception {
		try (FileOutputStream d = new FileOutputStream("omkar13.txt")) {
			ObjectOutputStream dos = new ObjectOutputStream(d);
			dos.writeObject(this);
			dos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void display() throws Exception {
		try (FileInputStream b = new FileInputStream("C:\\Users\\atuls\\OneDrive\\Desktop\\CDAC\\Omkar\\omkar13.txt")) {
			ObjectInputStream d = new ObjectInputStream(b);
			System.out.println((B)d.readObject());
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
