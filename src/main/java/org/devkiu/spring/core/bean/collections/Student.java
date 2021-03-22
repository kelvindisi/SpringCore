package org.devkiu.spring.core.bean.collections;

import java.util.List;

public class Student {
    private String fullName;
    private List<Unit> units;

    public Student(String fullName, List<Unit> units) {
        this.fullName = fullName;
        this.units = units;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", units=" + units +
                '}';
    }
}
