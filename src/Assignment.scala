

 //class
 class People{
    private var name:String=" ";
    private var gender:String = " ";
    private var age:Int = 0;
    def greeting():Unit = {
      println("Hello ...")
    }
    //setter
   def set_name(Name:String){
     name = Name
   }
   def set_gender(Gender:String){
     gender = Gender
   }
   def set_age(Age:Int){
     age = Age
   }
   //Getter
   def get_name():String = {
     return name
   }
   def get_gender():String = {
     return gender
   }
   def get_age():Int = {
     return age
   }

  }
 
 class Student extends People{
   private var studentId:Int = 0;
   private var gpa:Double = 0.0;
   //setter
   def set_studentId(Id:Int){
     studentId = Id
   }
   def set_gpa(Gpa:Double){
     gpa = Gpa
   }
   //getter
   def get_studentId():Int ={
     return studentId
   }
   def get_gpa():Double ={
     return gpa
   }
    //overrride
   override def greeting():Unit={
     println("Hello "+get_name())
   }

 }

object Assignment {
  
  //currying
  def testingCurry(x:String)=(y:String)=>{
    println("Currying example: "+x+" "+y)
  }
  

  

  def main(args:Array[String]){
    
    //currying
    testingCurry("Hello")("World")
    
    //create new object
    var student1 = new Student()
    student1.set_studentId(101);
    student1.set_name("Gen Li");
    student1.set_gender("M");
    student1.set_age(21);
    student1.set_gpa(3.88);
    student1.greeting();
    println("Student GPA: "+student1.get_gpa())
    
    
    
  }
}