/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.commands.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author robotics
 */
public class Climb30Step5CommandGroup extends CommandGroup
{

    public Climb30Step5CommandGroup()
    {
        addSequential( new Climb30Step5aCommandGroup() );
    }
}
