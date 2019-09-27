import java.math.BigDecimal;
import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.2");
        BigDecimal b = new BigDecimal("0.3");
        float c=0.2f;
        float d=0.3f;
        System.out.println(c-d);
        System.out.println(a.subtract(b));
    }
}
