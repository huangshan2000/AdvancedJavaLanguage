package medo01.TCP.File;

import java.io.File;

/*
    File类获取功能的方法
        - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        - public String getPath() ：将此File转换为路径名字符串。
        - public String getName()  ：返回由此File表示的文件或目录的名称。
        - public long length()  ：返回由此File表示的文件的长度。
 */
public class Demo03File {
    public static void main(String[] args) {
        show04();
    }

    /*
    public long length():返沪一由此File表示的文件的长度。
    获取的是构造方法指定的文件的大小，以字节为单位
    注意：
       文件夹是没有大小概念阿德，不能获取文件夹的大小
       如果构造方法中给出的路径不存在，那么length方法返回0
     */
    private static void show04() {
        File f1 = new File("E:\\empty\\AdvancedJavaLanguage\\day08\\src");
        long l1 = f1.length();
        System.out.println(l1);//4096

        File f2 = new File("E:\\empty\\AdvancedJavaLanguage\\day08\\src\\2.jpg");
        System.out.println(f2.length());

        File f3 = new File("E:\\empty\\AdvancedJavaLanguage\\day08\\src\\a");
        System.out.println(f3.length());
    }

    /*
        public String getName()  ：返回由此File表示的文件或目录的名称。
        获取的就是构造方法传递路径的结尾部分(文件/文件夹)
     */
    private static void show03() {
        File f1 = new File("D:\\empty\\AdvancedJavaLanguage\\day08\\src\\medo01\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);//a.txt

        File f2 = new File("D:\\empty\\AdvancedJavaLanguage\\day08\\src\\medo01");
        String name2 = f2.getName();
        System.out.println(name2);
    }

    /*
       public String getPath() ：将此File转换为路径名字符串。
       获取的构造方法中传递的路径

       toString方法调用的就是getPath方法
       源码:
           public String toString() {
               return getPath();
           }
    */
    private static void show02() {
        File f1 = new File("D:\\empty\\AdvancedJavaLanguage\\day08\\src\\medo01");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        System.out.println(path1);//D:\empty\AdvancedJavaLanguage\day08\src\medo01
        String path2 = f2.getPath();
        System.out.println(path2);//a.txt

        System.out.println(f1);//D:\empty\AdvancedJavaLanguage\day08\src\medo01
        System.out.println(f1.toString());//D:\empty\AdvancedJavaLanguage\day08\src\medo01
    }

    /*
           public String getAbsolutePath() ：返回此File的绝对路径名字符串。
           获取的构造方法中传递的路径
           无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径
        */
    private static void show01() {
        File f1 = new File("D:\\empty\\AdvancedJavaLanguage\\day08\\src\\medo01\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);//D:\empty\AdvancedJavaLanguage\day08\src\medo01\a.txt

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);//E:\empty\AdvancedJavaLanguage\a.txt
    }
}
