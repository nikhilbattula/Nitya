package com.nitya.FlyingTech.Demo;

/**
 * 
 * 
 * @author nikhil.maddy
 *
 */
public class NityaOverloading{
	
/*
 * @see height
 */
		   int height;
		
		/*
		 *  Creating a Overloading method without parameters    
		 */
		 
		   NityaOverloading() {
		      System.out.println("bricks");
		     
		      height = 50;
		   }
		   /*
		    *  Creating a Overloading method by name NityaOverloading 
		    *  @param int i, to store int value 
		    */
		   NityaOverloading(int i) {
		      System.out.println("Building new House that is "
		      + 50 + " feet tall");
		      height = 5;
		   }
		   /*
		    * Creating a method info() without parameters
		    */
		   void info() {
		      System.out.println("House is " + height
		      + " feet tall");
		   }
		   /*
		    * Creating a method info()
		    * @param String n, Store a string value
		    */
		   void info(String n) {
		      System.out.println(n + ": House is "
		      + height + " feet tall");
		   }
		}
		