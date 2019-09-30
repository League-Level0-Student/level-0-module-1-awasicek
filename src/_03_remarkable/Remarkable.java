package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
	
		// 1. Save something remarkable about each person in a variable.
		String bobRemarkable = "Bob can hold his breath for 4 minutes!";
		String maryRemarkable = "Mary has sailed around the globe!";
		String peteRemarkable = "Pete has a pet tarantula!";
	
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String userInput = JOptionPane.showInputDialog("Enter your name please.");
	
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		String response;
		
		if (userInput.equals("Bob")) {
			response = bobRemarkable;
		} else if (userInput.equals("Mary")) {
			response = maryRemarkable;
		} else if (userInput.equals("Pete")) {
			response = peteRemarkable;
		} else {
			response = "Unrecognized name.";
		}
		
		JOptionPane.showMessageDialog(null, response);
	
	}
}

