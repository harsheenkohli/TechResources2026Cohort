import java.util.*;
public class a2_q19 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for sand clock:");
        int n = sc.nextInt(); 
        int x = (n+1)/2;
        System.out.println();
        for (int i = 1; i<x; i++)
        {
                for (int j = 1; j<x; j++)
                {
                    if (i==1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
            System.out.print("*\t");
            for (int j = 1; j<x-1; j++)
                System.out.print("\t");
            System.out.println("*");
        } 
        for (int i = 1; i<=n; i++)
            System.out.print("*\t");
        System.out.println();
        for (int i = x + 1; i<=n; i++) 
        {
            System.out.print("*\t");
            for (int j = x + 1; j<n; j++)
                System.out.print("\t");
            System.out.print("*\t");
            if (i==n)
            {
                for (int j = x+1; j<=n; j++)
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
