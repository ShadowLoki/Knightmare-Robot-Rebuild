package org.usfirst.frc.team3786.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3786.robot.commands.teleop.TeleopShooterCommand;
import org.usfirst.frc.team3786.robot.config.robot.RobotConfig;

/**
 * All functions relating to shooting a ball.
 * This class can run the intake rollers, the lift, and the shooter wheel.
 * @author manpreet
 */
public class Shooting extends Subsystem {
	
	public static Shooting instance;
	
	private Talon shooterWheel;
	private Relay intakeRoller;
	private Relay lift;
	private DigitalInput topLimit;
	private DigitalInput bottomLimit;
	
	public Shooting(){
		shooterWheel = new Talon(RobotConfig.get().getSHOOTER());
		intakeRoller = new Relay(RobotConfig.get().getINTAKE_ROLLER());
		lift = new Relay(RobotConfig.get().getLIFT());
		
		topLimit = new DigitalInput(RobotConfig.get().getTOP_LIMIT());
		bottomLimit = new DigitalInput(RobotConfig.get().getBOTTOM_LIMIT());
	}
	
	public static Shooting getInstance(){
		if(instance == null)
			instance = new Shooting();
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
	public void intake() {
		intakeRoller.set(Relay.Value.kForward);
	}
	
	/**
	 * Stop just the feeder itself
	 */
	public void stopFeeder() {
		intakeRoller.set(Relay.Value.kOff);
	}
	
	/**
	 * This is probably going to get replaced because we might use a encoder for this motor
	 */
	public void liftUp() {
		lift.set(Relay.Value.kForward);
	}
	
	public void liftDown() {
		lift.set(Relay.Value.kReverse);
	}
	
	/**
	 * Stop just the Lift itself
	 */
	public void stopLift() {
		lift.set(Relay.Value.kOff);
	}
	
	/**
	 * Check to see if the lift has reached the top limit
	 * @return Returns true if lift has reached top position, false otherwise
	 */
	public boolean liftUpLimit(){
		return topLimit.get();
	}
	
	/**
	 * Check to see if the lift has reached the bottom limit
	 * @return Returns true if lift has reached bottom position, false otherwise
	 */
	public boolean liftDownLimit(){
		return bottomLimit.get();
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
