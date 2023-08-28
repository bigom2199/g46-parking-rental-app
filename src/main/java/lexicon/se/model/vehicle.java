package lexicon.se.model;

public class vehicle {
    // Fields
    private    String LicensePlate;
    private    vehicleType type;
  // Constructors
    public Vehicle(String licensePlate, vehicleType type) {
        this.LicensePlate = licensePlate;
        this.type = type;
    }
      // Getters
    public String getLicensePlate() {
        return LicensePlate;
    }

    public vehicleType getType() {
        return type;
    }
     // Methods
    public String VehicleInfo() {
        return "Vehicle: licensePlate:" + LicensePlate + "Type:" + type;
    }
    // ToString
    @Override
    public String toString() {
        return "Vehicle{" +
                "LicensePlate = " + LicensePlate +  '\'' +
                ",type " + type +
                '}' ;
    }
}









