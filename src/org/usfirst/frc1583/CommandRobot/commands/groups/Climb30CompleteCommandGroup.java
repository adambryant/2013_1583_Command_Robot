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
public class Climb30CompleteCommandGroup extends CommandGroup
{

    public Climb30CompleteCommandGroup()
    {
        addSequential( new Climb30Step1CommandGroup() );
        addSequential( new Climb30Step2CommandGroup() );
        addSequential( new Climb30Step3CommandGroup() );
        addSequential( new Climb30Step4CommandGroup() );
        addSequential( new Climb30Step5CommandGroup() );
    }
}
