package org.usfirst.frc.team3786.robot.subsystems;

import org.usfirst.frc.team3786.robot.config.robot.RobotConfig;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
*	@author alexanderw
*/
public class Vision extends Subsystem {

	//Constructor
	public Vision(){
		
		CameraServer mainCamera = CameraServer.getInstance();
		mainCamera.setQuality(50); 
		mainCamera.startAutomaticCapture("main_cam");
	}
	
	private static Vision instance; 
	
	
	//Camera Declaration 
	private CameraServer mainCamera; 
	
	public static Vision getInstance(){
		if (instance == null)
		{
			instance = new Vision();
		}
		
		return instance;
	}

	public void initDefaultCommand() {
		
	}

}
