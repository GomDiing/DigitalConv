package 싱글톤연습;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();
    private Singleton() {
        name = "test";
        id = 100;
    }
    static Singleton getSingleton() {
        return singleton;
    }
}
