public class Singleton3 {
    private Singleton3(){}
    private static Singleton3 instance=null;
    public static Singleton3 getInstance(){
        if (instance==null){
            synchronized (Singleton3.class){
                if (instance==null){
                    instance=new Singleton3();
                    System.out.println("创建一个双重锁模式");
                }
            }
        }
        return instance;
    }
    void show(){
        System.out.println("Singleton3");
    }
}
