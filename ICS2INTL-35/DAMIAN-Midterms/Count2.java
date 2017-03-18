/* Programmed by: <Redd Damian>
   Program title: Count2.java
   Program Date: <March 7> */

import java.io.*;
public class Count2{
	public static void main(String[] args){
		int i, n, ctr, ctrA;
		String input = " ";
		ctr = 0;
		ctrA = 0;

		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));
	
	for(i = 1; i<=10; i++){
		System.out.print("Input integer number: ");
	try{
		input = in.readLine();
	}catch(IOException e){
		System.out.println("Error!");
	}
	n = Integer.parseInt(input);
	if(n%2 == 0){
		ctr = ctr + 1;
		}
	else{
		ctrA = ctrA + 1;
		}
	}	
	System.out.println("The total Even number is " + ctr);
	System.out.println("The total Odd number is " + ctrA);
	}
}