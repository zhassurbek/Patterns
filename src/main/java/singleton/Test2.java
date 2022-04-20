package singleton;

public class Test2 {
    public static void main(String[] args) {
        MySingleton.INSTANCE.printName();
        // Получим класс синглтона
        System.out.println(MySingleton.INSTANCE.getClass());
        //
        System.out.println(MySingleton.INSTANCE.equals("MySingleton"));
    }
}
