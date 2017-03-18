/* Programmed by: Manalo, Ronmar M.
   Program title: Ses.java
   Program Date: 2/28/2017 */

import java.io.*;
public class Ses{
  public static void main(String[] args){
	int start = 0, end = 0, step = 0;
	String in = " ";

	BufferedReader input = new BufferedReader(new
			      InputStreamReader(System.in));
	do{
	try{
	  System.out.print("Input START value = ");
	  in = input.readLine();
	  start = Integer.parseInt(in);
	  System.out.print("Input END value = ");
	  in = input.readLine();
	  end = Integer.parseInt(in);
	  System.out.print("Input STEP value = ");
	  in = input.readLine();
	  step = Integer.parseInt(in);
	}catch(IOException e){
	  System.out.println("Error!");
	}
	if(start >= end){
	  System.out.print("Starting number should be lesser than the ending number");
	  System.exit(0);
	}else
	if(step<=0){
	  System.out.println("The step number should always be greater than zero.");
	  System.exit(0);
	}

	for(start = start;start <= end;start = start + step){
	  System.out.println(start);

	}
	
	try{
	  System.out.println("\nDo you want to try again (Y/N)?");
	  in = input.readLine();
	}catch(IOException e){
	  System.out.println("Error!");
	}
      }while(in.equalsIgnoreCase("Y"));
    }
}
	