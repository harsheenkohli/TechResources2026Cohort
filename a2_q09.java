import java.util.*;
public class a2_q09 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of cross:");
        int n = sc.nextInt(); //7
        int x = (n+1)/2;
        for (int i = 1; i<=x; i++)
        {
            for (int j = 1; j<i ; j++)
                System.out.print("\t");
            System.out.print("*\t");
            if (i==x)
                break;
            for (int j = 1; j<=2*(x-i)-1; j++)
                System.out.print("\t");
            System.out.println("*");
        }   
        System.out.println();
        for (int i = x + 1; i<=n; i++)   
        {
            for (int j = 1; j<=(n-i); j++)
                System.out.print("\t");
            System.out.print("*\t");
            for (int j = 1; j<=(i-x)*2-1; j++)
                System.out.print("\t");
            System.out.println("*");
        }
    }
}
