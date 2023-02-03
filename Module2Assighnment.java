package precoursework;

import java.util.Scanner;

public class Module2Assighnment {
	
    
	public static void main (String[] args) {
		
	    Scanner input = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String userInput = input.nextLine();
		int number = Integer.parseInt(userInput);
        
        
        if (number >= 300) {
    		System.out.println("No!");
        } else if (number > 50)  {
        	System.out.println("Yes!");    	
        } else if (number == 50)  {	
        	System.out.println("No!");
        } else  {
        	System.out.println("No!");
        }
        
	}
}
