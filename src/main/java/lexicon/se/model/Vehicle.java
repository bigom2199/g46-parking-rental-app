package lexicon.se.model;

public class Vehicle {
        // Fields
    private final String licensePlate;
      private final VehicleType type;


    // Constructors
    public Vehicle( String licensePlate, VehicleType type) {
        this.licensePlate= licensePlate;
        this.type= type;

    }

   // Getters
    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType(){
        return type;
    }

    // Methods
    public String VehicleInfo() {
        return "Vehicle:licensePlate:" +licensePlate + "Type:" + type;
    }
  // ToString
    @Override
    public String toString() {
        return "Vehicle{" +
                "LicensePlate=" + licensePlate + '\'' +
                ",type=" + type +
                '}' ;
    }
}
