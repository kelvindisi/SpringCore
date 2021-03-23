package org.devkiu.spring.core.bean.dependson;

public class Flight {
    private String flightName;

    public Flight(String flightName) {
        this.flightName = flightName;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightName='" + flightName + '\'' +
                '}';
    }
}
