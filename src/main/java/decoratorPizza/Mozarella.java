package decoratorPizza;

class Mozarella extends PizzaDecorator {
    public Mozarella(Pizza pizza) {
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
