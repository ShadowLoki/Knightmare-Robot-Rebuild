package org.usfirst.frc.team3786.robot.config.robot;

public class PracticeConfig extends RobotConfig{

	private static final int RUDDER_MOTOR_CHANNEL = 0;
	private static final int TROLLING_MOTOR_CHANNEL = 0;
	
	@Override 
	public int getTROLLING_MOTOR_CHANNEL()
	{
		return TROLLING_MOTOR_CHANNEL;
	}
	
	@Override
	public int getRUDDER_MOTOR_CHANNEL()
	{
		return RUDDER_MOTOR_CHANNEL;
	}
}
