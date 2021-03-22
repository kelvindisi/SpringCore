package org.devkiu.spring.core.bean.separation;

public class Specialization {
    private String specialty;
    private float salary;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "specialty='" + specialty + '\'' +
                ", salary=" + salary +
                '}';
    }
}
