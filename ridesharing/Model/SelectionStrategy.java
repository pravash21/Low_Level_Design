/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.RideManager;

public interface SelectionStrategy {
    public Ride findRides(String origin, String destination, int seats, RideManager rideManager, String vehicleNumber);
}
