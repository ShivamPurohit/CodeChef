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
		int[] arr = new int[t];
		for(int i=0;i<t;i++){
		    arr[i] = scan.nextInt();
		}
Arrays.sort(arr);
		for(int i:arr)
		System.out.println(i);
	}
}
