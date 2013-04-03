/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.actions.CGFullForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.CheckHangerLimitAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomAction;

/**
 *
 * @author robotics
 */
public class Climb30Step1d extends CommandGroup
{

    public Climb30Step1d()
    {
        addParallel( new CGHalfForwardAction() );
//        addParallel( new CGFullForwardAction() );
        addSequential( new ShuttleToBottomAction());
        // This action will NOT return true until the hanger limit switch is pressed.
        // SO, this will stay on this action indefinitely if the hanger does not
        // pop out where it needs to be.
        addSequential( new CheckHangerLimitAction() );
        addSequential( new CGFullForwardAction() );
    }
}
