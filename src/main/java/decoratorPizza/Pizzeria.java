package decoratorPizza;

public class Pizzeria {


    public static void main(String[] args) {

        Pizza pizzaMozzarella = new Mozarella(new Pomidor(new BasicPizza()));
        Pizza pizzaPepperoni = new Pepperoni(new Sausage(new BasicPizza()));
        System.out.printf("Pizza Mozzarella ingredients: %s%n", pizzaMozzarella.getIngredients());
        System.out.printf("Pizza Mozzarella price: %.3f%n", pizzaMozzarella.getPrice());

        System.out.println();

        System.out.printf("Pizza Pepperoni Ingredients: %s%n", pizzaPepperoni.getIngredients());
        System.out.printf("Pizza Mozzarella price: %.3f%n", pizzaPepperoni.getPrice());

    }
}
