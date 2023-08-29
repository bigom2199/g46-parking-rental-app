package lexicon.se.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingLot {
        // Fields
    private int areCode;
      private Map<Integer,ParkingSpot> parkingSpotMap;
    private int id;

    // Constructors


    public ParkingLot(int areCode, Map<Integer, ParkingSpot> parkingSpotMap) {
        this.areCode = areCode;
        this.parkingSpotMap = parkingSpotMap;

    }
 // Getters

    public int getAreCode() {
        return areCode;
    }

    public List< ParkingSpot> getParkingSpot() {
        return new ArrayList<>(parkingSpotMap.values()) ;

    }
    public List<ParkingSpot> getAvailableParkingSpots(){
        List<ParkingSpot> aveilableSpot = new ArrayList<>() ;
          for(ParkingSpot parkingSpot: parkingSpotMap.values()){
              if (!parkingSpot.isOccupied()){
                aveilableSpot.add(ParkingSpot);
              }
          }
          return aveilableSpot;
    }
    public ParkingSpot getParkingSpotNumber(int spotNumber){
        parkingSpotMap.get(spotNumber) ;
    }
    public void displayParkingSpots(){
        System.out.println("-------------");
        int counter = 0 ;
        for (ParkingSpot spot:parkingSpotMap.values()) {
            if (counter % 3 == 0 ){
            System.out.println("+ spot.getSpotNumber   "  + (spot.isOccupied() ? "x" : "\u2713") );
            System.out.println("--------");
        }
    }
}


    // Setters & Getters


