package elseif;

import javax.swing.JOptionPane;

public class Horoscopes {
	public static void main(String[] args) {
		
	
	String star = JOptionPane.showInputDialog("What is your star sign?");
	if(star.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "The mountain goat is the symbol for this sign because of the characteristic of the goat to climb higher and higher without losing his footing.\n Capricorn people are the type that are goal oriented and driven to succeed despite all odds. They will work long and hard hours toward a purposeful goal. ");
	}
	else if(star.equalsIgnoreCase("Sagittarious")) {
		JOptionPane.showMessageDialog(null, "The centaur is the symbol for this sign. In mythology, the centaur was half man and half horse, given to pursing pleasure.\n The centaur is shown with a bow, which he shoots. Wherever the arrow lands, the centaur follows, retrieves the arrow and shoots again. Those born under this sign will love travelling, discovering new things, meeting new people, and learning new things.");
	} 
	else if(star.equalsIgnoreCase("Aquarious")) {
		JOptionPane.showMessageDialog(null, "The man who carries the pitcher of water is the symbol for this sign. This is because Aquarians are often generous with their time and resources.\n For this reason this sign often find themselves in occupations where they are helping on some humanitarian level. They are interested and have a deep concern for the welfare of others.");
	}
	else if(star.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "The fish is the symbol given to this sign, primarily because fish live in a secretive and mysterious place. Pisces tend to be daydreamers,\n often dreaming up brilliant ideas and plans which they are unable to facilitate themselves. They have a happy and vibrant inner life that few get to share or see.");
	} else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!!!!!!");
	}
	

}
}
