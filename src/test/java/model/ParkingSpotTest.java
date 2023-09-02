package model;

import jdk.incubator.vector.VectorOperators;
import junit.framework.Test;
import lexicon.se.model.ParkingSpot;

public class ParkingSpotTest {
    private ParkingSpot testObject;

    public void setUp() {
        testObject = new ParkingSpot(1) ;

    }
        @Test
        void testGetSpotNumber() {
        int expectedNumber = 1;
        int actualNumber = testObject.getSpotNumber() ;
        assertEquals(expectedNumber,actualNumber) ;

    }
     public void testIsOccupyInitiallyFalse(){
        boolean expectedResult = false;
        boolean actualResult = testObject.isOccupied() ;
        assertEquals(expectedResult,actualResult) ;

     }
     public void testOccupy() {
        testObject.Occupy();
        assertFalse(testObject.isOccupied()) ;

     }
}
