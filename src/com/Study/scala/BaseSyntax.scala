package com.Study.scala

object BaseSyntax {
  def main(args: Array[String]): Unit = {
    /*
    * for循环
    * */


    val f = 1 to 10 //to:首尾包含  也可写成1.to(10)
      println(f)    //-------Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val f2 = 1.to(10,2)
    println(f2)   //------Range(1, 3, 5, 7, 9)
    val f1 = 1 until 10 //until 首包含，尾不包含
      println(f1)    //------- Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i <- 1 to 10)
      print(i)    //输出1到10所有数字


    //例子： 打印小九九
    /*  写法一，特点将两个for循环合并为一个*/
    for (i <- 1 until 10; j <- 1 until 10) {
      if (i >= j) {
        print(s"${i} * ${j} = ${i * j}\t")

      }
      if (i == j) {
        println()
      }
    }

    /* 写法二*/
    for (i <- 1 until 10) {
      for (j <- 1 until 10) {
        if (i >= j) {
          print(s"${i} * ${j} = ${i * j}\t")
        }
        if (i == j) {
          println()
        }
      }
    }

    //将for中的符合条件的元素通过yield关键字返回成一个集合
    /**/
    val list = for (i <- 1 to 10; if (i > 5)) yield i
    for (w <- list) {
      println(w)
    }

    /**
     * while 循环
     * do while循环比while循环至少会循环一次
     */
    var index = 0
    while (index < 100) {
      println("第" + index + "次while 循环")
      index += 1
    }
    index = 0
    do {
      index += 1
      println("第" + index + "次do while 循环")
    } while (index < 100)

    /**
     * if else
     */

     val age =18
     if (age < 18 ){
       println("no allow")
     }else if (18<=age&&age<=20){
       println("allow with other")
     }else{
       println("allow self")
     }


  }
}
