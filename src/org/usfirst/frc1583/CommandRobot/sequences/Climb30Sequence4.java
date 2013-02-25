/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.sequences;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step4a;

/**
 *
 * @author robotics
 */
public class Climb30Sequence4 extends CommandGroup
{

    public Climb30Sequence4()
    {
        addSequential( new Climb30Step4a() );
    }
}
