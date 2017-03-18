/*Programmed by: Rafael N. Gapuz
	Title: TwoNum.java
	Program Date: Feb. 14,2017*/
import java.io.*;
public class TwoNum{
public static void main (String[] args) {
int firstnumber;
int secondnumber = 0;
String input="";
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input FIRST Number:") ;

System.out.println("Input SECOND Number:") ;

try{
input = in.readLine();
}catch (IOException e){
System.out.println("Error!");
}
firstnumber = Integer.parseInt(input);
if (firstnumber < secondnumber)
{
System.out.println("first number is LESS THAN second number") ;
}
else{
System.out.println("first number is GREATER THAN second number") ;
}
}
}