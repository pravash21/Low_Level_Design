/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import Exceptions.AlreadyRideExists;
import Model.Ride;

public class RideManager {
   // private Map<String,List<Ride>> activeRides;
    private Map<UUID,Ride> activeRides;

    public RideManager() {
        this.activeRides=new HashMap<>();
    }

    public Map<UUID,Ride> getActiveRides() {
        return activeRides;
    }
    
    public void addOfferRide(Ride ride, String userName)
    {
        for(Ride r: activeRides.values())
        {
            if(r.getVehicleNumber().equals(ride.getVehicleNumber()))
                throw new AlreadyRideExists();
        }
        activeRides.put(ride.getId(), ride);
    }
    
    public Ride endRide(String vehicleNumber)
    {
        for(Ride r: activeRides.values())
        {
            if(r.getVehicleNumber().equals(vehicleNumber))
                return r;
        }
        return null;
    }
        
    
    
}
