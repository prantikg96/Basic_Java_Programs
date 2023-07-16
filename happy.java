package BASICS;

import java.util.*;
class happy
{
    public static void main(String args[])
    {
        int n,n1,s=0,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        n=sc.nextInt();
        while(n>=10)
        {
            s=0;
            n1=n;
            while(n1>0)
            {
                k=n1%10;
                s=s+k*k;
                n1=n1/10;
            }
            n=s;
        }
    if(s==1)
        System.out.println("Happy");
        else
        System.out.println("Not Happy");
        sc.close();
    }
}