import java.io.*;

public class StepDoWhile{
	public static void main(String[] args){

		int start = 0, end = 0, step = 0;
		boolean tryAgain = true;
		String input = " ";
		
		while (tryAgain){
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			try{
			
				System.out.print("Input START value = ");
				input = in.readLine();
				start = Integer.parseInt(input);

				System.out.print("Input END value = ");
				input = in.readLine();
				end = Integer.parseInt(input);
	
				System.out.print("Input STEP value = ");
				input = in.readLine();
				step = Integer.parseInt(input);

			} catch (IOException e){
				System.out.println("Error!");
			}

			if (start >= end){
				System.out.println("START should be lesser than the END");
			}

			if (step <= 0){
				System.out.println("STEP should be greater than ZERO");
			} 
			
			System.out.println(start);

			do{
				start = start + step;
				System.out.println(start);
				
			} while ((start + step) <= end);

			
	
			try{
				System.out.print("Do you want to try again (Y/N)? ");
				input = in.readLine();
				if (input.equals("N") || input.equals("n"))
					tryAgain = !tryAgain;
			
			}
			catch (IOException e){
				System.out.println("Error!");
			}
				
			
		}		
		
				
	}
}