package com.Study.scala

object ListDefine07 {
  def main(args: Array[String]): Unit = {
 /* 创建list只有一种写法
 * 要尽可能的使用list,而少用数组*/

    val list = List[String]("hello scala","hello java","hello spark")
    println(list)
//    对list进行遍历
//    写法一
    for (elem <- list) {
      println(elem)
    }
//    写法二
    list.foreach(elem => {
      println(elem)
    })
//    写法三 如果箭头函数里的参数只有一个的话，参数可以省略，可以用下划线_代替或者不写
    list.foreach(println(_))
    list.foreach(println)
  }

}
