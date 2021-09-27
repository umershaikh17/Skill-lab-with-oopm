import java.util.Scanner;
class Student {
Scanner in=new Scanner(System.in);
String name;
int roll_no;
float cgpa;
char div;
char branch;
void getdata()
{
System.out.println("Enter your name:");
name=in.next(); 
System.out.println("Enter your roll number:");
roll_no=in.nextInt();
System.out.println("Enter your CGPA:");
cgpa=in.nextFloat();
System.out.println("Enter your Division:");
div=in.next().charAt(0);
System.out.println("Enter branch:");
branch=in.next().charAt(0);
}
void getdata(String n,int r,float c,char d, char b)
{
name=n;
roll_no=r;
cgpa=c;
div=d;
branch=b;
}
void printdata()
{
System.out.println("Name of the student: "+name);
System.out.println("Roll-no of the student: "+roll_no);
System.out.println("Cgpa of the student: "+cgpa);
System.out.println("Division of the student: "+div);
System.out.println("branch of the student: "+branch);
}
};
public class StudentTest {
public static void main(String[] args) {
Student s1=new Student();
Student s2=new Student();
s1.getdata(); 
s1.printdata();
s2.getdata();
s2.printdata();
}
}
