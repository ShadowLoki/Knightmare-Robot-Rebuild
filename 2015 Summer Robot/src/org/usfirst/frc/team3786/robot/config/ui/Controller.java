package org.usfirst.frc.team3786.robot.config.ui;

import edu.wpi.first.wpilibj.Joystick;

/**
 * 
 * @author manpreet
 *
 */
public class Controller {
	private Controller(){
	}
	
	private static final Joystick[] instances = new Joystick[2];
	
	public static Joystick get(int slot){
		//Slots are one-based
		int index = slot - 1;
		if(instances[index] == null)
			instances[index] = new Joystick(slot);
		
		return instances[index];
	}
}
