package com.miit.calculatorapp.calculatorapp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CalculatorApp 
{
    public static void main( String[] args )
    {
    	  
		Calculator cal = new Calculator ();
    			int num1 = 0;
    	        int num2 = 0;
    	        char opreator;
    	        char key;
    	        double answer = 0.0;
    	        boolean data = true;
    	        while( data == true) 
    	        {
    			       System.out.println("Welcome To Calculator App");
    			       System.out.println("Enter 2 digit then select opreation that you would like to have");
    			      System.out.print("Please Enter First Number");
    			      Scanner scanObject = new Scanner(System.in);
    			      
    			    
    			      
    			     num1 = scanObject.nextInt();
    			      System.out.print("Please Enter Second Number");
//    			      if (num1.vale) {
//    			    	  
//    			      }
//    			      else {
//    			    	  System.out.println("Please enter number from 0 to 9");
//    			      }
    			     num2 = scanObject.nextInt();
    			     System.out.print("Enter the Opreation '+', '-', '*' ,'/' ");
    			      opreator = scanObject.next().charAt(0);
    			      
    			      if(opreator == '+' || opreator == '-' ||opreator == '*' ||opreator == '/') 
    			      {
    			    	  
    						     switch(opreator)
    						{
    						case '+' :
    							     answer =  cal.add(num1, num2);
       						          System.out.println(num1+""+opreator+""+num2+" = "+answer);
       						 
    						break;
    						case '-' :
    							      answer = cal.sub(num1, num2);
       						          System.out.println(num1+""+opreator+""+num2+" = "+answer);
    							
    						break;
    						case '*' : 
    							      answer = cal.mul(num1, num2);
       						          System.out.println(num1+""+opreator+""+num2+" = "+answer);
       						 
    						break;
    						case '/' : 
    							      answer = cal.div(num1, num2);
       						          System.out.println(num1+""+opreator+""+num2+" = "+answer);
    						break;
    						}
    						
    						      }

    			      
    			      else {
    			    	  System.out.println("Please Select Valid Input Opreator!");
    			      }
    						      System.out.println("do you wish to continue? Press y:");
    						      key = scanObject.next().charAt(0);
    						      if(key == 'y') {
    						    	  data =true;
    						      }
    						      else {
    						    	  data =false;
    						      }
    	        }
    			
    			    }
}
