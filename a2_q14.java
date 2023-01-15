import java.util.*;
public class a2_q14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for its table:");
        int n = sc.nextInt(); 
        System.out.println();
        for (int i = 1; i<=10; i++)
            System.out.println(n + " * " + i + "\t\b= " + (n*i));  
    }
}
