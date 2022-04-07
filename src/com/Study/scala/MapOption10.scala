//map操作
package com.Study.scala
/*
* 映射指的就是Map。它是由键值对(key, value)组成的集合。特点是: 键具有唯一性, 但是值可以重复. 在Scala中，
Map也分为不可变Map和可变Map。
* 注意：
* 如果添加重复元素(即: 两组元素的键（key）相同), 则会用新值覆盖旧值 .
* */
object MapOption10 {
  def main(args: Array[String]): Unit = {
    val map = Map[String,Int]("a" ->100,"b"->200,"c"->300)
//    也可写成
//    val map = Map[String,Int](("a",100),("b",200),("c",300))
//    遍历map
    val traverse = map.foreach(println)
    /*
    * map的基本操作
    * 1、map("key") 获取键值
    * 2、map.get("key").get 获取键值
    * 3、map.values : 获取所有的值
    * 4、map.getOrElse("key")  根据键获取其对应的值, 如果键不存在, 则返回指定的默认值,里面包含两个参数，一个是键值，一个是默认值
    * */
    /*
    * map的过滤,里面包含一个布尔值，返回值是一个map映射*/
    val res = map.filter(tp => {
      val key = tp._1  //获取map映射里的第一个值
      val value = tp._2  //获取map映射里的第二个值
      value == 100 && key == "a"   //filter函数内必须至少包含一个布尔值
    })
    println(res)

  }
}
