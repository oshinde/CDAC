package FileHandlingAssignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Nano extends Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Color;
	int Cost;
	
	
	public Nano(String color, int cost) {
		super();
		Color = color;
		Cost = cost;
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
	public void disp() throws IOException, ClassNotFoundException {
		try(FileInputStream e=new FileInputStream("omkar13.txt")) {
			ObjectInputStream d = new ObjectInputStream(e);
			System.out.println((Nano)d.readObject());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
