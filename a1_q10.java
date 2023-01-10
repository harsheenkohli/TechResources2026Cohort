import java.util.*;
public class a1_q10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a number to prime factorise : ");
        int n = sc.nextInt();
        int temp = n;
        System.out.print("Prime factorisation of "+ n +" : ");
        for (int i = 2; temp!=1; i++ )
        {
            if (temp%i==0)
            {
                System.out.print(i + " ");
                temp/=i;
                i = 1;
            }
        }
    }
}
