/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airportsimulator;

/**
 *
 * @author Administrator
 */
public class Airplane {
    private String status;
    // I'm using a string because despite the name, it a flight number also contains letters
    private String flightNum;
    private String destination;
    private String origin;
    private int runway;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getRunway() {
        return runway;
    }

    public void setRunway(int runway) {
        this.runway = runway;
    }
    
    
    
}
