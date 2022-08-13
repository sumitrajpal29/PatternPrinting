/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class HoInvertedHPyramid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		hihp(15);
	}
	static void hihp(int n){
	    String p;
	    for (int i=0; i<n; i++){
	        for(int j=0;j<n-i;j++){
	            
	            if(i==0||i==n-1||j==0||j==n-i-1) p="*";
	            else p=" ";
	            System.out.print(p);
	        }
	        System.out.println("");
	    } 
	}
}