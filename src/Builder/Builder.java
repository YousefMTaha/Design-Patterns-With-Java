package Builder;

abstract public class Builder {
    protected Pizza pizza = new Pizza();

    abstract public void setDough();

    abstract public void setSauce();

    abstract public void setTopping();


    public Pizza getPizza() {
        return pizza;
    }
}
