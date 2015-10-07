
package org.usfirst.frc.team3786.robot.commands.teleop;

import edu.wpi.first.wpilibj.command.Command;

//import org.usfirst.frc.team3786.robot.Robot;
import org.usfirst.frc.team3786.robot.config.ui.UIConfig;
import org.usfirst.frc.team3786.robot.subsystems.Wheels;

/**
 * 
 * @author manpreet
 *
 */
public class TeleopDriveCommand extends Command {

    public TeleopDriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Wheels.getInstance());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Wheels.getInstance().move(UIConfig.get().getRightDrive(), UIConfig.get().getLeftDrive());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	// We are never done driving
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
