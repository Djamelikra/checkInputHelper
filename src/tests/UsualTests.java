package tests;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

import checkNumInput.CkeckNum;

public class UsualTests {

	public static void checkInt() {
		String strInput = JOptionPane.showInputDialog( "Input to check", "13") ;
		if (CkeckNum.isInteger(strInput)) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, "It's an integer", "Check = O K",1);
		}else {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, "The number is not an integer !", "Check = K O",0);
		}
			
		/////////////////////////////////////////////////////
		 int choice = JOptionPane.showConfirmDialog(
			       null,
			       "Do you want to perform another test ?",
			       "Try again ?",
			       JOptionPane.YES_NO_OPTION);
		 if(choice !=0) {
			 System.exit(0);
		   }else {
			   checkInt();
		   }
	}
	
	
	
	
	public static void main(String[] args) {
		checkInt();
		

	}

}
