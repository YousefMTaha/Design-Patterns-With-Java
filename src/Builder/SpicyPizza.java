package Builder;

public class SpicyPizza extends Builder {
    @Override
    public void setDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void setSauce() {
        pizza.setSauce("Hot");
    }

    @Override
    public void setTopping() {
        pizza.setTopping("Pepperoni and salami");
    }

}
