/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.commands.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.commands.CGHalfForwardCommand;
import org.usfirst.frc1583.CommandRobot.commands.DelayTimedCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToBottomCommand;

/**
 *
 * @author robotics
 */
public class Climb30Step3bCommandGroup extends CommandGroup
{

    public Climb30Step3bCommandGroup()
    {
        addSequential( new DelayTimedCommand(5.0) );
        addSequential( new CGHalfForwardCommand());
        addSequential( new ShuttleToBottomCommand());
    }
}
