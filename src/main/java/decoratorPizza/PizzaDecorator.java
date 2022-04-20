package decoratorPizza;

class PizzaDecorator implements Pizza{

    private Pizza pizza;

    // constructor
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}
