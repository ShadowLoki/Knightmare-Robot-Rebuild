package org.usfirst.frc.team3786.robot.subsystems;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3786.robot.config.robot.RobotConfig;

/**
 * Vertical Aim Subsystem, this should be ready for testing position based PID
 * @author manpreet
 */
public class VerticalAim extends PIDSubsystem {
	
	private Encoder verticalEncoder;
	private Talon verticalAimMotor;
	
	private static double AIM_P = 5.0;
	private static double AIM_I = 0.5;
	private static double AIM_D = 1.0;
	
	public VerticalAim() {
		super("VerticalAim", AIM_P, AIM_I, AIM_D);
		
		verticalEncoder = new Encoder(RobotConfig.get().getVERTICAL_ENCODER_CHANNEL_A(), RobotConfig.get().getVERTICAL_ENDOER_CHANNEL_B(), false, EncodingType.k4X);
		
		verticalAimMotor = new Talon(RobotConfig.get().getVERTICAL_AIM());
	}
	
	@Override
	protected double returnPIDInput() {
		SmartDashboard.putNumber("Current Vertical PID Input", this.verticalEncoder.getDistance());
		return this.verticalEncoder.getDistance();
	}

	@Override
	protected void usePIDOutput(double output) {
		SmartDashboard.putNumber("Current Vertical PID Output", output);
		this.verticalAimMotor.set(output);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
}
