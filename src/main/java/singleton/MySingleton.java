package singleton;

public class MySingleton {
    // приватный конструктор, поэтому невозможно создать другой экземпляр
    private MySingleton() {
        System.out.println("Singleton created!");
    }
    // Можем обращаться из любого класса (PUBLIC)
    public static final MySingleton INSTANCE = new MySingleton();

    public void printName() {
        System.out.println("I am a Singleton!");
    }
    // Test2

}
