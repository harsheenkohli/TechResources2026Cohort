import java.util.*;
public class a2_q17 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int n = sc.nextInt(); 
        int x = (n+1)/2;
        System.out.println();
        for (int i = 1; i<=n; i++)
        {
            System.out.println();
            for(int j = 1; j<x; j++)
            {
                if (i==x)
                    break;
                System.out.print("\t");
            }
            if (i==x)
            {
                for (int j = 1; j<=n; j++)
                    System.out.print("*\t");
                continue;
            }
            for (int j = 1; j<=Math.min(i, n-i+1); j++)
                System.out.print("*\t");
        }  
    }
}
