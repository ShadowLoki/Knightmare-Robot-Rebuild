package org.usfirst.frc.team3786.robot.commands.teleop;

import org.usfirst.frc.team3786.robot.subsystems.Aim;
import org.usfirst.frc.team3786.robot.subsystems.Shooting;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopAimCommand extends Command{

	@Override
	protected void initialize() {
		requires(Aim.getInstance());
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
