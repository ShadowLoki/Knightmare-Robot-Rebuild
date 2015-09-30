package org.usfirst.frc.team3786.robot.config.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public abstract class RobotConfig {
	
	private static RobotConfig instance;
	
	static
	{
		instance = new PracticeConfig();
	}
	
	
	public static RobotConfig get()
	{
		return instance;
	}
	
	public abstract int getFRONT_LEFT();
	
	public abstract int getFRONT_RIGHT();
	
	public abstract int getBACK_LEFT();
	
	public abstract int getBACK_RIGHT();
}
