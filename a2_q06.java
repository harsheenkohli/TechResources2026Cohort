import java.util.*;
public class a2-_q06 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of hollow ellipse:");
        int n = sc.nextInt(); //7
        int x = (n+1)/2; //4
        for (int i = x; i>=1; i--)
        {
            for (int j = i; j>=1; j--)
                System.out.print("*\t");
            for (int j = 1; j<=2*(x-i)+1; j++)
                System.out.print("\t");
            for (int j = i; j>=1; j--)
                System.out.print("*\t");
            System.out.println();
        }
        for (int i = n; i>=x+1; i--) //7 6 5        5 3 1
        {
            for (int j = 1; j<=(n-i)+2; j++)
                System.out.print("*\t");
            for (int j = 1; j<=2*(i-x)-1; j++)
                System.out.print("\t");
            for (int j = 1; j<=(n-i)+2; j++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
