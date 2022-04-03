package checkNumInput;

public class CkeckNum {
	
	
	public static boolean isInteger (String input) {
		boolean check = false;
		try {
			Integer.parseInt(input);
			check = true;
		} catch (Exception e) {
			check = false;
		}
		
		return check;
		
	}
	

}
