/* Programmed by: Gapuz,Rafael N.
Program title: Sum3.java
Program Date: Feb. 28 ,2017 */
import java.io.*;
public class Sum3{
public static void main(String[] args){
int start = 0, end = 0, step =0;
String input = "";
BufferedReader in = new BufferedReader(new
InputStreamReader(System.in));
try{
System.out.print("Input starting number: ");
input = in.readLine();
start = Integer.parseInt(input);
System.out.print("Input ending number: ");
input = in.readLine();
end = Integer.parseInt(input);
System.out.print("Input STEP number: ");
input = in.readLine();
step = Integer.parseInt(input);
}catch(IOException e){
System.out.print("Error!");
}
if(start >= end){
System.out.print("Starting number should be lesser ");
System.out.println("than the ending number. ");
System.out.println("Try again.");
System.exit(0);
}
if(start%2 == 0)
{
start = start + 1;
}
sum = 0;
do
{
sum = sum + start;
start = start + 2;
} while(start <= end);
System.out.println("Sum = " + sum);
}
}