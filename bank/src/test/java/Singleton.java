
public class Singleton {
private Singleton(){}
private static Singleton instance= null;
public static final Singleton getInstance(){
    if (instance==null){
        instance=new Singleton();
        System.out.println("创建一个懒汉模式Instance");
    }
    return instance;
}
void show(){
    System.out.println("Singleton");
}


}
