package CollectionAPI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ArrayList11 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String a = "C:\\Users\\atuls\\OneDrive\\Desktop\\CDAC\\Omkar\\omkar134.txt";

	public static void main(String[] args) throws FileNotFoundException, Exception {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Omkar");
		a1.add("Atul");

		try (FileOutputStream f = new FileOutputStream(a)) {
			ObjectOutputStream oos = new ObjectOutputStream(f);
			Object[] a = new Object[] { a1 };
			oos.writeObject(a);
			oos.close();

		}
		try (FileInputStream g = new FileInputStream(a)) {
			ObjectInputStream ois = new ObjectInputStream(g);

			Object[] a2 = new Object[] { a1 };

			a2 = (Object[]) ois.readObject();
			for (Object a11 : a2) {
				System.out.println(a11);
			}

		}

	}
}