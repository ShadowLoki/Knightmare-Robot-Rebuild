package org.usfirst.frc.team3786.robot.commands.teleop;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3786.robot.subsystems.Shooting;

public class TeleopShooterCommand extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(Shooting.getInstance());
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		Shooting.getInstance().stopEverything();
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Shooting.getInstance().stopEverything();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Shooting.getInstance().stopEverything();
	}

}
