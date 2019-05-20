/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

import parkinglot.Vehicle.Kind;

/**
 *
 * @author archimede
 */
public class Main {
    
    public static void main(String args []) throws InterruptedException {
    
        ParkingLot lumbi=new ParkingLot("Lumbi",50);
        Vehicle v1 = new Vehicle ("ABC1", Kind.CAR);
        Vehicle v2 = new Vehicle ("EFG2", Kind.TRUCK);
        lumbi.addVehicle(v1);
        //lumbi.addVehicle(v2);
        
        long start = System.currentTimeMillis();
        Thread.sleep(1500);
        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
        
        lumbi.exitVehicle("ABC1");
        //lumbi.exitVehicle("EFG2");
    
        System.out.println("Cash: " + lumbi.getCash());
    }
    
}
