package org.usfirst.frc.team3786.robot.config.robot;

public class PracticeConfig extends RobotConfig{

	//Drive Motors
	private static final int FRONT_RIGHT_CHANNEL = 0;
	private static final int FRONT_LEFT_CHANNEL = 0;
	private static final int BACK_RIGHT_CHANNEL = 0;
	private static final int BACK_LEFT_CHANNEL = 0;
	
	//Motor Channels for feeding/shooting/aiming
	private static final int SHOOTER_CHANNEL = 0;
	private static final int INTAKE_ROLLER = 0;
	private static final int LIFT = 0;
	
	private static final int VERTICAL_MOTOR_CHANNEL = 0;
	private static final int VERTICAL_ENCODER_CHANNEL_A = 0;
	private static final int VERTICAL_ENCODER_CHANNEL_B = 0;
	
	private static final int LATERAL_MOTOR_CHANNEL = 0;
	private static final int LATERAL_ENCODER_CHANNEL_A = 0;
	private static final int LATERAL_ENCODER_CHANNEL_B = 0;
	
	private static final int TOP_LIMIT = 0;
	private static final int BOTTOM_LIMIT = 0;
	
	
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
	public int getINTAKE_ROLLER() {
		return INTAKE_ROLLER;
	}

	@Override
	public int getLIFT() {
		return LIFT;
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

	@Override
	public int getVERTICAL_AIM() {
		return VERTICAL_MOTOR_CHANNEL;
	}

	@Override
	public int getLATERAL_AIM() {
		return LATERAL_MOTOR_CHANNEL;
	}

	@Override
	public int getSHOOTER() {
		return SHOOTER_CHANNEL;
	}

	@Override
	public int getTOP_LIMIT() {
		return TOP_LIMIT;
	}

	@Override
	public int getBOTTOM_LIMIT() {
		return BOTTOM_LIMIT;
	}
}
