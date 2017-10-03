package me.rishabhkhanna.tests;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by rishabhkhanna on 02/10/17.
 */

public class MainActivityTest {

    @Test
    public void calcFareWorks(){
        assertEquals(50, KotlinActivity.calcFare(0,0),0.001);
    }
    @Test
    public void calFareWorks(){
        assertEquals(50,MainActivity.calFare(0,0),0.001);
    }

}
