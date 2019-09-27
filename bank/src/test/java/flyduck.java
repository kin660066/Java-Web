public class flyduck extends duck {
    public flyduck() {
         fly = new badfly();
        speak=new konwspeak();
    }

    @Override
    public void display() {
        System.out.println("flyduck");
    }
}
