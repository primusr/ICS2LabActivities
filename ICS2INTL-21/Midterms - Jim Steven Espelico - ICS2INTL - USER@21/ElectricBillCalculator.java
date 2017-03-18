/* Programmed By: Jim Steven Espelico
ElectricBillCalculator */
import java.io.*;
public class ElectricBillCalculator{
	public static void main(String[] args){
	int a=0;
	double amt, total_amt, sur_charge;
	String in;
		BufferedReader input = new BufferedReader(new
		InputStreamReader(System.in));
		try{
		System.out.print("Input number of units: ");
		in=input.readLine();
		a = Integer.parseInt(in);
		}catch(IOException e){
		System.out.println("Error");
		}
	if(a <= 50)
    {
    amt = a*0.50;
    }
    else if(a <= 150)
    {
    amt = 25+((a-50)*0.75);
    }
    else if(a <= 250)
    {
    amt = 100+((a-150)*1.20);
    }
    else
    {
    amt = 220+((a-250)*1.50);
    }
	{
	sur_charge = amt*.20;
    total_amt = amt+sur_charge;
	System.out.println("Amount before surcharge= " + amt);
	System.out.println("Surcharge= " + sur_charge);
	System.out.println("Total Amount= " + total_amt);
	}
	}
	}