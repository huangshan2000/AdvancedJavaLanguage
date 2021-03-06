package reflect;

import domain.Person;
import domain.Student;

import java.io.IOException;

public class ReflectDemo01 {


    /**
     * 获取Class对象的方式：
     *    1.Class.forName("全类名")：将字节文件加载进内存，返回Class对象
     *    2.类名.class:通过类名的属性class获取
     *    3.对象.getClass():getClass()方法在Object类中定义着
     *
     */
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class cls1 = Class.forName("day14_Junit_Reflection_Annotation\\damain.Person");
        System.out.println(cls1);
        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //== 比较三个对象
        System.out.println(cls1 == cls2);//True
        System.out.println(cls1 == cls3);//True

        Class c = Student.class;
        System.out.println(c == cls1);


    }
}
