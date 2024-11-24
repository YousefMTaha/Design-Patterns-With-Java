package Prototype;

public class Laptop extends Device implements Cloneable {
    private String keyboardType;

    public Laptop() {}

    public Laptop(String manufacturer, String screenSize, String RAM, double price, String keyboardType) {
        super(manufacturer, screenSize, RAM, price);
        this.keyboardType = keyboardType;
    }

    @Override
    public void display() {
        System.out.println("Displaying Laptop");
        System.out.println("Keyboard type" + this.keyboardType);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
