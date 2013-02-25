/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomCountedAction;

/**
 *
 * @author robotics
 */
public class Climb20Step1a extends CommandGroup
{

    public Climb20Step1a()
    {
        addSequential( new ShuttleToBottomCountedAction(Robot.armSubsystem.INTERVAL_COUNT));
        addSequential( new CGHalfForwardAction() );
        addSequential( new ShuttleToBottomAction());
    }
}
