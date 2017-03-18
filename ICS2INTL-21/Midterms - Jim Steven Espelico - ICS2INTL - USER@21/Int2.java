//jimsteven.3/7.Int1.while

import java.io.*;
public class Int2{
	public static void main(String[] args){
		int s = 0, e = 0, st = 0, sum = 0;
		String input = " ";
		
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		
		do{
		try{
			System.out.print("Input START value= ");
			input = in.readLine();
			s = Integer.parseInt(input);
			System.out.print("Input END value= ");
			input = in.readLine();
			e = Integer.parseInt(input);
			System.out.print("Input STEP value= ");
			input = in.readLine();
			st = Integer.parseInt(input);
			}catch(IOException x){
				System.out.println("Error!");
			}
			if(s >= e){
			System.out.print("START value should be lesser ");
			System.out.println("than the END value. ");
			System.out.println("Try again.");
			System.exit(0);
			}
			if(st < 0){
			System.out.print("STEP value is always greater than zero.");
			System.exit(0);
			}
			
			for(s = s; s <= e; s = s + st){
					sum = sum + s;
					System.out.print(s);
					System.out.print("\n");
			}
			try{
			System.out.print("Do you want to continue= ");
			input = in.readLine();
			}catch(IOException x){
				System.out.println("Error!");
				}
			}while(input.equals("Y") || input.equals("y"));
			}
		}

	
			
			