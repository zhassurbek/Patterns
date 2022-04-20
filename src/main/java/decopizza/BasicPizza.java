package decopizza;

public class BasicPizza implements Pizza{

    @Override
    public String getIngredients() {
        return ("Cheese");
    }

    @Override
    public double getPrice() {
        return 2;
    }
}
