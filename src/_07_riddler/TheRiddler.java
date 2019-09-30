package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String userAnswer = JOptionPane.showInputDialog("What has hands but can not clap?");
		String correctAnswer = "Clock";

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (userAnswer.equalsIgnoreCase(correctAnswer)) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct! Your score is " + score + ".");
		} else {
			// 5. Otherwise, say "wrong" and tell them the answer
			JOptionPane.showMessageDialog(null, "Wrong! Your score is " + score + ".");
		}

		// 6. Add some more riddles
		userAnswer = JOptionPane.showInputDialog("If you have me, you want to share me. If you share me, you haven't got me. What am I?");
		correctAnswer = "Secret";

		if (userAnswer.equalsIgnoreCase(correctAnswer)) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct! Your score is " + score + ".");
		} else {
			// 5. Otherwise, say "wrong" and tell them the answer
			JOptionPane.showMessageDialog(null, "Wrong! Your score is " + score + ".");
		}
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your final score is " + score + ".");
	}
}

