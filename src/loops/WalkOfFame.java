
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		r2d2.moveTo(100, 300);
		

		// 2. Make the robot draw a star shape. Hint: 144.
		r2d2.miniaturize();
		r2d2.setSpeed(200);
		r2d2.penDown();
		r2d2.setAngle(90);
		for (int i = 0; i < 5; i++) {
		for (int o = 0; o < 5; o++) {
		r2d2.penDown();
		r2d2.turn(144);
		r2d2.move(30);
		}
		r2d2.penUp();
		r2d2.setAngle(90);
		r2d2.move(50);
		}
		
		
		
		
		
		

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
