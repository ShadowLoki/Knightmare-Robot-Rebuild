package org.usfirst.frc.team3786.robot.commands.teleop;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3786.robot.subsystems.LateralAim;
import org.usfirst.frc.team3786.robot.config.ui.UIConfig;

public class TeleopLateralAimCommand extends Command{

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(LateralAim.getInstance());
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
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
