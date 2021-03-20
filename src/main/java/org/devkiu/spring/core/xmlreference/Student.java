package org.devkiu.spring.core.xmlreference;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private Department department;

    public Student(String studentId, String firstName, String lastName, Department department) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", " + department + '\'' +
                '}';
    }
}
