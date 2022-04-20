package decoratorPizza;

public class Pomidor extends PizzaDecorator {
    public Pomidor(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Pomidor";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
