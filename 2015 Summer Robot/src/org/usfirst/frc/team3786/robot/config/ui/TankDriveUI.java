package org.usfirst.frc.team3786.robot.config.ui;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team3786.robot.config.ui.Controller;

/**
 * 
 * @author manpreet
 *
 */
public class TankDriveUI extends UIConfig{
	
	private static final int AIM_LEFT = 0;
	private static final int AIM_RIGHT = 0;
	private static final int AIM_DOWN = 0;
	private static final int AIM_UP = 0;
	private static final int INTAKE_BUTTON = 0;
	private static final int SHOOT = 0;
	
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

	@Override
	public boolean aimLeft() {
		boolean left = rightStick.getRawButton(AIM_LEFT);
		return left;
	}

	@Override
	public boolean aimRight() {
		boolean right = rightStick.getRawButton(AIM_RIGHT);
		return right;
	}

	@Override
	public boolean aimUp() {
		boolean up = rightStick.getRawButton(AIM_UP);
		return up;
	}

	@Override
	public boolean aimDown() {
		boolean down = rightStick.getRawButton(AIM_DOWN);
		return down;
	}

	@Override
	public boolean intakeRollers() {
		boolean intake = leftStick.getRawButton(INTAKE_BUTTON);
		return intake;
	}

	@Override
	public boolean shoot() {
		boolean shoot = rightStick.getRawButton(SHOOT);
		return shoot;
	}
}
