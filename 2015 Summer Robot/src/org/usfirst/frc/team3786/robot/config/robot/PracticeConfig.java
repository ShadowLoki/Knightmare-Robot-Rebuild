package org.usfirst.frc.team3786.robot.config.robot;

public class PracticeConfig extends RobotConfig{

	private static final int FRONT_RIGHT_CHANNEL = 0;
	private static final int FRONT_LEFT_CHANNEL = 0;
	private static final int BACK_RIGHT_CHANNEL = 0;
	private static final int BACK_LEFT_CHANNEL = 0;
	private static final int MAIN_CAMERA_CHANNEL = 0;
	
	@Override 
	public int getLEFT_MASTER()
	{
		return FRONT_LEFT_CHANNEL;
	}
	
	@Override
	public int getRIGHT_MASTER()
	{
		return FRONT_RIGHT_CHANNEL;
	}

	@Override
	public int getLEFT_SLAVE() {
		return BACK_LEFT_CHANNEL;
	}

	@Override
	public int getRIGHT_SLAVE() {
		return BACK_RIGHT_CHANNEL;
	}
	
	@Override
	public int getMAIN_CAMERA(){
		return MAIN_CAMERA_CHANNEL;
	}
}
