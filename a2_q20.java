import java.util.*;
public class a2_q20 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for 'W':");
        int n = sc.nextInt(); 
        int x = (n+1)/2;
        System.out.println();
        for (int i = 1; i<x; i++)
        {
            System.out.print("*\t");
            for (int j = 1; j<=n-2; j++)
                System.out.print("\t");
            System.out.println("*");
        } 
        for (int i = x; i<n; i++) 
        {
            System.out.print("*\t");
            for (int j = 1; j<n-i; j++)
                System.out.print("\t");
            System.out.print("*\t");
            for (int j = 1; j<2*(i-x); j++)
                System.out.print("\t");
            if (i!=x)
                System.out.print("*\t");
            for (int j = 1; j<n-i; j++)
                System.out.print("\t");
            System.out.println("*\t");
        }
        System.out.print("*\t");
        for (int i = 1; i<=n-2; i++)
            System.out.print("\t");
        System.out.println("*");
    }
}
