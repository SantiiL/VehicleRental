package com.myHotel.carRent.Service;

import com.myHotel.carRent.Repository.MaintenanceRepository;
import com.myHotel.carRent.model.Maintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    public Maintenance createMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    public Optional<Maintenance> findMaintenanceById(Long id) {
        return maintenanceRepository.findById(id);
    }

    public Optional<Maintenance> findAllMaintenanceByVehicleId(Long vehicleId) {
        return maintenanceRepository.findById(vehicleId);
    }

    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    public void deleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }
}
