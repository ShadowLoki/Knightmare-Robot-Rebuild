package org.usfirst.frc.team3786.robot.commands.teleop;

import org.usfirst.frc.team3786.robot.config.ui.UIConfig;
import org.usfirst.frc.team3786.robot.subsystems.VerticalAim;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopVerticalAimCommand extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(VerticalAim.getInstance());
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if(UIConfig.get().aimUp()) {
			double setpoint = VerticalAim.getInstance().getPosition() + 1;
			VerticalAim.getInstance().setSetpoint(setpoint);
		}
		
		else if(UIConfig.get().aimDown()) {
			double setpoint = VerticalAim.getInstance().getPosition() - 1;
			VerticalAim.getInstance().setSetpoint(setpoint);
		}
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
