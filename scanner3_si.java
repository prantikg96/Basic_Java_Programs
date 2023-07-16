package BASICS;


import java.util.*;
class scanner3_si
{
    public static void main(String args[])
    {
        int p,r,t,si;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        si=(p*r*t)/100;
        System.out.println(si);
    }
}