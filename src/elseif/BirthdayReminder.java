
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 7th";
		String dadsBirthday = "June 8th";
		String myBirthday = "June 9th";
		String sisterbirthday = "June 10th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String want = JOptionPane.showInputDialog("What birthday do you want? (mom, dad, sister, or me");
	
		// 3. Print out what the user typed
		System.out.println(want);
		
		// 4. if user asked for "mom"
		if(want.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if(want.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if(want.equalsIgnoreCase("me")) {
			System.out.println(myBirthday);
		}
			// print myBirthday
		else if (want.equalsIgnoreCase("sister")) {
			System.out.println(sisterbirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, I don't remember that person's birthday!");
		}

	} 
}
