/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.actions.CGCenterAction;
import org.usfirst.frc1583.CommandRobot.actions.CGFullForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.DelayAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToTopAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToTopCountedAction;

/**
 *
 * @author robotics
 */
public class Climb30Step4a extends CommandGroup
{

    public Climb30Step4a()
    {
        addParallel( new CGHalfForwardAction() );
        addSequential( new ShuttleToTopCountedAction(Robot.armSubsystem.INTERVAL_COUNT * 9));
        addSequential( new CGFullForwardAction() );
        addSequential( new ShuttleToTopAction());
        addSequential( new CGCenterAction());
        addSequential( new DelayAction(5.0));
    }
}
