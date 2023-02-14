/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

public class UserAlreadyExists extends RuntimeException {

    public UserAlreadyExists() {
        super("User already exists");
    }
    
    
}
