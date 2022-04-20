package decoratorPizza;

class Sausage extends PizzaDecorator{
    public Sausage(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sausage";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.9;
    }
}
