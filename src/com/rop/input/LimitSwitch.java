/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rop.input;

import edu.wpi.first.wpilibj.DigitalInput;

/**
 *
 * @author adam
 */
public class LimitSwitch extends DigitalInput
{
    private boolean reversed = false;

    public LimitSwitch( int module, int channel, boolean reversed )
    {
        super(module,channel);
        this.reversed = reversed;
    }

    public boolean get()
    {
        if ( reversed )
        {
            return !super.get();
        }
        else
        {
            return super.get();
        }
    }
}
