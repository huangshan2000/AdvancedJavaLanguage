package medo04;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    JDK9的新特性:
        List接口,Set接口,Map接口:里边增加了一个静态的方法of,可以给集合一次性添加多个元素
        static <E> List<E> of​(E... elements)
        使用前提:
            当集合中存储的元素的个数已经确定了,不在改变时使用
     注意:
        1.of方法只适用于List接口,Set接口,Map接口,不适用于接接口的实现类
        2.of方法的返回值是一个不能改变的集合,集合不能再使用add,put方法添加元素,会抛出异常
        3.Set接口和Map接口在调用of方法的时候,不能有重复的元素,否则会抛出异常
 */
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("e","f","e","g","h");
        System.out.println(list);//[e, f, e, g, h]
        //list.add("l");//UnsupportedOperationException:不支持操作异常

        //Set<String> set = Set.of("e","f","e","g","h");//IllegalArgumentException:非法参数异常,有重复的元素
        Set<String> set  = Set.of("e","f","g","h");//[g, f, e, h]
        System.out.println(set);
        //set.add("l");//UnsupportedOperationException:不支持操作异常

       // Map<String,Integer> map = Map.of("张三", 17, "李四", 20, "王五", 21,"张三",18);//IllegalArgumentException:非法参数异常,有重复的元素
        Map<String,Integer> map = Map.of("张三", 17, "李四", 20, "王五", 21);
        System.out.println(map);//{李四=20, 王五=21, 张三=17}
        //map.put("赵四",45);;//UnsupportedOperationException:不支持操作异常
    }
}
