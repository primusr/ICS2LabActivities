/* 
 * Programmed by: Craig Matthew P. Berganio
 * Program title: List2b.java
 * Program Date: Mar. 21, 2017
*/


package bubblesort;


import java.io.*;

public class BubbleSort {
	public static void main(String[] args) {
		int list[];
		
		int size, num, i, ii, temp, uplimit = 0;
		
		String input = " ";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// Get the size of the list from the user
		System.out.print("Enter the size of the array: ");
		try {
			input = in.readLine();
		} catch (IOException e) {}
		
		// Create the array using the size
		size = Integer.parseInt(input);		
		list = new int[size];
		
		// Get the values to be saved to the array
		for (i = 0; i < size; i++) {
			System.out.print("Input value for list[" + i +"] = ");
			try {
				input = in.readLine();
			} catch (IOException e) {}
			
			num = Integer.parseInt(input);
			list[i] = num;
		}
		
		// Let's sort the array using the Bubblesort algorithm
		uplimit = size - 1;
		for (i = 0; i < size; i++) {
			for (ii = 0; ii < uplimit; ii++) {
				if (list[ii] > list[ii+1]) {
					temp = list[ii];
					list[ii] = list[ii+1];
					list[ii+1] = temp;
				}
			}
			uplimit--;
		}
		
		// Let's display the sorted array
		for (i = 0; i < size; i++) {
			System.out.println("list[" + i + "] = " +list[i]);
		}
	}
}