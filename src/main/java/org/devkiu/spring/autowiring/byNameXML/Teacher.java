package org.devkiu.spring.autowiring.byNameXML;

public class Teacher {
    private String fullName;
    private Address address;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(Address address) {
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
