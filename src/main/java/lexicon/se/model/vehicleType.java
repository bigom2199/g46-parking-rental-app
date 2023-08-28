package lexicon.se.model;

public enum vehicleType {
    Car (1),
    MOTORCYCLE (2),
    TRUCK (3),
    VAN (4),
    ELECTRIC (5),
    OTHER (6) ;
    private final int code;
    vehicleType(int code) {
        this.code = code;
    }
      public int getCode() {
        return this.code;
      }
}
