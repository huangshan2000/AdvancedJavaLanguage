package medo01.TCP.File;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
    java.util.Collection接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法


    共性的方法:
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      public void clear() :清空集合中所有的元素。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        //Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);

       // public boolean add(E e)：  把给定的对象添加到当前集合中 。
        coll.add("米奇");
        coll.add("牛仔");
        coll.add("朵拉");
        coll.add("阿狸");
        System.out.println(coll);//[牛仔, 朵拉, 米奇, 阿狸]

       //public void clear() :清空集合中所有的元素。
//        coll.clear();
//        System.out.println(coll); //[]

       // public boolean remove(E e): 把给定的对象在当前集合中删除。
        //注：coll.remove("朵拉");<==> boolean result = coll.remove("朵拉");效果相同，但第二种写法中多了一个判断是否操作成功的布尔值，便于判断。
//        boolean result = coll.remove("朵拉");
//        System.out.println(result);
//        System.out.println(coll);//[牛仔, 米奇, 阿狸]

        //public boolean contains(E e): 判断当前集合中是否包含给定的对象。
//        boolean result = coll.contains("米奇");
//        System.out.println(result);//true

        //public boolean isEmpty(): 判断当前集合是否为空。
//        boolean result = coll.isEmpty();
//        System.out.println(result);

        //public int size(): 返回集合中元素的个数。
//        int size = coll.size();
//        System.out.println(size); //4

        //public Object[] toArray(): 把集合中的元素，存储到数组中。
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
