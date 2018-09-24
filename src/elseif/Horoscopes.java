package elseif;

import javax.swing.JOptionPane;

public class Horoscopes {
	public static void main(String[] args) {
		
	
	String star = JOptionPane.showInputDialog("What is your star sign?");
	if(star.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "The mountain goat is the symbol for this sign because of the characteristic of the goat to climb higher and higher without losing his footing.\n Capricorn people are the type that are goal oriented and driven to succeed despite all odds. They will work long and hard hours toward a purposeful goal. ");
	}
	if(star.equalsIgnoreCase("Sagittarious")) {
		JOptionPane.showMessageDialog(null, "The centaur is the symbol for this sign. In mythology, the centaur was half man and half horse, given to pursing pleasure.\n The centaur is shown with a bow, which he shoots. Wherever the arrow lands, the centaur follows, retrieves the arrow and shoots again. Those born under this sign will love travelling, discovering new things, meeting new people, and learning new things.");
	}

}
}
