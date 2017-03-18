/* Programmed By: Jim Steven Espelico
Days */
import java.io.*;
public class Days{
	public static void main(String[] args){
	int day;
	String input = " ";
		BufferedReader in = new BufferedReader(new
		InputStreamReader(System.in));
		
		System.out.print("Input a number from 1 to 7: ");
		
		try{
		input = in.readLine();
		} catch(IOException e){
		System.out.println("Error!");
		}
		
		day = Integer.parseInt(input);
		
		switch(day){
			case 7 : System.out.println("The day is a Monday!");
						break;
			case 1 : System.out.println("The day is a Monday!");
						break;
			case 2 : System.out.println("The day is a Monday!");
						break;
			case 3 : System.out.println("The day is a Monday!");
						break;
			case 6 : System.out.println("The day is a Monday!");
						break;				
						default: System.out.println("Invalid input!!!");
						break;
			case 4 : System.out.println("The day is a Monday!");
						break;
			case 5 : System.out.println("The day is a Monday!");
						break;
								
			}
			System.out.println("Have a nice day.");
			}
			}