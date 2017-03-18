import java.io.*;
public class Quarter{
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
		
		switch(quarter){
			case 1:
			case 2:
			case 3: System.out.println("1st Quarter");
					break;
			case 4:
			case 5:
			case 6: System.out.println("2nd Quarter:");
					break;
			case 7:
			case 8:
			case 9: System.out.println("3rd Quarter:");
					break;
			case 10:
			case 11:
			case 12: System.out.println("4th Quarter");
					break;
			}
	}
}