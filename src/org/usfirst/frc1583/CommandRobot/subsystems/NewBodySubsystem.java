/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc1583.CommandRobot.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc1583.CommandRobot.RobotMap;

/**
 *
 * @author robotics
 */
public class NewBodySubsystem extends Subsystem
{
    public final double CG_FULL_BACK;
    public final double CG_HALF_BACK;
    public final double CG_CENTER;
    public final double CG_HALF_FORWARD;
    public final double CG_FULL_FORWARD;

    private Preferences prefs;

    private SpeedController motor = RobotMap.bodyPIDSubsystemMotor;
    private AnalogChannel pot = RobotMap.bodyPIDSubsystemPot;

    private double setPoint = 0.0;
    private double servoCenter = 0.05;

    private double MOVE_SPEED = 0.02;

    public NewBodySubsystem()
    {
        super();
        prefs = Preferences.getInstance();
        CG_FULL_BACK     = prefs.getDouble( "CgFullBack", 0.80);
        CG_FULL_FORWARD  = prefs.getDouble( "CgFullForward", 3.75);
        // Derive others from maxes
        double diff = CG_FULL_FORWARD - CG_FULL_BACK;
        CG_HALF_BACK     = CG_FULL_FORWARD - (diff * 0.75);
        CG_CENTER        = CG_FULL_FORWARD - (diff * 0.5);
        CG_HALF_FORWARD  = CG_FULL_FORWARD - (diff * 0.25);

        servoCenter = prefs.getDouble( "ServoCenter", 0.03);
        MOVE_SPEED = prefs.getDouble( "CGShiftSpeed", 0.02);
    }

    protected void initDefaultCommand()
    {
    }

    public void setSetpoint( double setPoint )
    {
        this.setPoint = setPoint;
    }

    public double getSetpoint()
    {
        return setPoint;
    }

    public boolean onTarget()
    {
        System.out.println("In onTarget, setPoint: " + setPoint + "  pot: " + pot.getVoltage());
        
        if (Math.abs( setPoint - pot.getVoltage()) < 0.1)
            return true;
        else
            return false;
    }

    public void set( double speed )
    {
        if ( speed > 0.0 )
            motor.set( servoCenter + MOVE_SPEED );
        else
            motor.set( servoCenter - MOVE_SPEED );
    }

    public double getPot()
    {
        return pot.getVoltage();
    }

    public void stop()
    {
        motor.set( servoCenter );
    }
}
