package org.usfirst.frc.team3786.robot.subsystems;

import org.usfirst.frc.team3786.robot.commands.teleop.TeleopCommand;
//import org.usfirst.frc.team3786.robot.commands.teleop.TeleopDriveCommand;
import org.usfirst.frc.team3786.robot.config.robot.RobotConfig;
//import org.usfirst.frc.team3786.robot.config.ui.UIConfig;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Wheels extends Subsystem{
	
	private static Wheels instance;
	
	private Talon frontLeft;
	private Talon backLeft;
	private Talon frontRight;
	private Talon backRight;
	
	
	public Wheels()
	{
		
		frontLeft = new Talon(RobotConfig.get().getFRONT_LEFT());
		frontRight = new Talon(RobotConfig.get().getFRONT_RIGHT());
		backLeft = new Talon(RobotConfig.get().getBACK_LEFT());
		backRight = new Talon(RobotConfig.get().getBACK_RIGHT());
	}
	public static Wheels getInstance()
	{
		if (instance == null)
		{
			instance = new Wheels();
		}
		
		return instance;
	}
	
	public void setFrontLeft(double factor)
	{
		frontLeft.set(factor);
	}
	
	public void setFrontRight(double factor)
	{
		frontRight.set(factor);
	}
	
	public void setBackLeft(double factor)
	{
		backLeft.set(factor);
	}
	
	public void setBackRight(double factor)
	{
		backRight.set(factor);
	}
		
	public void drive()
	{
		
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new TeleopCommand());
    }
	
}
