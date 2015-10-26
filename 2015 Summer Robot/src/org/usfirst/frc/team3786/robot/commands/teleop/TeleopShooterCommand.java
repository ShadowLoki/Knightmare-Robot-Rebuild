package org.usfirst.frc.team3786.robot.commands.teleop;

import org.usfirst.frc.team3786.robot.subsystems.Aim;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author alexanderw
 */
//TODO Finalize shooter command for Teleop system
public class TeleopShooterCommand extends Command{

	@Override
	protected void initialize() {
		requires(Aim.getInstance());
	}


	public TeleopShooterCommand(){
		initialize();
		SmartDashboard.putNumber("Shooter Position", 0);
		SmartDashboard.putNumber("Shooter Angle", 0); //Angle Values are from 0 to 360 
		
	}
	
//	public void TeleopShooterAngle(){
//		initialize();
//		
//	}
	
	@Override
	protected void execute(){
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		//Teleop commands are never done. 
		return false;
	}	
	
	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

}
