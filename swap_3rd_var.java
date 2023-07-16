package BASICS;


import java.io.*;
class swap_3rd_var
{
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        DataInputStream r=new DataInputStream(System.in);
        a=Integer.parseInt(r.readLine());
        b=Integer.parseInt(r.readLine());
        c=a;
        a=b;
        b=c;
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}
