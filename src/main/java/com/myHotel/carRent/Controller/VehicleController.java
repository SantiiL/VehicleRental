package com.myHotel.carRent.Controller;

import com.myHotel.carRent.Service.VehicleService;
import com.myHotel.carRent.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle) {
        Vehicle createdVehicle = vehicleService.createVehicle(vehicle);
        return ResponseEntity.ok(createdVehicle);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> findVehicleById(@PathVariable Long id) {
        Optional<Vehicle> foundVehicle = vehicleService.findVehicleById(id);
        return foundVehicle.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> findAllVehicles() {
        List<Vehicle> vehicles = vehicleService.findAllVehicles();
        return ResponseEntity.ok(vehicles);
    }

    @PutMapping
    public ResponseEntity<Vehicle> updateVehicle(@RequestBody Vehicle vehicle) {
        Vehicle updatedVehicle = vehicleService.updateVehicle(vehicle);
        return ResponseEntity.ok(updatedVehicle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
        return ResponseEntity.ok().build();
    }
}
