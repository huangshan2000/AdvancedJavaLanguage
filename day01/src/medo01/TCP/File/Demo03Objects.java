package medo01.TCP.File;

import java.io.PushbackInputStream;
import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 ="abc";
        //String s1 = null;
        String s2 = "abc";
      //  boolean b = s1.equals(s2); //NullPointerException null 是不能调用方法的，会抛出空指针异常
       // System.out.println(b);
        /*
        Objects类的equals方法：对连个现象进行比较，防止空指针异常
        public static boolean equals(Object a,Object b) {
            return (a == b) ||(a! =null && a.equals(b));
        }
        */
        boolean b2 = Objects.equals(s1, s1);
        System.out.println(b2);

    }
}