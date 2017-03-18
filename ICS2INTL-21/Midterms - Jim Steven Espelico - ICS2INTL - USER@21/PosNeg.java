/* Programmed by: Jim Steven Espelico
Program title: PosNeg.java
Program Date: 2-16 */
import java.io.*;
public class PosNeg{
	public static void main(String[] args){
		int number;
		String input = "";
		BufferedReader in = new BufferedReader(new
		InputStreamReader(System.in));
		System.out.println("Input a Number: " );
			try{
			input = in.readLine();
			}catch(IOException e){
			System.out.println("Error!");
			}
			number = Integer.parseInt(input);
			if(number < 0)
			{
			System.out.println("The number " + number + " is NEGATIVE");
			}
			if(number >= 0)
			{
			System.out.println("The number " + number + " is POSITIVE");
			}
		}
	}