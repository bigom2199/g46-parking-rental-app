package lexicon.se.data;

import lexicon.se.model.VehicleType;

import java.util.Collection;

public interface VehicleDao {
    Vehicle create(Vehicle data);



    VehicleType find (String licensePlate) ;
    boolean remove(String licensePlate);
    Collection<Vehicle> findAll() ;
}
