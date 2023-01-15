import java.util.*;
public class a2_q10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of solid rhombus:");
        int n = sc.nextInt(); //7
        int x = (n+1)/2;
        for (int i = x; i>=1; i--)
        {
            System.out.println();
            for (int j=1; j<i; j++)
                System.out.print("\t");
            System.out.print("*\t");
            if (i==x)
                continue;
            for (int j=1; j<=2*(x-i)-1; j++)
                System.out.print("\t");  
            System.out.print("*\t");
        }   
        System.out.println();
      
        for (int i = x + 1; i<=n; i++)   
        {
            for (int j = 1; j<=(i-x); j++)
                System.out.print("\t");
            System.out.print("*\t");
            if (i==n)
                break;
            for (int j = 1; j<=(n-i)*2-1; j++)
                System.out.print("\t");
            System.out.println("*");    
        }
    }
}
