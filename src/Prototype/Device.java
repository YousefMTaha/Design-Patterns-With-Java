package Prototype;

abstract public class Device implements Cloneable {
    protected String manufacturer;
    protected String screenSize;
    protected String RAM;
    protected double price;

    public Device() {
    }

    public Device(String manufacturer, String screenSize, String RAM, double price) {
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.RAM = RAM;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract public void display();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
