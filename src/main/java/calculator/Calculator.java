package calculator;

import java.util.Scanner;
import arithmetic.Arithmetic;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("---------Welcome to Simple Calculator-----------");
		System.out.println("You can just Add, Subtract,Divide and Multiply");
		
		Scanner sc = new Scanner(System.in);
		String operation;
		float FirstNumber,SecondNumber,result;
		Arithmetic obj = new Arithmetic();
		
	    for(;;)
	    {
	    	System.out.println("Write operation sign (+,-,/,*):");
	    	operation = sc.next();
	
	    	if(operation.charAt(0) == 'x')
				break;
			
	    	System.out.println("Write first number:");
	    	FirstNumber = sc.nextFloat();
	    	System.out.println("Write second number:");
	    	SecondNumber = sc.nextFloat();
	    	
	    	try
	    	{
	    		result = obj.performOperation(FirstNumber, SecondNumber, operation.charAt(0));
	    		System.out.println(FirstNumber + " " + operation.charAt(0) + " " + SecondNumber + " = " + result);
	    	}
	    	catch(Exception ex)
	    	{
	    		System.out.println(ex.getMessage());
	    	}
	    		 
	    }
	    sc.close();
	    System.out.println("Bye Bye");
	}


}