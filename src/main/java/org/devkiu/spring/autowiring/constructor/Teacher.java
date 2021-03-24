package org.devkiu.spring.autowiring.constructor;

public class Teacher {
    private String fullName;
    private Address address;

    public Teacher(String fullName, Address address) {
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", address=" + address +
                '}';
    }
}
