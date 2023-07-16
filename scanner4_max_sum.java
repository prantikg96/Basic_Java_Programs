package BASICS;


import java.util.*;
class scanner4_max_sum
{
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>(y+z))
        System.out.print(x);
        else if(y>(x+y))
        System.out.print(y);
        else
        System.out.print(z);
    }
}