import java.util.*;
public class a2_q16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");
        int n = sc.nextInt(); 
        for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j<=i; j++)
                System.out.print(j + "\t");
            for (int j = 1; j<= (n-i)*2-1; j++)
                System.out.print("\t");
            for (int j = i; j>=1; j--)
            {
                if(j==n)
                    continue;
                System.out.print(j + "\t");
            }
            System.out.println();
        }  
    }
}
