

 //super class
 class People{
    private var name:String=" ";
    private var gender:String = " ";
    private var age:Int = 0;
    
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
   def greeting():Unit={
     println("Hello ...")
   }

  }
 // traits
 trait Greeting{
   def greeting():Unit={
     println("Hello ...")
   }
 }
 trait Enrollment{
   def enrollment():Unit ={
     println("No class enrolled")
   }
 }

 
 // sub class
 class Student extends People with Greeting with Enrollment{
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
    //override with mulitple traits
   override def greeting():Unit={
     println("Hello "+get_name())
   }
   override def enrollment():Unit={
     println("Class enrolled: "+"Math");
     println("Class enrolled: "+"History");
     println("Class enrolled: "+"English");
   }
 }

 
// 2nd level sub class
 class Alumni extends Student{
   private var graduated:String= " "; 
   private var degree:String = " ";
   
   //setter
      def set_graduated(Date: String){
     graduated = Date
   }
   def set_degree(Degree: String){
     degree = Degree
   }
   //getter
   def get_graduated():String ={
     return graduated
   }
   def get_degree():String = {
     return degree
   }
//   override def greeting():Unit={
//     println("Congratulations ")
//   }
   
   def alumni_details(){
     println("Alumni Name: "+get_name())
     //greeting()
     println("Alumni graduated on: "+get_graduated())
     println("Alumni was granted: "+get_degree())
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
    
    println(" ")
    println(".....First level subclass ")
        //create new object
    var student1 = new Student()
    student1.set_studentId(101);
    student1.set_name("Gen Li");
    student1.set_gender("M");
    student1.set_age(21);
    student1.set_gpa(3.88);
    
    //calling the override function 
    student1.greeting();
    student1.enrollment()
    println("Student GPA: "+student1.get_gpa())
    
    //2nd level new object
    println(" ")
    println(".....Second level subclass ")
    var student2 = new Alumni();
    student2.set_name("Lesley")
    student2.set_graduated("May 2023")
    student2.set_degree("Master Of Science in Information Technology")
    student2.alumni_details()
    
  }
}