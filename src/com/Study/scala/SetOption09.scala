package com.Study.scala
//set操作
object SetOption09 {
  def main(args: Array[String]): Unit = {
    /*set是创建一无序的集合
    set的相关操作返回值也是一个set集合，也可使用list的相关方法
    * */
    val set1 = Set[Int](1,2,3,4,5,4)
//    println(set1)
    val set2  =Set[Int](2,3,4,6,7)

    /*
    取交集
    * */
    val res = set1.intersect(set2)  //也可写成 set1 & set2
    /*
    * 取差集
    * */
    val res1 = set1.diff(set2)   //set1独有而set2没有的  也可写成 set1 &~ set2
    val res2 = set2.diff(set1)   //set2独有而set1没有的  也可写成 set2 &~ set1
    set1 & set2
    println(res1)

  }

}
