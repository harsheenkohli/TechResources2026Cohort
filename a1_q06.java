import java.util.*;
public class a1_q06
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a number to reverse : ");
        int n = sc.nextInt();
        int temp = n;
        while(temp!=0)
        {
            System.out.println(temp%10);
            temp/=10;
        }  
        if (n == 0) 
            System.out.println(n);  
    }
}
