package org.devkiu.spring.core.bean.dependson;

public class Passenger {
    private String fullName;
    private Flight flight;

    public Passenger(String fullName, Flight flight) {
        this.fullName = fullName;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "fullName='" + fullName + '\'' +
                ", flight=" + flight +
                '}';
    }
}
