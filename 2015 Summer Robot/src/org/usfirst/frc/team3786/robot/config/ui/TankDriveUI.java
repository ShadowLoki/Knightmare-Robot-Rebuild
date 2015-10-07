package org.usfirst.frc.team3786.robot.config.ui;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team3786.robot.config.ui.Controller;

/**
 * 
 * @author manpreet
 *
 */
public class TankDriveUI extends UIConfig{	
	public TankDriveUI(){
		leftStick = Controller.get(1);
		rightStick = Controller.get(2);
	}
	
	private Joystick leftStick;
	private Joystick rightStick;
	
	@Override
	public double getLeftDrive(){
		return leftStick.getY();
	}
	
	@Override
	public double getRightDrive(){
		return rightStick.getY();
	}
	
}
