package org.usfirst.frc.team3786.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3786.robot.commands.teleop.TeleopShooterCommand;
import org.usfirst.frc.team3786.robot.config.robot.RobotConfig;

/**
 * All functions relating to Aim a ball.
 * This includes running the feeder wheel, running the lift, and running the shooter wheel.
 * It may include functions relating to aiming the shooter.
 * @author manpreet, alexanderw
 */
public class Shooting extends Subsystem {
	
	private Talon shooterWheel;
	private Talon feeder;
	private Talon lift;
	
	private static Shooting instance;
	
	public Shooting(){
		shooterWheel = new Talon(RobotConfig.get().getSHOOTER_WHEEL());
		feeder = new Talon(RobotConfig.get().getFEEDER());
		lift = new Talon(RobotConfig.get().getLIFT());
	}
	
	public static Shooting getInstance() {
		if (instance == null)
		{
			instance = new Shooting();
		}	
		
		return instance;
	}
	
	/**
	 * @param speed Speed you want to set the shooter wheel to
	 */
	public void setShooterSpeed(double speed) {
		SmartDashboard.putNumber("Shooter Wheel Speed", speed);
		shooterWheel.set(speed);
	}
	
	/**
	 * Stop the shooter wheel itself
	 */
	public void stopShooter() {
		shooterWheel.set(0.0);
	}
	
	/**
	 * @param speed Speed the feeder motor should be running at
	 */
	public void setFeederSpeed(double speed) {
		SmartDashboard.putNumber("Feeder Speed", speed);
		feeder.set(speed);
	}
	
	/**
	 * Stop just the feeder itself
	 */
	public void stopFeeder() {
		feeder.set(0.0);
	}
	
	/**
	 * This is probably going to get replaced because we might use a encoder for this motor
	 * @param speed Speed to run the Lift at (raise and lower)
	 */
	public void setLift(double speed) {
		SmartDashboard.putNumber("Lift Speed", speed);
		lift.set(speed);
	}
	
	/**
	 * Stop just the Lift itself
	 */
	public void stopLift() {
		lift.set(0.0);
	}
	
	/**
	 * Stop everything in this subsystem
	 */
	public void stopEverything() {
		stopShooter();
		stopFeeder();
		stopLift();
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TeleopShooterCommand());
	}

}
