package medo05;

import java.util.ArrayList;
import java.util.Collections;


/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(4);
        list01.add(3);
        System.out.println(list01);//[1, 4, 3]

        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        Collections.sort(list01);//默认是升序
        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("f");
        list02.add("h");
        list02.add("g");
        System.out.println(list02);//[f, h, g]
       Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("凌达",19));
        list03.add(new Person("大卫",20));
        list03.add(new Person("哈维",15));
        System.out.println(list03);//[Person{name='凌达', age=19}, Person{name='大卫', age=20}, Person{name='哈维', age=15}]

        Collections.sort(list03);
        System.out.println(list03);
    }
}
