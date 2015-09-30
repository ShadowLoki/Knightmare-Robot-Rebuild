package org.usfirst.frc.team3786.robot.config.robot;

public class PracticeConfig extends RobotConfig{

	private static final int FRONT_RIGHT_CHANNEL = 0;
	private static final int FRONT_LEFT_CHANNEL = 0;
	private static final int BACK_RIGHT_CHANNEL = 0;
	private static final int BACK_LEFT_CHANNEL = 0;
	
	@Override 
	public int getFRONT_LEFT()
	{
		return FRONT_LEFT_CHANNEL;
	}
	
	@Override
	public int getFRONT_RIGHT()
	{
		return FRONT_RIGHT_CHANNEL;
	}

	@Override
	public int getBACK_LEFT() {
		return BACK_LEFT_CHANNEL;
	}

	@Override
	public int getBACK_RIGHT() {
		return BACK_RIGHT_CHANNEL;
	}
}
