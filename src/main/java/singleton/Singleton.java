package singleton;

public class Singleton {
    // приватный конструктор
    private Singleton () {}
    // создает объект внутри класса
    public static final Singleton INSTANCE = new Singleton();
}
