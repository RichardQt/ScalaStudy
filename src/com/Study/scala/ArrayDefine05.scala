package com.Study.scala

object ArrayDefine05 {
  def main(args: Array[String]): Unit = {
//    第一种创建方式
    val arr = Array[String]("a","b","c","d")
//    arr.foreach(println)
//    第二种创建方式
    val arr1 = new Array[Int](3)   //小括号里面的参数为元素个数
//    分别给里面元素进行赋值，默认为0
    arr1(0) = 100
    arr1(1) = 200
    arr1(2) = 300
    arr1.foreach(println)
//    创建一个二维数组
    val arr2 = new Array[Array[Int]](3)   //表示创建一个包含三个数组的二维数组
    arr2(0) = Array[Int](1,2,3)
    arr2(1) = Array[Int](4,5,6)
    arr2(2) = Array[Int](7,8,9)
    arr2.foreach(p => {p.foreach(println)})   //p代表二维数组中的每一个数组
      /*
      * 注意：
      * 1、数组创建后并不能直接打印，需要遍历后再进行打印输出
      * 2、常见的遍历方法有for循环和foreach（foreach里面的参数是函数可简写）*/
  }

}
