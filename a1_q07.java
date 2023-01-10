import java.util.*;
public class a1_q07
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a number for inverse : ");
        int n = sc.nextInt();
        int temp = n;
        int len = 0;
        while (temp!=0)
        {
            len++;
            temp/=10;
        }
        temp = n;
        int num[] = new int [len];
        for (int i=0; i<len; i++)
        {
            num[len-(temp%10)] = i+1;
            temp/=10;
        }
        System.out.print("The inverse of "+ n +" is : ");
        for (int i=0; i<len; i++)
            System.out.print(num[i]);
    }
}
