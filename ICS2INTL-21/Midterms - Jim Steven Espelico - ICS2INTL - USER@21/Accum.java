import java.io.*;
public class Accum2{
	public static void main(String[] args){
		int i, n, sum = 0;
		String input = " ";
				
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		
		for (i = 0; i<10; i++){
			System.out.print("Input Integer number: ");
			try{
				input = in.readLine();
			}catch(IOException e){
				System.out.println("Error!");
			}
			
			n = Integer.parseInt(input);
			sum = sum + n;
			}
		System.out.println(" The sum of the integer is " + sum );
		}
		}