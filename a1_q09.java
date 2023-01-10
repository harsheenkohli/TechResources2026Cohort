import java.util.*;
public class a1_q09
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2); 
        //gcd
        int gcd = 0;
        for (int i=1; i<=min; i++) 
        {
            if (num1%i==0 && num2%i==0)
                gcd=i;
        }    
        //lcm
        int lcm = 0;
        for (int i = max; lcm==0; i++)
        {
            if (i%num1==0 && i%num2==0)
                lcm=i;
        }
        System.out.println("GCD of "+ num1+ " & "+ num2 + " is : " + gcd);
        System.out.println("LCM of "+ num1+ " & "+ num2 + " is : " + lcm);
    }
}
