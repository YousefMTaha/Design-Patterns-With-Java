package Builder;

public class Pizza {
    private String Dough;
    private String Topping;
    private String Sauce;

    public void setDough(String dough) {
        Dough = dough;
    }

    public void setTopping(String topping) {
        Topping = topping;
    }

    public void setSauce(String sauce) {
        Sauce = sauce;
    }

    public String toString() {
        return "Dough" + Dough + "Topping" + Topping + "Sauce" + Sauce;
    }
}
