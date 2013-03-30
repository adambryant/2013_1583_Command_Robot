/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.sequences;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.actions.CGCenterAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomCountedAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToTopAction;

/**
 *
 * @author robotics
 */
public class ResetSequence extends CommandGroup
{

    public ResetSequence()
    {
        addSequential( new CGCenterAction() );
        addSequential( new ShuttleToTopAction());
        addSequential( new ShuttleToBottomCountedAction(Robot.armSubsystem.RESET_COUNT));
    }
}
