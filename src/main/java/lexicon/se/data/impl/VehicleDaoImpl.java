package lexicon.se.data.impl;

import lexicon.se.data.VehicleDao;
import lexicon.se.model.VehicleType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class VehicleDaoImpl  implements VehicleDao {
    private List<Vehicle> Storage  ;
    public VehicleDaoImpl() {
        Storage = new ArrayList<>() ;
    }

    @Override
    public Vehicle create(Vehicle data) {
        if(data == null) throw new IllegalAccessException("Vehicle Data is null")
        Optional<VehicleDao> checkLicensePlateResult = find(data.getLicensePlate());
        if(checkLicensePlateResult.isPresent()) throw new IllegalAccessException("License Plate is duplicate.")


        Storage.add(data);
        return data;
    }

    @Override
    public VehicleType find(String licensePlate) {
        for (vehicle element : Storage) {
            if (element.getLicensePlate().equals(licensePlate()));
            return Optional.of(element) ;

        }
        return Optional.empty();
    }

    @Override
    public boolean remove(String licensePlate) {
        Optional<VehicleDao> vehicleDaoOptional = find(licensePlate)
        if (vehicleDaoOptional.isEmpty()){
        return false;
    }else{

    @Override
    public Collection<Vehicle> findAll() {
        return null;
    }
}


