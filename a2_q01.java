import java.util.*;
public class a2_q01
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the size: ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++)
        {
            if (i==0 || i==(n-1))
            {
                for (int j = 0; j<n; j++)
                    System.out.print("*");
                System.out.println();
                continue;
            }
            for (int j=n; j>(i+1); j--)
                System.out.print(" ");
            System.out.println("*");
        }
    }
}
