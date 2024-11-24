package Builder;

public class PizzaBuilder {
    Builder b;

    public PizzaBuilder(Builder b) {
        this.b = b;
    }

    public Pizza getPizza() {
        b.setDough();
        b.setSauce();
        b.setTopping();
        return b.getPizza();
    }
}
