package _02_unbirthday;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Unbirthday {
	
	public static void main(String[] args) {
		// 1. Ask the user for their birthday (mm/dd), e.g. 06/09
		
		String userResponse = JOptionPane.showInputDialog("What is your birthday? mm/dd format please!");
		
		// 2. If it matches today's date, wish them a happy birthday
		// otherwise, wish them a very merry UNbirthday 
		
		String todayDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd"));
		
		if (userResponse.equals(todayDate)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
		}
	}
}
