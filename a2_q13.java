import java.util.*;
public class a2_q13 
{
    public static int factorial (int num)
    {
        int fact = 1;
        for (int i = 1; i<=num; i++)
            fact*=i;
        return fact;
    }
    public static int combination(int n, int r)
    {
        int comb = factorial(n)/(factorial(r)*factorial(n-r));
        return comb;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Pascal's Triangle:");
        int n = sc.nextInt(); 
        for (int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
                System.out.print(combination(i,j) + "\t");
            System.out.println();
        }   
    }
}
