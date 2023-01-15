import java.util.*;
public class a2_q18 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for sand clock:");
        int n = sc.nextInt(); 
        int x = (n+1)/2;
        System.out.println();
        for (int i = 1; i<=x; i++)
        {
            System.out.println();
            for(int j = 1; j<i; j++)
                System.out.print("\t");
            if(i==1)
            {
                for (int j = 1; j<=n; j++)
                    System.out.print("*\t");
                continue;
            }
            if (i!=x)
                System.out.print("*\t");
            for (int j = 1; j<=(2*(x-i)-1); j++)
                System.out.print("\t");
            System.out.print("*");
        } 
        System.out.println();
        for (int i = x + 1; i<n; i++) 
        {
            for (int j = 1; j<=n-i; j++)
                System.out.print("\t");
            for (int j = 1; j<=2*(i-x)+1; j++)
                System.out.print("*\t");
            System.out.println();
        }
        for (int i = 1; i<=n; i++)
            System.out.print("*\t");
    }
}
