import java.util.Scanner;
public class manstring
{
    public static void main(String [] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String s= sc.nextLine();
        System.out.println("Given string in Uppercase:");
        System.out.println(s.toUpperCase());
        System.out.println("Given string in lowercase:");
        System.out.println(s.toLowerCase());
        System.out.println("Length of the  given string is :");
        System.out.println(s.length());
        System.out.println("string after removing  spaces are : ");
        System.out.println(s.trim());
        System.out.println("string after replacing a with @ is:");
        System.out.println(s.replace('a','@'));
    }
}

