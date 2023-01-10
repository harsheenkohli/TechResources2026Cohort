import java.util.*;
public class a1_q03
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the quantity of numbers to be checked : ");
        int t = sc.nextInt();
        for (int i = 1; i<=t; i++)
        {
            System.out.println("Enter a number to check for prime or not:");
            int n = sc.nextInt();
            if (n<0)
            {
                System.out.println("Invalid input.");
                continue;
            }
            int counter = 0;
            for (int j = 1; j<=n; j++)
            {
                if(n%j==0)
                    counter++;
            }
            if (counter == 1 || counter == 0)
                System.out.println("Neither prime nor composite.");
            else if (counter == 2)
                System.out.println("Prime.");
            else
                System.out.println("Not prime (composite).");
        }
    }
}
