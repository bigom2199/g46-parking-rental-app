package lexicon.se.model;

public class ParkingSpot {
        // Fields
    private int spotNumber;
      private boolean isOccupled;
    private int id;

    // Constructors
    public ParkingSpot(int spotNumber) {
        this.spotNumber= spotNumber;
        this.isOccupled = false;


    }
 public ParkingSpot(int spotNumber,boolean isOccupled) {
        this.spotNumber = spotNumber;
        this.isOccupled = isOccupled;
 }
   public int Occupy() {
        isOccupled = true;
   }

    // Setters & Getters
public void vacate(){
        isOccupled= false;
}

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", isOccupled=" + isOccupled +
                ", id=" + id +
                '}';
    }


// Methods

}
