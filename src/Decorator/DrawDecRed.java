package Decorator;

public class DrawDecRed extends DrawDecorator {
    public DrawDecRed(Shape s) {
        super(s);
    }

    @Override
    public void drawWithRed() {
        s.draw();
        System.out.println("add red shape");
    }
}
