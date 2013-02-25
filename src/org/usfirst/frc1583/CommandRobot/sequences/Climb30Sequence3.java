/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.sequences;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step3a;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step3b;

/**
 *
 * @author robotics
 */
public class Climb30Sequence3 extends CommandGroup
{

    public Climb30Sequence3()
    {
        addSequential( new Climb30Step3a() );
        addSequential( new Climb30Step3b() );
    }
}
