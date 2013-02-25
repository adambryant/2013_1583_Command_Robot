/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.sequences;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step2a;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step2b;

/**
 *
 * @author robotics
 */
public class Climb30Sequence2 extends CommandGroup
{

    public Climb30Sequence2()
    {
        addSequential( new Climb30Step2a() );
        addSequential( new Climb30Step2b() );
    }
}
