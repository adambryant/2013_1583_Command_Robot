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
public class Climb30Step5a extends CommandGroup
{

    public Climb30Step5a()
    {
        addSequential( new ShuttleToBottomCountedAction(Robot.armSubsystem.INTERVAL_COUNT * 2));
        addParallel( new CGCenterAction() );
        addSequential( new DelayAction(10.0) );
//        addSequential( new ShuttleToBottomCountedAction(Robot.armSubsystem.INTERVAL_COUNT * 8));
        addSequential( new ShuttleToBottomCountedAction(660));
//        addSequential( new CGHalfForwardAction() );
    }
}
