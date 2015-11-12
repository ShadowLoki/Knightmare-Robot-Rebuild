package org.usfirst.frc.team3786.robot.subsystems;

import org.usfirst.frc.team3786.robot.commands.teleop.TeleopDriveCommand;
//import org.usfirst.frc.team3786.robot.commands.teleop.TeleopDriveCommand;
import org.usfirst.frc.team3786.robot.config.robot.RobotConfig;
//import org.usfirst.frc.team3786.robot.config.ui.UIConfig;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * 
 * @author manpreet
 *
 */
public class Wheels extends Subsystem{
	
	private static Wheels instance;
	
	// Motor Declarations
	private Talon leftMotor;
	private Talon rightMotor;
	
	//Constructor
	public Wheels() {
		leftMotor = new Talon(RobotConfig.get().getLEFT_MASTER());
		rightMotor = new Talon(RobotConfig.get().getRIGHT_MASTER());
	}
	
	public static Wheels getInstance() {
		if (instance == null)
		{
			instance = new Wheels();
		}
		
		return instance;
	}
	
	/**
	 * @param speed Set the value to output to the right motor.
	 */
	public void setLeftSpeed(double speed) {
		leftMotor.set(speed);		
		//For Debugging Purposes
		SmartDashboard.putNumber("Left Side Speed", speed);
	}
	
	/**
	 * @param speed Set the value to output to the left motor.
	 */
	public void setRightSpeed(double speed) {
		rightMotor.set(speed);
		//For Debugging Purposes
		SmartDashboard.putNumber("Right Side Speed", speed);
	}
	
	/**
	 * @param rightFactor Speed Factor for the right drive motor of the robot
	 * @param leftFactor Speed Factor for the left drive motor of the robot
	 */
	public void move(double rightFactor, double leftFactor) {
		setRightSpeed(rightFactor);
		setLeftSpeed(leftFactor);
	}
	
	public void stop() {
		setRightSpeed(0.00);
		setLeftSpeed(0.00);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new TeleopDriveCommand());
    }
	
}
