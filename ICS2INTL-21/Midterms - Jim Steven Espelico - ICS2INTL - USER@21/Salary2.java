/* Programmed By: Jim Steven Espelico
Salary2*/
import java.io.*;
public class Salary2{
	public static void main(String[] args){
	int bs=0;
	double GROSS=0;
	String in;
	BufferedReader input = new BufferedReader(new
	InputStreamReader(System.in));
	try{
	System.out.print("Basic Salary: ");
	in=input.readLine();
	bs = Integer.parseInt(in);
	}catch(IOException e){
	System.out.println("Error");
	}
	if( bs <= 10000)
	{
	GROSS = ((bs*.20) + (bs*.80));
	}
	else if( bs >= 10001 && bs <=20000)
	{
	GROSS = ((bs*.25) + (bs*.90));
	}
	else
	{
	GROSS = ((bs*.30) + (bs*.95));
	}
	System.out.println("Employee's Gross Salary: " + GROSS);
	}
}