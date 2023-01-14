import java.util.*;
public class a2_q07 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of diagonal:");
        int n = sc.nextInt(); //7
        for (int i = 1; i<=n; i++)
        {
            for (int j = 1; j<i; j++)
                System.out.print("\t");
            System.out.println("*");
        }        
    }
}
