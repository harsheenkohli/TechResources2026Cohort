import java.util.*;
public class a2_q12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of fibonaccci pattern:");
        int n = sc.nextInt(); 
        int first = 0, second = 1, third = first + second;
        System.out.println(first);
        for (int i = 2; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if(i==2 && j==1)
                {
                    System.out.print(second + "\t");
                    continue;
                }
                System.out.print(third + "\t");
                first = second; 
                second = third; 
                third = first + second;
            }
            System.out.println();
        }   
    }
}
