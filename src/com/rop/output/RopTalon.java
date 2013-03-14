/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rop.output;

import edu.wpi.first.wpilibj.Talon;

/**
 *
 * @author robotics
 */
public class RopTalon extends Talon
{
    private boolean reversed = false;

    public RopTalon(int slot, int channel, boolean reversed)
    {
        super(slot, channel);
        this.reversed = reversed;
    }

    public void set( double speed )
    {
        if (!reversed)
            super.set( speed );
        else
            super.set( -speed );
    }
    

}
