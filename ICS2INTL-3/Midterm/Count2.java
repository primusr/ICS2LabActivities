/* Programmed By: Dannah Bacagan
   Program Title: Count2.java
   Program Date: MARCH 4 2017
*/

import java.io.*;

public class Count2{
	public static void main (String[] args){
		int i, n, ctr;
		String input = " ";
		ctr = 0;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (i = 1; i <= 10; i++){
			System.out.print("Input integer number: ");
			try{
				input = in.readLine();
			}catch(IOException e){
				System.out.println("Error!");
			}

			n = Integer.parseInt(input);

			if (n % 2 == 0){
				ctr = ctr + 1;
			} 
		}
		
		System.out.println("The total number of EVEN INTEGERS is " + ctr);
		System.out.println("The total number of ODD INTEGERS is " + (10 - ctr));
	}
}