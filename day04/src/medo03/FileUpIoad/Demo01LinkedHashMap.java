package medo03.FileUpIoad;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> entends HashMap<K,V>
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("e","e");
        map.put("d","d");
        map.put("a","f");
        System.out.println(map);//key不允许重复，无序{a=f, d=d, e=e}

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("e","e");
        linked.put("d","d");
        linked.put("a","f");
        System.out.println(linked);//key不允许重复，有序{a=f, e=e, d=d}
    }
}
