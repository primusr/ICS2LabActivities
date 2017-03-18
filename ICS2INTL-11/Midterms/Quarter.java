/* Programmed by: <Katelyn>
   Program title: Days.java
   Program Date: <February 23,2017> */

import java.io.*;
public class Quarter{
  public static void main(String[] args) {
      int month;
      String input = "";

      BufferedReader in = new BufferedReader(new
			    InputStreamReader(System.in));

      System.out.print("Input a number of month: ");

      try{
        input = in.readLine();
      }catch(IOException e){
	System.out.println("Error!");
      }

      month = Integer.parseInt(input);

      if(month<=3){
	System.out.println("First Quarter");
      }
      else if(month>=4 && month<=6){
	System.out.println("Second Quarter");
      }
      else if(month>=7 && month<=9){
	System.out.println("Third Quarter");
      }
      else if(month>=10 && month<=12){
	System.out.println("Fourth Quarter");
      }
      else{
	System.out.println("Invalid month");
      }
   }
}

 