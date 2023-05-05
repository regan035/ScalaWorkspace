
class Sample2(private var empname: String,  var empsal:Int ) {
   def display{println("Emp Name:"+empname);
          println("EmpSal:"+empsal);
   }
}
object ConstDemo {
  def main(args : Array[String]) {
      var Sample2 = new Sample2("Dublin",2345);  //object 
      println(Sample2.display);
      // println("EmpSal:"+empsal)
      
  }
}