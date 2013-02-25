/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.actions;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc1583.CommandRobot.Robot;

/**
 *
 * @author robotics
 */
public abstract class ShuttleMovementBaseAction extends Command
{
    protected int count = 0;

    protected void resetCounter()
    {
//        count = 0;
        Robot.armSubsystem.resetCounter();
    }

    protected void updateCounter()
    {
        SmartDashboard.putNumber( "Counter", Robot.armSubsystem.getCount() );
    }
}
