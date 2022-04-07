package com.Study.scala

import java.util.Date

//  复杂类型函数
object FunctionSyntax04 {
  def main(args: Array[String]): Unit = {

    /*递归方法
      1、递归方法要有显式的声明函数的返回类型
    * */
    def fun(num: Int): Int = {
      if (num == 1) {
        1
      } else {
        num * fun(num - 1)
      }
    }

    println(fun(5))

    /* 2、参数有默认值的方法,参数中默认值可以任意改变
    **/
    def fun1(a: Int = 10, b: Int = 20) = {
      a + b
    }

    println(fun1(b = 30))

    /*
    * 3、可变长参数的方法
    *   特点:a、是在参数后面加“*”，代表可以传多个同类型的参数
    *       b、若想传递多个不同类型的参数，可以定义参数为Any后再加“*”
    * */
    def fun2(s: String*) = {
      //      println(s)
      //      分别打印每个传进来的值
      //      s.foreach((elem) => { print(elem) })
      //      也可简写成
      //      s.foreach(println(_))
      //      或者
      s.foreach(println)
    }

    fun2("hello", "sss", "we")
    /*
    * 4、匿名函数
    * a：“=>代表箭头函数（匿名函数），多用于方法的内部参数，大部和js的箭头函数语法相同”
    * b:匿名函数中的参数需要加参数类型
    * */
    //有返回值的匿名函数
    val value3 = (a: Int, b: Int) => {
      a + b
    }
    println(value3(4, 4))

    /*5、嵌套方法
      方法里面嵌套方法，不常用
    * */
    def fun3(a: Int): Int = {
      def fun4(num: Int): Int = {
        if (num == 1) {
          1
        } else {
          num * fun4(num - 1)
        }
      }

      fun4(a)
    }

    println(fun3(5))

    /*6、偏应用函数
      某些情况下，方法中参数非常多，调用方法较为频繁，每次调用只有固定的某个参数变化，其他都不变，可以定义偏应用函数来实现
      第一个保持不变时，第二个参数可以使用下划线`_`来替换缺失的参数列表，并仅需要把要变化的参数传递给函数就可。
    * */
    def showlog(date: Date, s: String) = {
      println(s"date is ${date},log is ${s}")
    }

    //    这里的Date是导入Java的包，需要实例化一下
    val date = new Date()
    showlog(date, "log1")
    showlog(date, "log2")
    showlog(date, "log3")

    //想要调用showlog，以上变化的是第二个参数，可以用偏应用函数处理
    val logWithDate = showlog(date, _: String)
    logWithDate("log11")
    logWithDate("log22")
    logWithDate("log33")


    /*7、高阶函数  重点！！！
 * a、方法的参数是函数
 * b、方法的返回值是函数
 * c、方法的参数和返回值都是函数*/

//    方法的参数是函数
    def fun5(f: (Int, Int) => Int, s: String) = {
      val f_result: Int = f(100, 200)
      print(s"${f_result} + ${s}")
    }
//    调用函数
     fun5((a: Int, b: Int) => {
      a * b
    }, "Strinssg")

  }


}
