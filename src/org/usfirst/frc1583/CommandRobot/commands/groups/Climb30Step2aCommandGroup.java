/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.commands.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.commands.CGHalfBackCommand;
import org.usfirst.frc1583.CommandRobot.commands.DelayTimedCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToTopCountedCommand;

/**
 *
 * @author robotics
 */
public class Climb30Step2aCommandGroup extends CommandGroup
{

    public Climb30Step2aCommandGroup()
    {
        addSequential( new ShuttleToTopCountedCommand(Robot.armSubsystem.INTERVAL_COUNT * 9));
        addSequential( new CGHalfBackCommand() );
        addSequential( new DelayTimedCommand(5.0) );
    }
}
