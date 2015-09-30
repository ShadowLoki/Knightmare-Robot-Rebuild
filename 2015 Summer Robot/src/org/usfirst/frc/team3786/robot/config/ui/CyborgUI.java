package org.usfirst.frc.team3786.robot.config.ui;

//import org.usfirst.frc.team3786.robot.subsystems.Wheels;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;

/**
 * The Config to be used with the Cyborg controller
 * @author manpreet
 *
 */
public class CyborgUI extends UIConfig{
	
	//Joystick Information
	private final int CYBORG_CHANNEL = 0;
	//private final int JOYSTICK_CHANNEL =1;
	private final AxisType ROTATION_AXIS = AxisType.kThrottle;
	
	//Cyborg Buttons
	
	//Instance Vars
	private final Joystick CYBORG;
	//private final Joystick JOYSTICK;
	
	public CyborgUI()
	{
		CYBORG = new Joystick(CYBORG_CHANNEL);
		//JOYSTICK = new Joystick(JOYSTICK_CHANNEL);
	}
	
	public double getDriveXValue() {
		return CYBORG.getX();
	}
	
	public double getDriveYValue() {
		return CYBORG.getY();
	}
	
	public double getDriveRotateValue() {
		return CYBORG.getAxis(ROTATION_AXIS);
	}
}
