package lexicon.se.model;

import java.time.LocalTime;

public class Reservation {
    // Fields
    private String id;
    private LocalTime StartTime;
    private LocalTime endTime;
    private Customer customer;
    private ParkingSpot parkingSpot;
    private Vehicle associatedVehicle;
    // Constructors


    public  Reservation(LocalTime startTime, LocalTime endTime, ParkingSpot parkingSpot) {
        StartTime = startTime;
        this.endTime = endTime;

        this.parkingSpot = parkingSpot;
    }

    public Reservation(String id, LocalTime startTime, LocalTime endTime, Customer customer, ParkingSpot parkingSpot, Vehicle associatedVehicle) {
        this.id = id;
        StartTime = startTime;
        this.endTime = endTime;
        this.customer = customer;
        this.associatedVehicle= associatedVehicle;
        this.parkingSpot= parkingSpot;
    }

    public Reservation(LocalTime startTime, LocalTime endTime, Customer customer, ParkingSpot parkingSpot, Vehicle associatedVehicle) {
        StartTime = startTime;
        this.endTime = endTime;
        this.customer = customer;
        this.parkingSpot = parkingSpot;
        this.associatedVehicle = associatedVehicle;
    }
    public Customer getCustomer(){
         return customer;
    }
    public ParkingSpot getParkingSpot(){
        return parkingSpot;
    }
    public Vehicle getAssociatedVehicle() {
        return associatedVehicle;
    }
    // ToString


    @Override
    public String toString() {
        return "Reservation{" +
                "id='" + id + '\'' +
                ", StartTime=" + StartTime +
                ", endTime=" + endTime +
                ", customer=" + customer +
                ", parkingSpot=" + parkingSpot +
                ", associatedVehicle=" + associatedVehicle +
                '}';
    }
}











    // Methods


