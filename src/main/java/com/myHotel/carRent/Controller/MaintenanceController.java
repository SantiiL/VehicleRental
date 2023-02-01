package com.myHotel.carRent.Controller;

import com.myHotel.carRent.Service.MaintenanceService;
import com.myHotel.carRent.Service.VehicleService;
import com.myHotel.carRent.model.Maintenance;
import com.myHotel.carRent.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/vehicles/{vehicleId}/maintenance")
public class MaintenanceController {

    @Autowired
    private MaintenanceService maintenanceService;

    @PostMapping
    public ResponseEntity<Maintenance> createMaintenance(@PathVariable Long vehicleId,
                                                         @RequestBody Maintenance maintenance) {
        maintenance.setId(vehicleId);
        Maintenance createdMaintenance = maintenanceService.createMaintenance(maintenance);
        return ResponseEntity.ok(createdMaintenance);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Maintenance> findMaintenanceById(@PathVariable Long id) {
        Optional<Maintenance> foundMaintenance = maintenanceService.findMaintenanceById(id);
        if (foundMaintenance.isPresent()) {
            return ResponseEntity.ok(foundMaintenance.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<Optional<Maintenance>> findAllMaintenanceByVehicleId(@PathVariable Long vehicleId) {
        Optional<Maintenance> maintenance = maintenanceService.findAllMaintenanceByVehicleId(vehicleId);
        return ResponseEntity.ok(maintenance);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Maintenance> updateMaintenance(@PathVariable Long id, @RequestBody Maintenance maintenance) {
        maintenance.setId(id);
        Maintenance updatedMaintenance = maintenanceService.updateMaintenance(maintenance);
        return ResponseEntity.ok(updatedMaintenance);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
        return ResponseEntity.ok().build();
    }
}
