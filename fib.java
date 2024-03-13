 import java.util.*;
 class fib
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the series:");
        int n=sc.nextInt();
        int ft=0;
        int sd=1;
        int nt=ft+sd;
        System.out.println("Fibonnacci Series:");
        for(int i=0;i<n;i++)
        {
            System.out.println(ft);
            ft=sd;
            sd=nt;
            nt=ft+sd;
        }
    }
 }
