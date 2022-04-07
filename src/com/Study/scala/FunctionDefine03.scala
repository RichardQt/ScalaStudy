package com.Study.scala

object FunctionDefine03{
  def main(args: Array[String]): Unit = {
    /*
    * 方法定义 (使用def)
    * 1、方法体中最后返回值可以使用return，如果使用了return，那么返回值的类型一定要指定
    * 2、如果方法中没有return ,默认将方法体中的最后一行计算的结果当作返回值返回，此时 方法体中的返回值类型可以省略，会自动推断返回值的类型
    * 3、定义方法时一定传入参数，且需指定传入参数类型
    * 4、方法的方法体如果可以一行搞定，则方法体中的{...}可以省略不写
    * 5、如果定义方法时，省略了方法名称和方法体之间的“=”，那么无论方法体中的最后一行的计算结果是啥，都会被丢弃，并且返回空值（Unit）
    *   "="代表方法有返回值。 在方法实现中如果最后一行语句有实际的计算的话，那么方法不能省略"=",否则造成无法正常返回。
    * */
//    正常写法
    /*def max(a: Int, b: Int): Int = {
      if (a > b) {
        return a
      } else {
        b
      }
    }*/
//    简写
/*    def max(a:Int,b:Int) = {
      if (a>b) a else b
    }*/
//    最终简写
    def max(i: Int, i1: Int) = if (i>i1) i else  i1


    val result  = max(20,38)
    println(result)
  }
}
