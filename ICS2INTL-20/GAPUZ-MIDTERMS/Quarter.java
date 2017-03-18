/*Programmed by: Rafael N. Gapuz
	Title: Quarter.java
	Program Date: Feb. 23,2017*/
	
	import java.io.*;
public class Quarter{
	public static void main(String args[]){
	int day;
	String input ="";
	BufferedReader in = new BufferedReader(new
			InputStreamReader(System.in));
System.out.print("Input a number from 1 to 12: ");
try{
 input = in.readLine();
 } catch (IOException e){
 System.out.println("Error!");
 }
 day = Integer.parseInt (input);
 switch (day){
case 1:System.out.println("1st Quarter ");
case 2:
case 3:
	break;
case 4:	System.out.println("2nd Quarter ");
case 5:	
case 6:	
	break;
case 7:System.out.println("3rd Quarter ");
case 8:
case 9:	
	break;
case 10:System.out.println("4th Quarter ");
case 11:
case 12:	
	break;
default: System.out.println("Invalid input!!! ");
	break;	

}
System.out.println("Have a nice day. ");
}
}	
	