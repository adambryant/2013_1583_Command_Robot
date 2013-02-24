// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc1583.CommandRobot.subsystems;
import com.rop.input.LimitSwitch;
import org.usfirst.frc1583.CommandRobot.RobotMap;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class ArmSubsystem extends Subsystem
{
    Preferences prefs;

    private final double DOWN_SPEED;
    private final double UP_SPEED;
    private final int MAX_COUNT;
    public final int RESET_COUNT;
    public final int INTERVAL_COUNT;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    LimitSwitch topLimit = RobotMap.armSubsystemTopLimit;
    LimitSwitch bottomLimit = RobotMap.armSubsystemBottomLimit;
    SpeedController motor = RobotMap.armSubsystemMotor;
    Counter counter = RobotMap.armCountSubsystemCounter;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public ArmSubsystem()
    {
        super();
        prefs = Preferences.getInstance();
        UP_SPEED = prefs.getDouble( "ShuttleUpSpeed", 0.3);
        DOWN_SPEED = prefs.getDouble( "ShuttleDownSpeed", -0.3);
        MAX_COUNT = prefs.getInt( "MaxCount", 5000);
        RESET_COUNT = prefs.getInt( "ResetCount", 1000);
        INTERVAL_COUNT = prefs.getInt( "IntervalCount", 100);

//        System.out.println("MAX_COUNT: " + MAX_COUNT);
//        System.out.println("RESET_COUNT: " + RESET_COUNT);
    }

    public void initDefaultCommand()
    {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void resetCounter()
    {
        counter.reset();
        counter.start();
    }
    public int getCount()
    {
        return counter.get();
    }
    public void shuttleUp()
    {
        motor.set( UP_SPEED );
    }
    public void shuttleDown()
    {
        motor.set( DOWN_SPEED );
    }
    public boolean isTopLimit()
    {
        return this.topLimit.get();
    }
    public boolean isBottomLimit()
    {
        return this.bottomLimit.get();
    }
    public void stop()
    {
        motor.set( 0.0 );
        counter.stop();
    }
}
