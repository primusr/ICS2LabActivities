/* Programmed by: <Katelyn>
   Program title: Days.java
   Program Date: <February 23,2017> */

import java.io.*;
public class Month{
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
	case 1 : System.out.println("January");
		 break;
	case 2 : System.out.println("February");
		 break;
	case 3 : System.out.println("March");
		 break;
		 System.out.println("First Quarter");
		 break;
	case 4 : System.out.println("April");
		 break;
	case 5 : System.out.println("May");
		 break;
	case 6 : System.out.println("June");
		 break;
		 System.out.println("Second Quarter");
	         break;
	case 7 : System.out.println("July");
		 break;
	case 8 : System.out.println("August");
		 break;
	case 9 : System.out.println("September");
		 break;
	         System.out.println("Third Quarter");
	 	 break;
	case 10 : System.out.println("October");
		 break;
	case 11 : System.out.println("November");
		 break;
	case 12 : System.out.println("December");
		 break;
		 System.out.println("Fourth Quarter");
		 break;
       }
       System.out.println("Have a nice day.");
    }
}