/* 
 * Programmed by: Craig Matthew P. Berganio
 * Program title: List2a.java
 * Program Date: Mar. 21, 2017
*/


package list2a;


import java.io.*;

public class List2a {
	public static void main(String[] args) {
		
		int list1[] = new int[10];
		int list2[] = new int[10];
		int list3[] = new int[10];
		
		int i, num, sum, highest, lowest = 0;
		String input = " ";
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// Let's initialize the arrays
		for (i = 0; i < 10; i++) {
			list1[i] = 0;
			list2[i] = 0;
			list3[i] = 0;
		}
		
		// Let's get the values for list1
		System.out.println("Please enter values for List1 : ");
		for (i = 0; i < 10; i++) {
			try {
				input = in.readLine();
			} catch (IOException e) {}
			
			num = Integer.parseInt(input);
			list1[i] = num;
		}
		
		// Let's get the values for list2
		System.out.println("Please enter values for List2 : ");
		for (i = 0; i < 10; i++) {
			try {
				input = in.readLine();
			} catch (IOException e) {}
			
			num = Integer.parseInt(input);
			list2[i] = num;
		}
		
		// Now let's add the values of list1 and list2 then store it to list3
		for (i = 0; i < 10; i++) {
			sum = list1[i] + list2[i];
			list3[i] = sum;
		}
		
		// Let's assume that the first number in the array is both the highest and the lowest number
		highest = list3[0];
		lowest = list3[0];
		
		for (i = 1; i < 10; i++) {
			if (highest < list3[i]) {
				highest = list3[i];
			}
			if (list3[i] < lowest) {
				lowest = list3[i];
			}
		}
		
		// Let's display the result
		System.out.println("The highest value is " + highest);
		System.out.println("The lowest value is " + lowest);
		
	}
}