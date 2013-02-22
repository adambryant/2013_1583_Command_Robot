/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.commands.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToBottomCountedCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToTopCommand;

/**
 *
 * @author robotics
 */
public class ResetCommandGroup extends CommandGroup
{

    public ResetCommandGroup()
    {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.
        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        addSequential( new ShuttleToTopCommand());
        addSequential( new ShuttleToBottomCountedCommand(Robot.armSubsystem.RESET_COUNT));
//        addSequential( new CGCenterCommand() );
    }
}
