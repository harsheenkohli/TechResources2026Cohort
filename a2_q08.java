import java.util.*;
public class a2_q08 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of right diagonal:");
        int n = sc.nextInt(); //7
        for (int i = n; i>=1; i--)
        {
            for (int j = i; j>1; j--)
                System.out.print("\t");
            System.out.println("*");
        }        
    }
}
