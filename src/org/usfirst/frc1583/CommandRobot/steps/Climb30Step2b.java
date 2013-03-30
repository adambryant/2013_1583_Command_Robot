/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.steps;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.actions.CGCenterAction;
import org.usfirst.frc1583.CommandRobot.actions.CGFullForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.CGHalfForwardAction;
import org.usfirst.frc1583.CommandRobot.actions.ShuttleToTopAction;

/**
 *
 * @author robotics
 */
public class Climb30Step2b extends CommandGroup
{

    public Climb30Step2b()
    {
//        addSequential( new CGHalfBackAction() );
        addParallel( new CGCenterAction() );
        addSequential( new ShuttleToTopAction());
        addSequential( new CGFullForwardAction() );
//        addSequential( new DelayAction(3.0));
    }
}
