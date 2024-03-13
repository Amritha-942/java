import java.util.Scanner;
public class emp
{
    int eno;
    float esalary;
    String ename;
    Scanner sc=new Scanner(System.in);
    public void read()
    {
        
        
            System.out.println("Enter the employee number:");
            eno=sc.nextInt();
            System.out.println("Enter the employee salary:");
            esalary=sc.nextFloat();
            System.out.println("Enter the name of the employee:");
            ename=sc.next();
          
    }
    public void display()
        {
                System.out.println("employee number:"+eno);
                System.out.println("employee name:"+ename);
                System.out.println("employee salary:"+esalary);
            
        }

        
    public static void main(String[] args)
    {
        emp p1=new emp();
        emp p2=new emp();
        p1.read();        
        p2.read();
        p1.display();
        p2.display();
    }
}