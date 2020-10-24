package medo02;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {

        demo03();
    }

         /*
           long getTime() 把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
             返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time); //1596940639073
    }

    /*
        Date类的带参数构造方法
        Date(long date) :传递毫秒值,把毫秒值转换为Date日期
     */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970
    }


    /*
    Date类的空参数构造方法
    Date()获取当前系统的日期和时间
    * */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date); //Sun Aug 09 01:03:27 CST 2020
    }
}