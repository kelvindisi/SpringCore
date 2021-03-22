package org.devkiu.spring.core.bean.inner;

public class Instrument
{
    private String instrumentName;

    public Instrument(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentName='" + instrumentName + '\'' +
                '}';
    }
}
