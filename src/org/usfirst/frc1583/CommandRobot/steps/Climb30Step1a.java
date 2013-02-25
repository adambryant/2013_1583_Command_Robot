/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfBackAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomCountedAction;

/**
 *
 * @author robotics
 */
public class Climb30Step1a extends CommandGroup
{

    public Climb30Step1a()
    {
        addSequential( new ShuttleToBottomCountedAction(Robot.armSubsystem.INTERVAL_COUNT * 1));
        addSequential( new CGHalfBackAction() );
    }
}
