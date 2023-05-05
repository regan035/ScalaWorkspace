

object ArrayDemo {
  val arr1:Array[Int]= new Array[Int](5);
  val arr2:Array[String]= new Array[String](5);
  
  var s = 50
  val res = (a:Int)=>a+s
  
  def main(args:Array[String]){
//    arr1(0)=33;
//    arr1(4)=11;
//    arr2(1)="Hi"
//    arr2(2)="No"
//    for(a<-arr1){
//      println(a)
//    }
//    Afor(b<-arr2){
//      println(b)
//    }
    
    s=11
    println(res(5))
   
  }
}