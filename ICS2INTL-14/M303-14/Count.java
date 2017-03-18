/* Programmed by: John Paul D. Gomez
   Program title: Count.java
   Program Date: March 2,2017 */

import java.io.*;
public class Count{
  public static void main(String[] args){
   int i, n, ctr_even;
   String input = " ";
   ctr_even = 0;

   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

   for(i = 0; i<=10; i++){
     System.out.print("Input integer number: ");
     try{
       input = in.readLine();
     }catch(IOException e){
       System.out.println("Error!");
     }

     n = Integer.parseInt(input);
     if(n >= 0){
        ctr_even = ctr_even + 1;

     }
   }
   System.out.println("Even integers= " + ctr_even);
  }
}