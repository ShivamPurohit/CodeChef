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
        int t = scan.nextInt();
        while(t-- >0){
            int num = scan.nextInt();
            int result = (int)Math.sqrt(num);
            System.out.println(result);
        }
	}
}
