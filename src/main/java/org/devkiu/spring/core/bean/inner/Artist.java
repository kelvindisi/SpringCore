package org.devkiu.spring.core.bean.inner;

public class Artist {
    private String fullName;
    private Instrument instrument;

    public Artist(String fullName, Instrument instrument) {
        this.fullName = fullName;
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "fullName='" + fullName + '\'' +
                ", instrument=" + instrument +
                '}';
    }
}
