package Decorator;

abstract public class DrawDecorator implements Shape {
    protected Shape s;

    public DrawDecorator(Shape s) {
        this.s = s;
    }

    @Override
    public void draw() {
        s.draw();
    }

    abstract public void drawWithRed();
}
