/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.sequences;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step5a;

/**
 *
 * @author robotics
 */
public class Climb30Sequence5 extends CommandGroup
{

    public Climb30Sequence5()
    {
        addSequential( new Climb30Step5a() );
    }
}
