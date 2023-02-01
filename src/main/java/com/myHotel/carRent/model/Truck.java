package com.myHotel.carRent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "truck")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Truck extends Vehicle {
    private String type;
    private Integer tonnageCapacity;
    private Integer numberOfAxles;
}

