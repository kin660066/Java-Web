public class reverseTest1 {
    public static void main(String[] args) {
        reverseTest1 r1 = new reverseTest1();
        System.out.println(r1.a("abcde"));
    }
    public String a(String aa){
        StringBuffer b = new StringBuffer(aa);
        return b.reverse().toString();
    }
}
