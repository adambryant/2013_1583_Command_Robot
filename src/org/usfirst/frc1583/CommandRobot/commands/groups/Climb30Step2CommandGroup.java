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
public class Climb30Step2CommandGroup extends CommandGroup
{

    public Climb30Step2CommandGroup()
    {
        addSequential( new Climb30Step2aCommandGroup() );
        addSequential( new Climb30Step2bCommandGroup() );
    }
}
