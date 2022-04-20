package decopizza;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizzaPepperoni = new Pepperoni(new Sausage(new BasicPizza()));

        System.out.printf("Pizza Pepperoni ingredients: %s%n", pizzaPepperoni.getIngredients());
        System.out.printf("Pizza Pepperoni Price: %.2f%n", pizzaPepperoni.getPrice());

    }
}
