import java.util.*;
public class a2_q05 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rhombus:");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j<= Math.abs((n+1)/2 - i); j++)
                System.out.print("\t");
            for (int j = 1; j<=2*i-1 && j<=2*(n-i)+1; j++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
