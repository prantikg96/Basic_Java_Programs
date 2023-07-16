package BASICS;

import java.util.*;
class krishnamurthy
{
    public static void main(String args[])
    {
        int i,n,n1,s,k,f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        n=sc.nextInt();
        n1=n;
        s=0;
        while(n>0)
        {
            k=n%10;
            f=1;
            for(i=1;i<=k;i++)
            {
                f=f*i;
            }
            s=s+f;
            n=n/10;
        }
        if(n1==s)
        System.out.println("Krishnamurthy");
        else
        System.out.println("Not Krishnamurthy");
        sc.close();
    }
}