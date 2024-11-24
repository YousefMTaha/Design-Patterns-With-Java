package Prototype;

import java.util.HashMap;

public class Registry implements Cloneable {
    private HashMap<String, Device> devices = null;

    public Registry() {
        devices = new HashMap<String, Device>();
        init();
    }

    void init() {
        devices.put("Laptop", new Laptop());
        devices.put("Tablet", new Tablet());
    }

    public Device getClone(String name) {
        Object clone = null;
        try {
            clone = devices.get(name).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return (Device) clone;
    }

}
