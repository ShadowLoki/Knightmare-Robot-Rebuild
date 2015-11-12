package org.usfirst.frc.team3786.robot.config.ui;

import edu.wpi.first.wpilibj.Joystick;

public class SingleJoystickDrive extends UIConfig{
	
	private static final double reductionFactor = 0.5;
	
	private static final int AIM_LEFT = 0;
	private static final int AIM_RIGHT = 0;
	private static final int AIM_DOWN = 0;
	private static final int AIM_UP = 0;
	private static final int INTAKE_BUTTON = 0;
	private static final int SHOOT = 0;
	
	private Joystick controller;
	private double speed;
	private double turn;
	
	public SingleJoystickDrive() {
		controller = Controller.get(1);
		speed = controller.getX() * reductionFactor;
		turn = controller.getY() * reductionFactor;
	}
	
	@Override
	public double getLeftDrive() {
		//TODO Test this
		return speed + turn;
	}

	@Override
	public double getRightDrive() {
		//TODO Test this
		return speed - turn;
	}

	@Override
	public boolean aimLeft() {
		boolean left = controller.getRawButton(AIM_LEFT);
		return left;
	}

	@Override
	public boolean aimRight() {
		boolean right = controller.getRawButton(AIM_RIGHT);
		return right;
	}

	@Override
	public boolean aimUp() {
		boolean up = controller.getRawButton(AIM_UP);
		return up;
	}

	@Override
	public boolean aimDown() {
		boolean down = controller.getRawButton(AIM_DOWN);
		return down;
	}

	@Override
	public boolean intakeRollers() {
		boolean intake = controller.getRawButton(INTAKE_BUTTON);
		return intake;
	}

	@Override
	public boolean shoot() {
		boolean shoot = controller.getRawButton(SHOOT);
		return shoot;
	}
}
