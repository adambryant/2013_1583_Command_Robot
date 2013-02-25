/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.sequences;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step1a;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step1b;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step1c;
import org.usfirst.frc1583.CommandRobot.steps.Climb30Step1d;

/**
 *
 * @author robotics
 */
public class Climb30Sequence1 extends CommandGroup
{

    public Climb30Sequence1()
    {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.
        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        addSequential( new Climb30Step1a() );
        addSequential( new Climb30Step1b() );
        addSequential( new Climb30Step1c() );
        addSequential( new Climb30Step1d() );
    }
}
