package com.myHotel.carRent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car extends Vehicle {
    private String type;
    private Integer numberOfDoors;
    private Integer passengerCapacity;
    private Integer trunkCapacity;
}


