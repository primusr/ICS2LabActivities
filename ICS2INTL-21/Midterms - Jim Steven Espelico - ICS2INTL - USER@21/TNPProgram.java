/* Programmed By: Jim Steven Espelico
TNP Program */
import java.io.*;
public class TNPProgram{
	public static void main(String[] args){
	double charge, rate;
	int DAY=0, TIME=0, DURATION=0;
	String in;
	BufferedReader input = new BufferedReader(new
	InputStreamReader(System.in));
	try{
	System.out.print("DAY: ");
	in=input.readLine();
	DAY = Integer.parseInt(in);
	System.out.print("Start Time: ");
	in=input.readLine();
	TIME = Integer.parseInt(in);
	System.out.print("DURATION of Call: ");
	in=input.readLine();
	DURATION = Integer.parseInt(in);
	}catch(IOException e){
	System.out.println("Error");
	}
	if(DAY >= 1 && DAY <= 5){ 
	if(TIME >= 0600 && TIME <=1800)
	rate = 2.5; 
	else
	rate = 2.0; 
	}
	else 
	rate = 1.5; 
	charge = rate * DURATION;
	System.out.println("The call charge is: " + charge);
	}
}