

object funcDemo {
  //object function
  object obj{
    def sumNum(a:Int, b:Int):Int={
      return a+b;
    }
  }
  def sumNum(a:Int, b:Int):Int ={
    return a+b;
  }
  
  // default value
  def timeNum(x:Int = 2, y:Int = 6):Int ={
    return x*y
  }
  
  //non-return function
  def noReturn(i:Int =9,j:Int = 5 ): Unit = {
    println("No return function: "+(i-j))
  }
  
  //high order function
  def math(a:Double,b:Double, func:(Double,Double)=>Double):Double = func(a,b);
  def math2(a:Double,b:Double,c:Double,func:(Double,Double)=>Double):Double = func(func(a,b),c);
  
  //closure
  
  
  //**Main function**
  def main(args:Array[String]){
    println("obj.sumNum(10,5)"+obj.sumNum(10,5))
    println("sumNum(25,35)"+sumNum(25,35))
    println("timeNum()"+timeNum())
    println("timeNum(3,7)"+timeNum(3,7))
    println("timeNum(3)"+timeNum(3))
    println(noReturn(7,2))
    var result = math(3,5,(a,b)=>a*b)
    println("result = "+result)
    val result2 = math2(11,22,33,_*_)
    println("High Order wildcard result2 = "+result2)
    val result3 = math2(4,5,6,(a,b)=>a-b)
    println("High Order result3= "+result3)
    //Partial Applied func with anouymous func
    val result4 = (x:Int,y:Int,z:Int)=>x+y*z
    val k=result4(10,_:Int,_:Int)
    println(k(5,3)+" This is a anonymous funtion with wildcard")
  }
}