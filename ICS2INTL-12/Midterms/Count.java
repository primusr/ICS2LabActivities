/* Programmed by: Manalo,Ronmar M.
   Program title: Count.java
   Program Date: 3/2/2017 */

import java.io.*;
public class Count{
  public static void main(String[] args){
   int i, n, ctr;
   String input = " ";
   ctr = 0;

   BufferedReader in = new BufferedReader(new
			InputStreamReader(System.in));

   for(i = 1; i <= 10; i++){
	System.out.print("Input integer number: ");
	try{
	  input = in.readLine();
	}catch(IOException e){
	  System.out.print("Error!");
	}

	n = Integer.parseInt(input);
	

	if(n >= 0){
	  ctr = ctr + 1;
	 }
   }
   System.out.println("The total value for counter is " +ctr);
   }
}