package org.devkiu.spring.core.bean.collections;

public class Unit {
    private String unitCode;
    private String unitName;

    public Unit(String unitCode, String unitName) {
        this.unitCode = unitCode;
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "unitCode='" + unitCode + '\'' +
                ", unitName='" + unitName + '\'' +
                '}';
    }
}
