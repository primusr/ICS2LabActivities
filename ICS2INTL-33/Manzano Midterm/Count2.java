/* Programmed by: <Alejandro Manzano>
   Program Title: Count2.java
   Program Date: <March 7, 2017> */

import java.io.*;
public class Count2{
  public static void main(String[] args){
   int i, n, even_ctr=0;
   String input = " ";

   BufferedReader in = new BufferedReader(new
                          InputStreamReader(System.in));

   for(i = 1; i<=10; i++){
     System.out.print("Input integer number: ");
     try{
       input = in.readLine();
     }catch(IOException e){
       System.out.println("Error!");
     }

     n = Integer.parseInt(input);

     if(n % 2 == 0){
      even_ctr++;
     }
   }
   System.out.println("EVEN: " + even_ctr + "\nODD: "+ (10-even_ctr));
  }
}