package decopizza;

public class Pepperoni extends PizzaDecorator{

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
