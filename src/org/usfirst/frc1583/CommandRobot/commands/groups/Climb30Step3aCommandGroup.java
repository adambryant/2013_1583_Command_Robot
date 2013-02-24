/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.commands.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.commands.CGCenterCommand;
import org.usfirst.frc1583.CommandRobot.commands.DelayTimedCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToBottomCountedCommand;

/**
 *
 * @author robotics
 */
public class Climb30Step3aCommandGroup extends CommandGroup
{

    public Climb30Step3aCommandGroup()
    {
        addSequential( new ShuttleToBottomCountedCommand(Robot.armSubsystem.INTERVAL_COUNT));
        addSequential( new CGCenterCommand() );
    }
}