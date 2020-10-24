package annotain;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Pro2(className = "annotion.Demo01",methodNmae = "show")
public class ReflectTest2 {
    public static void main(String[] args) throws Exception {
        Class cl = ReflectTest2.class;
        Pro2 pro2 =(Pro2)cl.getAnnotation(Pro2.class);
        String className = pro2.className();
        String methodNmae = pro2.methodNmae();
        System.out.println(className+"111111");
        System.out.println(methodNmae+"222222");

        Class demo01 =Class.forName(className);
        Method show = demo01.getMethod(methodNmae);
        Object o = demo01.newInstance();
        show.invoke(o);
    }
}
