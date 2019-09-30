package _12_badgers;

// Badger, badger, badger, badger, badger
// Badger, badger, badger, badger, badger
// Mushroom, mushroom, a-
// Badger, badger, badger, badger, badger
// Badger, badger, badger, badger, badger
// Mushroom, mushroom, a-
// Badger, badger, badger, badger, badger
// Badger, badger, badger, badger, badger
// Mush-mushroom, a
// Badger, badger, badger, badger, badger
// Badger, badger, badger, badger, badger
// Argh! Snake, a snake!
// Snake! A snake, oooh it's a snake!

public class Badgers {
	public static void main(String[] args) {
		// Use a for loop to print the lyrics. 
		// You can only use the words “badger”, “mushroom” and “snake” once each in your code.
		for(int i = 0; i < 4; i++) {
			printBadgers();
			if(i == 3) {
				printSnakes();
			} else {
				printMushrooms();
			}
			
		}
	}
	
	public static void printBadgers() {
		String wordBadger = "badger";
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < 5; i++) {
				if(i == 0) {
					System.out.print(Character.toUpperCase(wordBadger.charAt(0)) + wordBadger.substring(1) + ", ");
				} else if (i < 4) {
					System.out.print(wordBadger + ", ");
				} else {
					System.out.print(wordBadger + "\n");
				}
			}
		}
	}
	
	public static void printMushrooms() {
		String wordMushroom = "mushroom";
			System.out.print(
					Character.toUpperCase(wordMushroom.charAt(0)) + wordMushroom.substring(1) + 
					", " + wordMushroom + ", a-\n");
	}
	
	public static void printSnakes() {
		String wordSnake = "snake";
		System.out.print(
				"Argh! " + 
				Character.toUpperCase(wordSnake.charAt(0)) + wordSnake.substring(1) + 
				", a " + wordSnake + "!\n" + 
				Character.toUpperCase(wordSnake.charAt(0)) + wordSnake.substring(1) + 
				"! A " + wordSnake + ", oooh it's a " + wordSnake + "!"
				);
	}
}
