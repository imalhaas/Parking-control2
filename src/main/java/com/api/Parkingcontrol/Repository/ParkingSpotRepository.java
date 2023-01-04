package com.api.Parkingcontrol.Repository;

import com.api.Parkingcontrol.Model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {


    boolean existsByLicensePlateCar(String LicensePlateCar);
    boolean existsByParkingSpotNumber(String ParkSpotNumber);
    boolean existsByApartmentAndBlock(String Apartament, String Block );
}
