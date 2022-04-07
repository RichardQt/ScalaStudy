package com.Study.scala

object ListOption08 {
  def main(args: Array[String]): Unit = {
    //1. 定义一个列表list1，包含以下元素：1,2,3,4
    val list1 = List(1, 2, 3)
    //2. 使用isEmpty方法判断列表是否为空, 并打印结果.
    println(s"isEmpty: ${list1.isEmpty}")
    //3. 再定义一个列表list2，包含以下元素: 4,5,6
    val list2 = List(4, 5, 6)
    //4. 使用`++`将两个列表拼接起来, 并打印结果.
    val list3 = list1 ++ list2
    println(s"list3: ${list3}")
    //5. 使用head方法，获取列表的首个元素, 并打印结果.
    println(s"head: ${list3.head}")
    //6. 使用tail方法，获取列表中除首个元素之外, 其他所有的元素, 并打印结果.
//    println(s"tail: ${list3.tail}")
    //7. 使用reverse方法将列表的元素反转, 并打印反转后的结果.
    val list4 = list3.reverse
    println(s"list4: ${list4}")
    //8. 使用take方法获取列表的前缀元素(前三个元素), 并打印结果.
    println(s"take: ${list3.take(3)}")
    //9. 使用drop方法获取列表的后缀元素(除前三个以外的元素), 并打印结果.
    println(s"drop: ${list3.drop(3)}")

   /* 对列表进行map和flatmap操作
   * map是一对一关系
   * flatmap是一对多关系
   * */
    val list5 = List[String]("hello scala","hello java","hello spark")
    val result:List[Array[String]] = list5.map(s => {
      s.split(" ")
    })    //map操作返回的是一个数组
    result.foreach(p => p.foreach(println))
    val result1:List[String] = list5.flatMap(s => {
      s.split(" ")
    })    //flatmap返回值是一个list5
    result1.foreach(println)
    /*对列表进行fileter操作
    * */
    val list6 = List[String]("hello scala","hello java","hello spark")
    val result6 = list6.filter(a => {
      "hello scala".equals(a)   //过滤条件：和hello scala 保持相等,filter返回值是一个布尔型，true留下，false剔除，并返回一个新列表
    })
    println(result6)

    /*对列表进行一个统计
    * */
    val list7 = List[String]("scala","java","spark")
    val result7 =  list7.count(a => {
        a.length >4        //统计列表元素长度大于4的个数
    })
    println(result7)
  }
}
