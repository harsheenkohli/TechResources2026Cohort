import java.util.*;
public class a1_q08
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a number to rotate : ");
        int n = sc.nextInt();
        System.out.println("Enter the required number of rotations : ");
        int k = sc.nextInt();
        int len = 0;
        int temp = n;
        while (temp!=0)
        {
            len++;
            temp/=10;
        }
        int num [] = new int [len];
        temp = n;
        for (int i = len-1; i>=0; i--)
        {
            num[i] = temp%10;
            temp/=10;
        }
        //rotation begins
        for(int i=1; i<=k; i++)
        {
            temp = num [len-1];
            for (int j = len-2; j>=0; j--)
                num[j+1] = num [j];
            num[0]=temp;
        }
        //rotation ends here
        System.out.print("The number "+ n +" after "+ k +" rotations is : ");
        for (int i=0; i<len; i++)
            System.out.print(num[i]);
    }
}
