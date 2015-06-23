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
	
	private Talon rudderMotor;
	private Talon trollingMotor;
	
	public Wheels()
	{
		
		rudderMotor = new Talon(RobotConfig.get().getRUDDER_MOTOR_CHANNEL());
		trollingMotor = new Talon(RobotConfig.get().getTROLLING_MOTOR_CHANNEL());
		
	}
	public static Wheels getInstance()
	{
		if (instance == null)
		{
			instance = new Wheels();
		}
		
		return instance;
	}
	
	public void setRudder(double factor)
	{
		rudderMotor.set(factor);
		//SmartDashboard.putDouble("Rudder Motor Speed", factor);
	}
	
	public void setTroll(double factor)
	{
		trollingMotor.set(factor);
		//SmartDashboard.putDouble("Trolling Motor Speed", factor);
	}
		
	public void drive(double rudder, double trolling)
	{
		setRudder(rudder);
		setTroll(trolling);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new TeleopCommand());
    }
	
}
