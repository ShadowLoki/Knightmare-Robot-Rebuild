package org.usfirst.frc.team3786.robot.config.robot;
/**
 * The RobotConfig is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * @author manpreet
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
	
	public abstract int getLEFT_MASTER();
	
	public abstract int getRIGHT_MASTER();
	
	public abstract int getLEFT_SLAVE();
	
	public abstract int getRIGHT_SLAVE();
}
