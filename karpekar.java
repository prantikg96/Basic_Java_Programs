package BASICS;

import java.util.*;
class karpekar
{
    public static void main(String args[])
    {
        int n, n1, s, k, c,r,l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        n = sc.nextInt();
        s = n * n;
        n1 = n;
        c = 0;
        while (n1 > 0)
        {
            c++;
            n1 = n1 / 10;
        }
        k = (int)Math.pow(10, c);
        r = s % k;
        l = s / k;
        if (l + r == n)
            System.out.println("Karpekar");
        else
            System.out.println("Not Karpekar");
        sc.close();
    }
}
