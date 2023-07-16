package BASICS;

import java.util.*;
class scanner5_slab_ternary
{
    public static void main(String args[])
    {
        int u;
        double ch=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter unit:");
        u=sc.nextInt();
        ch = (u <= 100) ? 0.50 * u : (u > 100 && u <= 250) ? (100 * 0.50) + (u - 100) * 1.00 : (u > 250 && u <= 500) ? (100 * 0.50) + (150 * 1.00) + (u - 250) * 2.50 : 3.50 * u;
        System.out.println("Charge = Rs."+ch);
        sc.close();
    }
}