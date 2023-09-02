package lexicon.se.model;



import java.beans.Transient;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

public class ParkingLotTest {
     private ParkingLot testObject;

     public void setup() {
         Map<Integer,ParkingSpot> parkingSpotMap = new HashMap<>() ;
         parkingSpotMap.put(1,new ParkingSpot(1,true));
         parkingSpotMap.put(2,new ParkingSpot(2,false)) ;
         parkingSpotMap.put(3,new ParkingSpot(3, true)) ;
         testObject= new ParkingLot(123,parkingSpotMap) ;
     }
     public void testGetAreaCode() {
         int expectedAreCode = 123;
         assertequals(expectedAreCode,testObject.getAreCode()) ;

     }
      @Transient
   public void testGetParkingSpotsSize3() {
         int expected = 3;
         int actual = testObject.getParkingSpot().size();
         assertEquals(expected,actual) ;
   }
     public void testGetAvailableParkingSpots(){
         int expected = 1;
         int actual= testObject.getAvailableParkingSpots().size();
         assertEquals(expected,actual) ;

     }
        @Transient
          public void testGetParkingSpotInvalidId() {
         ParkingSpot parkingSpot = testObject.getParkingSpotNumber(5) ;
         assertNull(ParkingSpot) ;

          }

}
