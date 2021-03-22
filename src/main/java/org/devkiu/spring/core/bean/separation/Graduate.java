package org.devkiu.spring.core.bean.separation;

public class Graduate {
    private String firstName;
    private String lastName;
    private Specialization specialization;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "graduate:{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", " + specialization +
                '}';
    }
}
