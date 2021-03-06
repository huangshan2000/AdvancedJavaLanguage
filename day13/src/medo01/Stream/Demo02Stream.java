package medo01.Stream;

import java.util.ArrayList;
import java.util.List;

/*
    使用Stream流的方式,遍历集合,对集合中的数据进行过滤
    Stream流是JDK1.8之后出现的
    关注的是做什么,而不是怎么做
 */
public class Demo02Stream {
    public static void main(String[] args) {
        //创建一个List集合，存储姓名
        List<String> list = new ArrayList<>();
        list.add("宋丹丹");
        list.add("宋小宝");
        list.add("贾玲");
        list.add("宋茜");
        list.add("宋江");

        //对list集合中的元素进行过滤，只要以宋开头的元素，存储到一个新的集合中
        //对list A集合进行过滤，只要姓名长度为3的人，存储到一个新的集合中
        //遍历listB集合
        list.stream()
                .filter(name->name.startsWith("宋"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
