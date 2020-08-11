/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		while(t-- >0){
		    int num = scan.nextInt();
		    int firstNum, lastNum;
		    lastNum = num%10;
		    while(num >=10){
		        num = num/10;
		    }
		    firstNum = num;
		    System.out.println(firstNum + lastNum);
		    
		}
	}
}
