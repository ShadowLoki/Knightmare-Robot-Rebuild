package org.usfirst.frc.team3786.robot.commands.teleop;

import org.usfirst.frc.team3786.robot.config.ui.UIConfig;
import org.usfirst.frc.team3786.robot.subsystems.VerticalAim;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopVerticalAimCommand extends Command{
	
	public TeleopVerticalAimCommand() {
		requires(VerticalAim.getInstance());
	}
	
	@Override
	protected void initialize() {
		VerticalAim.getInstance().setSetpoint(0);
		VerticalAim.getInstance().enable();
	}

	@Override
	protected void execute() {
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
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}

}
