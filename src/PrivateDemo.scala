class Employee
{
    // Class variables
    var emp_name: String= " "
    var emp_sal: Int= 0
    private var emp_regno= 0
    def set_regno(x:Int)
        { emp_regno = x}
} 
object ClassPrivate {
def main(args: Array[String]) 
    {
        // Class object 
        var emp = new Employee() 
        emp.emp_name= "Mr.Scala"
        emp.emp_sal= 1542
        
        emp.set_regno(11111)
        println("Employee Name:  " +  emp.emp_name) 
        println("Employee Salary: " + emp.emp_sal) 
     //   println("Employee Reg.no: " + emp.emp_regno) 
       
    }
}