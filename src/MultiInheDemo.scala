

object MultiInheDemo {
  
  class classInherit1{
    var AName: String = "Martin Odersky"
}
 
class classInherit2 extends classInherit1
{
    var Book_no: Int = 150
    def book_detail() // Method
    {
   println("Author name: " +AName);
     println("Total numbers of Books: " +Book_no);
    }
}
class classInherit3 extends classInherit2
{
    var Book_Publsher: String = "Googgle"
    def book_detail2() // Method
    {
    println("Author name: " +AName);
    println("Total numbers of Books: " +Book_no);
    println("Book Publisher  : " + Book_Publsher);
    }
}
  
    def main(args: Array[String])  // Driver code
    {
        val inheritob = new classInherit3();// Creating object of derived class
        inheritob.book_detail2();
    }
}