/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HollowFPyramid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		hollowFPyramid(9);
	}
	static void hollowFPyramid(int n){
	    String p;
	    for(int i=0; i<n; i++){
	        if(i==n-1)
	           for(int k=0; k<n; k++)
	           System.out.print("* ");
            else
	        for(int j=0; j<n+i;j++){
	            if(j==n-i-1||j==n+i-1)
	            System.out.print("*");
	            else
	            System.out.print(" ");
	        }
	        
	        System.out.println("");
	    }
	}
}
