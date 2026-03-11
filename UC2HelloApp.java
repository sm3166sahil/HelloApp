import java.util.*;


public class UC2HelloApp 
{
    public static void main(String args[]) 
    {
        // Get the name from command–line argument
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}