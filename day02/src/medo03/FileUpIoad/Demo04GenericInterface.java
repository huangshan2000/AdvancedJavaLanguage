package medo03.FileUpIoad;
/*
    测试含有泛型的接口
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("字符串");

       //创建GenericInterface2对象
         GenericInterfaceImpl2<Integer> gi2 =new GenericInterfaceImpl2<>();
         gi2.method(10);

         GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
         gi3.method(6.6);
    }
}