package org.usfirst.frc.team3786.robot.config.robot;

public class PracticeConfig extends RobotConfig{

	//Drive Motors
	private static final int FRONT_RIGHT_CHANNEL = 0;
	private static final int FRONT_LEFT_CHANNEL = 0;
	private static final int BACK_RIGHT_CHANNEL = 0;
	private static final int BACK_LEFT_CHANNEL = 0;
	private static final int MAIN_CAMERA_CHANNEL = 0;
	
	//Motor Channels for feeding/Aim/aiming
	private static final int SHOOTING_CHANNEL = 0;
	private static final int ROLLER_CHANNEL = 0;
	private static final int PUSHER_CHANNEL = 0;
	
	private static final int VERTICAL_ENCODER_CHANNEL_A = 0;
	private static final int VERTICAL_ENCODER_CHANNEL_B = 0;
	
	private static final int LATERAL_ENCODER_CHANNEL_A = 0;
	private static final int LATERAL_ENCODER_CHANNEL_B = 0;
	
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
//<<<<<<< HEAD
	
	@Override
	public int getMAIN_CAMERA(){
		return MAIN_CAMERA_CHANNEL;
	}
//=======

	@Override
	public int getSHOOTER_WHEEL() {
		return SHOOTING_CHANNEL;
	}

	@Override
	public int getFEEDER() {
		return ROLLER_CHANNEL;
	}

	@Override
	public int getLIFT() {
		return PUSHER_CHANNEL;
	}

	@Override
	public int getVERTICAL_ENCODER_CHANNEL_A() {
		return VERTICAL_ENCODER_CHANNEL_A;
	}

	@Override
	public int getVERTICAL_ENDOER_CHANNEL_B() {
		return VERTICAL_ENCODER_CHANNEL_B;
	}

	@Override
	public int getLATERAL_ENCODER_CHANNEL_A() {
		return LATERAL_ENCODER_CHANNEL_A;
	}

	@Override
	public int getLATERAL_ENCODER_CHANNEL_B() {
		return LATERAL_ENCODER_CHANNEL_B;
	}
	
	
//>>>>>>> refs/remotes/origin/master
}
