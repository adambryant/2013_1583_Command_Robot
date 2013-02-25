/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.actions.CGFullBackAction;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfBackAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomCountedAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomTimedAction;

/**
 *
 * @author robotics
 */
public class Climb30Step1b extends CommandGroup
{

    public Climb30Step1b()
    {
        addSequential( new ShuttleToBottomCountedAction(Robot.armSubsystem.INTERVAL_COUNT));
        addSequential( new CGFullBackAction() );
    }
}
