/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.Robot;
import org.usfirst.frc1583.CommandRobot.actions.CGCenterAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomCountedAction;

/**
 *
 * @author robotics
 */
public class Climb30Step1c extends CommandGroup
{

    public Climb30Step1c()
    {
        addSequential( new ShuttleToBottomCountedAction(Robot.armSubsystem.INTERVAL_COUNT * 4));
        addSequential( new CGCenterAction() );
    }
}
