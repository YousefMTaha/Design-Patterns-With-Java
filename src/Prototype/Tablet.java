package Prototype;

public class Tablet extends Device {

    public Tablet() {
    }

    public Tablet(String manufacturer, String screenSize, String RAM, double price) {
        super(manufacturer, screenSize, RAM, price);
    }

    @Override
    public void display() {
        System.out.println("Tablet");
        System.out.println(this.screenSize);
        System.out.println(this.price);
        System.out.println(this.RAM);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
