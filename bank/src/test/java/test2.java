import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TreeMap;
import java.util.TreeSet;

public class test2 {
    public static void main(String[] args) {
//        System.out.println(Math.round(8.5));
//        System.out.println(Math.round(8.4));
//        System.out.println(Math.round(8.6));
//        System.out.println(Math.round(-8.5)); //-8
//        System.out.println(Math.round(-8.4)); //-7.9
//        System.out.println(Math.round(-8.6)); //-8.1
//        System.out.println(Math.round(9.5)); //-8.1
//
//        char g='a';
//        System.out.println(g);
//
//        int i1=1;
//        String s1="11";
//        System.out.println(String.valueOf(i1));
//        System.out.println(Integer.parseInt(s1));
//        Calendar a = Calendar.getInstance();
//        System.out.println(a.get(1));
//        System.out.println(a.getActualMinimum(Calendar.DAY_OF_MONTH));
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd");
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate.format(dateTimeFormatter));
        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("aa",1);
        map.put("abab",2);
        map.put("acac",3);
        map.put("acac",3);
        System.out.println(map);
        TreeSet<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("C");

        System.out.println(set);
    }
}
