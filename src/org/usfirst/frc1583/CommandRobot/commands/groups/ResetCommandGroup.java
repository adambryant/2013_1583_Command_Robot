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
        addSequential( new ShuttleToTopCommand());
        addSequential( new ShuttleToBottomCountedCommand(Robot.armSubsystem.RESET_COUNT));
    }
}
