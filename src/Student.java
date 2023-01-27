
public class Student {
    int rollno;
    String name;
   Student(){
	   
   }
    Student(int rollno,String name)
    {
    	this.name=name;
    	this.rollno=rollno;
    }
    void display()
    {
    	System.out.println(name+" "+rollno);
    }
    void setRollno(int rollno)
    {
    	this.rollno=rollno;
    }
}
