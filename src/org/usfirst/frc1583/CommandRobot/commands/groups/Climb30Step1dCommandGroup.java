/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.commands.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.commands.CGHalfForwardCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToBottomCommand;

/**
 *
 * @author robotics
 */
public class Climb30Step1dCommandGroup extends CommandGroup
{

    public Climb30Step1dCommandGroup()
    {
        addSequential( new CGHalfForwardCommand() );
        addSequential( new ShuttleToBottomCommand());
    }
}
