package me.rishabhkhanna.tests;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by rishabhkhanna on 02/10/17.
 */

import static me.rishabhkhanna.tests.MainActivityTest.*;
import static me.rishabhkhanna.tests.kotlinActivity.*;

public class MainActivityTest {

    @Test
    public void calcFareWorks(){
        assertEquals(50,kotlinActivity.calcFare(0,0),0.001);
    }
    @Test
    public void calFareWorks(){
        assertEquals(50,MainActivity.calFare(0,0),0.001);
    }

}
