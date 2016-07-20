/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 20 July 2016
 * 
 * Aim : to design calculator class
*/

package assignment1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {
	
		Digits[] digit;
		Operator[] operator;
		Layout layout;
		Display display;
		
		public Calculator(){
			//do nothing in constructor
		}
		
		public Calculator(int digit, int operator) {
			//initialize all the objects
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//logic for action when the buttons are clicked
		}
		
		public Digits[] getDigits() {
			//sending the reference for 
			return digit;
		}
}