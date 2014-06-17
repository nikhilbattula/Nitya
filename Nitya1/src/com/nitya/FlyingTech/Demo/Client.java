package com.nitya.FlyingTech.Demo;

/**
 * 
 * @author nikhil.maddy
 *
 *Creating a class Client to call NityaOverloading
 */
public class Client  {
	   public static void main(String[] args) {
		   /*
		    * Creating an object t of NityaOverloading
		    *  
		    */
		      NityaOverloading t = new NityaOverloading (0);
		      t.info();
		      t.info("overloaded method");
		      /*Overloaded constructor
		       * 
		       */
		      new NityaOverloading();
		   }
		}
