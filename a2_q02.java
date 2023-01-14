import java.util.*;
public class a2_q02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for upper left triangle:");
        int n = sc.nextInt();
        for (int i=n; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
