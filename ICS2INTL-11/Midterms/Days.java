/* Programmed by: <Katelyn>
   Program title: Days.java
   Program Date: <February 23,2017> */

import java.io.*;
public class Days{
  public static void main(String[] args) {
      int day;
      String input = "";

      BufferedReader in = new BufferedReader(new
			    InputStreamReader(System.in));

      System.out.print("Input a number from 1 to 7: ");

      try{
        input = in.readLine();
      }catch(IOException e){
	System.out.println("Error!");
      }

      day = Integer.parseInt(input);

      switch(day){
	case 4 : System.out.println("The day is a Monday!");
		 break;
	case 1 : System.out.println("The day is Tuesday!");
		 break;
	case 3 : System.out.println("The day is Wednesday!");
		 break;
	default : System.out.println("Invalid input!!!");
		  break;
	case 2 : System.out.println("The day is Thursday!");
		 break;
	case 7 : System.out.println("The day is Friday!");
		 break;
	case 5 : System.out.println("The day is Saturday!");
		 break;
	case 6 : System.out.println("The day is Sunday!");
		 break;
       }
       System.out.println("Have a nice day.");
    }
}