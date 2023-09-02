package lexicon.se.model;


import java.time.LocalTime;

public class ReservationTest {
    private Reservation testObject;
 public void testConstructorNithoutId() {
     Customer customer = new Customer("test Testson " ,"1234564");
     ParkingSpot parkingSpot= new ParkingSpot(1) ;
     VehicleType vehicle = new vehicle("abc 123",VehicleType.CAR) ;
     testObject = new Reservation(LocalTime.parse("10:00"),LocalTime.parse("12:00"),customer,ParkingSpot,vehicle);

     assertNull(testObject.getId());
     assertEquals("Test Testson" ,customer.getName()) ;

 }
    }




