/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.actions.CGCenterAction;
import org.usfirst.frc1583.CommandRobot.actions.DelayAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomCountedAction;

/**
 *
 * @author robotics
 */
public class Climb20Step3a extends CommandGroup
{

    public Climb20Step3a()
    {
        addSequential( new ShuttleToBottomCountedAction(Robot.armSubsystem.INTERVAL_COUNT * 2));
        addSequential( new CGCenterAction() );
        addSequential( new DelayAction(5.0) );
        addSequential( new ShuttleToBottomCountedAction(Robot.armSubsystem.INTERVAL_COUNT * 7));
//        addSequential( new CGHalfForwardAction() );
    }
}
