package BASICS;

import java.util.*;
class scanner5_slab
{
    public static void main(String args[])
    {
        int u;
        double ch=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter unit:");
        u=sc.nextInt();
        if(u<=100)
        ch=0.50*u;
        else if(u>100 && u<=250)
        ch=(100*0.50)+(u-1.0)*1.00;
        else if(u>250 && u<=500)
        ch=(100*0.50)+(150*1.00)+(u-250)*2.50;
        else if(u>500)
        ch=3.50*u;
        System.out.println("Charge = Rs."+ch);
        sc.close();
    }
}
