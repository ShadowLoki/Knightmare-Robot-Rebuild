package org.usfirst.frc.team3786.robot.commands.teleop;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3786.robot.subsystems.LateralAim;
import org.usfirst.frc.team3786.robot.config.ui.UIConfig;

public class TeleopLateralAimCommand extends Command{
	
	public public TeleopLateralAimCommand() {
		requires(LateralAim.getInstance());
	}
	
	@Override
	protected void initialize() {
		LateralAim.getInstance().setSetpoint(0);
		LateralAim.getInstance().enable();
	}

	@Override
	protected void execute() {
		if(UIConfig.get().aimLeft()) {
			double setpoint = LateralAim.getInstance().getPosition() - 1;
			LateralAim.getInstance().setSetpoint(setpoint);
		}
		
		else if(UIConfig.get().aimRight()) {
			double setpoint = LateralAim.getInstance().getPosition() + 1;
			LateralAim.getInstance().setSetpoint(setpoint);
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
