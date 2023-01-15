import java.util.*;
public class a2_q15 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int n = sc.nextInt(); 
        int x = (n+1)/2;
        int j;
        for (int i = 1; i<=x; i++)
        {
            for (j = 1; j<=(x-i); j++)
                System.out.print("\t");
                j=i;
            while (j<2*i-1)
                System.out.print(j++ + "\t");
            while (j>=i)
                System.out.print(j-- + "\t");
            System.out.println();
        }  
        for (int i = x+1; i<=n; i++)
        {
            for (j = 1; j<=i-x; j++)
                System.out.print("\t");
            for (j = n-i+1; j<2*(n-i)+1; j++)
                System.out.print(j + "\t");
            for ( ; j>n-i; )
                System.out.print(j-- + "\t"); 
            System.out.println();
        }
    }
}
