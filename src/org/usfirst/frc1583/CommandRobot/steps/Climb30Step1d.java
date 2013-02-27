/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomAction;

/**
 *
 * @author robotics
 */
public class Climb30Step1d extends CommandGroup
{

    public Climb30Step1d()
    {
        addSequential( new CGHalfForwardAction() );
        addSequential( new ShuttleToBottomAction());
    }
}