/* Programmed By: Jim Steven Espelico
Salary Program */
import java.io.*;
public class SalaryProgram{
	public static void main(String[] args){
	int ET=0;
	double GROSS=0, HR=0, HW=0;
	double REGULAR=0, OTH=0, OTR=0, OTP=0;
	int day=0, TIME=0, DURATION=0;
	String in;
		BufferedReader input = new BufferedReader(new
		InputStreamReader(System.in));
		try{
		System.out.print("Input 1 for Part-time or 2 for Full-time for Employment Status: ");
		in=input.readLine();
		ET = Integer.parseInt(in);
		}catch(IOException e){
		System.out.println("Error");
		}
		if(ET == 1){ 
		try{
		System.out.print("Input hourly rate: ");
		in=input.readLine();
		HR = Double.parseDouble(in);
		System.out.print("Input number of hours worked: ");
		in=input.readLine();
		HW = Double.parseDouble(in);
		}catch(IOException e){
		System.out.println("Error");
		}
		GROSS = HR * HW;
		}
		else{
		try{
		System.out.print("Input regular pay: ");
		in=input.readLine();
		REGULAR = Double.parseDouble(in);
		System.out.print("Input number of overtime hours: ");
		in=input.readLine();
		OTH = Double.parseDouble(in);
		System.out.print("Input overtime rate: ");
		in=input.readLine();
		OTR = Double.parseDouble(in);
		}catch(IOException e){
		System.out.println("Error");
		}
		if(OTH > 0.0)
		OTP = OTR * OTH;
		else
		OTP = 0.0;

		GROSS = REGULAR + OTP;
		}
		System.out.println("Gross income= " + GROSS);
		}
}