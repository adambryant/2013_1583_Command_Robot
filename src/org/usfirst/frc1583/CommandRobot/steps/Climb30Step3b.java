/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.actions.CGFullForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.DelayAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToBottomAction;

/**
 *
 * @author robotics
 */
public class Climb30Step3b extends CommandGroup
{

    public Climb30Step3b()
    {
        addSequential( new DelayAction(10.0) );
        addSequential( new CGHalfForwardAction());
        addSequential( new ShuttleToBottomAction());
    }
}
