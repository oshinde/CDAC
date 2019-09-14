package Exception;

public class Font {
 String Style;
 
public Font(String Style) throws IllegalValueException {
	this.Style=Style;


	if(Style=="BOLD"){
		System.out.println("FONT is BOLD");
		}
	else if(Style=="PLAIN"){
		System.out.println("FONT is PLAIN");
	}
	else if(Style=="ITALIC"){
		System.out.println("FONTis ITALIC");
	}
	else {
		throw new IllegalValueException("Illegal fONT sTYLE");
	}
	
}
} 
 

