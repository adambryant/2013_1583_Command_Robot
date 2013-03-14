// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc1583.CommandRobot;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc1583.CommandRobot.sequences.Climb20CompleteSequence;
import org.usfirst.frc1583.CommandRobot.sequences.Climb30CompleteSequence;
import org.usfirst.frc1583.CommandRobot.sequences.Climb30Sequence1;
import org.usfirst.frc1583.CommandRobot.steps.Climb20Step1a;
import org.usfirst.frc1583.CommandRobot.subsystems.*;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot
{
    Command autonomousCommand;
    Command teleopCommand;
    SendableChooser autoChooser;
    public static OI oi;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static ArmSubsystem armSubsystem;
    public static BodyPIDSubsystem bodyPIDSubsystem;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit()
    {
        RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        armSubsystem = new ArmSubsystem();
        bodyPIDSubsystem = new BodyPIDSubsystem();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
//        autonomousCommand = new AutonomousCommand();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autoChooser = new SendableChooser();
        autoChooser.addDefault( "30 Point Climb", new Climb30Sequence1() );
        autoChooser.addObject( "20 Point Climb", new Climb20Step1a() );
        SmartDashboard.putData( "Climb Chooser", autoChooser );
    }
    public void autonomousInit()
    {
        autonomousCommand = (Command)autoChooser.getSelected();
        // schedule the autonomous command (example)
        if ( autonomousCommand != null )
        {
            autonomousCommand.start();
        }
    }
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic()
    {
        Scheduler.getInstance().run();
    }
    public void teleopInit()
    {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if ( autonomousCommand != null )
        {
            autonomousCommand.cancel();
        }

//        if ( autonomousCommand instanceof Climb30Sequence1 )
//        {
//            teleopCommand = new Climb30CompleteSequence();
//            teleopCommand.start();
//        }
//        else if ( autonomousCommand instanceof Climb20Step1a )
//        {
//            teleopCommand = new Climb20CompleteSequence();
//            teleopCommand.start();
//        }
    }
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic()
    {
        Scheduler.getInstance().run();
    }
    /**
     * This function called periodically during test mode
     */
    public void testPeriodic()
    {
        LiveWindow.run();
    }
}
