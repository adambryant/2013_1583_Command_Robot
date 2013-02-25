/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.sequences;

import org.usfirst.frc1583.CommandRobot.sequences.Climb30Sequence5;
import org.usfirst.frc1583.CommandRobot.sequences.Climb30Sequence4;
import org.usfirst.frc1583.CommandRobot.sequences.Climb30Sequence3;
import org.usfirst.frc1583.CommandRobot.sequences.Climb30Sequence2;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author robotics
 */
public class Climb30CompleteSequence extends CommandGroup
{

    public Climb30CompleteSequence()
    {
//        addSequential( new Climb30Step1CommandGroup() );
        addSequential( new Climb30Sequence2() );
        addSequential( new Climb30Sequence3() );
        addSequential( new Climb30Sequence4() );
        addSequential( new Climb30Sequence5() );
    }
}
