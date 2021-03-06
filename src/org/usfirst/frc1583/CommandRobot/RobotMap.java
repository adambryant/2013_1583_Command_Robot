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
import com.rop.input.LimitSwitch;
import com.rop.output.RopTalon;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
    public static LimitSwitch armSubsystemTopLimit;
    public static LimitSwitch armSubsystemBottomLimit;
    public static LimitSwitch hangerLimit;
    //public static ContinuousRotationServo bodyPIDSubsystemMotor;
    //public static RopTalon bodyPIDSubsystemMotor;
    public static SpeedController bodyPIDSubsystemMotor;
    public static AnalogChannel bodyPIDSubsystemPot;

    public static SpeedController armSubsystemMotor;
    public static Counter armCountSubsystemCounter;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
//    public static RopTalon armSubsystemMotor;
//    public static Encoder armEncoderSubsystemEncoder;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init()
    {
        armSubsystemTopLimit = new LimitSwitch(1, 2, false);
	LiveWindow.addSensor("ArmSubsystem", "TopLimit", armSubsystemTopLimit);

        // ### MODEL ###
//        armSubsystemBottomLimit = new LimitSwitch(1, 1, true);
        // ### REAL ###
        armSubsystemBottomLimit = new LimitSwitch(1, 3, false);
	LiveWindow.addSensor("ArmSubsystem", "BottomLimit", armSubsystemBottomLimit);

        hangerLimit = new LimitSwitch(1, 4, false);
        LiveWindow.addSensor( "ArmSubsystem", "HangerLimit", hangerLimit);

        // ### MODEL ###
//        bodyPIDSubsystemMotor = new ContinuousRotationServo(1, 2);
//	LiveWindow.addActuator("Body PID Subsystem", "Motor", (ContinuousRotationServo) bodyPIDSubsystemMotor);
        // ### REAL ###
        bodyPIDSubsystemMotor = new RopTalon(1, 2, false);
	LiveWindow.addActuator("Body PID Subsystem", "Motor", (RopTalon) bodyPIDSubsystemMotor);

        armCountSubsystemCounter = new Counter(1, 1);
	LiveWindow.addSensor("armCountSubsystemCounter", "Counter", armCountSubsystemCounter);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // ### MODEL ###
//        armSubsystemMotor = new Victor(1, 1);
//	LiveWindow.addActuator("ArmSubsystem", "Motor", (Victor) armSubsystemMotor);
        // ### REAL ###
        armSubsystemMotor = new RopTalon(1, 1, true);
	LiveWindow.addActuator("ArmSubsystem", "Motor", (RopTalon) armSubsystemMotor);
        
        bodyPIDSubsystemPot = new AnalogChannel(1, 1);
	LiveWindow.addSensor("Body PID Subsystem", "Pot", bodyPIDSubsystemPot);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
