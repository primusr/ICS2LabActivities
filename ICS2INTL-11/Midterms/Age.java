/* Programmed by: <Katelyn>
   Program title: PosBeg.java 
   Program Date: <February 14, 2017> */

import java.io.*;
public class Age{
public static void main(String[] args) {
	int age;
	String input = "";

	BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	System.out.println("Input age: " );
	try{
	  input = in.readLine ();
	}catch(IOException e) {
	System.out.println("Error!");
	}
	age= Integer.parseInt(input);
	if(age< 0 || age >= 100)
		System.out.println("Invalid age");
	if(age<5)
		System.out.println("BABY");
	if(age<12)
		System.out.println("CHILD");
	if(age<20)
		System.out.println("TEENAGER");
	if(age<50)
		System.out.println("ADULT");
	if(age<100)
		System.out.println("SENIOR CITIZEN");


	}
}