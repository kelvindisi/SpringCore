package org.devkiu.spring.core.annotationconfig;

public class Student {
    private String regNo;
    private String firstName;
    private String lastName;

    public Student(String regNo, String firstName, String lastName) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo='" + regNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
