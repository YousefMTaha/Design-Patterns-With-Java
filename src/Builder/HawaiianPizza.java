package Builder;

public class HawaiianPizza extends Builder {
    @Override
    public void setDough() {
        pizza.setDough("Cross");
    }

    @Override
    public void setSauce() {
        pizza.setSauce("Mild");
    }

    @Override
    public void setTopping() {
        pizza.setTopping("Meat and pineapple");
    }
}
