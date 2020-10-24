package medo09.ConstructorMethodReference;

import medo03.Stream.Person;

/*
   定义一个创建Peron对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法，根据传递的姓名，创建Person对象返回
    Person builderPerson(String name);
}
