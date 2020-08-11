/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner scan = new Scanner(System.in);
int t= scan.nextInt();

while(t-- >0){
    int a = scan.nextInt();
    int reverse=0,rem;
    while(a>0){
        rem = a%10;
        reverse = reverse*10 + rem;
        a = a/10;
    }
    System.out.println(reverse);
}
	}
}
