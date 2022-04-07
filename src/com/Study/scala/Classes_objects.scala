package com.Study.scala

/*
* 知识点
* 1、scala中Object相当Java中的单例对象，Object里定义的都是静态资源，静态资源优先加载 , Object中不可传参 【但如果Object里有apply方法则Object可以传参】
* 2、定义变量使用var ，定义常量使用val 在没有明确要求定义变量的话，尽量尽可能使用常量val便于scala回收
* 3、scala 中的object是单例对象，相当于java中的工具类，可以看成是定义静态的方法的类。object不可以传参数。另：Trait不可以传参数
* 4、scala中的class类默认可以传参数，传参时一定要指定数据类型，当实例化这个类时就相当于这个类的构造函数。class 类属性自带getter ，setter方法。
* 5、每个类中都有一个构造器，当发现构造函数的中的参数和原构造器不一样时，可以在类中使用def this(...){...} 来重写一个构造，第一行必须调用默认的构造
* 6、Scala中当new class(实例化一个类时)，class中除了方法不执行（不包括构造方法），其他都执行。
* 7、如果在同一个文件中，object对象和class类的名称相同，则这个对象就是这个类的伴生对象，这个类就是这个对象的伴生类。他们之间可以互相访问私有变量。
*
*
* 注意点：
* 建议类名首字母大写 ，方法首字母小写，类和方法命名建议符合驼峰命名法。
* */

//定义一个类
class Person(xname: String, xage: Int) {
  //  name和age相当于类中的属性
  val name = xname
  val age = xage
  var gender = "male"

  //重写一个构造器
  def this(yname: String, yage: Int, ygender: String) {
    this(yname, yage)
    this.gender = ygender
  }

  //  定义一个方法
  def sayHello(): Unit = {
    println("Hello world")
  }
}


object Classes_objects {
  //定义apply方法
  def apply(i: Int): Unit = {
    println(s"这是apply方法${i}")
  }

  def main(args: Array[String]): Unit = {
    Classes_objects(50)

    //    定义一个构造函数来实例化一个类,并传相应的参数
    val p = new Person(xname = "lsr", xage = 20)
    //    如果实例化类时传递的参数和定义类的参数不符时，可以对类进行重写
    val p1 = new Person(yname = "lsr", yage = 21, ygender = "female")
    println(p1.gender)
    //    打印相关属性
    println(p.name)
    println(p.age)
    //    调用类中的方法
    p.sayHello()
  }
}
