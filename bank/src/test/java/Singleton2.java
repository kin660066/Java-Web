public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() { }

    public static Singleton2 getInstance() {
        System.out.println("创建一个饿汉模式Instance");
        return instance;
    }
    void show(){
        System.out.println("Singleton2");
    }
}
