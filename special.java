package BASICS;

import java.util.*;
class special
{
    public static void main(String args[])
    {
        int n,n1,s,k,p;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        n=sc.nextInt();
        n1=n;
        p=1;
        s=0;
        while(n1>0)
        {
            k=n1%10;
            s=s+k;
            n1=n1/10;
            p=p*k;
        }
        if(s*p==n)
        System.out.println("Special");
        else
        System.out.println("Not special");
        sc.close();
    }
}