//元组的基本操作
package com.Study.scala
/*
* 1、元组一般用来存储多个不同类型的值。例如同时存储姓名，年龄，性别，出生年月这些数据, 就要用到元组来存储
了。并且元组的长度和元素都是不可变的。
* 2、元组长度最大为22
* 3、在定义元组时，尽量保证所定义元组个数和前面的Tulple后的数字相匹配
* 4、定义元组时，推荐使用()直接定义方式
* */
object TupleOption11 {
  def main(args: Array[String]): Unit = {
    /*创建元组的几种格式
    * 1、直接再tuple1后面加上() ---->Tuple后的数字但表最大元组的长度
    * 2、使用new Tulple
    * 3、直接使用小括号()*/
    val tuple = Tuple3(1,"a",'C')
//    println(tuple)
    val tuple3 = new Tuple1(1,"a",'C')
    val tuple2 = (1,"a",'C')
    /*
    * 元组的基本操作
    * 1、元组取值也是通过_1,_2,....来获取所在位置的元素
    * */
    val res = tuple._1
    println(res)

    /*
    * 对元组遍历
    * 1、遍历使用productIterator返回该元组的迭代器后再使用foreach或者for循环来进行遍历
    * 注意：不能使用foreach以及for循环模式*/
    val iter = tuple2.productIterator
    iter.foreach(println)

  }
}
