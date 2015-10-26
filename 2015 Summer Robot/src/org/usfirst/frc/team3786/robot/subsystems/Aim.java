package org.usfirst.frc.team3786.robot.subsystems;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3786.robot.config.robot.RobotConfig;
import org.usfirst.frc.team3786.robot.commands.teleop.TeleopAimCommand;

//TODO Finish off PID Control for Aim system
public class Aim extends Subsystem {
	
	private Encoder lateral;
	private Encoder vertical;
	
	private PIDController PIDLateral;
	private PIDController PIDVertical;
	
	private static Aim instance; 
	
	private static final double ENCODER_DISTANCE_PER_PULSE = 1.1685 * ((6 * Math.PI) / 360.0);
	
	public Aim() {
		lateral = new Encoder(RobotConfig.get().getLATERAL_ENCODER_CHANNEL_A(),
							RobotConfig.get().getLATERAL_ENCODER_CHANNEL_B(), false, EncodingType.k4X);
		
		vertical = new Encoder(RobotConfig.get().getVERTICAL_ENCODER_CHANNEL_A(),
							RobotConfig.get().getLATERAL_ENCODER_CHANNEL_B(), false, EncodingType.k4X);
		
		lateral.reset();
		vertical.reset();
		
		lateral.setDistancePerPulse(ENCODER_DISTANCE_PER_PULSE);
		vertical.setDistancePerPulse(ENCODER_DISTANCE_PER_PULSE);
	}
	
	public static Aim getInstance() {
		if (instance == null)
		{
			instance = new Aim();
		}	
		
		return instance;
	}
	
	public void random(){
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TeleopAimCommand());
	}
}
