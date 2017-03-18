/* Programmed by: <Redd Damian>
   Program title: Accum2.java
   Program Date: <March 7> */

import java.io.*;
public class Accum2{
public static void main(String[] args){
		int i, n, sum = 0, a = 0;
		String input = " ";

		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));
	for(i = 0; i<10; i++){
		System.out.print("Input integer number: ");
	try{
		input = in.readLine();
	}catch(IOException e){
		System.out.println("Error!");
	}
	n = Integer.parseInt(input);
	if(n%2==0)
		sum = sum + n;
	else
		a = a + n;
	}
	System.out.println("The sum of the even integers is " + sum);
	System.out.println("The sum of the odd integers is " + a);
	}
}