/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		invertedHPyramid(5);
	}
	static void invertedHPyramid(int n){
	    for(int i=0;i<n;i++){
	        for(int j=n-i;j>0;j--){
	            System.out.print("*");
	        }
	        System.out.println("");
	    }
	}
}
