/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FullPyramid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		fullPyramid(15);
	}
	static void fullPyramid(int n){
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-1-i;j++){
	            System.out.print(" ");
	        }
	        for(int k=0;k<=i;k++){
	            System.out.print("*");
	            System.out.print(" ");
	        }
	        System.out.println("");
	    }
	    
	}
}