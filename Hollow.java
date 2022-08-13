/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    hollowRectangle(3,4);
	}
	
	static void rectangle(int l,int w){
		for(int i=0;i<w;i++){
		    for(int j=0;j<l;j++)
		    System.out.print("*");
		    System.out.println("");
		}
	}
	
	static void hollowRectangle(int l,int w){
	   for(int i=1;i<=l;i++){
	       String p;
	        
	        for(int j=1;j<=w;j++){
	            if(i==1||i==l||j==1||j==w)
	             p="*";
	            else
	             p=" ";
	           System.out.print(p);
	       }
	       System.out.println("");
	   }
	}
	
	
}
