package Exception;

public class FontDemo {

	public static void main(String[] args) {
		
		try {
			Font F=new Font("pRIYANKA");
		} catch (IllegalValueException e) {
			
			e.printStackTrace();
		}
		

	}

}
