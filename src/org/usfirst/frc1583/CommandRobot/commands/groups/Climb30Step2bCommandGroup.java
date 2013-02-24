/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.commands.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.commands.CGCenterCommand;
import org.usfirst.frc1583.CommandRobot.commands.CGFullBackCommand;
import org.usfirst.frc1583.CommandRobot.commands.CGHalfBackCommand;
import org.usfirst.frc1583.CommandRobot.commands.ShuttleToTopCommand;

/**
 *
 * @author robotics
 */
public class Climb30Step2bCommandGroup extends CommandGroup
{

    public Climb30Step2bCommandGroup()
    {
        addSequential( new CGHalfBackCommand() );
        addSequential( new ShuttleToTopCommand());
        addSequential( new CGCenterCommand() );
    }
}
