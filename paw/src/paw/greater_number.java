package paw;

import java.util.Scanner;

public class greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
        
	    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        
        if(x > y && x > z)
        {
            System.out.println("The largest number is: "+x);
        }
        else if(y > z)
        {
            System.out.println("The largest number is: "+y);
        }
        else
        {
            System.out.println("The largest number is: "+z);
        }
	}

}
