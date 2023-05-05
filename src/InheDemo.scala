

class classInherit1{
    var AName: String = "Martin Odersky"
}
 
class classInherit2 extends classInherit1
{
    var Book_no: Int = 130
    def book_detail() // Method
    {
    println("Author name: " +AName);
    println("Total numbers of Books: " +Book_no);
    }
}
object InheDemo {
  
    def main(args: Array[String])  // Driver code
    {
        val inheritob = new classInherit2();// Creating object of derived class
        inheritob.book_detail();
    }
}