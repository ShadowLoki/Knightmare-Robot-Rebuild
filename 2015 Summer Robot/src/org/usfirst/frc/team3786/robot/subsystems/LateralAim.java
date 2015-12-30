package org.usfirst.frc.team3786.robot.subsystems;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3786.robot.config.robot.RobotConfig;
import org.usfirst.frc.team3786.robot.commands.teleop.TeleopLateralAimCommand;

public class LateralAim extends  PIDSubsystem{
	
	private static LateralAim instance;
	
	private Encoder lateralEncoder;
	private Talon lateralAimMotor;
	
	private static double AIM_P = 5.0;
	private static double AIM_I = 0.5;
	private static double AIM_D = 1.0;
	
	public LateralAim() {
		super("LateralAim", AIM_P, AIM_I, AIM_D);
		
		lateralEncoder = new Encoder(RobotConfig.get().getLATERAL_ENCODER_CHANNEL_A(), RobotConfig.get().getLATERAL_ENCODER_CHANNEL_B(), false, EncodingType.k4X);
		
		lateralAimMotor = new Talon(RobotConfig.get().getLATERAL_AIM());
		
		lateralEncoder.setDistancePerPulse(2);
		this.setAbsoluteTolerance(0.05);
		this.getPIDController().setContinuous(false);
	}
	
	public static LateralAim getInstance() {
		if(instance == null)
			instance = new LateralAim();
		return instance;
	}
		
	@Override
	protected double returnPIDInput() {
		SmartDashboard.putNumber("Current Lateral PID Input", this.lateralEncoder.getDistance());
		return this.lateralEncoder.getDistance();
	}

	@Override
	protected void usePIDOutput(double output) {
		SmartDashboard.putNumber("Current LateralPID Output", output);
		lateralAimMotor.set(output);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new TeleopLateralAimCommand());
	}

}
