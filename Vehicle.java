/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

/**
 *
 * @author archimede
 */
public class Vehicle {
    enum Kind {
    SCOOTER,
    CAR,
    TRUCK
}
    private String plate;
    private Kind kind;
    

    public Vehicle(String plate, Kind kind) {
        this.plate = plate;
        this.kind = kind;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }
    
    
    public double getSpaceForVehicle () {
        if (this.kind == Kind.CAR) return 1; 
        else if (this.kind == Kind.SCOOTER) return 0.5; 
        else return 3;
        
        
        //return this.kind == Kind.CAR ? 1 : this.kind == Kind.SCOOTER ? 0.5 : 3;
    }
    
}
