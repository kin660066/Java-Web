public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        singleton.show();
        singleton2.show();
        Singleton2 singleton3=Singleton2.getInstance();
        Singleton2 singleton4=Singleton2.getInstance();
        singleton3.show();
        singleton4.show();
        System.out.println(singleton3);
        System.out.println(singleton4);
        Singleton3 singleton5=Singleton3.getInstance();
        Singleton3 singleton6=Singleton3.getInstance();
        singleton5.show();
        singleton6.show();
    }
}
