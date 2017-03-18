/*Programmed by: Rafael N. Gapuz
	Title: TwoNum2.java
	Program Date: Feb. 14,2017*/
import java.io.*;
public class TwoNum2{
public static void main (String[] args) {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
try{
System.out.println("Input 1st Number:") ;
String first = in.readLine();
int x =Integer.parseInt();

System.out.println("Input SECOND Number:") ;
String second = in.readLine();
int y =Integer.parseInt();
if (x == y){
System.out.println("1st number is EQUAL TO second number") ;
}if 
	(x < y){
System.out.println("1st number is LESS THAN second number") ;
}else 
System.out.println("1st number is GREATER THAN second number") ;
}catch (IOException e){
System.out.println("Error!");
}
}
}