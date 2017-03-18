import java.io.*;
public class Quarter2{
	public static void main(String[] args){
		int quarter;
		String cc = " ";
		
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));
		
		System.out.println("Input a number from 1 to 12: ");
		
		
		try{
			cc = in.readLine();
		}catch(IOException e){
			System.out.println("Error");
		}
		quarter = Integer.parseInt(cc);
		
		if(quarter != 0 && quarter <= 3)
			System.out.println("1st Quarter");
		else if(quarter > 3 && quarter <= 6)
			System.out.println("2nd Quarter");
		else if(quarter > 6 && quarter <= 9)
			System.out.println("3rd Quarter");
		else if(quarter > 9 && quarter <= 12)
			System.out.println("4th Quarter");
		else
			System.out.println("Invalid input");
	}
}