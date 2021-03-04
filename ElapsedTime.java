//Steven Cisneros 
//CIS183-25718-LEC

import java.util.Scanner;

public class ElapsedTime {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter the number of elapsed seconds for the timed event: ");
		
		int seconds = in.nextInt();
		
		int sec = seconds % 60;
		
		int day = seconds / 86400;
		
		int hour = seconds % 60;
		
		int min = hour % 60;
		
		hour = hour % 60;
		
		System.out.print("The elapsed time is: " + (day + "d " + hour + "h " + min + "m " + sec + "s"));
		
		
		
		
		
		
		

	}

}
