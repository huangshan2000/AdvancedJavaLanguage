package medo02.Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_concat:用于把流组合到一起
    如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
    static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream1 = Stream.of("宋丹丹", "宋小宝", "贾玲", "宋茜", "宋江");
        //获取一个Stream流
        String[] arr = {"美羊羊","喜羊羊","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream2 = Stream.of(arr);
        //把以上两个流组合成一个流
        Stream<String> concat = Stream.concat(stream1, stream2);
        //遍历concat流
        concat.forEach(name-> System.out.println(name));
    }
}
