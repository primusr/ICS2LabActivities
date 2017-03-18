/*Programmed by: Rafael N. Gapuz
	Title: Quarter1.java
	Program Date: Feb. 23,2017*/
	
	import java.io.*;
public class Quarter1{
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
 if (day==1&&day==2&&day==3){

 System.out.println("1st Quarter ");
}
if (day==4&&day==5&&day==6){
System.out.println("2nd Quarter ");
}
if (day==7&&day==8&&day==9){
System.out.println("3rd Quarter ");
}
else (day==10&&day==11&&day==12){

System.out.println("4th Quarter ");
}
System.out.println("Have a nice day. ");
}
}	
	