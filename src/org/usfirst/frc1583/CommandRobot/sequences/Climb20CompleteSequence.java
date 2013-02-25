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
import org.usfirst.frc1583.CommandRobot.steps.Climb20Step2a;
import org.usfirst.frc1583.CommandRobot.steps.Climb20Step3a;

/**
 *
 * @author robotics
 */
public class Climb20CompleteSequence extends CommandGroup
{

    public Climb20CompleteSequence()
    {
        addSequential( new Climb20Step2a() );
        addSequential( new Climb20Step3a() );
    }
}
