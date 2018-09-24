package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Are you happy? (yes or no)");
		if(answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		if(answer.equalsIgnoreCase("no")) {
			String guess3 = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if(guess3.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
			if(guess3.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
		}
		
			
		}
		
		
	}


