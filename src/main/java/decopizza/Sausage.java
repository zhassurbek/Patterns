package decopizza;

public class Sausage extends PizzaDecorator{

    public Sausage(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sausage";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.0;
    }
}
