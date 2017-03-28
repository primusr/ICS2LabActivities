/* 
 * Programmed by: Craig Matthew P. Berganio
 * Program title: List2b.java
 * Program Date: Mar. 21, 2017
*/


package list2b;


import java.io.*;

public class List2b {
	public static void main(String[] args) {
		
		int list1[] = new int[10];
		int list2[] = new int[10];
		int list3[] = new int[10];
		
		int i, num, sum, searchnum, counter  = 0;
		String input = " ";
		
		boolean found = false;

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
		
		// Now let's display the output
		// list1
		System.out.print("List1 : ");
		for (i = 0; i < 10; i++) {
			System.out.print(list1[i] + " ");
		}
		System.out.println("");
		// list2
		System.out.print("List2 : ");
		for (i = 0; i < 10; i++) {
			System.out.print(list2[i] + " ");
		}
		System.out.println("");
		// list3
		System.out.print("List3 : ");
		for (i = 0; i < 10; i++) {
			System.out.print(list3[i] + " ");
		}
		
		// Let's ask the user what to search
		System.out.println("");
		System.out.print("Input value to search in List3 : ");
		try {
			input = in.readLine();
		} catch (IOException e) {}
		searchnum = Integer.parseInt(input);
		
		// Let's search for the input in list3
		for (i = 0; i < 10; i++) {
			if (list3[i] == searchnum) {
				found = true;
				counter++;
			}
		}		
		
		if (found) {
			System.out.println("The value " + searchnum + " is in List3!");
			System.out.println("There are " + counter + " of it in List3.");
			System.out.print("Located at: ");
			for (i = 0; i < 10; i++) {
				if (list3[i] == searchnum) {
					System.out.print("list3[" + i + "], ");
				}
			}
		} else {
			System.out.println("The value " + searchnum + " is NOT in List3!");
		}
		
	}
}