/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.commands.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.commands.CGCenterCommand;
import org.usfirst.frc1583.CommandRobot.commands.CGHalfForwardCommand;
import org.usfirst.frc1583.CommandRobot.commands.DelayTimedCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToTopCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToTopCountedCommand;

/**
 *
 * @author robotics
 */
public class Climb30Step4aCommandGroup extends CommandGroup
{

    public Climb30Step4aCommandGroup()
    {
        addSequential( new ShuttleToTopCountedCommand(Robot.armSubsystem.INTERVAL_COUNT * 10));
        addSequential( new CGHalfForwardCommand() );
        addSequential( new ShuttleToTopCommand());
        addSequential( new CGCenterCommand());
        addSequential( new DelayTimedCommand(5.0));
    }
}
