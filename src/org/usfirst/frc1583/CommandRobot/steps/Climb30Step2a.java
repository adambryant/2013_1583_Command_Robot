/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfBackAction;
import org.usfirst.frc1583.CommandRobot.actions.DelayAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToTopCountedAction;

/**
 *
 * @author robotics
 */
public class Climb30Step2a extends CommandGroup
{

    public Climb30Step2a()
    {
        addSequential( new ShuttleToTopCountedAction(Robot.armSubsystem.INTERVAL_COUNT * 9));
        addSequential( new CGHalfBackAction() );
        addSequential( new DelayAction(5.0) );
    }
}