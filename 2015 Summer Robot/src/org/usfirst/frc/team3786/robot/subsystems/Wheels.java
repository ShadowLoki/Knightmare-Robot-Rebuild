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
	private Talon leftMaster;
	private Talon leftSlave;
	private Talon rightMaster;
	private Talon rightSlave;
	
	//Constructor
	public Wheels() {
		leftMaster = new Talon(RobotConfig.get().getLEFT_MASTER());
		rightMaster = new Talon(RobotConfig.get().getRIGHT_MASTER());
		leftSlave = new Talon(RobotConfig.get().getLEFT_SLAVE());
		rightSlave = new Talon(RobotConfig.get().getRIGHT_SLAVE());
	}
	
	public static Wheels getInstance() {
		if (instance == null)
		{
			instance = new Wheels();
		}
		
		return instance;
	}
	
	/**
	 * @param speed Set the value to output to the right master and slave motors.
	 */
	public void setLeftSpeed(double speed) {
		leftMaster.set(speed);
		leftSlave.set(speed);
		
		//For Debugging Purposes
		SmartDashboard.putNumber("Left Side Speed", speed);
	}
	
	/**
	 * @param speed Set the value to output to the left master and slave motors.
	 */
	public void setRightSpeed(double speed) {
		rightMaster.set(speed);
		rightSlave.set(speed);
		
		//For Debugging Purposes
		SmartDashboard.putNumber("Right Side Speed", speed);
	}
	
	/**
	 * @param rightFactor Speed Factor for the right side of the robot
	 * @param leftFactor Speed Factor for the left side of the robot
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
