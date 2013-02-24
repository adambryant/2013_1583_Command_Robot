// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc1583.CommandRobot.commands;
import org.usfirst.frc1583.CommandRobot.Robot;
/**
 *
 */
public class ShuttleToBottomCountedCommand extends ShuttleMovementBaseCommand
{
    public ShuttleToBottomCountedCommand( int count )
    {
        this.count = count;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.armSubsystem);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize()
    {
        System.out.println("In ShuttleToBottomCountedCommand.initialize");

        resetCounter();
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        System.out.println("In ShuttleToBottomCountedCommand.execute");

        Robot.armSubsystem.shuttleDown();
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        System.out.println("In ShuttleToBottomCountedCommand.isFinished, count: " + count);

        updateCounter();
        if (Robot.armSubsystem.getCount() > count ||
            Robot.armSubsystem.isBottomLimit())
        {
            return true;
        }
        return false;
    }
    // Called once after isFinished returns true
    protected void end()
    {
        System.out.println("In ShuttleToBottomCountedCommand.end");

        Robot.armSubsystem.stop();
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
        System.out.println("In ShuttleToBottomCountedCommand.interrupted");

        Robot.armSubsystem.stop();
    }
}
