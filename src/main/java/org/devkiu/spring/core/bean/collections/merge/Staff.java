package org.devkiu.spring.core.bean.collections.merge;

import java.util.Map;

public class Staff {
    private Map<String, String> addresses;

    public Map<String, String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, String> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "addresses=" + addresses +
                '}';
    }
}
