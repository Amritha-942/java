import java.util.Scanner;
public class array_search
{
    public static void main(String[] args)
    {
    int n,x,flag=0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the no of elements:");
    n= s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the array elements:");
    for(int i = 0; i < n ;i++)
    {
        a[i] = s.nextInt();
    }
    System.out.println ("enter the element to be searched:");
    x=s.nextInt();
    for(int i = 0;i < n;i++)
    {
        if(a[i] == x)
        {
        flag=1;
        break;
        }
    }
    if(flag == 0)
        System.out.println("The element not found");
    else if(flag == 1)
    {
        for(int i=0;i<n;i++)
        {
            if (a[i] == x) {
                System.out.println("element found at position:"+(i+1));
            }
        }
    }
    }
}