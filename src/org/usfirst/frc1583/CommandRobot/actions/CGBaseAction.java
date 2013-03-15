// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc1583.CommandRobot.actions;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc1583.CommandRobot.Robot;

/**
 *
 */
public class CGBaseAction extends Command
{
    public CGBaseAction()
    {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires( Robot.bodySubsystem );
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        System.out.println("In CGBaseAction");
    }
    // Called just before this Command runs the first time

    protected void initialize()
    {
        System.out.println("In initialize");
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        if (Robot.bodySubsystem.getSetpoint() - Robot.bodySubsystem.getPot() > 0.0)
            Robot.bodySubsystem.set( 1.0 );
        else
            Robot.bodySubsystem.set( -1.0 );

        updateDisplay();

        System.out.println("In execute");
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {

        System.out.println("In isFinished");

        return Robot.bodySubsystem.onTarget();
    }
    // Called once after isFinished returns true
    protected void end()
    {
        Robot.bodySubsystem.stop();

        System.out.println("In end");
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run

    protected void interrupted()
    {
        Robot.bodySubsystem.stop();

        System.out.println("In interrupted");
    }

    protected void updateDisplay()
    {
        SmartDashboard.putNumber( "Potentiometer", Robot.bodySubsystem.getPot() );
    }
}
