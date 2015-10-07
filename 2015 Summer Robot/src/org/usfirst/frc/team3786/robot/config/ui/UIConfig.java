package org.usfirst.frc.team3786.robot.config.ui;

//import edu.wpi.first.wpilibj.buttons.Button;
//
//import org.usfirst.frc.team3786.robot.commands.teleop.TeleopCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * @author manpreet
 */
public abstract class UIConfig {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	private static UIConfig instance;
	
	static {
		//instance = new CyborgUI();
		instance = new TankDriveUI();
	}
	
	public static UIConfig get() {
		return instance;
	}
	
	public abstract double getLeftDrive();
	
	public abstract double getRightDrive();
//	
//	/**
//	 * @return The magnitude in the Y direction that the robot should move. [-1.0, 1.0]
//	 */
//	public abstract double getDriveYValue();
//	/**
//	 * @return The magnitude in the X direction that the robot should move. [-1.0,1.0]
//	 */
//	public abstract double getDriveXValue();
//	/**
//	 * @return The speed at which the robot should rotate. [-1.0, 1.0]
//	 */
//	public abstract double getDriveRotateValue();
}

