public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("create Singleton object");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
