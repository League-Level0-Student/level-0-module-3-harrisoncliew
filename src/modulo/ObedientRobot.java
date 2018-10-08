package modulo;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot r2d2 = new Robot();

	public static void main(String[] args) {
		String three = JOptionPane.showInputDialog("Which color do you want your shape to be? (red, blue, or yellow)");
		if (three.equalsIgnoreCase("red")) {
			r2d2.setPenColor(Color.red);
		}
		else if (three.equalsIgnoreCase("blue")) {
			r2d2.setPenColor(Color.blue);
		}
		else {
			r2d2.setPenColor(Color.yellow);
		}
		r2d2.show();
		r2d2.miniaturize();
		r2d2.setSpeed(1000);
		r2d2.penDown();
		String two = JOptionPane.showInputDialog("What do you want the robot to draw? (circle, square, or, triangle) ");
		if (two.equalsIgnoreCase("circle")) {
			drawCircle();
		}
		else if (two.equalsIgnoreCase("square")) {
			drawSquare();
		}
		else {
			drawTriangle();
		}
		
		

	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			r2d2.turn(90);
			r2d2.move(100);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			r2d2.move(100);
			r2d2.turn(120);
		}

	}

	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			r2d2.move(1);
			r2d2.turn(1);
		}
	}
}
