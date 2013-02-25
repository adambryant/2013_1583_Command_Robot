/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.actions.CGCenterAction;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.DelayAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToTopAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToTopCountedAction;

/**
 *
 * @author robotics
 */
public class Climb20Step2a extends CommandGroup
{

    public Climb20Step2a()
    {
        addSequential( new ShuttleToTopCountedAction(Robot.armSubsystem.INTERVAL_COUNT * 10));
        addSequential( new CGHalfForwardAction() );
        addSequential( new ShuttleToTopAction());
        addSequential( new CGCenterAction());
        addSequential( new DelayAction(3.0));
    }
}
