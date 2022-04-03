package tests;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

import checkNumInput.CkeckNum;

public class UsualTests {

	public static void main(String[] args) {
		if (CkeckNum.isInteger("23")) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, "It's an integer", "Check = O K",1);
		}else {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, "Is not an integer ", "Check = K O",0);
		}

	}

}
