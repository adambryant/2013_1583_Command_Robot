/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.commands.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.commands.CGHalfBackCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToTopCountedCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToTopTimedCommand;

/**
 *
 * @author robotics
 */
public class Climb30Step2aCommandGroup extends CommandGroup
{

    public Climb30Step2aCommandGroup()
    {
        addSequential( new ShuttleToTopCountedCommand(Robot.armSubsystem.INTERVAL_COUNT * 10));
        addSequential( new CGHalfBackCommand() );
    }
}
