
package org.usfirst.frc.team3786.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team3786.robot.commands.teleop.TeleopDriveCommand;
import org.usfirst.frc.team3786.robot.commands.teleop.TeleopLateralAimCommand;
import org.usfirst.frc.team3786.robot.commands.teleop.TeleopShooterCommand;
import org.usfirst.frc.team3786.robot.commands.teleop.TeleopVerticalAimCommand;
import org.usfirst.frc.team3786.robot.config.ui.UIConfig;
import org.usfirst.frc.team3786.robot.subsystems.LateralAim;
import org.usfirst.frc.team3786.robot.subsystems.Shooting;
import org.usfirst.frc.team3786.robot.subsystems.VerticalAim;
import org.usfirst.frc.team3786.robot.subsystems.Wheels;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // instantiate the command used for the autonomous period
    	Wheels.getInstance();
    	Shooting.getInstance();
    	VerticalAim.getInstance();
    	LateralAim.getInstance();
    	
        autonomousCommand = new TeleopDriveCommand();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        Scheduler.getInstance().add(new TeleopDriveCommand());
        Scheduler.getInstance().add(new TeleopLateralAimCommand());
        Scheduler.getInstance().add(new TeleopVerticalAimCommand());
        Scheduler.getInstance().add(new TeleopShooterCommand());
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
