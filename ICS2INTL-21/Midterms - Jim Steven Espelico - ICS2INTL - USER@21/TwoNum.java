/* Programmed by: Jim Steven Espelico
Program title: TwoNum.java
Program Date: 2-16 */
import java.io.*;
public class TwoNum{
	public static void main(String[] args){
		int a, b;
		String input = " ";
		BufferedReader in = new BufferedReader(new
		InputStreamReader(System.in));
		System.out.println("Input a Number1: " );
			try{
			input = in.readLine();
			}catch(IOException e){
			System.out.println("Error!");
			}
			a = Integer.parseInt(input);
		System.out.println("Input a Number2: " );
			try{
			input = in.readLine();
			}catch(IOException e){
			System.out.println("Error!");
			}
			b = Integer.parseInt(input);
			if(a == b)
			System.out.println("The two integers are EQUIVALENT");
			{
			if(a < b)
			System.out.println( a + " is GREATER THAN" + b );
			{
			if (a > b)
			System.out.println( a + " is LESS THAN" + b );
			}
			}
		}
	}